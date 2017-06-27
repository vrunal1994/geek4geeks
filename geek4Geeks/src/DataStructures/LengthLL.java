/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import com.sun.org.apache.bcel.internal.generic.L2D;

/**
 *
 * @author Z606331
 */
public class LengthLL {
    Node head;
class Node{
    int data;
    Node next;
    Node(int v){
        data = v;
        next =null;
    }
}    

public void push(int  data){
    if(head ==null){
        head =new Node(data);
        return;
    }
    else{
        Node temp =new Node(data);
        Node current;
        current  =head;
        while(current.next != null)
            current =current.next;
        current.next =temp;
    }
}

public int iterativeCount(){
   int count=0;
    if(head == null)
        return 0;
    else
    {   
        Node current  = head;
        while(current != null){
            current =current.next;
            count += 1;
        }
        return count;        
    }
    }
    int count =0;
public int recursiveCount(Node newNode){
    //Node current = head;

    if(newNode == null)
        return 0;
    return 1+ recursiveCount(newNode.next);
    
}

public int getRecurseCount()
{
    return recursiveCount(head);
}

public static void main(String [] args){
    LengthLL  list = new LengthLL();
    list.push(4);
    list.push(5);
    list.push(2);
    list.push(40);
    System.out.println(list.getRecurseCount());
    System.out.println(list.iterativeCount());
}
}