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
public class Node {
    int data;
    Node left, right;
    
    public Node(int new_data) 
    {
        data = new_data;
        left = right = null;
    }
}
