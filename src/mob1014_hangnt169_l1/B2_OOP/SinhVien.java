/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1014_hangnt169_l1.B2_OOP;

/**
 *
 * @author hangnt
 */
public class SinhVien {
//     * Tao class SinhVien gom cac thuoc tinh:
//         *  - mssv - String , ten - String, tuoi - int, 
//         *  chieuCao - double, matKhauFacebook - String
//         * va cac contructor, getter, setter , inThongTin(): void

    private String mssv; //=> gia tri mac dinh : null
    private String ten;
    private int tuoi;// => gia tri mac dinh : 0
    private double chieuCao; // 0.0
    private String matKhauFaceBook;

    // C1: Chuot phai => insert code
//    public SinhVien() {
//    }
//
//    public SinhVien(String mssv, String ten, int tuoi, double chieuCao, String matKhauFaceBook) {
//        this.mssv = mssv;
//        this.ten = ten;
//        this.tuoi = tuoi;
//        this.chieuCao = chieuCao;
//        this.matKhauFaceBook = matKhauFaceBook;
//    }
//    
    // C2: Ctrl space
    // Co 2 loai contructor:
        // Contructor khong tham so
        // Contructor co tham so 
    // Default cua 1 class : Contructor khong tham so 
    // DHNB: 
        // 1. Ten contructor trung vs ten class
        // 2. Khong co gia tri tra ve(Khong co return)
    // Contructor : Khoi tao doi tuong
    public SinhVien() {
    }

    // Contructor co tham so
    public SinhVien(int tuoi, double chieuCao, String matKhauFaceBook) {
        this.tuoi = tuoi;
        this.chieuCao = chieuCao;
        this.matKhauFaceBook = matKhauFaceBook;
    }

    public SinhVien(String matKhauFaceBook) {
        this.matKhauFaceBook = matKhauFaceBook;
    }

    public SinhVien(String mssv, String ten, int tuoi, double chieuCao, String matKhauFaceBook) {
        this.mssv = mssv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.chieuCao = chieuCao;
        this.matKhauFaceBook = matKhauFaceBook;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public String getMatKhauFaceBook() {
        return matKhauFaceBook;
    }

    public void setMatKhauFaceBook(String matKhauFaceBook) {
        this.matKhauFaceBook = matKhauFaceBook;
    }

    public void inThongTin() {
        // in thong tin Sinh Vien 
        // Co bn thuoc tinh . => Bang day cai sout
        System.out.println("MSSV : " + mssv);
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi : " + tuoi);
        System.out.println("Chieu cao: " + chieuCao);
        System.out.println("Mat khai FB: " + matKhauFaceBook);
    }

}
