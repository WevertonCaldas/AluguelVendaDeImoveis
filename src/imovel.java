public class imovel {

    int numeroCadastro;
    String tipo;
    String endereço;
    String descrição;
    Double valor;
    String telefone;

    String status;

    Corretor corretor;



    public imovel(int numeroCadastro, String tipo, String endereço, String descrição, Double valor, String telefone, String status, Corretor corretor) {

        this.numeroCadastro = numeroCadastro;
        this.tipo = tipo;
        this.endereço = endereço;
        this.descrição = descrição;
        this.valor = valor;
        this.telefone = telefone;
        this.status = status;
        this.corretor = corretor;
    }

    public int getNumeroCadastro() {
        return numeroCadastro;
    }

    public void setNumeroCadastro(int numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }
}
