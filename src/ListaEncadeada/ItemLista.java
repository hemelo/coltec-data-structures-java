package ListaEncadeada;

import Data.DadosSimples;

public class ItemLista {
    protected ItemLista proximo;
    protected DadosSimples info;

    public ItemLista(DadosSimples info, ItemLista proximo){
        this.proximo = proximo;
        this.info = info;
    }
    public ItemLista getProximo(){
        return this.proximo;
    }

    public void setProximo(ItemLista novoProximo){
        this.proximo = novoProximo;
    }

    public DadosSimples getDados(){
        return this.info;
    }

    public void setDados(DadosSimples novosDados){
        this.info = novosDados;
    }

}
