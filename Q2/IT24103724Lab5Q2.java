import java.util.Scanner;
public class IT24103724Lab5Q2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int newMembers;
		
		System.out.print("Enter the number of new members introduced: ");
		newMembers = input.nextInt();
		
		switch (newMembers) {
			
			case 0:
			    System.out.println();
				System.out.println("No Prize");
				
				break;
			case 1:
                System.out.println();
                System.out.println("Prize is a : Pen");
                 
                break;
             case 2:
                System.out.println();
                System.out.println("Prize is a : Umbrella");
                 
				break;
            case 3:
                System.out.println();
                System.out.println("Prize is a : Bag");

                break;
            case 4:
                System.out.println();
                System.out.println("Prize is a : Travelling Chair");

                break;
            default:
				if (newMembers >= 5) {
					System.out.println();
					System.out.println("Prize is a : Headphone");
				}
				else {
                    System.out.println("Input must be a number 0 or greater");
                }
			break;			
        }
    }
}	