package main;

public class latefeecalc {

    public double calculateLateFees(latefeecalculate items, int days){
        double totalLatefee = 0;
        for(latefeecalculate item: items){
            totalLatefee += item.calculateLateFee(days);
        }
        return totalLatefee;
    }
    
}
