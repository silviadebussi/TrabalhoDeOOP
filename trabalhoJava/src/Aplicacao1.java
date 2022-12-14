public class Aplicacao1 {

    public static void main(String[] args) {

        Cargo atendente = new Cargo();
        atendente.setNome("Carmélia");

        Cargo gerente = new Cargo();
        gerente.setNome("Leandro");

        Funcionario f1 = new Funcionario (atendente);
        Funcionario f2 = new Funcionario(gerente);

        atendente.addFuncionario(f1);
        gerente.addFuncionario(f2);

    }
}
