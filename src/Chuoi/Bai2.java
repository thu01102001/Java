package Chuoi;

import java.util.Scanner;

//viet hoa ky tu dau tien trong java
//viet hoa ky tu dau tien cua moi chu trong java
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String text1 = scanner.nextLine();
        //subString : lay chuoi con tu chuoi da cho
        String textFirst1 = text1.substring(0,1).toUpperCase();
        String textRemain1 = text1.substring(1);
        System.out.println("Text sau khi viet hoa chu dau tien: " +(textFirst1+textRemain1));

        System.out.println("Nhap chuoi: ");
        String text2 = scanner.nextLine();
        String[] textFirst2 = text2.split(" ");
        //String build: de noi chuoi
        StringBuilder result = new StringBuilder();
        for (String first : textFirst2) {
            String textAfter1 = first.substring(0, 1).toUpperCase() + first.substring(1);
            result.append(textAfter1).append(" "); // noi chuoi cach nhau bang  " "
        }
        System.out.println(result);


    }
}
