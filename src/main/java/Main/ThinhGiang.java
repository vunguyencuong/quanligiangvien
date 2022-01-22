package Main;

import  java.util.Scanner;
//import GiangVien.*;
public class ThinhGiang extends GiangVien {
    private  String coQuan;
    private int luong = 0;
    public void nhapGiangvien(){
        super.nhapGiangVien();
        Scanner sc = NhapXuat.sc;
        System.out.println("Co quan cong tac: ");
        sc.nextLine();
        coQuan = sc.nextLine();
    }
    public void inGiangVien(){
        super.inGiangVien();
        System.out.print("Luong cua giang vien: " + solve());
    }
    public int solve(){
        luong = 200000 * getTime();
        luong *= 1 + getHeSoLuong();
        return luong;
    }
}
