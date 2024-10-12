package Chuoi;

import java.util.Scanner;

//xoa khoang trang cua chuoi
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String text = scanner.nextLine();
        System.out.println("Chuoi ban dau: " +text);

        String textAfter = text.replaceAll("\\s", "");
        System.out.println("Chuoi sau khi xoa khoang trang: " +textAfter);
    }
}
