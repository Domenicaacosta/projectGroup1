/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgroup1;

import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class ProjectGroup1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner(System.in);
        boolean rainLoop = true;
        int option;
        int demographic;
        int m;
        
                        
               
        do{            
                           
            System.out.println("%%%%%%%%%%UPDATING OF CARTOGRAPHIC DATA%%%%%%%%%%");
            System.out.println("0--->Exit");
            System.out.println("1--->Demographic data ");
            System.out.println("2--->Social datas ");
            System.out.println("3--->economic datas ");
            System.out.println("4--> geographic features");
            
            
            
            System.out.println("Please enter your menu option");
            option = input.nextInt();
            
            switch (option) {
                case 0: 
                    System.out.println("See you later");
                    System.exit(0);
                    break;
                case 1:
                    do{
                    System.out.println("what would you like to know about Demographic datas ");
                    System.out.println("1--> What is the population of Ecuador?");
                    System.out.println("2--> Migrant Population");
                    
                    demographic = input.nextInt();
                    
                    switch (demographic){
                        case 1:{
                            int n = 17794929;
                            int j = 8884493;
                            
                            System.out.println("The current population in Ecuador is " + n);
                            System.out.println(j + " are women");
                            System.out.println((n-j)+ " are men");
                            break;}
                        case 2:
                            int k = 1183685;
                            m = ((k*100 ) / 17794929 );
                            
                            System.out.println("there are about "+ k + " migrants");
                            System.out.println("it represents" + m + " % of Ecuador ");
                            break;
                        
                    }
                    } while (demographic <= 2);

                    
                                  
        } 

                    }while (option <=4);
            }
}

    
            
            
       

