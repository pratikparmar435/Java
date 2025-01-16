import java.util.Scanner;
import javax.sound.midi.SysexMessage;
public class patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();

        //1.square pattern numbers
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //2.square pattern stars
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }

        //3.square pattern ABCD
        // for(int i=0;i<n;i++){
        //     char ch = 'A';
        //     for(int j=0;j<n;j++){
        //         System.out.print(ch+" ");
        //         ch++;
        //     }
        //     System.out.println();
        // }
        //or
        // for(int i=0;i<n;i++){
        //     char ch='A';
        //     for(int j=0;j<n;j++){
        //         System.out.print((char)(ch+j)+" ");
        //     }
        //     System.out.println();
        // }

        //4.square pattern continues numbers
        // int num = 1;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(num+" ");
        //         n++;
        //     }
        //     System.out.println();
        // }
        //or
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print((i*n+j+1)+" ");
        //     }
        //     System.out.println("");
        // }

        //5.square pattern continues ABCD
        // char ch = 'A';
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print((char)(ch+i*n+j)+" ");
        //     }
        //     System.out.println("");
        // }
        //or
        // char ch = 'A';
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(ch+" ");
        //         ch++;
        //     }
        //     System.out.println("");
        // }

        //6.Triangle star pattern
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*" );
        //     }
        //     System.out.println();
        // }
        //or
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //7.Triangle pattern row-wise numbers
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println("");
        // }
        //or
        // int num=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //     }
        //     System.out.println("");
        //     num++;
        // }

        //8.Triangle pattern row-wise ABCD
        // char ch ='A';
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch+" ");
        //     }
        //     System.out.println("");
        //     ch++;
        // }
        //or
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print((char)('A' + i)+ " ");
        //     }
        //     System.out.println();
        // }

        //9.Triangle pattern number
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        //or
        // for(int i=1;i<=n;i++){
        //     int num = 1;
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println("");
        // }

        //10.Triangle pattern of ABCD
        // for(int i=1;i<=n;i++){
        //     char ch = 'A';
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch+" ");
        //         ch++;
        //     }
        //     System.out.println();
        // }
        //or
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print((char)('A'+j)+" ");
        //     }
        //     System.out.println();
        // }

        //11.Reverse Triangle pattern with numbers
        // for(int i=1;i<=n;i++){
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        //or
        // for(int i=1;i<=n;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print((i-j)+" ");
        //     }
        //     System.out.println();
        // }
        //11.2 Reverse Triangle pattern with ABCD
        // for (int i = 1; i <= n; i++) {
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print((char) ('A' + j - 1) + " ");
        //     }
        //     System.out.println();
        // }
        


        //12.floyd's triangle pattern
        // int num = 1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }
        
        //12.2.floyd's triangle pattern with ABCD
        // char ch = 'A';
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch+" ");
        //         ch++;
        //     }
        //     System.out.println();
        // }

        //13.inverted triangle pattern with numbers
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<n-i;j++){
        //         System.out.print(i+1);
        //     }
        //     System.out.println();
        // }
        
        //13.2 inverted triangle pattern with ABCD
        for(int i=0;i<n;i++){
            char ch = 'A';
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print((char)(ch+i));
            }
            System.out.println("");
        }


        sc.close();
    }
}
