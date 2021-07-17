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
//public class Bai2d {
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Nhap vao chuoi ky tu : ");
//        String s = scanner.nextLine();
//       char kytu ;
//       int kytuep ; 
//       int dem  ;
//       int khoidauchuoi = 0 ;
//       String alts ; 
//       int maxofstrnum = 0 ;
//       String maxofstr = s;
//       int tam ;
//       for(int i = 0 ; i < s.length() ; i++ )
//       {
//           kytu = s.charAt(i);
//           if(Character.isSpaceChar(kytu) )
//           {    
//               alts = s.substring(khoidauchuoi,i );
//               dem = 0 ;
//               for(int j = 0 ; j < alts.length() ; j++)
//               {
//                   dem++;
//               }
//               if( maxofstrnum < dem)
//               {
//                   maxofstrnum = dem;
//                   maxofstr = alts;
//               }
//               tam = i ;
//               khoidauchuoi = ++tam ; 
//               
//            }
//           tam = 0 ;
//           if( maxofstrnum == 0 )
//               maxofstrnum = s.length();
//           
//       }
//        System.out.println(" Tu dai nhat la " + maxofstr);
//         System.out.println(" co So  ky Tu dai nhat la " +  maxofstrnum);
//    }
//}
