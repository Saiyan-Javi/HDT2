package Model;

import java.util.ArrayList;
import java.util.Scanner;
import Model.IPostfixCalculator;
import Model.PostfixCalculator;
import java.io.File;
import java.io.FileNotFoundException;

public class DriverTest {

    public static <T> void main(String[] args) throws Exception {

      /* Agregar el Scanner de la ruta del archivo.  */
      File doc = new File("C:\\Users\\danie\\Downloads\\Ejemplo.txt");
      Scanner obj = new Scanner(doc);

      /* Solo para verificar. */
      ////////////////////////////////////////
      while(obj.hasNextLine()) {
        System.out.println(obj.nextLine());
      }
      ////////////////////////////////////////


       
      ArrayList<Integer> read = new ArrayList<>();

      /* Aún no funciona. */
      while(obj.hasNextLine()) {
        read.add(Integer.parseInt(obj.nextLine()));
      }
      System.out.println(read);

        /* Esto lo arreglaré cuando funcione lo de arriba. */
        //PostfixCalculator miIPostfixCalculator = new PostfixCalculator<>();
        //Scanner entrada = new Scanner(System.in);

        //miIPostfixCalculator.Calculate(read);



        /*miIPostfixCalculator.Calculate(miIPostfixCalculator.getData());
        System.out.println("");
        System.out.println(miIPostfixCalculator.getData());*/

       
    }
    
}
