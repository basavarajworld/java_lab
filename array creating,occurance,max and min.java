import java.util.Scanner;
import java.util.Arrays;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("enter the no of elements:");
    int n = sc.nextInt ();
    int[] numbers = new int[n];
      fillArrays (numbers);
      printArrays (numbers);
      occrance (numbers);
      maxmin (numbers);
  }

  public static void fillArrays (int[]numbers)
  {
    Scanner sc = new Scanner (System.in);
    for (int i = 0; i < numbers.length; i++)
      numbers[i] = sc.nextInt ();

  }
  public static void printArrays (int[]numbers)
  {
    System.out.println (Arrays.toString (numbers));

  }
  public static void occrance (int[]numbers)
  {
    Scanner sc = new Scanner (System.in);
    int s = 0;
    System.out.println ("enter the key element:");
    int key = sc.nextInt ();
    for (int i = 0; i < numbers.length; i++)
      if (key == numbers[i])
	s++;
    System.out.println ("occurance" + s);
  }

  public static void maxmin (int[]numbers)
  {printArrays(numbers);
    Scanner sc=new Scanner(System.in);
    int max = numbers[0];
    int min = numbers[0];
    for (int i = 0; i < numbers.length; i++)
      {
	if(max < numbers[i])
	  max = numbers[i];i++;
	System.out.println ("max" + max);
if (min > numbers[i])
	  min = numbers[i];i++;
	System.out.println ("min" + min);
      }

  }

}

