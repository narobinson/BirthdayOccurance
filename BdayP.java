import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author Nasi Robinson
 * 
 * The methodology behind this code was to create an array of integers using a random number 
 * generated between 0-365(days of the year). Adding numbers in a while loop until there was a duplicate found,
 * the size of the array at that time is the number of people it took to get a duplicate. With another array I count
 * the number of times that amount of people had its first duplicate. To find out the average i just added up all the
 * people it took for the first duplicate and divided that by the number of trials.
 * 
 * 
 * Results:16 people: 311.0
           17 people: 300.0
           18 people: 301.0
           19 people: 336.0
           20 people: 347.0
           21 people: 346.0
           22 people: 291.0
           23 people: 298.0
           24 people: 291.0
         The average is: 23.0 people
         
 * From the results you can see that the greatest probability for the first occurrence is 20 people
 * and the average is 23.
 *
 */


public class BdayP {
    
    public static void main(String args[]){
        System.err.println("The average is: "  + birthday() + " people");    
    }

    private static double birthday() {
        
        Random rn = new Random();
        
        double[] fin = new double[100];
        
        int average = 0;
        
        for( int i = 1; i < 10000; i++){
        
        int end = 0;
        ArrayList<Integer> birthdays = new ArrayList<Integer>();     
        int day;   
        
        while( end == 0){
        	
        day = rn.nextInt(365);
          
        if(birthdays.contains(day)){
            fin[birthdays.size()]++;
            average += birthdays.size();
            end = 1;
        }
        else
        	birthdays.add(day);    
        }
        
        }
        
        for ( int i = 0; i < fin.length; i++)
        	System.out.println(i + " people: " + fin[i]);
        
        return average/10000;
    }
}