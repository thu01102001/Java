package CoBan;

import java.util.Scanner;

//kiem tra so chan le
//value = Mệnh đề điều kiện ? giá trị true : giá trị false
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra: ");
        int number = scanner.nextInt();
        String text = (number % 2 == 0) ? "So chan" : "So le";
        System.out.println(text);
    }
}
