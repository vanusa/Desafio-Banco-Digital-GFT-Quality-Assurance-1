public class Main {
    public static void main(String[] args) {

        Agencia agencia = new Agencia("Agencia Centro", getEnderecoAgencia());
        IPessoa pessoaFisica = new PessoaFisica("João Silva", "123.456.789-10", getEnderecoPessoaFisica());
        Cliente clientePf = new Cliente(pessoaFisica, agencia, getTelefonePessoaFisica());
        Conta ccPf = new ContaCorrente(agencia, clientePf);
        Conta ppPf = new ContaPoupanca(agencia, clientePf);

        ccPf.depositar(1000);
        ppPf.depositar(5000);
        ccPf.imprimirExtrato();
        ppPf.imprimirExtrato();

        IPessoa pessoaJuridica = new PessoaJuridica("Casa da Construção", "12345678/0001-10", getEnderecoPessoaJuridica());
        Cliente clientePj = new Cliente(pessoaJuridica, agencia, getTelefonePessoaJuridica());
        Conta ccPj = new ContaCorrente(agencia, clientePj);
        Conta ppPj = new ContaPoupanca(agencia, clientePj);

        ccPj.depositar(10000);
        ppPj.depositar(90000);
        ccPj.imprimirExtrato();
        ppPj.imprimirExtrato();

        /*Conta cc = new ContaCorrente();
        cc.depositar(100);

        Conta poupanca = new ContaPupanca();
        cc.transferir(100,poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();*/

    }

    private static Telefone getTelefonePessoaFisica() {
        return new Telefone("11", "1234-5678");
    }

    private static Telefone getTelefonePessoaJuridica() {
        return new Telefone("41", "9876-5432");
    }

    private static Endereco getEnderecoPessoaFisica() {
        String logradouro = "Rua Formosa";
        String numeroEndereco = "77";
        String complementoEndereco = "Ap. 401";
        String cidade = "São paulo";
        String ufEndereco = "SP";
        String cep = "77777-000";
        String pais = "Brasil";
        Endereco endereco = new Endereco(logradouro, numeroEndereco,
                complementoEndereco, cidade, ufEndereco, cep, pais);
        return endereco;
    }

    private static Endereco getEnderecoPessoaJuridica() {
        String logradouro = "Avenida Lagoa";
        String numeroEndereco = "777";
        String complementoEndereco = "Sala 909";
        String cidade = "Curitiba";
        String ufEndereco = "PR";
        String cep = "88888-000";
        String pais = "Brasil";
        Endereco endereco = new Endereco(logradouro, numeroEndereco,
                complementoEndereco, cidade, ufEndereco, cep, pais);
        return endereco;
    }

    private static Endereco getEnderecoAgencia() {
        String logradouro = "Avenida Central";
        String numeroEndereco = "987";
        String complementoEndereco = "";
        String cidade = "Sao Paulo";
        String ufEndereco = "SP";
        String cep = "77777-777";
        String pais = "Brasil";
        Endereco endereco = new Endereco(logradouro, numeroEndereco,
                complementoEndereco, cidade, ufEndereco, cep, pais);
        return endereco;
    }
}
