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
        System.out.println("suma=+"cl.suma(0));
    }
}


