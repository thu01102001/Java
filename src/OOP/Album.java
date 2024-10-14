package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Album {
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBaiHat;
    private double giaThanh;

    public Album() {
    }

    public Album(int maCD, String tuaCD, String caSy, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    public void themCD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma CD: ");
        this.setMaCD(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap tua CD: ");
        this.setTuaCD(scanner.nextLine());
        System.out.println("NHap ten ca sy: ");
        this.setCaSy(scanner.nextLine());
        System.out.println("Nhap so bai hat: ");
        this.setSoBaiHat(scanner.nextInt());
        System.out.println("Nhap gia thanh: ");
        this.setGiaThanh(scanner.nextDouble());
    }

    public double tongGiaThanh(Album[] albums) {
        double tong = 0;
        for(int i = 0; i < albums.length; i++) {
            tong += albums[i].getGiaThanh();
        }
        return tong;
    }

    public void sapXepGiamDanTheoGiaThanh(Album[] albums) {
        Album temp;
        for(int i = 0; i < albums.length; i++) {
            for(int j = i+1; j < albums.length; j++) {
                if(albums[j].getGiaThanh() > albums[i].getGiaThanh()) {
                    temp = albums[i];
                    albums[i] = albums[j];
                    albums[j] = temp;
                }
            }
        }
    }

    public void sapXepTangDanTheoTuaCD(Album[] albums) {
        Album temp;
        for(int i = 0; i < albums.length; i++) {
            for(int j = i+1; j < albums.length; j++) {
                if(albums[i].getTuaCD().compareTo(albums[j].getTuaCD()) > 0) {
                    temp = albums[i];
                    albums[i] = albums[j];
                    albums[j] = temp;
                }
            }
        }
    }

    public void xuatCD() {
        System.out.println("Ma CD: " +this.getMaCD());
        System.out.println("Tua CD: " +this.getTuaCD());
        System.out.println("Ten ca sy: " +this.getCaSy());
        System.out.println("So bai hat: " +this.getSoBaiHat());
        System.out.println("Gia thanh: " +this.getGiaThanh());

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Album[] albums = null;
        int choose, soLuong;
        do {
            System.out.println("1. Them CD");
            System.out.println("2. Xuat CD");
            System.out.println("3. Tong so luong CD");
            System.out.println("4. Sap xep giam dan theo gia thanh");
            System.out.println("5. Sap xep tang dan theo tua CD");
            System.out.println("6. Tong gia thanh");
            System.out.println("7. Thoat");
            System.out.println("Nhap lua chon cua ban: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Nhap so luong CD muon them: ");
                    soLuong = scanner.nextInt();
                    albums = new Album[soLuong];
                    for (int i = 0; i < soLuong; i++) {
                        System.out.println("CD thu " +(i+1));
                        albums[i] = new Album();
                        albums[i].themCD();
                    }
                    break;
                case 2:
                    System.out.println("Xuat thong tin");
                    for (int i = 0; i < albums.length; i++) {
                        albums[i].xuatCD();
                    }
                    break;
                case 3:
                    System.out.println("Tong so luong CD la : " +albums.length);
                    break;
                case 4:
                    for(int i = 0; i < albums.length; i++) {
                        albums[i].sapXepGiamDanTheoGiaThanh(albums);
                    }
                    System.out.println("Thu tu da sap xep giam dan theo gia thanh");
                    break;
                case 5:
                    for(int i = 0; i < albums.length; i++) {
                        albums[i].sapXepTangDanTheoTuaCD(albums);
                    }
                    System.out.println("Thu tu da sap xep tang dan theo tua CD");
                    break;
                case 6:
                    for(int i = 0; i < albums.length; i++) {
                        System.out.println("Tong gia thanh " +albums[i].tongGiaThanh(albums));
                    }
                    break;
                default:
                    break;
            }
        } while (choose != 7);

    }
}
