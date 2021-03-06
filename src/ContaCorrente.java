public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaCorrente(Agencia agencia, Cliente cliente) {
        super.agencia = agencia;
        super.numero = SEQUENCIAL++;
        super.cliente = cliente;
        super.saldo = 0.0;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("**** Extrato Conta Corrente ***");
        super.imprimirInfosComuns();
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

}
