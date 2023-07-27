import javax.swing.*;

public class variableEjercicios {

    public static void main (String [] args){

        String valorProductosStringA = JOptionPane.showInputDialog(null,"Ingrese Valor A");
        String valorProductosStringB = JOptionPane.showInputDialog(null,"Ingrese Valor B");


        Integer a = Integer.parseInt(valorProductosStringA);
        Integer b = Integer.parseInt(valorProductosStringB);

        var suma = a + b;
        JOptionPane.showMessageDialog(null,"la suma es : " + suma);

        var resta = a - b;
        JOptionPane.showMessageDialog(null,"la resta es : " + resta);

        var multiplicacion =  a * b;
        JOptionPane.showMessageDialog(null,"la multiplicacion es : " + multiplicacion);

        var division = a / b;
        JOptionPane.showMessageDialog(null,"la division es : " + division);

        var resultadoComparacion = a == b ? "Son Iguales" : "No son Iguales";
        JOptionPane.showMessageDialog(null,"la division es : " + resultadoComparacion);


        if (a == b) {
            resultadoComparacion = "los valores osniguales";
        }
        else {
            resultadoComparacion = "los valores no son iguales";
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de i = " +i);
        }



    }
}
