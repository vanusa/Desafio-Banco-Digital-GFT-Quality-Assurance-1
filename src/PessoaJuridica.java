public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj, Endereco endereco) {
        super.nome = nome;
        this.cnpj = cnpj;
        super.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Nome: %s", this.nome));
        System.out.println(String.format("CNPJ: %s", this.cnpj));
        System.out.println(String.format("Endereço: %s", super.endereco));
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
