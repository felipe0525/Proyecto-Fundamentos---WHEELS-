package com.example.wheels;

import java.util.ArrayList;

public class Pasajero extends Usuario{

    private String codigo;
    public static ArrayList<Pasajero> pasajeros = new ArrayList<>(); // Array con todos los Pasajeros


    public Pasajero(String nombre, String correo, String contraseña, String universidad, String telefono, String codigo) {
        super(nombre, correo, contraseña, universidad, telefono);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public  static void almacenarPasajero() { // Metodo para almacenar los registros de pasajeros en arrays

        Archivo archivo = new Archivo();
        String[] arreglos = new String[archivo.leer("pasajeros.txt").size()];
        arreglos = archivo.leer("pasajeros.txt").toArray(arreglos);

        pasajeros.clear();
        for (String arreglo : arreglos) {
            String[] partes = arreglo.split("\\|");
            pasajeros.add(new Pasajero(partes[0].trim(), partes[1].trim(), partes[2].trim(), partes[3].trim(), partes[4].trim(), partes[5].trim()));
        }
    }


    public  static void almacenarRegistroPasajero(){ // Metodo para almacenar los array en el archivo pasajeros
        Archivo archivo = new Archivo();
        String cadena = pasajeros.get(0).getNombre() +  "|" + pasajeros.get(0).getCorreo() +  "|" + pasajeros.get(0).getContraseña() +  "|" + pasajeros.get(0).getUniversidad() +  "|" + pasajeros.get(0).getTelefono() +  "|" + pasajeros.get(0).getCodigo() ;
        archivo.sobreEscribir("pasajeros.txt", cadena);

        for (int i = 1; i< pasajeros.size();i++){
            cadena = "\n" + pasajeros.get(i).getNombre() +  "|" + pasajeros.get(i).getCorreo() +  "|" + pasajeros.get(i).getContraseña() +  "|" + pasajeros.get(i).getUniversidad() +  "|" + pasajeros.get(i).getTelefono() +  "|" + pasajeros.get(i).getCodigo() ;
            archivo.escribir(cadena, "pasajeros.txt");
        }
    }

}
