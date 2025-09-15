/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

import BAI2.QlCB;
import java.util.Scanner;

/**
 *
 * @author HO TUNG DUONG
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        QlCB qlcb=new QlCB();   
        qlcb.nhapDanhSach(sc);
        System.out.println("Nhap vao ho ten can tim kiem:");
        String name=sc.nextLine();
        qlcb.timKiemCanBO(name);
        //huy sc
        sc.close();
    }
   
}
