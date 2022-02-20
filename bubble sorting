import java.util.Scanner;
class bubbleSort{


    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        //Accepting the number of elements in the array
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();


        int[] array = new int[n];
        System.out.println("Enter the values");
        //Accepting values in the array
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }


        //Sorting it using the bubble sort technique
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        //Printing the sorted array
        System.out.print("The sorted array is:\t");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        
    }
}


