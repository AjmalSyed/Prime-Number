/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

/**
 *
 * @author Ajmal Syed
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
        int count=0;
           for(int j=2;j<=i/2;j++){
        if(i%j==0){
           
            count=1;
            System.out.println( i+"not prime");
      // count=1;
            break;
            }}
        if(count==0){
            System.out.println(i+" prime");
        }
    }}
    
}
