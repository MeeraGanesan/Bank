import java.util.*;
class HDFC extends Bank
{
    int interestamt=2;
    HDFC()
    {
        super();
    }
    HDFC(int no,String name,double balance)
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
        if (getbalance() <= 2800 || getbalance()<amt)
        {
        System.out.println("Cant withdraw because you only have minimum balance amount");
        return -1;
        }
    
        return super.withdrawal(amt);
    }
    
    
} 