package View;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
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

        System.out.println(menu1);
        System.out.println("Ingrese la dirección de archivo.");
        opc1 = teclado.nextLine();

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

        System.out.println("Las operaciones encontradas en el archivo son:");
        System.out.println(operaciones);
        teclado.close();

        for (String s : operaciones) {
            String[] operacion = s.split("");
            ArrayList<String> calculo = new ArrayList<>();
            for (String op : operacion) {
                System.out.println(op);
                calculo.add(op);
            }
            miCalculadora.Calculate(calculo);
        }

        
        // Esto es el case para los números 

        ///char caracter = '@'; aqui deberia estar la lista de los números y que vaya verifiando cada uno de ellos 
      /*  int representacion = new operaciones;
        
        if (representacion <= 57 && representacion >= 48) {
            //toma los número de la pila y los almacena 
        } else if (representacion == 42 ||  representacion == 43 || representacion == 45 || representacion == 47) {
            //cuenta como operador y toma 2 valores 
        }*/
        
    }
}
            
