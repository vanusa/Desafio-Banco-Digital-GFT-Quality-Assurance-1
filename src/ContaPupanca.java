public class ContaPupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("**** Extrato Conta Pupança ***");
        super.imprimirInfosComuns();
    }
}

