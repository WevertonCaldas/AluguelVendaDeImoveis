package DAO;

import modelos.Imovel;

import java.util.ArrayList;

public class CadastroImovel implements IDao<Imovel> {

    ArrayList<Imovel> Imoveis = new ArrayList<>();

    @Override
    public void adicionar(Imovel obj) {
        Imoveis.add(obj);
    }

    @Override
    public ArrayList<Imovel> listar() {
        return Imoveis;
    }

    @Override
    public void deletar(int numeroCadastro) {
        for (int i = 0; i < Imoveis.size(); i++) {
            if (Imoveis.get(i).getNumeroCadastro() == numeroCadastro) {
                Imoveis.remove(Imoveis.get(i));
                System.out.println("Imovel deletado com sucesso!!!");
            }

        }
    }





}
