/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

import java.util.Scanner;

/**
 *
 * @author HO TUNG DUONG
 */
public class PhanSo {
    // thuoc tinh 
    private int tuSo102;
    private int mauSo102;  
    //phuongthuc
    //ham khoi tao khong doi so
    public PhanSo(){
        tuSo102=0;
        mauSo102=1;
    }
    //ham khoi tao co doi so
    public PhanSo(int tuSo, int mauSo){
        this.tuSo102=tuSo;
        this.mauSo102=mauSo;
    }
    //ham nhap phan so
    public void nhapPS(Scanner sc){
        int a;
        int b;
        do {            
            System.out.println("\tNhap vao tu so");
            a=sc.nextInt();
            System.out.println("\tNhap vao mau so");
            b=sc.nextInt();  
            //kiemtra 
            if (b==0) {
                System.out.println("Mau phai khac 0.Hay nhap lai"); 
            } else {
                tuSo102=a;
                mauSo102=b;            }
        }
        while (b==0);
    }
    //ham hien thi
    public void hienthiPS(){
        if(tuSo102*mauSo102<0){
            System.out.println("\t-"+Math.abs(tuSo102)+"/"+Math.abs(mauSo102));
        }
        else{
            System.out.println("\t"+Math.abs(tuSo102)+"/"+Math.abs(mauSo102));
        }
    }
    //ham cong
    public PhanSo congPS(PhanSo ps2){
        int a= tuSo102*ps2.mauSo102+ps2.tuSo102*mauSo102;
        int b= mauSo102*ps2.mauSo102;
        return new PhanSo(a,b);
    }
    //ham tru
    public PhanSo truPS(PhanSo ps2){
        int a= tuSo102*ps2.mauSo102-ps2.tuSo102*mauSo102;
        int b= mauSo102*ps2.mauSo102;
        return new PhanSo(a,b);
    }
    //ham nhan
    public PhanSo nhanPS(PhanSo ps2){
        int a= tuSo102*ps2.tuSo102;
        int b= mauSo102*ps2.mauSo102;
        return new PhanSo(a,b);
    }
    //ham chia
    public PhanSo chiaPS(PhanSo ps2){
        int a= tuSo102*ps2.mauSo102;
        int b= mauSo102*ps2.tuSo102;
        return new PhanSo(a,b);
    }
    //ham tim uscln
    private int timUSCLN(int a,int b){
        int r=a%b;
        while (r!=0) {
            a=b;
            b=r;
            r=a%b;
            
        }
        return b;

    }
    //hay kiem tra phan so toi gian hay chua
    public boolean kiemTraToiGian(){
        if (timUSCLN(tuSo102, tuSo102)==1) {
            return true;
        }
        return false;   
    }
    //hamtoigian
    public void toiGianPS(){
        int x=timUSCLN(tuSo102, mauSo102);
        tuSo102/=x;
        mauSo102/=x;
        
        
    }

    void hienthiPS102() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void hienThiPS102() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
