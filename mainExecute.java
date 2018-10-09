import java.util.*;
class mainExecute
{
    public void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("In which bank do you want to create an account?");
        System.out.println("1)HDFC 2)ICICI");
        int n=SC.nextInt();
        String name;
        int no;
        double balance;
        switch(n)
        {
            case 1:
            System.out.println("Enter your name");
            name=SC.next();
            System.out.println("Enter your number");
            no=SC.nextInt();
            System.out.println("Enter the bank deposit");
            balance=SC.nextDouble();
            if (balance<2800)
            {
                System.out.println("Access denied");
            }
            else
            {
              HDFC Hac1=new HDFC(no,name,balance);
              callmenu(Hac1); 
            }
            break;
            case 2:
            System.out.println("Enter your name");
            name=SC.next();
            System.out.println("Enter your number");
            no=SC.nextInt();
            System.out.println("Enter the bank deposit");
            balance=SC.nextDouble();
            if (balance<1600)
            {
                System.out.println("Access denied");
            }
            else
            {
              ICICI Iac1=new ICICI(no,name,balance);
             callmenu(Iac1); 
            }
            break;
            
            
        
    }
}

   
     void callmenu(HDFC Hac1)
    {
        while (true)
        {
        Scanner SC=new Scanner(System.in);
        System.out.println("Do you want to: 1) Withdraw money 2) Check interest 3) Sign out");
        int choice=SC.nextInt();
        switch(choice)
        {
          case 1:
          System.out.println("Enter amount to be withdrawn");
          double amt=SC.nextDouble();
          amt=Hac1.withdrawal(amt);
          System.out.println("Balance="+amt);
          break;
          case 2:
          Hac1.calculateinterest();
          break;
          
        }
        if (choice==3)
        break;
        }
    }
    
    void callmenu(ICICI ICIc1)
    {
        while (true)
        {
        Scanner SC=new Scanner(System.in);
        System.out.println("Do you want to: 1) Withdraw money 2) Check interest 3) Sign out");
        int choice=SC.nextInt();
        switch(choice)
        {
          case 1:
          System.out.println("Enter amount to be withdrawn");
          double amt=SC.nextDouble();
          amt=ICIc1.withdrawal(amt);
          System.out.println("Balance="+amt);
          break;
          case 2:
           ICIc1.calculateinterest();
          break;
          
        }
        if (choice==3)
        break;
        }
    }
}