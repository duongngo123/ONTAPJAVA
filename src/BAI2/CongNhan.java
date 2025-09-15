/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

import java.util.Scanner;

/**
 *
 * @author HO TUNG DUONG
 */
public class CongNhan extends CanBo{
    //thuoc tinh
    private String bac102;
    //phuong thuc 
    //ham khoi tao khong doi so
    public CongNhan(){
        
    }
    //ham khoi tao co doi so
    public CongNhan(String hoten,String NgaySinh,String gioiTinh,String diaChi,String bac){
        super(hoten, NgaySinh, gioiTinh, diaChi);
        this.bac102=bac;
        
    }
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("\tNhap bac");bac102=sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tBac:"+bac102);
    }
}
