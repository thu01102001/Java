package OOP;

import java.util.Scanner;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public SinhVien() {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float diemTB() {
        return (this.getDiemLT() + this.getDiemTH())/2;
    }

    public String showResult() {
        return this.getMaSV()+ " - " +this.getHoTen()+ " - Diem trung binh: " +diemTB();
    }

    public void inSV() {
        System.out.println("Ma sinh vien: " +getMaSV());
        System.out.println("Ten sinh vien: " +getHoTen());
        System.out.println("Diem LT: " +getDiemLT());
        System.out.println("Diem TH: " +getDiemTH());
        System.out.println("Diem TB: " +diemTB());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien[] sinhViens = new SinhVien[3];
        for(int i = 0; i < sinhViens.length; i++) {
            SinhVien sinhVien = new SinhVien();
            System.out.println("Nhap ma sinh vien thu " +(i+1)+ ": ");
            sinhVien.setMaSV(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Nhap ten sinh vien thu " +(i+1)+ ": ");
            sinhVien.setHoTen(scanner.nextLine());
            System.out.println("Nhap diem LT sinh vien thu " +(i+1)+ ": ");
            sinhVien.setDiemLT(scanner.nextFloat());
            System.out.println("Nhap diem TH sinh vien thu " +(i+1)+ ": ");
            sinhVien.setDiemTH(scanner.nextFloat());
            scanner.nextLine();
            sinhViens[i] = sinhVien; //luu doi tuong sinh vien vao mang
            System.out.println("--------------------");
        }

        for (int i = 0; i < sinhViens.length; i++) {
            System.out.println("Diem trung binh cua sinh vien thu " +(i+1)+ ": " + sinhViens[i].showResult());
        }



        System.out.println("In sinh vien: ");
        for (int i = 0; i < sinhViens.length; i++) {
            sinhViens[i].inSV();
        }
    }
}
