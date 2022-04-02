public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaPoupanca(Agencia agencia, Cliente cliente) {
        super.agencia = agencia;
        super.numero = SEQUENCIAL++;
        super.cliente = cliente;
        super.saldo = 0.0;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("**** Extrato Conta Pupança ***");
        super.imprimirInfosComuns();
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}

