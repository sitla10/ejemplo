/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer=new Scanner (System.in);
      Clima clima=new Clima();
      
      for (int i=0;i<7;i++) {
          Temperatura t=new Temperatura();
          System.out.println("Ingrese la máxima de día: " + i);
          t.setMaxima(leer.nextFloat());
          System.out.println("Ingrese la minima de día:" + i);
          t.setMinima(leer.nextFloat());
          clima.agregarTemperatura(i, t);
      }
      System.out.println("Promedio temperaturas Máximas: "+ clima.verPromedioMaxima());
      System.out.println("Promedio temperaturas Minimas: "+ clima.verPromedioMinima());
    
          }   
}
