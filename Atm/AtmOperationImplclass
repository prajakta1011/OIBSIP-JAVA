import java.util.Map;
import java.util.HashMap;

public class AtmOperationImpl implements AtmOperationInterf{
    Atm atm=new Atm();
    Map<Double,String>ministmt=new HashMap<>();
    @Override
    public void viewBalance() {
    System.out.println("Available Balance is :"+atm.getBalance());
        }
    @Override
    public void withdrawAmount (double withdrawAmount) {
        if (withdrawAmount <= atm.getBalance()) {
            ministmt.put(withdrawAmount, "Amount Withdraw");
            System.out.println("Collect the cash" + withdrawAmount);
            atm.setBalance (atm.getBalance() - withdrawAmount);
            viewBalance();
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
    ministmt.put(depositAmount,"Amount Deposited");
System.out.println(depositAmount+"Deposited Successfully");
atm.setBalance(atm.getBalance()+depositAmount);
    }
    @Override
    public void viewMiniStatement(){
    for(Map.Entry<Double,String>m:ministmt.entrySet()){
        System.out.println(m.getKey()+""+m.getValue());
    }

    }
}
