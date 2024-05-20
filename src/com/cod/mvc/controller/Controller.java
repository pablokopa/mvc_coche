package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

public class Controller{
    static Model miModelo;

    /**
     * Crea un coche
     * @param nombre del coche
     * @param matricula del coche
     */
    public static void crearCoche(String nombre, String matricula) {
        miModelo.crearCoche(nombre, matricula);
    }

    public static void main(String[] args) {

        // el patron Observer en java nos exige instanciar la clase observable
        miModelo = new Model();

        // instanciamos al observador
        ObserverVelocidad observoVelocidad = new ObserverVelocidad();
        miModelo.addObserver(observoVelocidad);

        // instanciamos un segundo observador
        ObserverOtro otroObservador = new ObserverOtro();
        miModelo.addObserver(otroObservador);

        crearCoche("LaFerrari", "SBC 1234");
        crearCoche("Alpine", "HYU 4567");
        crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = Model.getCoche("SBC 1234");
        // modifica la velocidad
        miModelo.cambiarVelocidad("SBC 1234", 30);

        // otro cambio de velocidad
        miModelo.cambiarVelocidad("HYU 4567", 100);
    }
}