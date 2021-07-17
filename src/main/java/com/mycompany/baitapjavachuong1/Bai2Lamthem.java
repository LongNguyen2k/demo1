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
//public class Bai2Lamthem {
//    public static void main (String[] args)
//    {   int count = 1 ;
//        int index = 0 ;
//        String[] str ;
//         System.out.print(" Nhap vao DO DA CUA CHUOI chuoi");
//        Scanner scanner = new Scanner(System.in);
//        int strlen = scanner.nextInt();
//        str = new String[strlen];
//        System.out.print(" Nhap vao chuoi");
//       
//       for( int i = 0 ; i < strlen ; i ++)
//       {
//           str[i] = "\0";
//       }
//       for( int i = 0 ; i <strlen ; i++ )
//       {
//           str[i] = scanner.next();
//       }
//       boolean setval ;
//        for( int i = 0 ; i < strlen ; i++)
//        {   setval = str[i].equals(str[i+1]);
//            if( setval == true )
//                count++;
//            else
//            {
//                if( count > 1 )
//                {    
//                    str[index] = String.valueOf(count);
//                    index++;
//                    str[index] = str[i-1];
//                    index++;
//                    count = 1 ;
//                         
//                }
//                else
//                {
//                    str[index] = str[i];
//                    index++;
//                }
//            }
//        }
//        System.out.print(" Chuoi Sau khi da nen la :");
//        for( int i = 0 ; i < strlen ; i++)
//        {   setval = str[i].equals("\0");
//            if( setval == true )
//                break;
//            else
//                System.out.print(str[i]);
//        }
//    }
//}
