import java.util.Scanner;
class personal{
    String name;
    int age;
    String education;
    double basic;
    double hra;
    double da;
    int years_of_exp;
    int no_of_loans;
    double loan_amt[];


    personal(String name,int age,String education,double basic,double hra,double da,int years_of_exp,int no_of_loans,double[] loan_amt){
        this.name = name;
        this.age = age;
        this.education = education;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.years_of_exp = years_of_exp;
        this.no_of_loans = no_of_loans;
        this.loan_amt =  new double[no_of_loans];
        this.loan_amt = loan_amt; 
    }
    void isEligible(personal p){
        if((p.basic+p.hra+p.da)>500000 && p.no_of_loans <=2){
            System.out.println("The person is eligible for loan");
        }
        else{
            System.out.println("The person is not eleigible for loan");
        }
    }


    void taxPay(personal p){
        double sal = p.basic + p.hra + p.da;
        if(sal<=250000){
            System.out.println("No tax is to be paid");
        }
        else if(sal<=500000){
            System.out.println("The tax to be paid is: "+0.2*sal);
        }
        else if(sal<=1000000){
            System.out.println("The tax to be paid is: "+0.3*sal);
        }
        else{
            System.out.println("The tax to be paid is: "+0.4*sal);
        }
    }


    void isEligiblePromotion(personal p){
        if(p.years_of_exp >=10 && p.age>=43){
            System.out.println("The person is eligible for promotion");
        }
        else{
            System.out.println("The person is not eleigible for promotion");
        }
    }


    void display(personal p){
        System.out.println("Name of the person is: "+p.name);
        System.out.println("Age of the person is: "+p.age);
        System.out.println("Education of the person is: "+p.education);
        System.out.println("The total salary of the person is: "+(p.basic+p.hra+p.da));
        System.out.println("The years of experience of the person is: "+p.years_of_exp);
        System.out.println("The no of loans in the name of the person is: "+p.no_of_loans);
        System.out.print("The lloan amount for each loan is:\t ");
            for(int i=0;i<p.no_of_loans;i++){
                System.out.print(p.loan_amt[i]+" ");
            }
            
            System.out.println();
            p.isEligible(p);
            p.taxPay(p);
            p.isEligiblePromotion(p);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of employees whose detail you wanna enter");
        int n = sc.nextInt();
        sc.nextLine();
        personal[] p = new personal[n];


        for(int i=0;i<n;i++){
            
            System.out.println("Enter the name");
            String name = sc.nextLine();
            System.out.println("Enter the age");
            int age = sc.nextInt();
            sc.nextLine();//Have to give after int
            System.out.println("Enter the education");
            String education = sc.nextLine();
            System.out.println("Enter the basic salary");
            double basic = sc.nextDouble();
            System.out.println("Enter the hra");
            double hra = sc.nextDouble();
            System.out.println("Enter the da");
            double da = sc.nextDouble();
            System.out.println("Enter the years of experience");
            int years_of_exp = sc.nextInt();
            System.out.println("Enter the no of loans");
            int no_of_loans = sc.nextInt();
            double[] loan_amt = new double[no_of_loans];
            for(int j=0;j<no_of_loans;j++){
                System.out.println("Enter the loan amount "+(j+1));
                loan_amt[j] = sc.nextDouble();
            }
            sc.nextLine();
            p[i] = new personal(name,age,education,basic,hra,da,years_of_exp,no_of_loans,loan_amt);
            System.out.println("The details of the employee are: ");
            System.out.println("---------------------------------------");
            p[i].display(p[i]);
            System.out.println("---------------------------------------");
        }
    }
}

