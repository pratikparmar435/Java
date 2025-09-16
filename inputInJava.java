import java.util.*;

public class inputInJava {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);
        // String name = sc.nextLine();
        // System.out.println(name);

        // int num = sc.nextInt();
        // System.out.println(num);

        // float price = sc.nextFloat();
        // System.out.print(price);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.print(sum);
        // sc.close();

        //Area of circle pir^2
        // float pi = 3.14f;
        // float radius = sc.nextFloat();
        // float area = pi * radius * radius;
        // System.out.println("Area of circle is:" + area);

        //Type conversion
        // int a = 25;
        // long b = a;
        // System.out.println(b);

        //Type casting
        // float a = 25.99999f;
        // int b = (int) a;
        // System.out.println(b);

        // char a = 'c';
        // int b = (int) a;
        // System.out.print(b);

        //practice question
        //1
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int avg = (a+b+c)/3;
        // System.out.print("The average of numbers is: "+avg);

        //2
        // int side = sc.nextInt();
        // int area = side * side;
        // System.out.println("The area of square is:"+area);

        //3
        // float pen = sc.nextFloat();
        // float pencil = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // float total = pen + pencil + eraser;
        // System.out.println("The total cost is = "+total);

        // float newTotal = (total * 18) / 100;
        // System.out.println("The new total with 18% GST = "+newTotal);
        // int x = 2, y = 5;
        // int exp1 = (x * y / x);
        // int exp2 = (x * (y / x));
        // System.out.print(exp1 + ",");
        // System.out.print(exp2);

        //conditional statements
        //Income tax calculate
        // int income = sc.nextInt();
        // int actualIncome;
        // if(income<500000){
        //     actualIncome = income;
        //     System.out.println("Your income after tax ="+actualIncome);
        // } else if(income>500000 && income<=1000000){
        //     actualIncome = income - (income * 20)/100;
        //     System.out.println("Your income after 20% tax ="+actualIncome);
        // } else {
        //     actualIncome = income - (income * 30)/100;
        //     System.out.println("Your income after 30% tax ="+actualIncome);
        // }

        //Ternary Operator
        // int number = 10;
        // String type = (number%2==0) ? "even" : "odd";
        // System.out.print(type);

        //switch statement
        // int number = 2;
        // switch (number) {
        //     case 1:
        //         System.out.println("Samosa");
        //         break;
        //     case 2:
        //         System.out.print("momos");
        //         break;
        //     default:
        //         System.out.println("you woke up!");
        // }

        //Creating calculator with switch statement
        // System.out.println("Enter number a:");
        // int a = sc.nextInt();
        // System.out.println("Enter number b:");
        // int b = sc.nextInt();
        // System.out.println("Enter number operator:");
        // char operator = sc.next().charAt(0);
        // switch (operator) {
        //     case '+':
        //         System.out.println(a+b);
        //         break;
        //     case '-':
        //         System.out.println(a-b);
        //         break;
        //     case '*':
        //         System.out.println(a*b);
        //         break;
        //     case '/':
        //         System.out.println(a/b);
        //         break;
        //     case '%':
        //         System.out.println(a%b);
        //         break;
        //     default:
        //         System.out.println("Operator not found!");
        // }

        //practice question
        //1
        // int num = sc.nextInt();
        // if(num > 0){
        //     System.out.print("number is positive");
        // } else{
        //     System.out.println("number is negative");
        // }

        //2
        // double temp = 103.5;
        // if(temp>100){
        //     System.out.println("You have fever");
        // } else{
        //     System.out.print("You don't have fever");
        // }

        //5
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Leap year");
        } else{
            System.out.println("Not a Leap year");
        }
    }
}
