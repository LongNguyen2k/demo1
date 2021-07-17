///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mycompany.baitapjavachuong1;
//
//import java.io.File;
//import java.util.Scanner;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//
//
///**
// *
// * @author ACER
// */
//public class Bai2C {
//    public static void main(String[] args) throws FileNotFoundException
//    {
//       File f = new File("E:\\LaptrinhHuongDoiTuong\\BaitapChuong1\\BaiTapJavaChuong1\\src\\input.txt");
//       Scanner scanner = new Scanner(f);
//       String name ;
//       int n ;
//       name = scanner.nextLine();
//       
//       
//       System.out.println(name + " \t");
//       String s2 = name.replaceAll("\\{file\\}","tap tin");
//       File f2 = new File("E:\\LaptrinhHuongDoiTuong\\BaitapChuong1\\BaiTapJavaChuong1\\src\\output.txt");
//      
//        PrintWriter writer = new PrintWriter(f2) ;
//            writer.println(s2);
//        
//        writer.close();
//     
//       
//            
//            
//           
//        
//    }
//  
//}
//    
