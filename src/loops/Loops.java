/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author halva023
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //     ****
        //     ****
        //     ****
        
       task3(10);
           	
}

    
    static void task3(int num)
    {
        //i: 1
        //j: 1
        
        for(int i = 0; i < num; i++)
        {
            for(int j = 0; j < num; j++)
            {
                if(i==j)
                System.out.print("X");
                else 
                System.out.print("O");
            }
            System.out.println("");
        }
    }





}
