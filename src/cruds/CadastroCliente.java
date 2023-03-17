package cruds;

import Modelos.Cliente;

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
                    "numeroCadastro=" + clientes.get(i).getNumeroCadastro() +
                    ", nome='" + clientes.get(i).getNome() + '\'' +
                    ", cpf='" + clientes.get(i).getCpf() + '\'' +
                    ", contato='" + clientes.get(i).getContato() + '\'' +
                    '}'
        );
        }

    }

    public void DeletarCliente(int numeroCadastro) {

        for (int i = 0; i < clientes.size(); i++) {

            if (clientes.get(i).getNumeroCadastro() == numeroCadastro) {
                clientes.remove(clientes.get(i));
                System.out.println("Cliente deletado com sucesso!!!");
            }

        }

    }
}
