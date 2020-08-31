package Fila;
import Data.DadosSimples;

public abstract class Fila {
    int n_itens;

    public boolean FilaEstaVazia(){
        if (this.n_itens == 0) return true;
        else return false;
    }

    public abstract void FilaCriar();
    public abstract void FilaCriar(int capacidade);
    public abstract boolean Inserir(DadosSimples dados);
    public abstract boolean Remover();
    public abstract void Imprimir();
    public abstract boolean BuscarItem(DadosSimples dados);
}
