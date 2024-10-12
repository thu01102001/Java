package CoBan;

import java.util.Scanner;

//check nam nhuan
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam can kiem tra: ");
        int year = scanner.nextInt();
        if(year % 400 ==  0) {
            System.out.println(year+ " la nam nhuan");
        }
        else if(year % 4 == 0 && year % 100 != 0) {
            System.out.println(year+ " la nam nhun");
        }
        else {
            System.out.println(year+ " khong phai la nam nhuan");
        }
    }
}
