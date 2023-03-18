package DAO;

import modelos.AlugarVender;

import java.util.ArrayList;

public interface IDao<T> {

    public void adicionar(T obj);

    public ArrayList<T> listar();

    public void deletar(int numeroCadastro);

}
