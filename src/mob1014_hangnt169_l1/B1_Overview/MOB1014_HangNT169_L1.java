/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mob1014_hangnt169_l1.B1_Overview;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class MOB1014_HangNT169_L1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * 1. Nhap du lieu ban phim scanf => C Scanner => java Code Java => AN
         * CTRL SPACE NHIEU DE GOI Y CODE 2. In ra printf => C System.out..
         */
//        Scanner sc = new Scanner(System.in);
//        Scanner scan = new Scanner(System.in); // Cu phap cua Scanner 
        //Nhập tên, địa chỉ, quê quán của người yêu cũ và in ra màn hình.
        // B1: Moi nhap tu ban phim.
//        System.out.println("Moi nhap ten:");
//        String ten = scan.nextLine();// Nhap chuoi tu ban phim
//        System.out.println("Moi nhap dia chi:");
//        String diaChi = scan.nextLine();
//        System.out.println("Moi nhap que quan:");
//        String queQuan = scan.nextLine();
//
//        // B2: In ra man hinh
//        System.out.println("Ten : " + ten);
//        System.out.println("Dia chi : " + diaChi);
//        System.out.println("Que quan : " + queQuan);
        /**
         * Scanner: nhap du lieu tu ban phim nextLine => Nhap chuoi nextInt =>
         * Nhap so nguyen nextFloat => Nhap so thuc ...
         *
         */
//        System.out.println("Moi nhap so nguyen:");
//        int number = scan.nextInt();
//        float number1 = scan.nextFloat();
//        nextDouble
        // B2:Nhập tuổi, chiều cao, cân nặng của bản thân và in ra màn hình
        //nhập tuổi, chiều cao, cân nặng cua bản thân in ra
//        System.out.println("nhap tuoi:");
//        int tuoi = sc.nextInt();
//        System.out.println("nhap chieu cao:");
//        float chieucao = sc.nextFloat();
//        System.out.println("nhap can nang:");
//        double cannang = sc.nextDouble();
//
//        System.out.println("tuoi cua ban la:" + tuoi);
//        System.out.println("chieu cao cua ban la:" + chieucao);
//        System.out.println("can nang cua ban la:" + cannang);
        // B3: Nhập mssv, tên, tuổi, địa chỉ,  nganh hoc,  cân nặng, của bản thân và in ra màn hình 
        /**
         * Co 2 cach fix troi lenh c1: Them scan.nextLine() => o giua dong ma bi
         * troi lenh C2: Coi tat ca moi thu nhap tu ban phim luon luon la chuoi.
         * Sau do ep kieu ve kieu du lieu tuong ung
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi nhap MSSV:");
        String mssv = scan.nextLine();
        System.out.println("Moi nhap ten:");
        String ten = scan.nextLine();
        System.out.println("Moi nhap tuoi:");
//        String tuoiStr = scan.nextLine();
        // tuoi : int 
        // can ep : String => int
//        int tuoi = Integer.valueOf(scan.nextLine());
        int tuoi = Integer.valueOf(scan.nextLine());
//        int tuoi = scan.nextInt();
        // C1: Them nextLine
//        scan.nextLine();
        System.out.println("Moi nhap dia chi:");
        String diaChi = scan.nextLine();
        System.out.println("nhap can nang:");
//        double cannang = scan.nextDouble();
        double canNang = Double.valueOf(scan.nextLine());
//        scan.nextLine();
        System.out.println("nhap nganh cao:");
        String nganhHoc = scan.nextLine();

        System.out.println("MSSV:" + mssv);
        System.out.println("Ten:" + ten);
        System.out.println("Tuoi:" + tuoi);
        System.out.println("Dia chi:" + diaChi);
        System.out.println("Nganh hoc:" + nganhHoc);
        System.out.println("Can nang:" + canNang);

    }

}
