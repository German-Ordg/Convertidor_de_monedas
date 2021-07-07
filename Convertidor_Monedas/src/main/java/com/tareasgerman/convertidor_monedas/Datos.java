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
public class Datos {

    /**
     * @return the valor_Referencia
     */
    public double getValor_Referencia() {
        return valor_Referencia;
    }

    /**
     * @param valor_Referencia the valor_Referencia to set
     */
    public void setValor_Referencia(double valor_Referencia) {
        this.valor_Referencia = valor_Referencia;
    }

    /**
     * @return the monto_Origen
     */
    public double getMonto_Origen() {
        return monto_Origen;
    }

    /**
     * @param monto_Origen the monto_Origen to set
     */
    public void setMonto_Origen(double monto_Origen) {
        this.monto_Origen = monto_Origen;
    }

    /**
     * @return the monto_Destino
     */
    public double getMonto_Destino() {
        return monto_Destino;
    }

    /**
     * @param monto_Destino the monto_Destino to set
     */
    public void setMonto_Destino(double monto_Destino) {
        this.monto_Destino = monto_Destino;
    }
    
    
    
    
    private static double valor_Referencia;
    private double monto_Origen;
    private double monto_Destino;
}
