package com.example.wheels;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Archivo {

        public void escribir(String cadena, String path) {
            try {
                FileWriter escribir = new FileWriter(path, true);
                escribir.write(cadena);
                escribir.close();
            } catch (IOException ex) {
                System.out.println("No se pudo escribir en el archivo");
            }
        }

        public void sobreEscribir(String path, String cadena) {
            try {
                FileWriter escribir = new FileWriter(path);
                escribir.write(cadena);
                escribir.close();
            } catch (IOException ex) {
                System.out.println("No se pudo escribir en el archivo");
            }
        }

        public ArrayList<String> leer(String path) {
            String cadena = "incializar";
            ArrayList<String> linea = new ArrayList<>();
            try {
                FileReader lectura = new FileReader(path);
                BufferedReader lecturas = new BufferedReader(lectura);
                while (cadena != null) {
                    cadena = lecturas.readLine();
                    linea.add(cadena);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("No se pudo leer el archivo");
            } catch (IOException ex) {
                System.out.println("No se pudo leer el archivo");
            }
            linea.remove(linea.size() - 1);
            return linea;
        }
}
