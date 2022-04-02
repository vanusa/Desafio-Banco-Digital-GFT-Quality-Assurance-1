public abstract class Pessoa implements IPessoa{
    protected String nome;
    protected Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Nome: %s", this.nome));
        System.out.println(String.format("Endereço: %s", this.endereco));
    }
}
