

public class functions{
    public static void printHello(){
        System.out.print("Hello");
    }

    public static int calculateSum(int num1,int num2){
        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        int sum = num1+num2;
        return sum;
    }

    public static int factorial(int num) {
        int f = 1;
        for(int i = 1;i<=num;i++){
            f *= i;
        }
        return f;
    }

    public static int binCoffe(int n,int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int BC = n_fact/(r_fact*nmr_fact);
        return BC;
    }

    //function loading
    public static int sum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static int sum(int a,int b,int c){
        int sum = a + b + c;
        return sum;
    }
    public static float sum(float a,float b){
        float sum = a + b;
        return sum;
    }

    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        // for(int i=2;i<=n;i++){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimesInRange(int a,int b){
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void binToDec(int binNum){
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;

        while(binNum > 0){
            int lastDigit = binNum%10; //storing last digit of bin number 
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum /= 10; //removing last digit from binary number
        }
        System.out.println("The decimal of "+myNum +" = "+decNum);
    }

    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem*(int)Math.pow(10, pow));

            pow++;
            n/=2;
        }
        System.out.println("The binary of "+myNum+" = "+binNum);
    }

    public static int avgOfNum(int a,int b,int c){
        int avg = (a+b+c)/3;
        return avg;
    }

    public static boolean isEven(int n){
        // if(n%2==0){
        //     return true;
        // }
        // return false;
        //or
        return n%2==0;
    }

    public static int reverseNum(int n){
        int reversedNum = 0;
        while(n>0){
            int lastDigit = n%10;
            reversedNum = (reversedNum * 10) + lastDigit;

            n /= 10;
        }
        return reversedNum;
    }

    public static boolean chkPalindrome(int n){
        int reversedNum = reverseNum(n);
        return reversedNum == n;
    }

    public static int doSum(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args){
        // printHello();

        //For 2nd function
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.print("sum is :"+sum);

        //Binomial Coefficient 
        // System.out.println(binCoffe(5, 2));

        //function overloading
        // System.out.println(sum(5,1));
        // System.out.println(sum(5,1,6));
        // System.out.println(sum(5.5f,2.2f));

        //printing prime numbers in range
        // for(int k=2;k<=20;k++){
        //     boolean isPrime = isPrime(k);
        //     if(isPrime){
        //         System.out.print(k+" ");
        //     }
        // }
        //or
        // printPrimesInRange(3, 20);

        //Converting binary number to decimal
        // binToDec(1011);

        //Converting decimal to binary
        // decToBin(5);

        //Practice Questions
        //1 find average of 3 numbers
        // System.out.println(avgOfNum(1, 2, 3));

        //2 pass number and find if it's even or odd
        // System.out.println(isEven(6));

        //3 check if given number is palindrome or not 
        // System.out.println(chkPalindrome(323));

        //5 compute the sum of digits from integer 
        // System.out.println(doSum(46));
    }
}