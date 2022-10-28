import java.util.Scanner;
import java.text.DecimalFormat;
public class LinearEquationRunner {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);


        //welcome the user, and input/save the coordinates
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coordinate1 = scan.nextLine();
        String x1 = coordinate1.substring(1,coordinate1.indexOf(","));
        int X1 = Integer.parseInt(x1);
        String y1 = coordinate1.substring(coordinate1.indexOf(",")+2, coordinate1.length()-1);
        int Y1 = Integer.parseInt(y1);

        System.out.print("Enter coordinate 2: ");
        String coordinate2 = scan.nextLine();
        String x2 = coordinate2.substring(1,coordinate2.indexOf(","));
        int X2 = Integer.parseInt(x2);
        String y2 = coordinate2.substring(coordinate2.indexOf(",")+2, coordinate2.length()-1);
        int Y2 = Integer.parseInt(y2);

        if(X1==X2){
            System.out.println("These coordinates result in a vertical line: " + "X=" + X1);
        } else {
            LinearEquation equation = new LinearEquation(X1, Y1, X2, Y2);
            System.out.println(equation.distance());
            System.out.println(equation.slope());
            System.out.println(equation.equation());
        }
    }
}

