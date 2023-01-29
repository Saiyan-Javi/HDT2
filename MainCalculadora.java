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
    }
}
            