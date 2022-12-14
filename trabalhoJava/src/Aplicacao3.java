public class Aplicacao3 {

    public static void main(String[] args) {

        Cliente clien1 = new Cliente();
        clien1.setNome("Silvia");
        clien1.setCpf("70128695667");
        clien1.setTelefone("32988771234");

        ContaCorrente cc1 = new ContaCorrente();
        cc1.setNumero("1");
        cc1.setLimite(0.00);
        cc1.setSaldo(0.00);

        clien1.adicionarConta(cc1);

        cc1.depositar(100.00);
        cc1.depositar(100.00);
        cc1.depositar(100.00);
        cc1.sacar(50.0);
        System.out.println(cc1.getSaldo());


    }
}

