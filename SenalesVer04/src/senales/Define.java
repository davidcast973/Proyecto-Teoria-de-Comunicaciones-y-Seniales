/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package senales;

import java.util.StringTokenizer;

/**
 *
 * @author ararage_kun
 */

public class Define {
   
    /*El método cant_var de esta clasesita se encarga de recibir la cadena asi tal cual
    a secas llena de comas, lo que se hace es solo leerla y obtener la cantidad de valores
    resultantes (subcadenas) al quitarle las comitas :D*/
    public int cant_var(String cad){
        int cant = 0;
        StringTokenizer token = new StringTokenizer(cad,","); 
        while(token.hasMoreTokens()){//Mientra... hayan espacios 
        token.nextToken();//ir al siguiente token 
        cant++; 
        }
       System.out.println("Son "+cant+" nùmeros");
    return cant;
    }
    
    public float[] origen (float[]pnl,int oG){
      /*Nuevo tamaño del arreglo*/
        int tam;
      /*Nuevo arreglo donde se guardaran los nuevos elementos :D*/
        float calcuG[] = null;
          
            System.out.println("El origen es la posicion "+oG+" con el valor "+pnl[oG]);
            tam = pnl.length-oG;
            System.out.println("El nuevo tamaño es de :D "+tam+ " valorsitos.");
            calcuG = new float[tam];
                for(int j=0;j<tam;j++){
                    calcuG[j] = pnl[oG];
                    //System.out.println("Ahora se encuentra el valor "+pnl[i]+" en la posicion "+j+" del nuevo arreglo :D");
                  oG++;
                }
             
          
        return calcuG;
     }
    
    public float[] origen_a (float[]pnl,int oG){
        int tam;
        float calcuA[] = null;
        System.out.println("El origen es la posicion "+oG+" con el valor "+pnl[oG]);
            tam = (pnl.length-(pnl.length-oG));
            System.out.println("El nuevo tamaño es de :D "+tam+ " valorsitos.");
            calcuA = new float[tam];
                for(int j=0;j<tam;j++){
                    calcuA[j] = pnl[oG-1];
                    //System.out.println("Ahora se encuentra el valor "+pnl[i]+" en la posicion "+j+" del nuevo arreglo :D");
                  oG--;
                }         
        return calcuA;
    }
    
    public float[] acomodador(float[]total1a){
       int size = total1a.length;
       int pos = size-1;
       float []total1;
       total1 = new float[size];
       
       for(int x=0;x<size;x++){
           total1[x]=total1a[pos];
           pos--;
       }
       
       return total1;
    }
    
    public boolean define_exite(int multi,int tamanio){
        if(multi>tamanio){
            return true;
        }else{
            return false;
        }
    }
    
    public float[] invierte(float[]total){
        float[]acom;
        int temp = total.length;
        int tempa = temp-1;
        acom = new float[temp];
        for(int x=0;x<temp;x++){
            acom[x]= total[tempa];
            tempa--;
        }
        return acom;
    }
    
    
    public float [] union(float[]Ad,float[]At){
    float []union = new float[(Ad.length + At.length)];
    int x,y,z=0;
    
    for(x=0;x<At.length;x++){
        union[x]=At[x];
    }
    for(y=At.length;y<Ad.length+At.length;y++){
        union[y]=Ad[z];
        z++;
    }
    return union;
    }
}
