package Main;
import  java.util.Scanner;
//import GiangVien.*;
public class CoHuu extends GiangVien {
    private int luongCung = 0,luong = 0;
    public final int timeDefault = 40;
    public void nhapGiangVien(){
        Scanner sc = NhapXuat.sc;
        super.nhapGiangVien();
        System.out.println("Luong thoa thuan: ");
        sc.nextLine();
        luongCung = sc.nextInt();
    }
    public void inGiangVien(){
        super.inGiangVien();
        System.out.println("Luong cua giang vien: " + solve());
    }
    public int solve(){
        if(getTime() >= 40) {
            luong = luongCung + 50000 * (getTime() - 40);
            luong *= 1 + getHeSoLuong();
        }
        else{
            luong = luongCung;
            luong *= 1 + getHeSoLuong();
        }
        return luong;
    }
}
