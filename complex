import java.util.Scanner;
class complex{
    
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    complex(){
        this.a = 0;
        this.b =0;
    }
    
    public void getInput(){
        System.out.println("Enter the real part of the complex number");
        a = sc.nextInt();
        System.out.println("Enter the imaginary part of the complex number");
        b = sc.nextInt();
    }
    public complex sum_c(complex c1,complex c2){  
        complex c3 = new complex(); 
        c3.a = c1.a + c2.a;
        c3.b = c1.b + c2.b;
        return c3;
    }

    public complex diff_c(complex c1,complex c2){
        complex c3 = new complex();
        c3.a = c1.a - c2.a;
        c3.b = c1.b - c2.b;
        return c3;
    }

    public complex mul_c(complex c1, complex c2){
        complex c3 = new complex();
        c3.a = (c1.a * c2.a) - (c1.b * c2.b);
        c3.b = (c1.a * c2.b) + (c2.a * c1.b);
        return c3;
    }
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition of two complex numbers");
        System.out.println("2. Subtraction of two complex numbers");
        System.out.println("3. Multiplication of two complex numbers");
        System.out.println("4. Exit!");

        complex c1 = new complex();
        complex c2 = new complex();
        complex compute = new complex();

        while(true){
            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                        System.out.println("Enter the first complex number");
                        c1.getInput();
                        System.out.println("Enter the second complex number");
                        c2.getInput();
                        compute = compute.sum_c(c1,c2);
                        System.out.println("The sum of "+c1.a + " +i " + c1.b + " and "+c2.a + " +i " + c2.b +" is "+compute.a + " +i (" + compute.b+")");
                        break;
                case 2:
                        System.out.println("Enter the first complex number");
                        c1.getInput();
                        System.out.println("Enter the second complex number");
                        c2.getInput();
                        compute = compute.diff_c(c1,c2);
                        System.out.println("The sum of "+c1.a + " +i " + c1.b + " and "+c2.a + " +i " + c2.b +" is "+compute.a + " +i (" + compute.b +")" );
                        break;
                case 3:
                        System.out.println("Enter the first complex number");
                        c1.getInput();
                        System.out.println("Enter the second complex number");
                        c2.getInput();
                        compute = compute.mul_c(c1,c2);
                        System.out.println("The sum of "+c1.a + " +i " + c1.b + " and "+c2.a + " +i " + c2.b +" is "+compute.a + " +i (" + compute.b+")"  );
                        break;
                case 4:
                        System.exit(0);
                        break;
                default:
                        System.out.println("Invalid choice");
                        break;
            }
        }
    }
}
