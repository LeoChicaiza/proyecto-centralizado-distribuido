
package com.mycompany.centralizadoapp;

import java.io.*;

public class CentralizadoApp {
    public static void main(String[] args) {
        try {
            // Guardar "Hola Mundo" en un archivo
            FileWriter writer = new FileWriter("centralizado.txt");
            writer.write("Hola Mundo");
            writer.close();

            // Leer el archivo
            BufferedReader reader = new BufferedReader(new FileReader("centralizado.txt"));
            String mensaje = reader.readLine();
            System.out.println("Mensaje leído: " + mensaje);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
