public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, String cpf, Endereco endereco) {
        super.nome = nome;
        this.cpf = cpf;
        super.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Nome: %s", super.nome));
        System.out.println(String.format("CPF: %s", this.cpf));
        System.out.println(String.format("Endereço: %s", super.endereco));
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
