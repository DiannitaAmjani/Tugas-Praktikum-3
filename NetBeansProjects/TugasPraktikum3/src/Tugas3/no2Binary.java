/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class no2Binary {
    public static void main(String[] args){
        System.out.println("Diannita Amjani (20090085)"+"\n");
        int A[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int search;
        int indeks1 = 0;//0
        int indeks2 = A.length-1;
        int ketemu = 0;
        int data = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan data yang akan dicari: ");
        search = scan.nextInt();
        System.out.println();
        
        System.out.println("Isi dari Data adalah: ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i]+"");
        }
        System.out.println("");
        System.out.println("");
        
        while((indeks1 <= indeks2 && (ketemu == 0))){
            data = (indeks1 + indeks2)/2;
            System.out.println("Indeks data: " + data);
            if(search == A[data]){
                ketemu = 1;
                System.out.println();
                System.out.println("Data" + search + "ada pada indeks ke-" + data);
            }
            else{
                if(search < A[data]){
                    System.out.println("Cari di sebelah kiri");
                    indeks2 = data - 1;
                }
                else{
                    indeks1 = data + 1;
                    System.out.println("Cari di sebelah kanan" + "\n");
                }
            }
            if(ketemu == 1)
                System.out.println("Keterangan: Data ditemukan" + "\n");
            else{
                System.out.println("Keterangan: Data tidak ditemukan" + "\n");
            }
        }
    }
    
}
