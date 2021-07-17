///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mycompany.baitapjavachuong1;
//
//import java.util.Scanner;
//
///**
// *
// * @author ACER
// */
//public class Bai2 {
//    public static void main(String[] args)
//    {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println(" Nhap vao 1 chuoi co dau @:");
//    String s = scanner.nextLine();
//    
//    int a = s.indexOf("@");
//    System.out.println(s.substring(0, a));
//    
//    System.out.println("\n Nhap vao 1 chuoi de kiem tra co ky tu in hoa: ");
//    String b = scanner.nextLine();
//    int dem = 0 ;
//    char kytu ;
//    for( int i  = 0 ; i < b.length(); i++)
//    {
//        kytu = b.charAt(i);
//        if(Character.isUpperCase(kytu))
//            dem++;
//        
//    }
//    System.out.println(b + "\n");
//    System.out.println(" Co " + dem + " ky tu in hoa ");
//    }
//}
