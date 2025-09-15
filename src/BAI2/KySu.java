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
public class KySu extends CanBo{
    //thuoc tinh
    private String nganhDaoTao102;
    //phuong thuc 
    //ham khoi tao khong doi so
    public KySu(){
        
    }
    //ham khoi tao co doi so
    public KySu(String hoten,String NgaySinh,String gioiTinh,String diaChi,String nganhDaoTao){
        super(hoten,NgaySinh,gioiTinh,diaChi);
        this.nganhDaoTao102=nganhDaoTao;
        
    }
    //ham nhap
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("\tNhap nganh dao tao:");nganhDaoTao102=sc.nextLine();
        
    }
    //ham hien thi
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tp nganh dao tao"+nganhDaoTao102);
    }
}
