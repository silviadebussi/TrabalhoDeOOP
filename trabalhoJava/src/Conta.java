public abstract class Conta {

    private String numero;
    private Cliente cliente;

    private Double saldo = new Double(0.0);


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setClpiente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        return true;
    }

    public boolean sacar(double valor) {
        if (valor < getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }


    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    public void printConta(){
        System.out.println("cliente:" + this.cliente);
        System.out.println("numero:" + this.numero);
        System.out.println("saldo:" + this.saldo);

    }


}

