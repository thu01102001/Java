package CoBan;

import java.util.Scanner;

//nguyen am, phu am
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap text: ");
        char text = scanner.next().charAt(0);
        if(text >= 'a' && text <= 'z' || text >= 'A' && text <= 'Z') {
            switch (text) {
                case 'U':
                case 'u':
                case 'E':
                case 'e':
                case 'O':
                case 'o':
                case 'A':
                case 'a':
                case 'I':
                case 'i':
                    System.out.println(text+ " la nguyen am");
                    break;
                default:
                    System.out.println(text+ " la phu am");
                    break;

            }
        }
        else {
            System.out.println(text + " khong nam trong bang chu cai");
        }
    }
}
