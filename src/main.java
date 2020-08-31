import Data.DadosSimples;
import Pilha.PilhaLE;
import Pilha.PilhaVetor;
import Fila.FilaDE;
import Fila.FilaLE;
import Fila.FilaVetor;
import java.util.Random;

public class main {
    public static DadosSimples[] vetor_de_dados = new DadosSimples[10];

    public static void preencheDados(){
        Random gerador_de_numeros = new Random();
        for(int i = 0; i < vetor_de_dados.length; i++){
            vetor_de_dados[i] = new DadosSimples(gerador_de_numeros.nextInt(25));
        }
    }
    public static void main(String[] args) {
        preencheDados();
        System.out.println("--------------------------------------------------");
        TestePilhaEncadeada();
        System.out.println("--------------------------------------------------");
        TestePilhaVetor();
        System.out.println("--------------------------------------------------");
        TesteFilaEncadeada();
        System.out.println("--------------------------------------------------");
        TesteFilaVetor();
        System.out.println("--------------------------------------------------");
        TesteFilaDuplamente();
    }

    public static void TestePilhaEncadeada(){
        boolean resultado;
        PilhaLE pilha = new PilhaLE();
        pilha.Imprimir();
        resultado = pilha.Empilhar(vetor_de_dados[0]);
        resultado = pilha.Empilhar(vetor_de_dados[1]);
        resultado = pilha.Empilhar(vetor_de_dados[2]);
        pilha.Imprimir();
        resultado = pilha.Desempilhar();
        resultado = pilha.BuscarItem(vetor_de_dados[2]);
        resultado = pilha.Desempilhar();
        pilha.Imprimir();
    }

    public static void TestePilhaVetor(){
        boolean resultado;
        PilhaVetor pilha = new PilhaVetor(4);
        pilha.Imprimir();
        resultado = pilha.Empilhar(vetor_de_dados[0]);
        resultado = pilha.Empilhar(vetor_de_dados[1]);
        resultado = pilha.Empilhar(vetor_de_dados[2]);
        pilha.Imprimir();
        resultado = pilha.Desempilhar();
        resultado = pilha.BuscarItem(vetor_de_dados[1]);
        resultado = pilha.Desempilhar();
        pilha.Imprimir();
    }

    public static void TesteFilaEncadeada(){
        boolean resultado;
        FilaLE fila = new FilaLE();
        fila.Imprimir();
        resultado = fila.Inserir(vetor_de_dados[0]);
        resultado = fila.Inserir(vetor_de_dados[1]);
        resultado = fila.Inserir(vetor_de_dados[2]);
        fila.Imprimir();
        resultado = fila.Remover();
        resultado = fila.BuscarItem(vetor_de_dados[1]);
        resultado = fila.Remover();
        fila.Imprimir();
    }

    public static void TesteFilaVetor(){
        boolean resultado;
        FilaVetor fila = new FilaVetor(4);
        fila.Imprimir();
        resultado = fila.Inserir(vetor_de_dados[0]);
        resultado = fila.Inserir(vetor_de_dados[1]);
        resultado = fila.Inserir(vetor_de_dados[2]);
        fila.Imprimir();
        resultado = fila.Remover();
        resultado = fila.BuscarItem(vetor_de_dados[1]);
        resultado = fila.Remover();
        fila.Imprimir();
    }

    public static void TesteFilaDuplamente(){
        boolean resultado;
        FilaDE fila = new FilaDE();
        fila.Imprimir();
        resultado = fila.Inserir(vetor_de_dados[0]);
        resultado = fila.Inserir(vetor_de_dados[1]);
        resultado = fila.Inserir(vetor_de_dados[2]);
        fila.Imprimir();
        resultado = fila.Remover();
        resultado = fila.BuscarItem(vetor_de_dados[1]);
        fila.Imprimir();
        fila.ImprimirInvertido();
    }
}
