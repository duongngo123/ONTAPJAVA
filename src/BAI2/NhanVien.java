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
public class NhanVien extends CanBo{
    //thuoc tinh
    private String congViec102;
    
    //phuong thuc
    //ham khoi tao khong doi so
    public NhanVien(){
        
    }
    //ham khoi tao cos doi so
    public NhanVien(String hoten,String NgaySinh,String gioiTinh,String diaChi,String congViec){
        super(hoten,NgaySinh,gioiTinh,diaChi);
        this.congViec102=congViec;
    }
    //ham nhap
    public void nhapThongtin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("\t Nhap cong viec:");congViec102=sc.nextLine();
    }
    //ham hien thi 
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("/tCong viec;"+congViec102);
    }
}
