import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        AtmOperationInterf op=new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to ATM Machine !!!");
        System.out.print("Enter ATM Number :");
        int atmNumber = in.nextInt();
        System.out.println("Enter Pin :");
        int pin = in.nextInt();
        if ((atmnumber == atmNumber) && (atmpin == pin)) {
            while (true) { System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Transfer Amount\n5.Quit");
                System.out.println("Enter Choice :");
                int ch = in.nextInt();
                if (ch == 1) {
                    op.viewBalance();
                }
                else if (ch == 2){
                        System.out.println("Enter Amount to withdraw");
                        double withdrawAmount=in.nextDouble();
                        op.withdrawAmount(withdrawAmount);

                }
                    else if (ch == 3){
                        System.out.println("Enter Amount to Deposit : ");
                    double depositAmount=in.nextDouble();
                    op.depositAmount(depositAmount);

                }
                    else if (ch == 4){ op.viewMiniStatement();

                }
                    else if (ch == 5) {
                    System.out.println("Collect Your ATM CAr\n Thank You For Trusting Us ");
                    System.exit(0);
                } else {
                    System.out.println("Incorrect Atm Number or pin");
                    System.exit(0);
                }
            }
        }
    }
}
