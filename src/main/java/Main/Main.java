package Main;
import  java.util.Scanner;
/*
import GiangVien.*;
import CoHuu.*;
import ThinhGiang.*;
import QuanLy.*;
*/
public class Main {
    public static void main(String[] args) {
        QuanLy ql = new QuanLy();
        int key = -1;
        while(key != 0)
        {
            System.out.println("=======MENU=======");
            System.out.println("1.Nhap thong tin giang vien");
            System.out.println("2.In ra danh sach giang vien");
            System.out.println("3.Xoa,sua giang vien");
            System.out.println("4.In ra danh sach giang vien co huu");
            System.out.println("5.In ra danh sach giang vien thinh giang");
            System.out.println("6.Tim kiem giang vien gan dung");
            System.out.println("7.Sap xep danh sach theo ho ten, he so luong, theo luong linh");
            System.out.println("8.Tinh tong so tien luong cua toan bo giang vien, trung binh luong");
            System.out.println("9.Tim giang vien co tong luong cao nhat");
            System.out.println("0.Ket thuc chuong trinh");
            Scanner sc = NhapXuat.sc;
            key = sc.nextInt();
            if(key == 1)
            {
                System.out.println("***1.Giang vien co huu***");
                System.out.println("***2.Giang vien thinh giang***");
                int key2 = sc.nextInt();
                if(key2 == 1)
                {
                    CoHuu a = new CoHuu();
                    a.nhapGiangVien();
                    ql.addCoHuu(a);
                }
                else{
                    ThinhGiang b = new ThinhGiang();
                    b.nhapGiangVien();
                    ql.addThinhGiang(b);
                }
            }
            else if(key == 2)
            {
                ql.inDanhSach();
            }
        }
        System.out.println("=======Chuong trinh ket thuc=======");
    }
}
