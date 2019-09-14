package bnhom;
import java.text.DecimalFormat;
import java.util.Scanner;
public class tonghaiso {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.println("Nhập vào số thứ nhất: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int secondNumber = scanner.nextInt();
         
        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
	}
}
