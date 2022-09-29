package com.example.wheels;

import java.util.ArrayList;

public class Conductor extends Usuario {

    private String cedula;
    private String marca;
    private String modelo;
    private String placa;
    private String poliza;
    private String chasis;
    private String fechaExp;

    public static ArrayList<Conductor> conductores = new ArrayList<>(); // Array con todos los Conductores


    public Conductor(String nombre, String correo, String contraseña, String universidad, String telefono, String cedula, String marca, String modelo, String placa, String poliza, String chasis, String fechaExp) {
        super(nombre, correo, contraseña, universidad, telefono);
        this.cedula = cedula;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.poliza = poliza;
        this.chasis = chasis;
        this.fechaExp = fechaExp;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public static void almacenarConductor() { // Metodo para almacenar los registros de conductores en arrays

        Archivo archivo = new Archivo();
        String[] arreglos = new String[archivo.leer("conductores.txt").size()];
        arreglos = archivo.leer("conductores.txt").toArray(arreglos);

        conductores.clear();
        for (String arreglo : arreglos) {
            String[] partes = arreglo.split("\\|");
            conductores.add(new Conductor(partes[0].trim(), partes[1].trim(), partes[2].trim(), partes[3].trim(), partes[4].trim(), partes[5].trim(), partes[6].trim(), partes[7].trim(), partes[8].trim(), partes[9].trim(), partes[10].trim(), partes[11].trim()));
        }
    }


    public static void almacenarRegistroConductor(){ // Metodo para almacenar los array en el archivo conductores
        Archivo archivo = new Archivo();
        String cadena = conductores.get(0).getNombre() +  "|" + conductores.get(0).getCorreo() +  "|" + conductores.get(0).getContraseña() +  "|" + conductores.get(0).getUniversidad() +  "|" + conductores.get(0).getTelefono() + "|" + conductores.get(0).getCedula() +  "|" +  conductores.get(0).getMarca() +  "|" + conductores.get(0).getModelo() +  "|" + conductores.get(0).getPlaca() +  "|" + conductores.get(0).getPoliza() +  "|" + conductores.get(0).getChasis() +  "|" + conductores.get(0).getFechaExp();
        archivo.sobreEscribir("conductores.txt", cadena);

        for (int i = 1; i< conductores.size();i++){
            cadena = "\n" + conductores.get(i).getNombre() +  "|" + conductores.get(i).getCorreo() +  "|" + conductores.get(i).getContraseña() +  "|" + conductores.get(i).getUniversidad() +  "|" + conductores.get(i).getTelefono() + "|" + conductores.get(i).getCedula() +  "|" +  conductores.get(i).getMarca() +  "|" + conductores.get(i).getModelo() +  "|" + conductores.get(i).getPlaca() +  "|" + conductores.get(i).getPoliza() +  "|" + conductores.get(i).getChasis() +  "|" + conductores.get(i).getFechaExp();
            archivo.escribir(cadena, "conductores.txt");
        }
    }
}
