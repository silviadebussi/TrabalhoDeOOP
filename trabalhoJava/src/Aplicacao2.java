public class Aplicacao2 {

    public static void main(String[] args) {
        Cliente clien1 = new Cliente();
        clien1.setNome("Silvania");
        clien1.setCpf("32256798552");
        clien1.setTelefone("32224444");

        Endereco end1 = new Endereco();

        end1.setCliente(clien1);
        end1.setCep("36081010");
        end1.setNumero("262");
        end1.setComplemento("201");
        end1.setCidade("Juiz de fora");
        end1.setUf("Mg");
        end1.setLogradouro("Granbery");

        Endereco end2 = new Endereco();

        end2.setCliente(clien1);
        end2.setCep("35020896");
        end2.setNumero("652");
        end2.setComplemento("333");
        end2.setCidade("Viçosa");
        end2.setUf("Mg");
        end2.setLogradouro("Cachoeira de Santa Cruz");

        Endereco end3 = new Endereco();

        end3.setCliente(clien1);
        end3.setCep("52368412");
        end3.setNumero("222");
        end3.setComplemento("102");
        end3.setCidade("Natal");
        end3.setUf("RN");
        end3.setLogradouro("Tirol");

        clien1.adicionarEndereco(end1);
        clien1.adicionarEndereco(end2);
        clien1.adicionarEndereco(end3);

        clien1.listaDeEnderecos();

    }

}



