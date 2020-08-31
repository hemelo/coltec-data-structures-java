package Fila;
import Data.DadosSimples;

public class FilaDE extends Fila {
    private ItemFilaDE inicio, fim;

    public FilaDE(){ FilaCriar(); }

    @Override
    public void FilaCriar(){
        this.inicio= null;
        this.fim = null;
        this.n_itens = 0;
    }

    @Override
    public void FilaCriar(int capacidade) {}

    public boolean Inserir(DadosSimples dados){
        ItemFilaDE item = new ItemFilaDE(dados, null, null);

        if(this.FilaEstaVazia() == false){
            item.setAnterior(fim);
            this.fim.setProximo(item);
        }
        else{
            this.inicio = item;
        }

        this.fim = item;
        this.n_itens++;
        return true;
    }

    public boolean Remover(){
        if(this.FilaEstaVazia() == true) { return false; }

        this.inicio = (ItemFilaDE) this.inicio.getProximo();
        this.inicio.setAnterior(null);

        if(this.inicio == null) { this.fim = null; }

        this.n_itens--;
        return true;
    }

    public boolean BuscarItem(DadosSimples dados){
        ItemFila item = this.inicio;
        do{
            if(dados.equals(item.getDados())== true) { return true; }
            item = (ItemFila) item.getProximo();
        }while(item.getProximo() != null);

        return false;
    }

    public void Imprimir(){
        ItemFilaDE item = this.inicio;

        if(this.FilaEstaVazia() == false) {
            System.out.println("Impressao de Fila Duplamente Encadeada");
            for (int i = 0; i < this.n_itens; i++) {
                System.out.printf("Posicao %d: ", i);
                System.out.printf(item.getDados().getFormato(),item.getDados().getNumero());
                System.out.println();
                item = (ItemFilaDE) item.getProximo();
            }
        }
        else{
            System.out.println("Fila Vazia!");
        }
    }

    public void ImprimirInvertido(){
        ItemFilaDE item = this.fim;

        if(this.FilaEstaVazia() == false) {
            System.out.println("Impressao Invertida de Fila Duplamente Encadeada");
            for (int i = this.n_itens - 1; i >= 0; i--) {
                System.out.printf("Posicao %d: ", i);
                System.out.printf(item.getDados().getFormato(),item.getDados().getNumero());
                System.out.println();
                item = (ItemFilaDE) item.getAnterior();
            }
        }
        else{
            System.out.println("Fila Vazia!");
        }
    }
}
