import java.util.*;

public class loops {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        // int count = 1;
        // while(count<100){
        //     System.out.println("Hello World");
        //     count++;
        // }
        // System.out.println("Printing HW 100x");

        // while (count<11) { 
        //     System.out.println(count);
        //     count++;
        // }
        
        // int n = sc.nextInt();
        // while(count<=n){
        //     System.out.print(count + " ");
        //     count++;
        // }

        //sum first n natural numbers
        // int sum = 0;
        // while(count<=n){
        //     sum+=count;
        //     count++;
        // }
        // System.out.println("Sum = "+sum);

        //for loop
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Hello World");
        // }

        //print square pattern
        // for(int i = 1; i<=4; i++){
        //     System.out.println("* * * *");
        // }
        // //or
        // int i = 1;
        // while (i<=4) { 
        //     System.out.println("* * * *");
        //     i++;
        // }

        //print reverse of number
        // int num = 2936;
        // while(n>0){
        //     int lastDigit = n%10; // to store last digit in var
        //     System.out.print(lastDigit);
        //     n /= 10; // to remove last digit from number
        // }

        //store reverse of number
        // int num = 24125;
        // int rev = 0;
        // while (num>0){
        //     int lastDigit = num%10;
        //     rev = (rev*10) + lastDigit; //formula to store the last number   
        //     num/=10;
        // }
        // System.out.println(rev);

        //do-while + break keyword
        //exit the loop when number is multiple of 10 unless print the number
        
        // do { 
        //     System.out.print("Enter your number: ");
        //     int num = sc.nextInt();
        //     if(num%10==0){
        //         break;
        //     }
        //     System.out.println(num);
        // } while (true);

        //do-while + continue keyword
        //exit the loop when number is multiple of 10 unless print the number
        
        // do { 
        //     System.out.print("Enter your number: ");
        //     int num = sc.nextInt();
        //     if(num%10==0){
        //         continue;
        //     }
        //     System.out.println(num);
        // } while (true);

        //practice questions
        //1 how many time hello world will be printed
        // for(int i = 0;i<5;i++){
        //     System.out.println("Hello world");
        //     i+=2;
        // }

        //2 Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
        // int number;
        // int choice;
        // int evenSum = 0;
        // int oddSum = 0;
        // do { 
        //     System.out.print("Enter a number:");
        //     number = sc.nextInt();
        //     if(number%2==0){
        //         evenSum += number;
        //     }else{
        //         oddSum += number;
        //     }
        //     System.out.print("if you want to continue enter 1 else 0:");
        //     choice = sc.nextInt();
        // } while (choice == 1);
        // System.out.println("The sum even number = "+evenSum);
        // System.out.println("The sum odd number = "+oddSum);

        //3 find factorial of number
        // System.out.print("Enter a number to find factorial:");
        // int num = sc.nextInt();
        // int fact = 1;
        // for(int i = 2;i<=num;i++){
        //     fact*=i;
        // }
        // System.out.println("The factorial of given number is:"+fact);

        //4 multiplication table of n given by user 
        System.out.print("Enter a number to print table:");
        int num = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(num +" * "+i+" = "+num*i);
        }
    }
}
