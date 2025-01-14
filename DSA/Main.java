import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        
        //pattern problems
        //1
        // for (int i=0; i<n; i++){
        //     char ch = 'A';
        //     for(int j=0; j<n; j++){
        //         System.out.print(ch+" ");
        //         ch += 1 ;
        //     }
        //     System.out.println();
        // }
        // sc.close();

        //2
        // for (int i=1; i<=n; i++){
        //     for (int j=1; j<=n; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");
        // }

        //3
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }

        //4
        // int num = 1;
        // for (int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println("");
        // }

        //5 
        // char ch = 'A';
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print(ch+" ");
        //         ch++;
        //     }
        //     System.out.println("");
        // }
        // sc.close();

        //6 
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<=i; j++){
        //         System.out.print('*');
        //     }
        //     System.out.println("");
        // }

        //7
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i);
        //     }
        //     System.out.println("");
        // }

        //8
        // char ch = 'A';
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<=i; j++){
        //         System.out.print(ch);
        //     }
        //     ch++;
        //     System.out.println("");
        // }

        //9 
        // for(int i=0; i<n; i++){
        //     // int num = 1;
        //     for(int j=0; j<=i; j++){
        //         System.out.print(j+1);
        //     }
        //     System.out.println("");
        // }

        //10
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j>0; j--){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

        //11
        // int num = 1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println("");
        // }

        //12
        // char ch = 'A';
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<=i; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        //homework
        for(int i=0; i<n; i++){
            for(int j=i+1; j>0; j--){
                System.out.print((char)'A'+j-1);
            }
            System.out.println("");
        }
    }
}