

public class Cliente {

    int numeroCadastro;
    String nome;
    String cpf;
    String telefone;


    public Cliente(int numeroCadastro, String nome, String cpf, String telefone) {

        this.numeroCadastro = numeroCadastro;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getNumeroCadastro() {
        return numeroCadastro;
    }

    public void setNumeroCadastro(int numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroCadastro=" + numeroCadastro +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
