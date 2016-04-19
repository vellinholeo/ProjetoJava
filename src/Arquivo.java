import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo{

    private static String arquivoCSV = "C:\\Users\\ilegra\\Desktop\\vendas.txt";
    private static List<Venda> vendas = new ArrayList<Venda>();

    public static List<Venda> readFile() {
        BufferedReader br = null;
        String linha = "";
        try {
            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {
                String[] linhas = linha.split(";");
                Venda venda = new Venda(linhas[0], linhas[1], Integer.parseInt(linhas[2]));
                vendas.add(venda);
            }
            return vendas;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}