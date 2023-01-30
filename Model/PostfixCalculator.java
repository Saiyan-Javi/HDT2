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
                System.out.print("Este dígito es " + a + "\n");
            } catch (NumberFormatException e) {
                System.out.println("Halle el símbolo " + t + "\n");
                //ES SíMBOLO
            }
        }

        /*switch( Data.get(0)) {

            case 48:{
                //Data.add(T);
            } break;

            case 43: {
                int suma = (int) Data.get(0) + (int) Data.get(1);
                res = suma;
            } break;

            case 45: {
                int resta = (int) Data.get(0) - (int) Data.get(1);
                res = resta;
            } break;

            case 42: {
                int mul = (int) Data.get(0) * (int) Data.get(1);
                res = mul;
            } break;

            case 47: {
                int div = (int) Data.get(0) / (int) Data.get(1);
                res = div;
            } break;

        }
        /
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
