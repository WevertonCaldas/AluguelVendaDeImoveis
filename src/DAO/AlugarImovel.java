package DAO;

import modelos.AlugarVender;

import java.util.ArrayList;

public class AlugarImovel implements IDao<AlugarVender> {

    ArrayList<AlugarVender> Imoveis = new ArrayList<>();

    @Override
    public void adicionar(AlugarVender obj) {
        Imoveis.add(obj);
    }

    @Override
    public ArrayList<AlugarVender> listar() {
        return null;
    }

    @Override
    public void deletar(int numeroCadastro) {

        for (int i = 0; i < Imoveis.size(); i++) {
            if (Imoveis.get(i).getNumeroCadastro() == numeroCadastro) {
                Imoveis.remove(Imoveis.get(i));
                System.out.println("Imovel alugado com sucesso!!!");
            }

        }

    }



}
