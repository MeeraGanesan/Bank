import java.util.*;
class ICICI extends Bank
{

    int interestamt=5;
    ICICI()
    {
        super();
    }
    ICICI(int no,String name,double balance)
    {
      super(name,no,balance);
    }
    void calculateinterest()
    {
      Scanner SC=new Scanner(System.in);
      System.out.println("Enter the time");
      
      double T=SC.nextDouble();
      double IA= CalculateInterest(T,interestamt);
      System.out.println("Interest="+IA);
    }
    
      double withdrawal(double amt)
    {
        if (getbalance() <= 1600 || getbalance()<amt)
        {
        System.out.println("You can't withdraw because you only have minimum balance amount");
        return -1;
        }
        else
        {
        return super.withdrawal(amt);
    }
}
}
    
    