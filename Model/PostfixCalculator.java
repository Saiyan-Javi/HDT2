package Model;

import java.util.ArrayList;

public class PostfixCalculator<T> implements IPostfixCalculator<T> {

    private ArrayList<T> Data = new ArrayList<>();
    private int res;
    
    
    public PostfixCalculator() {

    }

    private void setData(ArrayList<T> data) {
        this.Data = data;
    }

    /* Los datos ya vienen en ASCII desde el DriverTest. */
    @Override
    public int Calculate(ArrayList<T> postfix_expression) throws Exception {

        setData(postfix_expression);

        for (T t : Data) {
            try {
                int a = Integer.parseInt(t.toString());
                System.out.print("Este dígito es " + a + "\n");  //Esto es para testeo
            } catch (NumberFormatException e) {
                System.out.println("Halle el símbolo " + t + "\n"); //Esto es para testeo
                //ES SíMBOLO
                switch(t.toString()) {  //TODO: Cambiar los métodos para realizar las operaciones.
        
                    case "+": {
                        int suma = (int) Data.get(0) + (int) Data.get(1);
                        res = suma;
                    } break;
        
                    case "-": {
                        int resta = (int) Data.get(0) - (int) Data.get(1);
                        res = resta;
                    } break;
        
                    case "*": {
                        int mul = (int) Data.get(0) * (int) Data.get(1);
                        res = mul;
                    } break;
        
                    case "/": {
                        int div = (int) Data.get(0) / (int) Data.get(1);
                        res = div;
                    } break;
                }
            }
        }

        /* Estos son los remanentes de cómo lo había hecho antes. */

        /*if((int) Data.get(0) == 43)  {
            int suma = (int) Data.get(0) + (int) Data.get(1);
            res = suma;

        } else if((int) Data.get(0) == 45) {
            int resta = (int) Data.get(0) - (int) Data.get(1);
            res = resta;

        } else if((int) Data.get(0) == 42)  {
            int mul = (int) Data.get(0) * (int) Data.get(1);
            res = mul;
        } else if((int) Data.get(0) == 47)  {
            int div = (int) Data.get(0) / (int) Data.get(1);
            res = div;

        }*/
        
        System.out.print(Data);
        return res;    
    }


        
     
        /* Esto hay que ponerlo dentro de Calculate. */
        ArrayList<T> getData(){
        return Data;
     }

     
    
}
