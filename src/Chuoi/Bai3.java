package Chuoi;

import java.util.Scanner;

//chuyen chu hoa thanh chu thuong
//chuyen chu thuong thanh chu hoa
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String text = scanner.nextLine();
        System.out.println("Text sau khi viet hoa: " +text.toUpperCase());
        System.out.println("Text sau khi viet thuong: " +text.toLowerCase());
    }
}
