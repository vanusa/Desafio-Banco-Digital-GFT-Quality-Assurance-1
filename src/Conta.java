public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 0;

    protected double saldo;
    protected Agencia agencia;
    protected int numero;
    protected Cliente cliente;

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(this.cliente.toString());
        System.out.println(this.agencia.toString());
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));

    }

}
