package Main;
import  java.util.Scanner;
public class GiangVien {
    private String maGiangVien,tenGiangVien,email,hocHam,hocVi,diaChi,phone;
    private int time;
    private double heSoLuong = 0;
    public void setGiangVien(String maGiangVien, String tenGiangVien, String email, String hocHam, String hocVi, String diaChi, String phone, int time, double heSoLuong)
    {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
        this.email = email;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.diaChi = diaChi;
        this.phone = phone;
        this.time = time;
        this.heSoLuong = heSoLuong;
    }
    public int getTime(){
        return time;
    }
    public double getHeSoLuong(){
        return heSoLuong;
    }
    public String getTenGiangVien(){
        return tenGiangVien;
    }
    public void nhapGiangVien(){
        Scanner sc = NhapXuat.sc;
        sc.nextLine();
        System.out.println("Nhap ma cua giang vien: ");
        maGiangVien = sc.nextLine();
        System.out.println("Nhap ho va ten cua giang vien: ");
        tenGiangVien = sc.nextLine();
        System.out.println("Dia chi email cua giang vien: ");
        email = sc.nextLine();
        System.out.println("Hoc ham (khong, giao su, pho giao su): ");
        hocHam = sc.nextLine();
        System.out.println("Hoc vi (dai hoc, thac si, tien si): ");
        hocVi = sc.nextLine();
        System.out.println("Dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("So dien thoai: ");
        phone = sc.nextLine();
        System.out.println("So gio giang day trong thang: ");
        time = sc.nextInt();
        System.out.println("He so luong: ");
        heSoLuong = sc.nextDouble();
        if(hocVi.equals("dai hoc")) heSoLuong += 1;
        else if(hocVi.equals("thac si")) heSoLuong += 1.1;
        else heSoLuong += 1.2;
        if(hocHam.equals("giao su")) heSoLuong += 0.2;
        else heSoLuong += 0.1;
    }
    public void  inGiangVien(){
        System.out.println("Ma giang vien: " + maGiangVien);
        System.out.println("Ten giang vien: " + tenGiangVien);
        System.out.println("Dia chi Email: " + email);
        System.out.println("Hoc ham: " + hocHam);
        System.out.println("Hoc vi: " + hocVi);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Dien thoai: " + phone);
        System.out.println("So gio giang day trong thang: " + time);
        System.out.println("He so luong: " + heSoLuong);
    }
}