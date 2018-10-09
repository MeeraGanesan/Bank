


import java.util.*;
class Bank
{
    private int accno;
    private String accname;
    private static  double balance =0;
    Bank()
    {
       accname="";
       accno=0;
       balance=0;
    }
    Bank(String accname,int accno,double balance)
    {
       this.accname=accname;
       this.accno=accno;
       this.balance=balance;
    }
    protected double CalculateInterest(double T, double R)
    {
        double interest=(balance*T*R)/100;
        balance=balance+interest;
        return interest;
    }
    
    double getbalance()
    {
        return balance;
    }
    double withdrawal(double amt)
    {
        balance=balance-amt;
        return balance;
    }
   
}

 