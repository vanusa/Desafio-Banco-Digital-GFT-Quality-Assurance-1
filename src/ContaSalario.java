public class ContaSalario extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaSalario(Agencia agencia, Cliente cliente) {
        super.agencia = agencia;
        super.numero = SEQUENCIAL++;
        super.cliente = cliente;
        super.saldo = 0.0;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("**** Extrato Conta Salário ***");
        super.imprimirInfosComuns();
    }
}

