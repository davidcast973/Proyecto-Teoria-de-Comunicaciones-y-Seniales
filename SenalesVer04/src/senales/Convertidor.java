/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package senales;
import java.util.ArrayList;
import java.util.Vector;


/**
 *
 * @author ararage_kun
 * 
 */


public class Convertidor {
    
    /*El metodo a Matriz de esta clase recibe una lista donde ya estan guardados los valores sin comitas, 
    lo que hacemos es recorrerla y guardar los datos en un arreglo de enteros, regresando
    ese arreglo de enteros para usarlos en el boton que deseamos :D*/
    
    public float[] aMatriz(ArrayList<Float> v){
    float[]resultado = new float[v.size()];
    for(int i=0;i<resultado.length;i++)//{
        resultado[i] = v.get(i);
    //System.out.println("El resultado "+resultado[i] + "se encuentra en la pos "+i);}
    return resultado;
    }

    
}
