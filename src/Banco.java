import java.util.List;

public class Banco {
    private static int SEQUENCIAL = 1;

    private String nome;
    private int numero;
    List<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.numero = SEQUENCIAL++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }
}
