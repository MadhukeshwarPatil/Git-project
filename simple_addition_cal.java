import java.util.Scanner;  
class SumOfNumbers2  
{  
    public static void main(String args[])  
    {  
        int x, y, sum;  
        Scanner sc = new Scanner(System.in);  
        x = sc.nextInt();  
        y = sc.nextInt(); 
        sum = sum(x, y);  
        System.out.println("The SUM of TWO Numbers " + x + " and " + y + " is: " +sum );  
    }   
    public static int sum(int a, int b)  
    {  
        int sum = a + b;  
        return sum;  
    }  
}  
