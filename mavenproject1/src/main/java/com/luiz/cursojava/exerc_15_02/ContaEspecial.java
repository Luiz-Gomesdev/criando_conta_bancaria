/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luiz.cursojava.exerc_15_02;

/**
 *
 * @author lgome
 */
public class ContaEspecial extends ContaBancaria {
    
    private double limite;

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "ContaEspecial[";
        s += " limite: " + limite;
        s += "; " + super.toString(); 
        s += "]" ;
        return s; 
    }
    
    public boolean sacar(double valor){
        
        double saldoComLimite = this.getSaldo() + limite;
        
        if ((saldoComLimite-valor) >=0){
            this.setSaldo(this.getSaldo()-valor);
            
            //super.sacar(valor);
            return true;
        }
        
        return false;
    }
}
