/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author jccol
 */
public class POO_tp4_ej3 {
    public static void calcular_total(LinkedList<Producto>lista){
        double total=0;
        System.out.println("------------------------------------");
        for(int i=0;i<lista.size();i++){
            System.out.println("Cod producto: "+lista.get(i).get_codigo()+" | Precio: "+lista.get(i).get_precio());
            total=total+lista.get(i).get_precio();
        }
        System.out.println("------------------------------------");
        System.out.println("Total a pagar: $"+total);
        System.out.println("Correccion hecha con GIT");
        System.out.println("------------------------------------");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto prod=new Producto();
        LinkedList<Producto>lista=new LinkedList<>();
        Scanner entrada=new Scanner(System.in);
        String opcion="";
        boolean opcion1=true;
        while(!"n".equals(opcion)){
            System.out.println("Ingrese codigo de producto: ");
            prod.set_codigo(entrada.nextInt());
            System.out.println("Ingrese precio de producto: ");
            prod.set_precio(entrada.nextDouble());
            System.out.println("¿Desea agregar otro producto?(s/n)");
            opcion=entrada.next();
            lista.add(prod);
            prod=new Producto();
        }
        calcular_total(lista);
    }
}
    

