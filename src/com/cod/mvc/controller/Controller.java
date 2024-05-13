package com.cod.mvc.controller;
import com.cod.mvc.model.Coche;
import com.cod.mvc.view.View;
import com.cod.mvc.model.Model;

public class Controller {
    public static void main(String[] args) {

        // Crear tres coches

        Model.crearCoche("LaFerrari", "SBC 1234");
        Model.crearCoche("Alpine", "HYU 4567");
        Model.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = Model.getCoche("SBC 1234");
        // modifica la velocidad
        Model.cambiarVelocidad("SBC 1234", 30);

        // recoje la velocidad y la muestra (tarea de la com.cod.mvc.view.View)
        boolean hecho = View.muestraVelocidad("SBC 1234", Model.getVelocidad("SBC 1234"));

        System.out.println(hecho);
    }
}