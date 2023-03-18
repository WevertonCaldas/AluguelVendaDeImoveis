package DAO;

import modelos.Corretor;

import java.util.ArrayList;

public class CadastroCorretor implements IDao<Corretor> {

    ArrayList<Corretor> Corretores = new ArrayList<>();

    @Override
    public void adicionar(Corretor obj) {
        Corretores.add(obj);
    }

    @Override
    public ArrayList<Corretor> listar() {
        return Corretores;
    }

    @Override
    public void deletar(int numeroCadastro) {

        for (int i = 0; i < Corretores.size(); i++) {

            if (Corretores.get(i).getCRECI() == numeroCadastro) {
                Corretores.remove(Corretores.get(i));
                System.out.println("Corretor deletado com sucesso!!!");
            }

        }

    }


}
