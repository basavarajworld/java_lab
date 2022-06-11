import java.util.Scanner;
class prime{


    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.print("Enter the number you wanna check:\t");
        int n = sc.nextInt();
        int flag =0;
        for(int i=2;i<=n/2;i++){
            if(n%i == 0){
                flag = 1;
                break;
            }
            else{
                flag = 0;
            }
        }
        if(flag == 1){
            System.out.println("The entered number is not a prime number");
        }
        else{
            if(n != 1 || n != 0){
                System.out.println("The entered number is a prime number");
            }
            else{
                System.out.println("The entered number is neither prime nor composite");
            }
        }
        System.out.println("-----------------------------------");
    }
}

