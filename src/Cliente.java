public class Cliente implements IPessoaFisica, IPessoaJuridica{

    private IPessoa pessoa;
    private Agencia agencia;
    private Telefone telefone;

    public Cliente(IPessoa pessoa, Agencia agencia, Telefone telefone) {
        this.pessoa = pessoa;
        this.agencia = agencia;
        this.telefone = telefone;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "pessoa=" + pessoa +
                ", agencia=" + agencia +
                ", telefone=" + telefone +
                '}';
    }
}
