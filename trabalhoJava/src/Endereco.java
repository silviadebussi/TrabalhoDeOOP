public class Endereco {

    private String logradouro;
    private String numero;
    private String complemento;

    private String cep;

    private String cidade;

    private String uf;

    private Cliente cliente;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }


    public void printEndereco(){
        System.out.println("logradouro:" + this.logradouro);
        System.out.println("numero:" + this.numero);
        System.out.println("complemento:" + this.complemento);
        System.out.println("cep:" + this.cep);
        System.out.println("cidade:" + this.cidade);
        System.out.println("uf:" + this.uf);
    }

}