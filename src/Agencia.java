import java.util.List;

public class Agencia implements IAgencia{

    private static int SEQUENCIAL = 1;

    private String nome;
    private int numero;
    private Endereco endereco;
    private Banco banco;
    private List<Conta> contas;

    public Agencia(String nome, Endereco endereco) {
        this.nome = nome;
        this.numero = SEQUENCIAL++;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        return "Agência{" +
                "nome='" + nome + '\'' +
                ", número=" + numero +
                ", endereço=" + endereco +
                '}';
    }

}
