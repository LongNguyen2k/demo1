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
//public class Bai4 {
//    public static int[][] nhapMaTran(int a[][], int rows , int cols )
//    {   Scanner scanner = new Scanner(System.in);
//        for(int i = 0 ; i < rows ; i ++)
//        {
//            for(int j = 0 ; j <cols; j++)
//            {
//                System.out.println(" Nhap vao phan tu a[" + i + "][" + j + "] = ");
//                a[i][j] = scanner.nextInt();
//                
//            }
//        }
//        return a;
//        
//    }
//    
//    public static void xuatMaTran(int a[][], int rows , int cols )
//    {   
//        for(int i = 0 ; i < rows ; i ++)
//        {
//            for(int j = 0 ; j <cols; j++)
//            {
//                System.out.print(a[i][j] + "\t");
//                
//            }
//            System.out.print("\n");
//        }
//       
//        
//    }
//    public static int tongMaTran(int a[][] , int rows , int cols)
//    {
//        int tong = 0 ; 
//         for(int i = 0 ; i < rows ; i ++)
//        {
//            for(int j = 0 ; j <cols; j++)
//            {
//                
//                tong += a[i][j];
//            }
//            
//        }
//         return tong;
//       
//    }
//    public static int tongMaTranTrenDong(int a[][] , int rowselect ,int cols)
//    {
//        int tong = 0 ; 
//       for(int j = 0 ; j < cols ; j++  )
//       {
//           tong += a[rowselect][j];
//       }
//       return tong;
//       
//    }
//    public static int tongMaTranTrenCot(int a[][] , int rows ,int colselect)
//    {
//        int tong = 0 ; 
//       for(int j = 0 ; j < rows ; j++  )
//       {
//           tong += a[j][colselect];
//       }
//         return tong;
//       
//    }
//    public static int ChiSoDongCoTongLonNhat(int a[][], int rows ,int cols)
//    {
//        int maxtrendong = tongMaTranTrenDong(a , 0 , cols);
//        int chisodongmax = 0 ;
//        int tongtrendong;
//        for( int i = 1 ; i < rows ; i ++)
//        {
//            tongtrendong = tongMaTranTrenDong( a , i , cols);
//            if( maxtrendong < tongtrendong)
//            {
//                maxtrendong = tongtrendong;
//                chisodongmax = i ; 
//            }
//            
//        }
//        return chisodongmax ; 
//        
//       
//    }
//     public static int ChiSoCotCoTongLonNhat(int a[][], int rows ,int cols)
//    {
//        int maxtrencot = tongMaTranTrenCot(a ,rows , 0);
//        int chisocotmax = 0 ;
//        int tongtrencot;
//        for( int i = 1 ; i < cols ; i ++)
//        {
//            tongtrencot= tongMaTranTrenCot( a , rows, i);
//            if( maxtrencot < tongtrencot)
//            {
//                maxtrencot = tongtrencot;
//                chisocotmax = i ; 
//            }
//            
//        }
//        return chisocotmax ; 
//        
//       
//    }
//    
//    public static void main(String[] args)
//    {
//        int rows ;
//        int cols;
//        int sumrows;
//        int sumcols;
//        int sumrowmax;
//        int sumcolmax ; 
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao so dong :");
//        rows = scanner.nextInt();
//        System.out.println("Nhap vao so cot: ");
//        cols = scanner.nextInt();
//        int martrix[][] = new int[rows][cols];
//        nhapMaTran(martrix , rows , cols);
//        
//        System.out.println(" Cac phan tu trong mang la :\n");
//        xuatMaTran(martrix , rows , cols );
//        System.out.print(" Nhap vao dong can tinh tong :");
//        sumrows = scanner.nextInt();
//         System.out.print(" Nhap vao cot can tinh tong :");
//        sumcols = scanner.nextInt();
// System.out.print(" Tong cua phan tu tren dong "+ sumrows + " = " + tongMaTranTrenDong(martrix, sumrows , cols) + "\t");
// System.out.print(" Tong cua phan tu tren cot "+ sumcols + " = " + tongMaTranTrenCot(martrix, rows , sumcols) + "\t");       
//        
// 
//        System.out.print(" Chi so dong co tong lon nhat la "+ ChiSoDongCoTongLonNhat(martrix , rows , cols));
//         System.out.print(" Chi so cot co tong lon nhat la "+ ChiSoCotCoTongLonNhat(martrix , rows , cols));
//                
//                
//    }
//}
