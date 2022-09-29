package com.example.wheels;

public class Registro {


    public Registro() {
    }

    public  void registrarPasajero(String nombre, String correo, String contraseña, String universidad, String telefono, String codigo){

        Pasajero.almacenarPasajero();
        Pasajero.pasajeros.add(new Pasajero(nombre, correo, contraseña, universidad, telefono, codigo));
        Pasajero.almacenarRegistroPasajero();
    }


    public  void registrarConductores(String nombre, String correo, String contraseña, String universidad, String telefono, String cedula, String marca, String modelo, String placa, String poliza, String chasis, String fechaExp){

        Conductor.almacenarConductor();
        Conductor.conductores.add(new Conductor(nombre, correo, contraseña, universidad, telefono, cedula, marca, modelo, placa, poliza, chasis, fechaExp));
        Conductor.almacenarRegistroConductor();

    }







}
