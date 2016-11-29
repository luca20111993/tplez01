/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

/**
 *
 * @author tss
 */
public class Parcheggio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       boolean sensore_entrata = true;
       boolean sensore_uscita = true;
       boolean biglietto = true;
       
       boolean ancora = true;
       String codice_start = "start" ;
       String codice_stop = "stop" ;
       
       //Chiedo di scrivere start. se scrivono start allora il programma parte altrimenti richiede il codice
       
       
       
       while (ancora == true ){  
       
       
       if (sensore_entrata == true){
           System.out.println("Luce rossa \n Benvenuti al parcheggio CIAC!");
       }else{
           if (sensore_entrata == false && biglietto == true){
               System.out.println("Luce rossa \n Buongiorno , ritirare il biglietto");
           }else{ 
               System.out.println("Luce verde \n La ringraziamo per aver scelto il nostro parcheggio \n Sbarra alzata");
           }
       }
        
        
       /*if ()
           System.out.println("Sbarra abbassata");*/
       
       
       
       }
        
       }
        
        
        
    }
    

