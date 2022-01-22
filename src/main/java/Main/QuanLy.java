package Main;
import  java.util.Scanner;
import java.util.Vector;
/*
import  CoHuu.*;
import  ThinhGiang.*;
import  GiangVien.*;
*/
public class QuanLy {
    private Vector<GiangVien> v = new Vector<GiangVien>();
    public void addCoHuu(CoHuu ch){
        v.add(ch);
    }
    public void addThinhGiang(ThinhGiang tg){
        v.add(tg);
    }
    public void inDanhSach(){
        System.out.println("=====DANH SACH GIANG VIEN=====");
        for(int i = 0; i < v.size(); i++)
        {
            System.out.println("**Giang vien thu " + (i+1));
            v.get(i).inGiangVien();
        }
    }
}