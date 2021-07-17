///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mycompany.baitapjavachuong1;
//
//import static java.lang.Math.sqrt;
//import java.util.Scanner;
//
///**
// *
// * @author ACER
// */
//public class Bai3a {
//   
//    
//    
//           public static int[] nhapmang(int array[] , int n )
//    {
//        Scanner scanner = new Scanner(System.in);
//       
//       for(int i = 0 ; i < n ; i++)
//       {
//           System.out.println(" Nhap vào phan a[" + i + "] = ");
//           array[i] = scanner.nextInt();
//       }
//    
//    return array;
//    }
//    
//    public static boolean ktNguyenTo(int n )
//    {
//        if( n < 2 )
//            return false;
//        else
//        {
//            int count = 0 ; 
//            for(int i = 2 ; i <= sqrt(n) ; i++)
//            {
//                if( n % i == 0 )
//                    count++;
//                
//                        
//            }
//            if(count == 0 )
//                return true;
//            else
//                return false;
//        }
//    }
//    public static int tongNguyenTo(int a[],int n )
//    {   
//        int dem = 0  ; 
//        for(int i = 0 ; i < n ; i++)
//        {
//            if( ktNguyenTo(a[i]) == true)
//                dem += a[i];
//                
//        }
//        return dem;
//    }
//    public static int timNguyenToMax(int a[],int n )
//    {
//         int max = 0  ; 
//        for(int i = 0 ; i < n ; i++)
//        {
//            if( ktNguyenTo(a[i]) == true && max < a[i])
//                max = a[i];
//            
//                
//        }
//        return max;
//    }
//    public static int demX(int a[], int n ,int x )
//    {   int dem = 0 ;
//        for(int i = 0 ; i < n ; i++)
//        {
//            if( a[i] == x )
//                dem++;
//            
//                
//        }
//        return dem;
//    }
//    public static void sapxep(int a[] , int n )
//    {   int tam =0;
//        for(int i = 0 ; i < n - 1 ; i++)
//        {
//            for(int j = i+1 ; j < n ; j++ )
//            {
//                if( a[i] < a[j])
//                {
//                        tam = a[j];
//                        a[j] = a[i];
//                        a[i] = tam ;
//                }    
//             } 
//        }
//                    
//    }
//    public static void xuatmang(int a[] , int n )
//    {
//        for(int i =0 ; i < n ; i++)
//             System.out.println(a[i] +" ");
//    }
//    public static void main(String[] args)
//    {
//       
//       System.out.println(" Nhap vao so luong phan tu :");
//       Scanner scanner = new Scanner(System.in);
//       int a = scanner.nextInt();
//       int array[] = new int[a];
//       nhapmang(array ,a );
////       int array[] = new int[a];
////       for(int i = 0 ; i < a ; i++)
////       {
////           System.out.println(" Nhap vào phan a[" + i + "] = ");
////           array[i] = scanner.nextInt();
////       }
//       System.out.println("\t");
//       System.out.println(" Cac phan tu trong mang la \n");
//       for(int i = 0 ; i < a ; i++)
//       {
//           System.out.println(array[i] +" ");
//           
//       }
//        System.out.println("\t");
//        
//        
//        
//        System.out.println("Trong mang co tong cac so nguyen to la "+ tongNguyenTo(array , a));
//        
//        if( timNguyenToMax(array , a) == 0 )
//            System.out.println(" Khong co so nguyen to trong mang ");
//        else
//            System.out.println("So nguyen to MAx = " +timNguyenToMax(array , a) );
//        
//        
//        System.out.println(" Nhap vao 1 so de dem so lan xuat hien : ");
//        
//        int b = scanner.nextInt();
//        
//        System.out.println(" So " + b + " co " + demX(array , a , b )+ " lan xuat hien trong mang ");
//        
//        
//        
//        sapxep(array , a );
//        System.out.println("Mang sau khi da sap xep la : \n");
//        xuatmang(array , a );
//  
//    }
//    
//    
//    
//    
//}
