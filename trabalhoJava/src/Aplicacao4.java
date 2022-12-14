    public class Aplicacao4 {

        public static void main(String[] args) {

            Cliente clien2 = new Cliente();
            clien2.setNome("Renato");
            clien2.setCpf("21243567890");
            clien2.setTelefone("32988338702");

            ContaCorrente CcClien2 = new ContaCorrente();
            CcClien2.setNumero("2");
            CcClien2.depositar(1000.00);

            Cliente clien3 = new Cliente();
            clien3.setNome("Eric");
            clien3.setCpf("71543234580");
            clien3.setTelefone("32988338702");

            ContaPoupanca c2 = new ContaPoupanca();
            c2.setNumero("3");
            c2.depositar(1000.00);

            System.out.println(CcClien2.getSaldo());
            System.out.println(c2.getSaldo());


        }
    }

