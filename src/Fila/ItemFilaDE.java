package Fila;
import Data.DadosSimples;
import ListaEncadeada.ItemLista;

public class ItemFilaDE extends ItemFila{
    ItemFila anterior;

    public ItemFilaDE(DadosSimples info, ItemFila anterior, ItemFila proximo) {
        super(info, proximo);
        this.anterior = anterior;
    }

    public ItemFila getAnterior(){
        return this.anterior;
    }

    public void setAnterior(ItemFila novoAnterior){
        this.anterior = novoAnterior;
    }
}
