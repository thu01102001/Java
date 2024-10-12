package Chuoi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//ky tu trung lap
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String text = scanner.nextLine();

        //hashMap: De luu so lan xuat hien cua tung ky tu
        HashMap<Character, Integer> count = new HashMap<>();

        //duyet qua tung ky tu trong chuoi
        for (char ch : text.toCharArray()) {
            //bo qua khoang trang
            if(ch != ' ') {
                if(count.containsKey(ch)) {
                    count.put(ch, count.get(ch) +1);
                }
                else {
                    count.put(ch, 1);
                }
            }
        }
        //in
        System.out.println("Cac ky tu trung lap:");
        for(Map.Entry<Character, Integer> entry : count.entrySet()) {
                System.out.println(entry.getKey()+ " xuat hien " +entry.getValue()+ " lan" );
        }
    }
}
