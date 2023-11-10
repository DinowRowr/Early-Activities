package Banking;

public class Account {
    Banking bank = new Banking();

    public void Deposited(int bal, int deposit){
        if (deposit % 100 != 0){
            System.out.println("ERROR! Minimum deposit is 100 and should be multiple of 100!");
            Banking.success = false;
        }
        if ((deposit >= bal) && Banking.success){
            Banking.bal += deposit;
        }
    }
}
