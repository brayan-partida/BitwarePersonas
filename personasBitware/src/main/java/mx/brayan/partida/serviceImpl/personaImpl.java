/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.brayan.partida.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import mx.brayan.partida.models.persona;
import mx.brayan.partida.service.personaService;

/**
 *
 * @author brayanvaweei
 */
public class personaImpl implements personaService {

    @Override
    public boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean comprobarSexo(char sexo) {

        if (sexo != 'H' || sexo != 'M') {
            return false;
        } else {
            return false;
        }

    }

    public String personaToString(persona personas) {
        persona personasEntity = new persona(personas.getNombre(), personas.getEdad(), personas.getNSS(), personas.getSexo(), personas.getAltura(), personas.getPeso());

        String valor = "la informacion de la persona es \n Nombre: "
                + personas.getNombre() + "\n Altura: "
                + personasEntity.getAltura() + "\n  Peso: "
                + personasEntity.getPeso() + "\n NSS: "
                + personasEntity.getNSS() + "\n"
                + "para otros datos contacte a la empresa";

        return valor;
    }

    @Override
    public int calcularIMC(double peso, double estatura, char sexo) {

        double imc = peso / (estatura * estatura);
        System.out.println(imc);
        char sexoGet = sexo;

        if ((sexoGet == 'M' && imc < 19.0) || (sexoGet == 'H' && imc < 20.0)) {
            return -1;
        }
        if ((sexoGet == 'M' && (imc >= 19.0 && imc <= 24)) || (sexoGet == 'H' && (imc >= 20.0 && imc <= 25.0))) {
            return 0;
        }

        if ((sexoGet == 'M' && (imc > 24)) || (sexoGet == 'H' && (imc > 25))) {
            return 1;
        }
        return 0;
    }

    /**
     * GenerarNSS
     *
     * @return
     */
    @Override
    public String GenerarNSS() {
        String theAlphaNumericS;
        StringBuilder builder;

        theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789";

        //create the StringBuffer
        builder = new StringBuilder(8);

        for (int m = 0; m < 8; m++) {

            // generate numeric
            int myindex
                    = (int) (theAlphaNumericS.length()
                    * Math.random());

            // add the characters
            builder.append(theAlphaNumericS
                    .charAt(myindex));
        }
        System.err.println(builder.toString());
        return builder.toString();

    }

}
