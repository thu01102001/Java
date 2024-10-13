package OOP;

import java.util.Scanner;

public class Student {
    private int maSV;
    private String hoTen;
    private String diaChi;
    private String number;

    public Student() {
    }

    public Student(int maSV, String hoTen, String diaChi, String number) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.number = number;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void nhapStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        setMaSV(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap ten sinh vien: ");
        setHoTen(scanner.nextLine());
        System.out.println("Nhap dia chi: ");
        setDiaChi(scanner.nextLine());
        do {
            System.out.println("Nhap so dien thoai: ");
            setNumber(scanner.nextLine());
        } while (getNumber().length() != 7);

    }

    public void inStudent() {
        System.out.println("Ma sinh vien: " +getMaSV());
        System.out.println("Ten sinh vien: " +getHoTen());
        System.out.println("Dia chi sinh vien: " +getDiaChi());
        System.out.println("SDT sinh vien: " +getNumber());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = null;
        int choose;
        int quality = 0;
        do {
            System.out.println("1. Nhap thong tin sinh vien");
            System.out.println("2. Xuat thong tin");
            System.out.println("3. Thoat");
            System.out.println("Nhap lua chon cua ban: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Nhap so luong sinh vien ban muon nhap: ");
                    quality = scanner.nextInt();
                    students = new Student[quality];
                    for (int i = 0; i < quality; i++) {
                        System.out.println("Sinh vien thu " +(i+1)+ ": ");
                        students[i] = new Student();
                        students[i].nhapStudent();
                    }
                    break;

                case 2:
                    Student temp = students[0];
                    System.out.println("Xuat thong tin");
                    for (int i = 0; i < students.length - 1; i++) {
                        for(int j = i + 1; j < students.length; j++) {
                            if(students[i].getMaSV() > students[j].getMaSV()) {
                                temp = students[j];
                                students[j] = students[i];
                                students[i] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < quality; i++) {
                        students[i].inStudent();
                    }
                    break;
                case 3:
                    System.out.println("Cam on");
                    break;
                default:
                    break;
            }
        } while (choose != 3);
    }
}
