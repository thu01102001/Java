package CoBan;

import java.util.Scanner;

//cong , nhan, phan nguyen, phan du 2 so trong java
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Nhap so thu 2: ");
        int number2 = scanner.nextInt();
        System.out.println("Tong: " +number1+ " + " +number2+ " = " +(number1+number2));
        System.out.println("Tong: " +number1+ " * " +number2+ " = " +(number1*number2));
        System.out.println("Tong: " +number1+ " / " +number2+ " = " +(number1/number2));
        System.out.println("Tong: " +number1+ " % " +number2+ " = " +(number1%number2));
    }
}
