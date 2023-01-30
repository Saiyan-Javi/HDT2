import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import Model.PostfixCalculator;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> operaciones = new ArrayList<String>();


        try {
            BufferedReader reader = new BufferedReader(new FileReader("datos.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                operaciones.add(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo a leer. Por favor, agrege uno al directorio.");
        }
        


        String menu1 = "\n ************** Bienvenido a nuestra calculadora ***********";
        String opc1;

        System.out.println(menu1);
        System.out.println("Las expresiones a evaluar son:");
        for (String s : operaciones) {
            System.out.println(s);
        }
        //Imprimir los resultados aquí.
        System.out.println();
        teclado.close();
        
    }
}
            
