import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilegra on 19/04/2016.
 */
public class Executa {

    public static void main(String[] args) {
        List<Venda> v = new ArrayList<Venda>();
        Arquivo arq = new Arquivo();
        int aux =0;
        int p=0;

        v = arq.readFile();
        for (int i = 0; i <v.size() ; i++) {
            for (int j = 0; j <v.size() ; j++) {
                if(v.get(i).getValor() < v.get(j).getValor()){
                    aux = v.get(j).getValor();
                    p = j;
                }
            }
        }
        System.out.println("O maior valor é: " +aux + " do vendedor: "+ v.get(p).getNome());
    }
}
