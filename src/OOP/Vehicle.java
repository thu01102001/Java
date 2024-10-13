package OOP;

public class Vehicle {
    private int maXe, dungTich;
    private double triGia;
    private String chuXe, moTa;

//    public Vehicle(int maXe, int dungTich, double triGia, String chuXe, String moTa) {
//        this.maXe = maXe;
//        this.dungTich = dungTich;
//        this.triGia = triGia;
//        this.chuXe = chuXe;
//        this.moTa = moTa;
//    }

    public Vehicle() {
    }

    public int getMaXe() {
        return maXe;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public  double tinhThue() {
        double thue = 0f;
        if(this.dungTich < 100) {
            thue = this.triGia * 0.1;
        } else if(this.dungTich >= 100 && this.dungTich < 200) {
            thue = this.triGia * 0.03;
        }
        else {
            thue = this.triGia * 0.05;
        }
        return thue;
    }

    public void inThue() {
        System.out.println("Ma xe: " +getMaXe());
        System.out.println("Dung tich: " +getDungTich());
        System.out.println("Tri gia: " +getTriGia());
        System.out.println("Chu xe: " +getChuXe());
        System.out.println("Mo ta: " +getMoTa());
        System.out.println("Thue: " +tinhThue());
    }

}
