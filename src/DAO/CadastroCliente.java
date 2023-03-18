package DAO;

import modelos.Cliente;

import java.util.ArrayList;

public class CadastroCliente implements IDao<Cliente> {

    ArrayList<Cliente> clientes = new ArrayList<>();

    @Override
    public void adicionar(Cliente obj) {
        clientes.add(obj);
    }

    @Override
    public ArrayList<Cliente> listar() {
        return clientes;
    }

    @Override
    public void deletar(int numeroCadastro) {

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNumeroCadastro() == numeroCadastro) {
                clientes.remove(clientes.get(i));
                System.out.println("Cliente deletado com sucesso!!!");
            }

        }

    }


}
