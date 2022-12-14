import java.util.ArrayList;

public class Cargo {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();


    public void setListaDeFuncionarios(ArrayList<Funcionario> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }
    public ArrayList<Funcionario> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }


   public void addFuncionario(Funcionario funcionario) {
       this.getListaDeFuncionarios().add(funcionario);

   }

}



