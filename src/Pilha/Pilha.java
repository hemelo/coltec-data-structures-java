package Pilha;

import Data.DadosSimples;

public abstract class Pilha {
    int n_itens;

    public boolean PilhaEstaVazia(){
        if (this.n_itens == 0) return true;
        else return false;
    }

    public abstract void PilhaCriar();
    public abstract void PilhaCriar(int capacidade);
    public abstract boolean Empilhar(DadosSimples dados);
    public abstract boolean Desempilhar();
    public abstract void Imprimir();
    public abstract boolean BuscarItem(DadosSimples dados);

}
