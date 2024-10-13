package OOP;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
    private long soTK;
    private String tenTK;
    private double soTienTrongTK;

    public Account(long soTK, String tenTK, double soTienTrongTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK = soTienTrongTK;
    }

    public Account() {

    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTienTrongTK() {
        return soTienTrongTK;
    }

    public void setSoTienTrongTK(double soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }

    public static Account nhapTK() {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Nhap so tai khoan: ");
        account.setSoTK(scanner.nextLong());
        scanner.nextLine();
        System.out.println("Nhap ten tai khoan: ");
        account.setTenTK(scanner.nextLine());
        account.setSoTienTrongTK(50);
        return account;
    }
    public String toString() {
        //Dinh dang so tien
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(this.soTienTrongTK);
        return this.getSoTK()+ " - " +this.getTenTK()+ " - " +str1;
    }

    public double napTien() {
        Scanner scanner = new Scanner(System.in);
        double nap;
        System.out.println("Nhap so tien ban muon nap: ");
        nap = scanner.nextDouble();
        if(nap >= 0) {
            soTienTrongTK = soTienTrongTK + nap;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(nap);
            System.out.println("Ban vua nap " +str1+ " vao tai khoan");
        }
        else {
            System.out.println("So tien khong hop le");
        }
        return nap;
    }

    public double rutTien() {
        Scanner scanner = new Scanner(System.in);
        double phi = 5;
        double rut;
        System.out.println("Nhap so tien ban muon rut: ");
        rut = scanner.nextDouble();
        if(rut <= (soTienTrongTK + phi)) {
            soTienTrongTK = soTienTrongTK - (rut + phi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("Ban vua rut " +rut+ " trong tai khoan");
        }
        else {
            System.out.println("So tien rut khong hop le");
            return rutTien();
        }
        return rut;
    }

    public double daoHan() {
        double laiSuat = 0.035;
        soTienTrongTK = soTienTrongTK + soTienTrongTK * laiSuat;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTrongTK);
        System.out.println("Ban vua duoc " +str1+ " tu dao han 1 thang");
        return soTienTrongTK;
    }

    public void inTK() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTrongTK);
        System.out.printf("%-10d %-20s %-20s \n", getSoTK(), getTenTK(), str1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        Account[] accounts = null; //list ban dau null
        int choose;
        int quality = 0;
        long s,d;
        do{
            System.out.println("1. Nhap thong tin khach hang");
            System.out.println("2. Xuat danh sach thong tin khach hang");
            System.out.println("3. Nap tien");
            System.out.println("4. Rut tien");
            System.out.println("5. Dao han");
            System.out.println("6. Thoat");
            System.out.println("Nhap lua chon cua ban: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Nhap so luong khach hang muon nhap");
                    quality = scanner.nextInt();
                    accounts = new Account[quality];
                    for (int i = 0; i < quality; i++) {
                        accounts[i] = nhapTK();
                    }
                    break;

                case 2:
                    System.out.println("Xuat thong tin");
                    System.out.printf("%-10s %-20s %-20s\n", "Số TK", "Tên TK", "Số tiền trong TK");
                    for (int i = 0; i < quality; i++) {
                        accounts[i].inTK();
                    }
                    break;

                case 3:
                    System.out.println("Nhap so tai khoan cua khach hang can nap tien");
                    s = scanner.nextLong();
                    for (int i = 0; i < quality; i++) {
                        d = accounts[i].getSoTK();
                        if(s == d) {
                            System.out.println("Ban chon tai khoan: " +d);
                            accounts[i].napTien();
                            break;
                        }
                        else {
                            System.out.println("So tai khoan khong dung");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Nhap so tai khoan cua khach hang muon rut tien");
                    s = scanner.nextLong();
                    for (int i = 0; i < quality; i++) {
                        d = accounts[i].getSoTK();
                        if(s == d) {
                            System.out.println("Ban chon tai khoan: " +d);
                            accounts[i].rutTien();
                            break;
                        }
                        else {
                            System.out.println("So tai khoan khong dung");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Nhap so tai khoan cua khach hang muon dao han");
                    s = scanner.nextLong();
                    for (int i = 0; i < quality; i++) {
                        d = accounts[i].getSoTK();
                        if(s == d) {
                            System.out.println("Ban chon tai khoan: " +d);
                            accounts[i].daoHan();
                            break;
                        }
                        else {
                            System.out.println("So tai khoan khong dung");
                        }
                    }
                    break;

                case 6:
                    System.out.println("cam on");
                    break;

                default:
                    break;
            }
        } while (choose != 6);
    }
}
