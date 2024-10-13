package OOP;

import java.util.Scanner;

public class HinhChuNhat {
    private double width;
    private double height;

    private HinhChuNhat() {
        this.width = width;
        this.height = height;
    }

    private double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private double tinhDienTich() {
        return this.getWidth() * this.getHeight();
    }

    private double tinhChuVi() {
        return (width + height)*2;
    }

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        hcn.setWidth(scanner.nextDouble());
        System.out.println("Nhap chieu rong: ");
        hcn.setHeight(scanner.nextDouble());
        System.out.println("Dien tich: " +hcn.tinhDienTich());
        System.out.println("Chu vi: " +hcn.tinhChuVi());

    }
}
