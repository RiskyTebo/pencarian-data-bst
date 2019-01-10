/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectalgoritma2;

//import package
import java.util.Scanner;

/**
 *
 * @author Risky Feryansyah Pribadi(171111040)
 * @author Shania Saraswati (171111011)
 * @author Nurami Nasrullah
 * @author Randika
 */
public class Main {

       static BinaryTree tree = new BinaryTree();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        menginialisasi input untuk menjadi sebuah inputan data
        Scanner input = new Scanner(System.in);
        int banyak = 0, 
                data,
                nilaiCari;
        String pilihan = "",jawaban,jawabanPencarian;
        
        System.out.println("##### Applikasi Pencarian Data Pada Binary Search Tree #####");
        System.out.println("------------------------------------------------------------");
        System.out.print("Masukkan Berapa Banyak Data ke Binary Search Tree : ");
        banyak = input.nextInt();
        
        for(int i=0; i<banyak; i++)
        {
            System.out.print("Masukkan Data ke Binary Search Tree : ");
            data = input.nextInt();
            tree.masukkanNilaiTree(data);
        }
        System.out.println("------------------------------------------------------------");
        
        do {           
            
            System.out.println("1. Menampilkan Secara inOrder");
            System.out.println("2. Menampilkan Secara PostOrder");
            System.out.println("3. Menampilkan Secara PreOrder");
            System.out.print("Pilih metode untuk menampilkan data Binary Search Tree : ");
            jawaban = input.next();
            
            if(jawaban.equals("1"))
            {
                System.out.println("----- Menampilkan Secara InOrder -----");
                tree.menampilkanInOrder(tree.root);
                System.out.println("--------------------------------------");
                System.out.print("Apakah Anda ingin Mencari Data didalam Binary Search Tree ? : [Y/n]");
                jawabanPencarian = input.next();
                
                if(jawabanPencarian.equals("Y") || jawabanPencarian.equals("y"))
                {
                    System.out.print("Masukkan Data yang ingin Anda Cari : ");
                    nilaiCari = input.nextInt();
                    tree.cariDataTreeInOrder(tree.root, nilaiCari, "");
                    if(tree.pesanAda != null)
                    {
                        System.out.println(tree.pesanAda);
                    }
                    else
                    {
                        System.out.println(tree.pesanGagal);
                    }
                    System.out.print("Apakah Anda ingin Kembali Lagi ? [Y/n]");
                    pilihan = input.next();
                }
            }
            else if(jawaban.equals("2"))
            {
                System.out.println("----- Menampilkan Secara Post Order -----");
                tree.menampilkanPostOrder(tree.root);
                System.out.println("-----------------------------------------");
                System.out.print("Apakah Anda ingin Mencari Data didalam PostOrder ? : [Y/n]");
                jawabanPencarian = input.next();
                
                if(jawabanPencarian.equals("Y") || jawabanPencarian.equals("y"))
                {
                    System.out.print("Masukkan Data yang ingin Anda Cari : ");
                    nilaiCari = input.nextInt();
                    tree.cariDataTreePostOrder(tree.root, nilaiCari, "");
                    if(tree.pesanAda != null)
                    {
                        System.out.println(tree.pesanAda);
                    }
                    else
                    {
                        System.out.println(tree.pesanGagal);
                    }
                    System.out.print("Apakah Anda ingin Kembali Lagi ? [Y/n]");
                    pilihan = input.next();
                }
            }
            else if(jawaban.equals("3"))
            {
                System.out.println("----- Menampilkan Secara PreOrder -----");
                tree.menampilkanPreOrder(tree.root);
                System.out.println("---------------------------------------");
                System.out.print("Apakah Anda ingin Mencari Data didalam PreOrder ? : [Y/n]");
                jawabanPencarian = input.next();
                
                if(jawabanPencarian.equals("Y") || jawabanPencarian.equals("y"))
                {
                    System.out.print("Masukkan Data yang ingin Anda Cari : ");
                    nilaiCari = input.nextInt();
                    tree.cariDataTreePreOrder(tree.root, nilaiCari, "");
                    if(tree.pesanAda != null)
                    {
                        System.out.println(tree.pesanAda);
                    }
                    else
                    {
                        System.out.println(tree.pesanGagal);
                    }
                    System.out.print("Apakah Anda ingin Kembali Lagi ? [Y/n]");
                    pilihan = input.next();
                }
            }
            else
            {
                System.out.println("Maaf Pilih Pilihan yang benar");
                pilihan = "Y";
            }
            
        } while (pilihan.equals("Y"));
        
//        tree.menampilkanInOrder(tree.root, "");
//        System.out.println("--------");
//        tree.menampilkanPostOrder(tree.root);
//        System.out.println("--------");
//        tree.menampilkanPreOrder(tree.root);
    }
    
//    public static void inOrder()
//    {
//        tree.menampilkanInOrder(tree.root, "");
//        tree.cariDataTreeInOrder(tree.root, 70);
//        if(tree.pesanAda != null)
//        {
//            System.out.println(tree.pesanAda);
//        }
//        else
//        {
//            System.out.println(tree.pesanGagal);
//        }
//    }
    
}
