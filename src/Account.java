import java.util.*;

class SavingAmount {
private int saving;

    public void setInitialSaving(int saving) {
        this.saving = saving;
    }

    public int getCurrentSaving() {
        return saving;
    }
    public void incrementSaving()
    {
         saving+=1000;
    }
    public void decrementSaving()
    {
         saving-=100;
    }
    public void checkSaving()
    {
        if(saving>=1000)
            System.out.println("Congratulations! You have saved a good amount");
        else if(saving<1000&&saving>=0)
            System.out.println("Insufficient saving!");
        else
            System.out.println("You are in debt");

    }
}

public class Account {
    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs " + obj.getCurrentSaving());
    }
}