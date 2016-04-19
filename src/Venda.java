import java.util.ArrayList;

/**
 * Created by ilegra on 19/04/2016.
 */
public class Venda {

    private String nome;
    private String filial;
    private int valor;

    public Venda(){

    }

    public Venda(String nome, String filial, int valor){
        this.nome = nome;
        this.filial = filial;
        this.valor=valor;

    }

    public String getNome() {
        return nome;
    }

    public String getFilial() {
        return filial;
    }

    public int getValor() {
        return valor;
    }

}
