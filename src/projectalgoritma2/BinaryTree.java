/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectalgoritma2;

/**
 *
 * @author confus1on
 */
public class BinaryTree {
    
    public Node root,tree;
    public String status, pesanAda, pesanGagal;
    
    public void BinaryTree()
    {
        root = null;
    }
    
    public void masukkanNilaiTree(int data)
    {
       root = rekursifDataTree(root, data);
    }
    
    public Node rekursifDataTree(Node root, int data)
    {
        if(root == null) //cek jika root masih null atau kosong
        {
            // maka nilai awal akan dimasukkan sebagai nilai root
            root = new Node(data);
            return root;
        }
        
        if(data < root.data) // jika data yang dimasukkan lebih kecil dari root maka akan ditaruh disebelah kiri
        {
            root.left = rekursifDataTree(root.left, data); // memanggil fungsi rekursif untuk dicek terus menerus sehingga dapat ditempatkan nilai nodenya
        }
        else if(data > root.data) // jika data yang dimasukkan lebih besar dari root maka akan ditaruh disebelah kanan
        {
            root.right = rekursifDataTree(root.right, data); // memanggil fungsi rekursif untuk dicek terus menerus sehingga dapat ditempatkan nilai nodenya
        }
        return root;
    }
    
    public void cariDataTreeInOrder(Node root, int nilai, int data )
    {
        if(root != null)
        {
//            status = newStatus;
            cariDataTreeInOrder(root.left, nilai, data);
            if(root.data == nilai)
            {
                if(nilai == data)
                {
                    status = "Root";
                    pesanAda = "Data " + nilai + " ditemukan di posisi " + status;
                }
                else if(nilai > data)
                {
                    status = "Kanan";
                    pesanAda = "Data " + nilai + " ditemukan di posisi " + status;
                }
                else if(nilai < data)
                {
                    status = "Kiri";
                    pesanAda = "Data " + nilai + " ditemukan di posisi " + status;
                }
            }
            else
            {
                pesanGagal = "Maaf Data " + nilai + " Tidak Ditemukan di Binary Search Tree";
            }
            cariDataTreeInOrder(root.right, nilai, data);
        }
    }
    
    public void cariDataTreePostOrder(Node root, int nilai, int data)
    {
        if(root != null)
        {
            cariDataTreePostOrder(root.left, nilai, data);
            cariDataTreePostOrder(root.right, nilai, data);
            if(root.data == nilai)
            {
                if(nilai == data)
                {
                    status = "Root";
                    pesanAda = "Data " + nilai + " ditemukan di posisi " + status;
                }
                else if(nilai > data)
                {
                    status = "Kanan";
                    pesanAda = "Data " + nilai + " ditemukan di posisi " + status;
                }
                else if(nilai < data)
                {
                    status = "Kiri";
                    pesanAda = "Data " + nilai + " ditemukan di posisi " + status;
                }
            }
            else
            {
                pesanGagal = "Maaf Data " + nilai + " Tidak Ditemukan di Binary Search Tree";
            }
        }
    }
    
    public void cariDataTreePreOrder(Node root, int nilai, int data)
    {
        if(root != null)
        {
            if(root.data == nilai)
            {
                if(nilai == data)
                {
                    status = "Root";
                    pesanAda = "Data " + nilai + " ditemukan di posisi " + status;
                }
                else if(nilai > data)
                {
                    status = "Kanan";
                    pesanAda = "Data " + nilai + " ditemukan di posisi " + status;
                }
                else if(nilai < data)
                {
                    status = "Kiri";
                    pesanAda = "Data " + nilai + " ditemukan di posisi " + status;
                }
            }
            else
            {
                pesanGagal = "Maaf Data " + nilai + " Tidak Ditemukan di Binary Search Tree";
            }
            cariDataTreePreOrder(root.left, nilai, data);
            cariDataTreePreOrder(root.right, nilai, data);
        }
    }
    
    public void menampilkanInOrder(Node root)
    {
        if(root != null)
        {
//            status = new_status;
            menampilkanInOrder(root.left);
            System.out.println(root.data);
            menampilkanInOrder(root.right);
        }
    }
    
    public void menampilkanPostOrder(Node root)
    {
        if(root != null)
        {
            menampilkanPostOrder(root.left);
            menampilkanPostOrder(root.right);
            System.out.println(root.data);
        }
    }
    
    public void menampilkanPreOrder(Node root)
    {
        if(root != null)
        {
            System.out.println(root.data);
            menampilkanPreOrder(root.left);
            menampilkanPreOrder(root.right);
        }
    }
}
