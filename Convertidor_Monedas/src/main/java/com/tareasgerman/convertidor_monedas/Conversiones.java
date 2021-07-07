/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tareasgerman.convertidor_monedas;

/**
 *
 * @author david
 */
public class Conversiones {
 
    
    
    Datos c = new Datos();
    
    public  Double Convertir(double cantidad){
        
        double moneda = c.getValor_Referencia() * cantidad;
        return moneda;
    }
}
