package arreglo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Temperatura {
    private float maxima;
    private float minima;
    
    public Temperatura(float maxima, float minima){
        this.maxima = maxima;
        this.minima = minima;
    }
    
    public Temperatura(){
}
    public float getMaxima(){
        return maxima;
    }
     
    public void setMaxima(float maxima) {
        this.maxima = maxima;
    }
    
    public float getMinima(){
        return minima;
    }
   
    public void setMinima(float minima){
        this.minima = minima;
    }
}
    

