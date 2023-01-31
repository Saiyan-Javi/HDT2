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

    @Override
    public int Calculate(ArrayList<T> postfix_expression) throws Exception {

        ArrayList<Integer> operandos = new ArrayList<>();

        setData(postfix_expression);

        for (T t : Data) {
            try {
                int a = Integer.parseInt(t.toString());
                System.out.print("Este dígito es " + a + "\n");  //Esto es para testeo
                operandos.add(a);
            } catch (NumberFormatException e) {
                System.out.println("Halle el símbolo " + t + "\n"); //Esto es para testeo
                //ES SíMBOLO
                int top = operandos.size() - 1;
                int second = top - 1;
                switch(t.toString()) {  //TODO: Añadir programación defensiva.
                                        //TODO: Se repite mucho código. Deberíamos de hacer algo para reciclarlo.
        
                    case "+": {
                        int suma = Integer.parseInt(operandos.get(top).toString()) + Integer.parseInt(operandos.get(second).toString());
                        res = suma;
                        operandos.remove(top);
                        operandos.remove(second);
                        operandos.add(res);
                        System.out.println(suma);
                    } break;
        
                    case "-": {
                        int resta = Integer.parseInt(operandos.get(top).toString()) - Integer.parseInt(operandos.get(second).toString());
                        res = resta;
                        operandos.remove(top);
                        operandos.remove(second);
                        operandos.add(res);
                        System.out.println(resta);
                    } break;
                    
                    case "*": {
                        int mul = Integer.parseInt(operandos.get(top).toString()) * Integer.parseInt(operandos.get(second).toString());
                        res = mul;
                        operandos.remove(top);
                        operandos.remove(second);
                        operandos.add(res);
                        System.out.println(mul);
                    } break;
                    
                    case "/": {
                        int div = Integer.parseInt(operandos.get(top).toString()) / Integer.parseInt(operandos.get(second).toString());
                        res = div;
                        operandos.remove(top);
                        operandos.remove(second);
                        operandos.add(res);
                        System.out.println(div);
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
