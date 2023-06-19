import java.util.*;
public class Switchexample {
    public static void main(String [] args)
    {
         try (Scanner s = new Scanner(System.in)) {
            int option;
            System.out.println("Welcome to Powered Air service what you like to do?");
                System.out.println("1.Know my balance\n2.Know my vaidity date\n3.Know number of free calls avaliable\n4.More");
                System.out.println("please choose any one of the  above option");
                option=s.nextInt();
                switch(option)
                {
                    case 1:System.out.println("Your total balance is:"+1600);
                            break;
                    case 2:System.out.println("Your validity date  upto :"+30+" December");
                            break;
                    case 3: System.out.println("1.Prepaid bill request\n2.GRPS Activation\n3.Special GRPS offers\n4.Go back to previous menu");
                            System.out.println("please choose any one of the  above option");        
                            int op=s.nextInt();
                            switch(op)
                            {
                                case 1:System.out.println("Your prepaid bill has activated");
                                break;
                                case 2:System.out.println("Your GRPS has activated");
                                break;
                                case 3:System.out.println("special offer is 50% of on GRPS subscription");
                                break;
                                case 4: break;
                                default:System.out.println("You entered wrong option");
                            }
                            break;
                    case 4: System.out.println("1.Customer preferences\n2.Special Message offers\n3.3G Activation");
                            System.out.println("please choose any one of the  above option");
                            int opt=s.nextInt();

                            switch(opt)
                            {
                                case 1:System.out.println("congrants your next month subscrition will free");
                                break;
                                case 2:System.out.println("special 0ffer for you 100 message in only 2 ruppees");
                                break;
                                case 3:System.out.println("Your 3G activation failed");
                                break;
                                default:System.out.println("You entered wrong option");
                            }
                            break;
                    default:System.out.println("You entered wrong option");
                }
        }
    }
}
