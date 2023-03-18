package modelos;

public class Imovel extends  AbstImovel {

    public Imovel() {
    }

    public Imovel(int numeroCadastro, String tipo, String descricao, Double valor, String status, Corretor corretor, Endereco endereco, Contato contato) {
        this.numeroCadastro = numeroCadastro;
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
        this.corretor = corretor;
        this.endereco = endereco;
        this.contato = contato;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "numeroCadastro=" + numeroCadastro +
                ", tipo='" + tipo + '\'' +
                ", descrição='" + descricao + '\'' +
                ", valor=" + valor +
                ", status='" + status + '\'' +
                ", corretor=" + corretor +
                ", endereco=" + endereco +
                ", contato=" + contato +
                '}';
    }
}
