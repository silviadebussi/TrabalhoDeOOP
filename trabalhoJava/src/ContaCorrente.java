public class ContaCorrente extends Conta {

    private Double limite;


    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void transferir(ContaPoupanca contaPoupanca, Double valor) {
        if (this.getSaldo() >= valor) {
            this.sacar(valor);
            contaPoupanca.depositar(valor);
        }
    }
    public Double calcularSalario() {
        return 0.0;
    }


}