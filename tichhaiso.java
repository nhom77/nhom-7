package bnhom;
import java.text.DecimalFormat;
import java.util.Scanner;


public class tichhaiso {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.println("Nhập vào số thứ nhất: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int secondNumber = scanner.nextInt();
         
        int tich = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + tich);
}
}
