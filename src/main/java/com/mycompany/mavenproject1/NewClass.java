/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author soblab
 */
public class NewClass {
    int getLargest(int[] nmList){
    int max = nmList[0];
    int index = 0;
    while(index < nmList.length){
        if( nmList[index] > max)
            max = nmList[index];
        
        index++;
    }
    
    return max;
}
    
    public static void main(String args[]){
        
        Lab2 nc = new Lab2();
        int[] arr = {3,6,-1,10,15,-8};
        int mx = nc.getLargest(arr);
        System.out.println("The max is " + mx);
        
    }
    
}
