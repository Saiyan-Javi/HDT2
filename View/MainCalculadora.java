/* 
 * Hoja de Trabajo 2
 * Héctor Penedo, 22217
 * Javier Chiquín, 22103
 * Nelson Escalante 22046
 * José Morales 22689
 */

package View;
import java.util.Scanner;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.util.ArrayList;

import Model.IPostfixCalculator;
import Model.PostfixCalculator;

public class MainCalculadora {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> operaciones = new ArrayList<String>();

        IPostfixCalculator<String> miCalculadora = new PostfixCalculator<>();


        String menu1 = "\n ************** Bienvenido a nuestra calculadora ***********";
        String opc1;

        // Printing the menu and asking for the user to input the file name.
        System.out.println(menu1);
        System.out.println("Ingrese la dirección de archivo.");
        opc1 = teclado.nextLine();

        // Reading the file and adding each line to the arraylist.
        try {
            BufferedReader reader = new BufferedReader(new FileReader(opc1));
            String line;
            while ((line = reader.readLine()) != null) {
                operaciones.add(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo a leer. Por favor, agrege uno al directorio.");
        }

        // Printing the operations found in the file.
        if(operaciones.isEmpty() == false) {
            System.out.println("Las operaciones encontradas en el archivo son:");
            System.out.println(operaciones);
            teclado.close();

        } else {
            System.out.println("No hay operaciones válidas.");
        }

        // Taking the operations from the file and splitting them into individual characters.
        for (String s : operaciones) {
            String[] operacion = s.split("");
            ArrayList<String> calculo = new ArrayList<>();
            for (String op : operacion) {
                //System.out.println(op);
                calculo.add(op);
            }
            int resultado = miCalculadora.Calculate(calculo);
            System.out.println("El resultado de la operación es: " + resultado);
        }

    }

    @Test
    public void pruebaCalculate(){
        IPostfixCalculator<String> miCalculadora = new PostfixCalculator<>();
        ArrayList<String> operaciones = new ArrayList<String>();
        operaciones.add("41839/-+*");
        for (String s : operaciones) {
            String[] operacion = s.split("");
            ArrayList<String> calculo = new ArrayList<>();
            for (String op : operacion) {
                //System.out.println(op);
                calculo.add(op);
            }
            try {
                assertEquals(-16, miCalculadora.Calculate(calculo));
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}