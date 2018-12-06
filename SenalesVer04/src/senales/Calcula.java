/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package senales;

/**
 *
 * @author ararage_kun
 */
public class Calcula {
   /*Este señor recibe los pedazitos de los arreglos a partir del origen
    y los sumay guarda las sumas en un nuevo arreglo llamado suma :D, a y los imprime :D*/
    public float[] sumaPosiciones(float[]g,float[]h){
       int size;
       int x;
       float []suma;
       float []corto;
       boolean mayor = false;
       if(g.length<h.length){
           mayor = true;
           size = h.length;
           corto = new float[size];
           for(x=0; x<g.length; x++){
               corto[x] = g[x];
           }
           for(x++; x<size; x++)
               corto[x] = 0;
       }else{
           size = g.length;
           corto = new float[size];
           for(x=0; x<h.length; x++){
               corto[x] = h[x];
           }
           for(x++; x<size; x++)
               corto[x] = 0;
       }
       suma = new float[size];
       for(int i = 0;i<size;i++){
           if(mayor){
                suma[i]=corto[i]+h[i];
                System.out.println("Se tiene la suma de "+corto[i]+" + "+h[i]+" y nos da "+suma[i]);
           }
           else{
               suma[i]=corto[i]+g[i];
               System.out.println("Se tiene la suma de "+g[i]+" + "+corto[i]+" y nos da "+suma[i]);
           }
       }
       return suma;
  }
       
    public float[] restaPosiciones(float[]g,float[]h){
       int size;
       int x;
       float []resta;
       float []corto;
       boolean mayor = false;
       if(g.length<h.length){
           mayor = true;
           size = h.length;
           corto = new float[size];
           for(x=0; x<g.length; x++){
               corto[x] = g[x];
           }
           for(x++; x<size; x++)
               corto[x] = 0;
       }else{
           size = g.length;
           corto = new float[size];
           for(x=0; x<h.length; x++){
               corto[x] = h[x];
           }
           for(x++; x<size; x++)
               corto[x] = 0;
       }
       resta = new float[size];
       for(int i = 0;i<size;i++){
           if(mayor){
                resta[i]=corto[i]-h[i];
                System.out.println("Se tiene la suma de "+corto[i]+" - "+h[i]+" y nos da "+resta[i]);
           }
           else{
               resta[i]=g[i]-corto[i];
               System.out.println("Se tiene la resta de "+g[i]+" - "+corto[i]+" y nos da "+resta[i]);
               
           }
       }
       return resta;
    }
    
    public float[] multiplicaPosiciones(float[]g,float[]h){
       int size;
       int x;
       float []multiplica;
       float []corto;
       boolean mayor = false;
       if(g.length<h.length){
           mayor = true;
           size = h.length;
           corto = new float[size];
           for(x=0; x<g.length; x++){
               corto[x] = g[x];
           }
           for(x++; x<size; x++)
               corto[x] = 0;
       }else{
           size = g.length;
           corto = new float[size];
           for(x=0; x<h.length; x++){
               corto[x] = h[x];
           }
           for(x++; x<size; x++)
               corto[x] = 0;
       }
       multiplica = new float[size];
       for(int i = 0;i<size;i++){
           if(mayor){
                multiplica[i]=corto[i]*h[i];
                System.out.println("Se tiene la multiplicacion de "+corto[i]+" X "+h[i]+" y nos da "+multiplica[i]);
           }
           else{
               multiplica[i]=corto[i]*g[i];
               System.out.println("Se tiene la multiplicacion de "+g[i]+" X "+corto[i]+" y nos da "+multiplica[i]);
               
           }
       }
       return multiplica;
    }
    
     public float[] dividePosiciones(float[]g,float[]h){
       int size;
       int x;
       float []multiplica;
       float []corto;
       boolean mayor = false;
       if(g.length<h.length){
           mayor = true;
           size = h.length;
           corto = new float[size];
           for(x=0; x<g.length; x++){
               corto[x] = g[x];
           }
           for(x++; x<size; x++)
               corto[x] = 0;
       }else{
           size = g.length;
           corto = new float[size];
           for(x=0; x<h.length; x++){
               corto[x] = h[x];
           }
           for(x++; x<size; x++)
               corto[x] = 0;
       }
       multiplica = new float[size];
       for(int i = 0;i<size;i++){
           if(mayor){
                multiplica[i]=corto[i]/h[i];
                System.out.println("Se tiene la division de "+corto[i]+" X "+h[i]+" y nos da "+multiplica[i]);
           }
           else{
               multiplica[i]=corto[i]/g[i];
               System.out.println("Se tiene la division de "+g[i]+" X "+corto[i]+" y nos da "+multiplica[i]);
               
           }
       }
       return multiplica;
    }
    
