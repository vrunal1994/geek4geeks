/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vmhatre
 */
public class MissingNumber {
    public static void main(String[] args) {
        int [] input = {1,2,3,4,6,7,8,9};
        System.out.println(findNum(input));
    }
    public static int findNum(int[] input){
        int total =input.length*(input.length+1)/2;
        for(int i : input)
            total = total-i;
        return total-1;
    }
    
}
