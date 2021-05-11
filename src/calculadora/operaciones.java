/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author mange
 */
public class operaciones {
     private int resultado;

    public operaciones() {
    }

    public operaciones(int resultado) {
        this.resultado = resultado;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int suma (int valor){
        this.resultado=resultado+valor;
        return valor;
    }
    public int resta (int valor){
        this.resultado=resultado-valor;
        return valor;
    }
    public int multi (int valor){
        this.resultado=resultado*valor;
        return valor;
    }
    public float div(int valor){
   
           if(valor==0){
            System.out.println("ERROR");
        }else{
            this.resultado=resultado/valor;
            
        }

    return valor; 
    }
    public int revertir(int valor){
        if(valor==1){
            this.resultado-=resultado;
        }else if(valor==2){
            this.resultado+=resultado;
        } else if(valor==3){
            this.resultado/=resultado;
        } else if(valor==4){
            this.resultado*=resultado;
        }
        this.resultado=resultado;
        return valor;
    }
    @Override
    public String toString() {
        return "operaciones{" + "resultado=" + resultado + '}';
    }
 
    
    

    
}
