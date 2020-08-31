package Fila;
import Data.DadosSimples;

public class FilaVetor extends Fila{
    private DadosSimples itens[];
    private int capacidade;
    private int inicio;

    public static int modulo(int x, int y, int limite){
        return (x + y) % limite;
    }
    public FilaVetor(int capacidade){ FilaCriar(capacidade); }

    @Override
    public void FilaCriar() {}

    public void FilaCriar(int capacidade){
        this.itens = new DadosSimples[capacidade];
        this.capacidade = capacidade;
        this.n_itens = 0;
        this.inicio = 0;
    }

    public boolean FilaEstaCheia() {
        if(this.n_itens == this.capacidade) { return true; }
        else return false;
    }

    public boolean Inserir(DadosSimples dados){
        if(this.FilaEstaCheia() == true){ return false; }
        int fim = modulo(this.inicio, this.n_itens, this.capacidade);
        this.itens[fim] = dados;
        this.n_itens++;
        return true;
    }

    public boolean Remover(){
        if(this.FilaEstaVazia() == true){ return false; }
        this.itens[this.inicio] = null;
        this.inicio = modulo(this.inicio, 1, this.capacidade);
        this.n_itens--;
        return true;
    }

    public void Imprimir(){
        int posicao, posicao_relativa;
        if(this.FilaEstaVazia() == false) {
            System.out.println("Impressao de Fila Vetor!");
            for (posicao = 0; posicao < this.n_itens; posicao++) {
                posicao_relativa = modulo(this.inicio, posicao, this.capacidade);
                System.out.printf("Posicao %d: ", posicao);
                System.out.printf(this.itens[posicao_relativa].getFormato(), this.itens[posicao_relativa].getNumero());
                System.out.println();
            }
        }
        else{
            System.out.println("Fila Vazia!");
        }

    }

    public boolean BuscarItem(DadosSimples dados){
        int posicao, posicao_relativa;
        for(posicao = 0; posicao < this.n_itens; posicao++){
            posicao_relativa = modulo(this.inicio, posicao, this.capacidade);
            if(dados.equals(itens[posicao_relativa])) { return true; }
        }
        return false;
    }
}
