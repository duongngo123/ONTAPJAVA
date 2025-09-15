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
public class CanBo {
     private String hoTen102;
    private String ngaySinh102;
    private String gioiTinh102;
    private String diaChi102;
    //phuong thuc 
    //ham khoi tao khong doi so
    public CanBo(){
        
    }   
    //ham khoi tao co doi so
    public CanBo(String hoten,String NgaySinh,String gioiTinh,String diaChi){
        this.hoTen102=hoten;
        this.ngaySinh102=NgaySinh;
        this.gioiTinh102=gioiTinh;
        this.diaChi102=diaChi;
    }
    //ham nhap
    public void nhapThongTin(Scanner sc){
        System.out.println("\tNhap ho ten:");hoTen102=sc.nextLine();
        System.out.println("\tNhap ngay sinh(dd/MM/yyyy):");ngaySinh102=sc.nextLine();
        System.out.println("\tNhap gioi tinh:");gioiTinh102=sc.nextLine();
        System.out.println("\tNhap dia chi:");diaChi102=sc.nextLine();
        
    }
    //ham hien thi thong tin 
    public void hienThiThongTin(){
        System.out.println("\tHo ten:"+hoTen102);
        System.out.println("\tNgay sinh:"+ngaySinh102);
        System.out.println("\tGioi tinh:"+gioiTinh102);
        System.out.println("\tDia chi:"+diaChi102);
    }
    //ham lay thong tin ho ten
    public String getHoTen(){
    return this.hoTen102;
    }
}
