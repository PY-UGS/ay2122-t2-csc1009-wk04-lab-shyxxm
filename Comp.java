import java.util.Scanner;

public class Comp {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble()*0.45359237;

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble()*0.0254;

        BMI bmi = new BMI(weight, height);

        System.out.println("BMI is " + bmi.getBmi());

        input.close();

        if (bmi.getBmi() < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi.getBmi() >= 18.5 && bmi.getBmi() < 25.0){
            System.out.println("Normal");
        }
        else if (bmi.getBmi() >= 25.0 && bmi.getBmi() < 30.0){
            System.out.println("Overweight");
        }
        else if (bmi.getBmi() <= 30.0){
            System.out.println("Obese");
        }

    }
}
