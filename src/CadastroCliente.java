import java.util.ArrayList;

public class CadastroCliente {
    ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);

    }

    public void ListarClientes() {

        for (int i = 0; i < clientes.size(); i++) {
        System.out.println(
            "Cliente {" +
                    "numeroCadastro=" + clientes.get(i).numeroCadastro +
                    ", nome='" + clientes.get(i).nome + '\'' +
                    ", cpf='" + clientes.get(i).cpf + '\'' +
                    ", telefone='" + clientes.get(i).telefone + '\'' +
                    '}'
        );
        }

    }

    public void DeletarCliente(int numeroCadastro) {

        for (int i = 0; i < clientes.size(); i++) {

            if (clientes.get(i).numeroCadastro == numeroCadastro) {
                clientes.remove(clientes.get(i));
                System.out.println("Cliente deletado com sucesso!!!");
            }

        }

    }
}
