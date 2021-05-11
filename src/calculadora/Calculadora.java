/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author TRUJEQUE
 */
public class Calculadora {


   
    public double respuesta;
    private int resultadoCal;
    private int numero;
    private String signo;
    
    public Calculadora(){
        
    }
    
    public void valorI(int resultado){
        this.respuesta = respuesta;
    }
    
    public void suma(int ...numero){
        this.signo = "+";
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.respuesta = this.numero;
        }
    }
    
    public void multiplicacion(int ...numero){
        this.signo = "*";
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.respuesta = this.numero;
        }
    }
    
    public void resta(int ...numero){
        this.signo = "-";
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.respuesta -= this.numero;
        }
    }
    
    public void division(int ...numero){
        this.signo = "/";
        for (int i = 0; i < numero.length; i++) {
            if(numero[i] == 0){
                respuesta = 0;
                JOptionPane.showMessageDialog(null, "Escribe un numero correcto para la division", "!ERROR", 0);
                break;
            } else {
                this.numero = numero[i];
                respuesta /= this.numero;
            }
        }
    }
    
    public void eliminar(){
        if(this.signo.equalsIgnoreCase("+")){
            this.respuesta -= this.numero;
        } else if(this.signo.equalsIgnoreCase("-")){
            this.respuesta += this.numero;
        } else if(this.signo.equalsIgnoreCase("*")){
            this.respuesta /= this.numero;
        } else if(this.signo.equalsIgnoreCase("/")){
            this.respuesta *= this.numero;
        }
    }
    
    public void resultado(){
        resultadoCal = (int)respuesta;
        if(respuesta % resultadoCal == 0){
            System.out.println("resultado = " + resultadoCal);
        } else{
            System.out.println("resultado = " + respuesta);
        }    
    }
}
