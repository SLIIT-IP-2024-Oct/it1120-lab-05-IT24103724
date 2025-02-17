import java.util.Scanner;
public class IT24103724Lab5Q3 {
	private static final double ROOM_CHARGE_PER_DAY = 48000.0;
	private static final int DISCOUNT_3_TO_4_DAYS = 10;
	private static final int DISCOUNT_5_OR_MORE_DAYS = 20;
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Start Date (1-31): ");
		int startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31) : ");
		int endDate = input.nextInt();
		
		if (startDate >= endDate) {
			System.out.println("Error: Start Date must be less than End Date");
			
			return;   // Exit Program
		}
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
			
		    return;   // Exit Program
		}				
			
        int  numberOfDaysReserved = endDate - startDate;
		
		double totalAmount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
		
		int discountRate = 10;
		if (numberOfDaysReserved > 3 && numberOfDaysReserved < 4) {
			discountRate = DISCOUNT_3_TO_4_DAYS;
	    } else if (numberOfDaysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
	    }
      
        
        double discountAmount = (totalAmount * discountRate)/100;
        double totalAmountToBePaid = totalAmount - discountAmount;
		
		  System.out.println("Room charge per day Rs. " + ROOM_CHARGE_PER_DAY);
		  System.out.println("Number of days reserved: " + numberOfDaysReserved);
		  System.out.println("Total amount to be paid: " + totalAmountToBePaid);
			  
	}
}	