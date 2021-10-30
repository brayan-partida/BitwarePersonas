/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.brayan.partida.service;

import java.util.List;
import mx.brayan.partida.models.persona;

/**
 *
 * @author brayanvaweei
 */
public interface personaService {

    /**
     * indica si es mayor de edad, devuelve un booleano.
     *
     * @return
     */
    public boolean esMayorDeEdad(int edads);

    /**
     * comprueba que el sexo introducido es correcto. Devolver el valor en
     * booleano. No será visible al exterior.
     *
     * @param sexo
     * @return
     */
    public boolean comprobarSexo(char sexo);

    /**
     * devuelve toda la información del objeto.
     *
     * @return
     */
    public String personaToString(persona person);

    /**
     * calculara si la persona está en su peso ideal (peso en kg/(Estatura^2 en
     * m)), devuelve un -1 si está por debajo de su peso ideal, un 0 si está en
     * su peso ideal y un 1 si tiene sobrepeso .Te recomiendo que uses
     * constantes para devolver estos valores.
     *
     * @param peso
     * @return
     */
    public int calcularIMC(double peso, double  estatura, char sexo);
    
    
    public String GenerarNSS();
}
