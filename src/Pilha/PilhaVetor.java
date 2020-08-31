package Pilha;

import Data.DadosSimples;

public class PilhaVetor extends Pilha{
    private DadosSimples itens[];
    private int capacidade;

    public PilhaVetor(int capacidade){ PilhaCriar(capacidade); }

    @Override
    public void PilhaCriar() {}

    public void PilhaCriar(int capacidade){
        this.itens = new DadosSimples[capacidade];
        this.capacidade = capacidade;
        this.n_itens = 0;
    }

    public boolean Empilhar(DadosSimples dados){
        if(this.n_itens >= this.capacidade) return false;
        this.itens[this.n_itens++] = dados;
        return true;
    }

    public boolean Desempilhar(){
        if(this.PilhaEstaVazia() == true) return false;
        this.itens[this.n_itens--] = null;
        return true;
    }

    public void Imprimir(){
        if(this.PilhaEstaVazia() == false) {
            System.out.println("Impressao de Pilha Vetor!");
            for (int i = this.n_itens - 1; i >= 0; i--) {
                System.out.printf("Posicao %d: %d\n", this.n_itens - i - 1, this.itens[i].getNumero());
            }
        }
        else{
            System.out.println("Pilha Vazia!");
        }
    }

    public boolean BuscarItem(DadosSimples dados){
        for(int i = this.n_itens - 1; i >= 0; i--){
            if(dados.equals(itens[i])) { return true; }
        }
        return false;
    }
}
