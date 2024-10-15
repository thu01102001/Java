package OOP;

import java.util.Scanner;

public class QLSV {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public QLSV(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public QLSV() {
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
        float diemTB = (this.getDiemLT() + this.getDiemTH()*2) / 3;
        return diemTB;
    }

    public void nhapSV() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        this.setMaSV(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap ho ten: ");
        this.setHoTen(scanner.nextLine());
        System.out.println("Nhap diem ly thuyet: ");
        this.setDiemLT(scanner.nextFloat());
        System.out.println("Nhap diem thuc hanh: ");
        this.setDiemTH(scanner.nextFloat());
    }

    public String xeploaiSV() {
        if(diemTB() <= 6) {
            return "Xep loai C";
        }
        else if (diemTB() > 6 && diemTB() <8) {
            return "Xep loai B";
        }
        else {
            return "Xep loai A";
        }

    }
    public void inSV() {
        System.out.println("Ma sinh vien: " +this.getMaSV());
        System.out.println("Ten sinh vien: " +this.getHoTen());
        System.out.println("Diem TB sinh vien: " +diemTB());
    }

    public void sapXepTheoDiemTB(QLSV[] sinhvien) {
        QLSV temp;
        for (int i = 0; i < sinhvien.length; i++) {
            for (int j = i + 1; j < sinhvien.length; j++) {
                if(sinhvien[j].diemTB() < sinhvien[i].diemTB()) {
                    temp = sinhvien[i];
                    sinhvien[i] = sinhvien[j];
                    sinhvien[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLSV[] qlsvs = null;
        int choose;
        int quality;
        do {
            System.out.println("CHUONG TRINH QUAN LY SINH VIEN");
            System.out.println("1. Nhap du lieu");
            System.out.println("2. In danh sach sinh vien");
            System.out.println("3. Sap xep danh sach sinh vien theo DTB");
            System.out.println("4. Xep loai sinh vien");
            System.out.println("5. Thoat");
            System.out.println("Nhap lua chon cua ban; ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Nhap so luong sinh vien ban muon them");
                    quality = scanner.nextInt();
                    qlsvs = new QLSV[quality];
                    for (int i = 0 ; i < quality; i++) {
                        System.out.println("Sinh vien thu " +(i+1)+ ": ");
                        qlsvs[i] = new QLSV();
                        qlsvs[i].nhapSV();
                    }
                    break;
                case 2:
                    System.out.println("In sinh vien");
                    for (int i = 0; i < qlsvs.length; i++) {
                        qlsvs[i].inSV();
                    }
                    break;
                case 3:
                    for (int i = 0; i < qlsvs.length; i++) {
                        qlsvs[i].sapXepTheoDiemTB(qlsvs);
                    }
                    System.out.println("Danh sach da duoc sap xep theo thu tu DTB");
                    break;
                case 4:
                    for (int i = 0; i < qlsvs.length; i++) {
                        System.out.println("Sinh vien " +(i+1)+ ": " +qlsvs[i].xeploaiSV());
                    }
                    break;
                case 5:
                    System.out.println("Cam on");
                    break;
                default:
                    break;
            }

        } while (choose != 5);
    }


}
