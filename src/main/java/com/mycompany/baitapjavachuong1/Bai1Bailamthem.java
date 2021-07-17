///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mycompany.baitapjavachuong1;
//
//import static java.lang.Math.pow;
//import java.util.Scanner;
//
///**
// *
// * @author ACER
// */
//public class Bai1Bailamthem {
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner (System.in);
//        System.out.print("Nhap vao cap bat cua da thuc: ");
//        int s = scanner.nextInt();
//        int array[] = new int[s+1];
//        for(int i = 0 ; i <= s ; i++)
//        {
//            System.out.print("Nhap vao hệ So của phan tu trong Da thuc co Mu" + i + " = " );
//            array[i] = scanner.nextInt();
//            
//            
//        }
//        int x ;
//        System.out.print(" Nhap vao An X = ");
//        x = scanner.nextInt();
//        
//      
//        System.out.print("Gia tri Da thuc bac " + s  );
//        System.out.print(" f(" + s +" ) = ");
//        for(int i = s ; i >= 0 ; i-- )
//        {   
//             if( i == 0 )
//                 System.out.print( array[i] + "x^" + i + " = ");
//             else
//                System.out.print( array[i] + "x^" + i + " + ");
//                
//        }
//        System.out.println( " Voi An X = " + x );
//       System.out.print(" f(" + s +" ) = ");
//       for(int i = s ; i >= 0 ; i-- )
//        {   
//             if( i == 0 )
//                 System.out.print( array[i] + "." + x + "^" + i + " = ");
//             else
//                System.out.print( array[i] + "." + x +  " ^" + i + " + ");
//                
//        }
//       double giatriDathuc = 0 ;
//       for( int i = 0 ; i <= s ; i++ )
//       {
//           if( i >= 1  )
//           {
//               giatriDathuc += array[i]*( pow(x , i ));
//           }
//           else
//               giatriDathuc += array[i] ;
//       }
//       System.out.print(giatriDathuc);
//        
//        
//    }
//}
