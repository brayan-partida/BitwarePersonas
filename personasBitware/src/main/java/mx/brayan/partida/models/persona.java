/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.brayan.partida.models;

/**
 *
 * @author brayanvaweei
 */
/**
 *   private String nombre;
    private int edad;
    private String NSS;
    private char sexo;
    private double altura;
    private  double peso;
 * @author brayanvaweei
 */
public class persona {

    private String nombre;
    private int edad;
    private String NSS;
    private char sexo;
    private double altura;
    private  double peso;
/**
 * 
 * @param nombre
 * @param edad
 * @param NSS
 * @param sexo
 * @param altura
 * @param peso 
 */
    public persona(String nombre, int edad, String NSS, char sexo, double altura,double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.NSS = NSS;
        this.sexo = sexo;
        this.altura = altura;
        this.peso=peso;
        
    }
    public persona(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        if (nombre.equals(null)){
            nombre ="";
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
}
