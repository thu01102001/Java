package OOP;

import java.util.Scanner;

public class Test {

    //nhap thong tin cho 1 xe va tra ve doi tuong Vehicle
    public static Vehicle nhapXe() {
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = new Vehicle();
        System.out.println("Nhap ma xe: ");
        vehicle.setMaXe(scanner.nextInt());
        System.out.println("Nhap dung tich xe: ");
        vehicle.setDungTich(scanner.nextInt());
        System.out.println("Nhap tri gia: ");
        vehicle.setTriGia(scanner.nextFloat());
        scanner.nextLine();
        System.out.println("Nhap chu xe: ");
        vehicle.setChuXe(scanner.nextLine());
        System.out.println("Nhap mo ta: ");
        vehicle.setMoTa(scanner.nextLine());
        System.out.println("+++++++++++++++");
        return vehicle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = null;
        int quality = 0;
        int choose = 0;
        do {
            System.out.println("Ban chon lam gi !!!!!");
            System.out.println("1. Tao cac doi tuong xe va nhap thong tin");
            System.out.println("2. Xuat bang ke khai tien thue cac xe");
            System.out.println("3. Thoat");
            System.out.println("Nhap lua chon cua ban: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Nhap so luong xe ban muon khai bao thue: ");
                    quality = scanner.nextInt();
                    vehicles = new Vehicle[quality];
                    for (int i = 0; i < quality; i++) {
                        System.out.println("Xe thu " +(i+1));
                        vehicles[i] = nhapXe(); //luu thong tin vao mang
                    }
                    break;

                case 2:
                    System.out.println("In thue");
                    System.out.println("In thue");
                    if (vehicles == null || quality <= 0) { // Kiểm tra nếu vehicles là null hoặc không có xe nào
                        System.out.println("Chua co xe nao duoc nhap");
                    } else {
                        for (int i = 0; i < quality; i++) {
                            vehicles[i].inThue(); // Gọi phương thức inThue từ lớp Vehicle
                        }
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
