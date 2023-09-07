/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculos;

/**
 *
 * @author Admin
 */
public class Calculos {

    public static void main(String[] args) {
       // Crear instancia
        Calcular cl=new Calcular();
        System.out.println(cl.elMayor(5, 10));
        System.out.println(cl.elMenor(2, 3, 1));
        System.out.println("Numeros pares= "+cl.cantidadPares(10));
        System.out.println("Sumatoria= "+cl.sumatoria(10));
        System.out.println("suma="+cl.suma(10));
       
        double valorDolar = 20.0; // Cambia este valor al valor actual del dólar
        double cantidadPesos = 1000.0; // Cambia esta cantidad según tus necesidades
        
        double equivalenteEnDolares = convertirPesosADolares(valorDolar, cantidadPesos);
        
        System.out.println(cantidadPesos + " pesos equivalen a " + equivalenteEnDolares + " dólares.");

    }
}


