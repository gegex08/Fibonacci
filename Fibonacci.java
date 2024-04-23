/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author OcampoG4446
 */
public class Fibonacci {


    public static void main(String[] args) {
    
        int n = 12;
        int f = myFib(n);
        System.out.println(f);
    }
    public static int myFib(int args){
        if (args==0||args==1){
            return args;
        }
        else{
        return myFib(args-1)+myFib(args-2);
                }
    }

}
