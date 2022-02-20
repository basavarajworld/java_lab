import java.util.Scanner;
class account{

    Scanner sc = new Scanner(System.in);
    long accNo;
    long phoneNo;
    String name;
    double balanceAmt;

    //Method to get the details of the user.
    public void getInput(){
        System.out.print("Enter the account number:\t");
        accNo = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the account holders name:\t");
        name = sc.nextLine();
        
        System.out.print("Enter the account holders phone number:\t");
        phoneNo = sc.nextLong();
        
        balanceAmt =0;
    }
    //Method to deposit the amount in the bank
    public void deposit(){
        System.out.println("Enter the amount you wanna deposit:\t");
        double deposit = sc.nextDouble();

        balanceAmt += deposit;
        System.out.println("Amount Deposited Successfully");
        System.out.println("The account balance is:\t"+balanceAmt);
    }
    //Method to withdraw the amount from the bank
    public void withdraw(){
        System.out.println("Enter the amount you wanna withdraw:\t");
        double withdraw = sc.nextDouble();

        if(balanceAmt-withdraw>=0){
            balanceAmt -= withdraw;
            System.out.println("Amount withdrawn successful");
        }
        else{
            System.out.println("Your account has insufficient funds");
        }
        System.out.println("The account balance is:\t"+balanceAmt);
    }
    //Method to print the details
    public void printDetails(){
        System.out.println("Account Number:\t"+accNo);
        System.out.println("Account holders name:\t"+name);
        System.out.println("Phone number:\t"+phoneNo);
        System.out.println("Current balance in the account:\t"+balanceAmt);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        account a1 = new account(); //Object reference for the account

        System.out.println("1.Enter the user details");
        System.out.println("2.Deposit money in the account");
        System.out.println("3.Withdraw money from the account");
        System.out.println("4.Get the account details");
        System.out.println("5. Exit!");

        
    while(true){
        System.out.print("Enter your choice:\t");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                    a1.getInput();
                    break;
            case 2:
                    a1.deposit();
                    break;
            case 3:
                    a1.withdraw();
                    break;
            case 4:
                    a1.printDetails();
                    break;
            case 5:
                    System.exit(0);
                    break;
            default:
                    System.out.println("Invalid choice!");
        }
        System.out.println("");
    }
    }
}


