import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa implements IUsuario {

    public boolean autenticar() {
        return true;
    }


    private Collection<Endereco> listaDeEnderecos = new ArrayList<>();
    private Collection<Conta> listaDeContas = new ArrayList<>();

    public void adicionarEndereco(Endereco endereco) {
        this.listaDeEnderecos.add(endereco);
    }

    public void adicionarConta(Conta conta) {
        this.listaDeContas.add(conta);
    }


    public void listaDeEnderecos() {

        for (Endereco e : this.listaDeEnderecos) {
            System.out.println("CEP"+ e.getCep());
            System.out.println("Logradouro"  + e.getLogradouro());
            System.out.println("Numero" + e.getNumero());
            System.out.println("Complemento" + e.getComplemento());
            System.out.println("Cidade" + e.getCidade());
            System.out.println("uf" + e.getUf());
        }

    }

    public void listaDeContas() {
        for (Conta c: this.listaDeContas) {
            System.out.println("Cliente" + c.getCliente());
            System.out.println("Numero" + c.getNumero());
            System.out.println("Saldo" + c.getSaldo());
        }

    }



}