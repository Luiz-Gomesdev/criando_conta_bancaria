/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luiz.cursojava.exerc_15_02;

import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author lgome
 */
public class ContaPoupanca extends ContaBancaria {
    
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = "ContaPoupança[";
        s += " diaRendimento: " + diaRendimento;
        s += "; " + super.toString(); 
        s += "]" ;
        return s; 
    }
    
    public boolean calcularNovoSaldo(double taxaRendimento){
        
        Calendar hoje = Calendar.getInstance();
        
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            //saldo += saldo * taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
}
