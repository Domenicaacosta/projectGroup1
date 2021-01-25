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
        int social;
        int m;
        int economic;
        int geographyc;
        int quality;                
               
        do{            
                           
            System.out.println("%%%%%%%%%%UPDATING OF CARTOGRAPHIC DATA%%%%%%%%%%");
            System.out.println("0--->Exit");
            System.out.println("1--->Demographic data ");
            System.out.println("2--->Social datas ");
            System.out.println("3--->economic datas ");
            System.out.println("4--> geographic features");
             System.out.println("5--> quality measures");
            
            
            
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
                    case 2:
                    do{
                    System.out.println("what would you like to know about social datas");
                    System.out.println("1--> half Blood people data");
                    System.out.println("2--> montubio people data");
                    System.out.println("3--> Afro-Ecuadorian people data");
                    System.out.println("4--> indigenous poeple data");
                    System.out.println("5--> withe people data");
                    social = input.nextInt();
                                        switch (social){
                        case 1:
                            System.out.println("Ecuador half blood people porcent is 71,99%");
                            break;
                        case 2:
                            System.out.println("Ecuador montubios people porcent is 7,4%");                         
                        break;
                        case 3:
                            System.out.println("Ecuador Afro-Ecuadorian people porcent is 7,2%");
                            break;
                        case 4:
                            System.out.println("Ecuador indigenous people porcent is 7%");
                            break;
                        case 5:
                            System.out.println("Ecuador indigenous people porcent is 6,1%");
                            break;
                    
                    } 
                        
                    }while (social <= 5);
                     case 3:
                    do{
                        System.out.println("what would you like to know about economic datas");
                        System.out.println("1-->Lower class data");
                        System.out.println("2-->vulnerable middle class data");
                        System.out.println("4-->high class");
                        economic = input.nextInt();       
                                              
                    switch (economic){
                        case 1:
                            System.out.println("33.6% of the population belongs to the lower class");
                            System.out.println("median income is $ 149,71");
                            break;
                        case 2: 
                            System.out.println("65,4% of the population belongs to the vulnerable middle class data");
                            System.out.println("median income is $738,81 ");
                            break;
                        case 3:
                            System.out.println("1,1% of the population belongs to the high class");
                            System.out.println("high class income is 1633,42  ");
                            break;
                        }
                    } while (economic <=4 );
                    case 4:
                    do{
                        System.out.println("what would you like to know about geographyc features");
                        System.out.println("1--> by inclination");
                        System.out.println("2--> fluvial accidents");
                        System.out.println("3--> mountainous and glacial features");
                        System.out.println("4--> volcanic accidents");
                        geographyc = input.nextInt();
                        
                    switch (geographyc){
                        case 1:
                            System.out.println(" a example of geographyc feature by inclination is an cliff ");
                            System.out.println(" Puerto Baquerizo Moreno Cliff");
                            System.out.println(" Jama Cliff");
                            break;
                        case 2: 
                            System.out.println(" a example of fluvial accidents are gulfs and bays: ");
                            System.out.println(" Guayaquil gulf ");
                            System.out.println(" Tortuga bay on Galapagos Island");
                            break;
                        case 3:
                            System.out.println(" a example of mountainous and glacial features ");
                            System.out.println(" Antisana ");
                            System.out.println(" Cotopaxi ");
                            System.out.println(" Illinizas ");
                            System.out.println(" all of them are located in volcanic craters ");
                            break;
                        case 4:
                            System.out.println(" a example of volcanic accidents are: ");
                            System.out.println(" lava tubes in ''el sombrero chino Island'' Galapagos ");
                            System.out.println(" Catopaxi Volcano ");
                            System.out.println(" Sangay Volcano ");
                            break; 
                    }
                  } while (geographyc <=4); 
                        case 5:
                    do{
                    System.out.println("what would you like to know about quality measures");
                        System.out.println("1--> Means of communication");
                        System.out.println("2--> Transportation  ");
                        System.out.println("3--> Public buildings ");
                        System.out.println("4--> Services");
                        quality = input.nextInt();           
                    switch (quality){
                        case 1:
                          
                            System.out.println(" a example of Means of communication:");
                            System.out.println(" telephone ");
                            System.out.println(" internet");
                            break;
                        case 2: 
                            System.out.println(" a example of :Transportation  ");
                            System.out.println(" Metrobus");
                            System.out.println(" private car");
                            break;
                        case 3:
                            System.out.println(" a example of Services ");
                            System.out.println(" Water ");
                            System.out.println(" electricity");
                            System.out.println(" sever ");
                            System.out.println("national police ");
                            break;
                        case 4:
                            System.out.println(" a example of Public buildings: ");
                            System.out.println(" SRI");
                            System.out.println(" Hospital ");
                            System.out.println(" central bank ");
                            break; 
                    }
                    }while (quality  <=4);        
                                
                    }
                    
                                 
            } while (option <=5);
}
}