    public float[] diezmaPosiciones_pos(float[]g, int multi,int tamanio){
        float []diezmada;
        int saltos;
       // boolean salto = false;
       int q;
              
        if(multi==1){
             
            diezmada = new float[g.length];
             for(q=0;q<g.length;q++){
                       diezmada[q]= g[q*multi];
                       System.out.println("Se ha agregado el "+g[q*multi]+" en el de la diezmada en la pos "+q);
                       
                }
             return diezmada;
        }else{
        
            if(g.length%multi!=0){
                saltos = (g.length/multi);
                System.out.println("Cantidad de Saltos: "+(saltos));
                 System.out.println("El tamaño de la diezmada: "+(saltos+1));
                diezmada = new float[saltos+1];
                    for(q=0;q<=saltos;q++){
                       diezmada[q]= g[q*multi];
                       System.out.println("Se ha agregado el "+g[q*multi]+" en el de la diezmada en la pos "+q);        
                    }
            return diezmada;
            }else{
                System.out.println("Errorsitos locos");
                //diezmada = null;
                saltos = (g.length/multi);
                diezmada = new float[saltos];
                for(q=0;q<saltos;q++){
                       diezmada[q]= g[q*multi];
                       System.out.println("Se ha agregado el "+g[q*multi]+" en el de la diezmada en la pos "+q);
                       
        }
                return diezmada;
       }
     }
    }
    
    public float[] diezmaPosiciones_pat(float[]g, int multi,int tamanio){
         float []diezmada;
         int saltos;
         int q;
         int aux;    
        if(multi==1){
             diezmada = new float[g.length];
             for(q=0;q<g.length;q++){
                       diezmada[q]= g[q*multi];
                       System.out.println("Se ha agregado el "+g[q*multi]+" en el de la diezmada en la pos "+q);
             }
             return diezmada;
        }else{
        
            if(g.length%multi!=0){
               aux=1;
                saltos = (g.length/multi);
                System.out.println("Cantidad de Saltos: "+(saltos));
                 System.out.println("El tamaño de la diezmada: "+(saltos));
                diezmada = new float[saltos];
                    for(q=0;q<saltos;q++){
                       diezmada[q]= g[(aux*multi)-1];
                       System.out.println("Se ha agregado el "+g[q*multi]+" en el de la diezmada en la pos "+q);        
                       aux++;
                    }
            return diezmada;
            }else{
                System.out.println("Errorsitos locos");
                //diezmada = null;
                aux=1;
                saltos = (g.length/multi);
                diezmada = new float[saltos];
                for(q=0;q<saltos;q++){
                       diezmada[q]= g[(aux*multi)-1];
                       System.out.println("Se ha agregado el "+g[q*multi]+" en el de la diezmada en la pos "+q);
                   aux++;
        }
                return diezmada;
       }
     }
    }
    
    
    
    public float[] interpolaPosiciones(float[]g, int tipo, int valor, float fin){

       int x,y,z = 0;
       float factor;
       float []interpoladog;

       
       interpoladog = new float[g.length*valor];

       
       if(tipo == 0){ //tipo 0-------------------
           
           
           for(x = 0; x<g.length; x++){
               interpoladog[z] = g[x];
               z++;
               for(y=1; y<valor; y++){
                   interpoladog[z] = 0;
                   z++;
               }
               
               
           }

           
       }  //tipo 0------------
       
       if(tipo == 1){ //tipo 1-------------------
           
           
           for(x = 0; x<g.length; x++){
               interpoladog[z] = g[x];
               z++;
               for(y=1; y<valor; y++){
                   interpoladog[z] = g[x];
                   z++;
               }
               
               
           }

           
       }  //tipo 1------------
      
       if(tipo == 2){ //tipo 2-------------------
           
           
           for(x = 0; x<g.length; x++){
               interpoladog[z] = g[x];
               if(x+1>=g.length){
                   factor = (fin - g[x])/valor;
               }
               else
                   factor = (g[x+1] - g[x])/valor;
               
               z++;
               
               for(y=1; y<valor; y++){
                   
                   interpoladog[z] = interpoladog[z-1]+factor;
                   
                   z++;
               }
               
               
           }

           
       }  //tipo 2------------
       
       
        
        return interpoladog;
    }
    
    public float[]reflejaPos(float[]g){
        float[]nuevo;
        
        int tamanio = g.length;
        int aux = tamanio-1;
        nuevo = new float[tamanio];
        
        for(int x = 0;x<tamanio;x++){
            nuevo[x]=g[aux];
        System.out.println("Se ha agregado el numero "+g[aux]);
        aux--;
        }
        return nuevo;
    }
    
    
    
    public float[] desplazaPosiciones(float[]g, int valor){
        int x,y,z = 0;
        float []desplazado;
        
        if(valor >= g.length){
            desplazado = new float[valor+1];
            for(x=0;x<g.length;x++)
                desplazado[x] = g[x];
            for(;x<valor;x++)
                desplazado[x] = 0;
        }
        else{
            desplazado = new float[g.length];
            for(x=0;x<g.length;x++)
                desplazado[x] = g[x]; 
        }
        
        
        return desplazado;
    }
    
    public float[] desplazaPosicionesNega(float[]g, int valor){
        int x,y,z = 0;
        float []desplazado;
        
        if(valor >= g.length-1){
            desplazado = new float[valor];
            for(x=0;x<g.length;x++)
                desplazado[x] = g[x];
            for(;x<valor-1;x++)
                desplazado[x] = 0;
        }
        else{
            desplazado = new float[g.length];
            for(x=0;x<g.length;x++)
                desplazado[x] = g[x]; 
        }
        return desplazado;
    }
    
    
    
    
////////////////////////////////////////////////////////////FIN    
 }


