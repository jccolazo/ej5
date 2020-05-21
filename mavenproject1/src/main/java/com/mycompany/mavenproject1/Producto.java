/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author jccol
 */
public class Producto {
    private int codigo;
    private double precio;
    public Producto(int codigo, double precio){
        this.codigo=codigo;
        this.precio=precio;
    }
    public Producto(){
        
    }
    public int get_codigo(){
        return this.codigo;
    }
    
    public double get_precio(){
        return this.precio;
    }
    public void set_codigo(int codigo){
        this.codigo=codigo;
    }
    
    public void set_precio(double precio){
        this.precio=precio;
    }
}
