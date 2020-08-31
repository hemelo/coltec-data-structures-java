package Data;

public class DadosSimples {
    private int numero;
    private static String formato = "%d";

    public DadosSimples(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getFormato(){
        return this.formato;
    }

    public boolean equals(Object obj){
        if(obj instanceof DadosSimples){
            if(((DadosSimples) obj).getNumero() == this.getNumero())
                return true;
            else
                return false;
        }else{
            return false;
        }
    }
}
