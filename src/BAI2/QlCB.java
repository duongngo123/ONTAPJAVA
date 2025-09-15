/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author HO TUNG DUONG
 */
import java.util.ArrayList;
import java.util.Scanner;
public class QlCB {
    //thuoc tinh
    private ArrayList<CanBo>dscb102;
    //phuong thuc
    //ham khoi tao
    public QlCB(){
       dscb102=new ArrayList<CanBo>(10);
    }
    //ham them can bo
    public void themCanBo(CanBo cb){
        dscb102.add(cb);
    }
    public void nhapDanhSach(Scanner sc){
        CanBo cb;
        System.out.println("Nhap vao so luong can bo:");
        int n=sc.nextInt();sc.nextLine();
        System.out.println("Nhap thong tin chi tiet:");
        for (int i = 0; i < n; i++) {
            System.out.println("Lan Nhap thu "+(i+1)+":");
            System.out.println("Chon Can Bo(1-KySu;-NhanVien;3-CongNhan:");
            int chon=sc.nextInt();sc.nextLine();
            cb=new CanBo();
            switch (chon) {
                case 1:
                    cb=new KySu();                  
                    break;
                case 2:
                    cb=new NhanVien();                  
                    break;
                case 3:
                    cb=new CongNhan();                  
                    break;
                default:
                      cb=new KySu();      
                      break;
            }
            //sau khi chon loai can bo thi nhap thong tin cho can bo do
            cb.nhapThongTin(sc);
            //nhap xong thi them can bo do vao danh sach
            themCanBo(cb);
            
    }
    }
    //ham tim kiem theo ten
    public void timKiemCanBO(String hoTen) {
        for(CanBo cb:dscb102){
            if (hoTen.equals(cb.getHoTen())) {
                cb.hienThiThongTin();
            }
        }
    }
}
