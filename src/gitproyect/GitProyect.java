/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gitproyect;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class GitProyect {

    /**
     * @param init
     * @param end
     * @return 
     */
    
    public static ArrayList NumbersBettewn(int init , int end){
        ArrayList numbersBettewn = new ArrayList();
        for (int i = init + 1; i < end; i++) {
            if(i%2 != 0)
                numbersBettewn.add(i);
            
        }
        return numbersBettewn;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jin;
        jin = new Scanner(System.in);
        int init = jin.nextInt();
        int end = jin.nextInt();
        jin.close();
        
        ArrayList numbersBettewn;
        numbersBettewn = NumbersBettewn(init , end);
        for (Object number : numbersBettewn) {
            System.out.println(number);
        }
    }
    
}
