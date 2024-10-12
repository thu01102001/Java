package Chuoi;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ky tu: ");
        char ch = scanner.next().charAt(0);
        String text = Character.toString(ch);
        System.out.println("String: " +text);
        System.out.println("-------------");
        scanner.nextLine();
        System.out.println("Nhap chuoi: ");
        String text1 = scanner.nextLine();
        for(int i = 0 ; i < text1.length(); i++) {
            char ch1 = text1.charAt(i);
            System.out.println(ch1+ " o vi tri " +i);
        }
    }
}
