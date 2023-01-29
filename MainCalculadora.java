import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;

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
        opc1 = teclado.nextLine();
        teclado.nextLine(); ///Aqui ingresa la direccion del archivo 
        teclado.close();
        
        // Esto es el case para los números 

        ///char caracter = '@'; aqui deberia estar la lista de los números y que vaya verifiando cada uno de ellos 
        int representacion = (int) caracter;
        
        If (representacion < 57); and (representacion > 48);
            //toma los número de la pila y los almacena 
        ElseIf (representacion == 42, 43, 45 , 47);
            //cuenta como operador y toma 2 valores 
        
    }
}
            
