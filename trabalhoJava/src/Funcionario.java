import java.util.ArrayList;
import java.util.Collection;

public class Funcionario extends Pessoa implements IUsuario{

    private Double salario;

    private ArrayList<Cargo> listaDeCargos = new ArrayList<Cargo>();


    public Funcionario(Cargo cargo) {
        this.listaDeCargos.add(cargo);
    }

    public void addCargo(Cargo cargo) {
        this.listaDeCargos.add(cargo);
    }

    public boolean autenticar() {
        return true;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
