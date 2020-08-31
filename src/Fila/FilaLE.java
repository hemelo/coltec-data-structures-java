package Fila;
import Data.DadosSimples;

public class FilaLE extends Fila{
    private ItemFila inicio, fim;

    public FilaLE(){ FilaCriar(); }

    @Override
    public void FilaCriar(){
        this.inicio= null;
        this.fim = null;
        this.n_itens = 0;
    }

    @Override
    public void FilaCriar(int capacidade) {}

    public boolean Inserir(DadosSimples dados){
        ItemFila item = new ItemFila(dados, null);

        if(this.FilaEstaVazia() == false){
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

        this.inicio = (ItemFila) this.inicio.getProximo();
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
        ItemFila item = this.inicio;
        if(this.FilaEstaVazia() == false) {
            System.out.println("Impressao de Pilha Encadeada");
            for (int i = 0; i < this.n_itens; i++) {
                System.out.printf("Posicao %d: ", i);
                System.out.printf(item.getDados().getFormato(),item.getDados().getNumero());
                System.out.println();
                item = (ItemFila) item.getProximo();
            }
        }
        else{
            System.out.println("Fila Vazia!");
        }
    }
}
