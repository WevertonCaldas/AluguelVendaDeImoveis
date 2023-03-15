public class AlugarVender {

    int numeroCadastro;
    String tipo;
    String descricao;
    Double valor;
    String telefone;
    String status;
    Endereco endereco;
    Corretor corretor;
    Cliente cliente;

    public AlugarVender() {
    }

    public AlugarVender(int numeroCadastro, String tipo, Endereco endereco, String descricao, Double valor, String telefone, String status, Corretor corretor, Cliente cliente) {

        this.numeroCadastro = numeroCadastro;
        this.tipo = tipo;
        this.endereco = endereco;
        this.descricao = descricao;
        this.valor = valor;
        this.telefone = telefone;
        this.status = status;
        this.corretor = corretor;
        this.cliente = cliente;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
