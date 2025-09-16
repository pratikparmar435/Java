public class patterns {
    public static void reversed_half_pyramid(int n){
        //1
        // for(int i = 1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //2
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n; j++){
                if(j<=n-i){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_number(int n) {
        // for(int i=0;i<n;i++){
        //     for(int j = 1;j<=n-i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        //or
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n){
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if((j+i) % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void printButterFly(int n){
        for(int i = 1;i<=n;i++){
            for(int st=1;st<=i;st++){
                System.out.print("*");
            }
            for(int sp=1;sp<=2*(n-i);sp++){
                System.out.print(" ");
            }
            for(int st=1;st<=i;st++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n;i>=1;i--){
            for(int st=1;st<=i;st++){
                System.out.print("*");
            }
            for(int sp=1;sp<=2*(n-i);sp++){
                System.out.print(" ");
            }
            for(int st=1;st<=i;st++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void print_solid_rhumbus(int n){
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for(int st=1;st<=n;st++){
                System.out.print("*");
            }
            System.out.println();
        }
        //or
        // for(int i = 1;i<=n;i++){
        //     for(int sp=1;sp<=n-i;sp++){
        //         System.out.print(" ");
        //     }
        //     for(int st=1;st<n*2;st++){
        //         System.out.print("*");
        //     }
        //     for(int sp=1;sp<=n-i;sp++){
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
    }

    public static void print_hollow_rhumbus(int n){
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for(int st=1;st<=n;st++){
                if(i == 1 || st == 1 || i == n || st == n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void print_diamond(int n){
        //1st half
        for(int i = 1;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for(int st=1;st<=(2*i)-1;st++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i = n;i>=1;i--){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for(int st=1;st<=(2*i)-1;st++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //pattern part 1

        //star pattern
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }

        //inverted star pattern
        // for(int i = 1;i<=5;i++){
        //     for(int j = 5;j>=i;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        //or
        // int n = 4;
        // for(int i = 1;i<=n;i++){
        //     for(int j = 1;j<=n-i+1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //print half pyramid pattern
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //print characters pattern
        // char ch = 'A';
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        //Patterns part 2 

        //print hollow rectangle pattern
        // for(int i = 1;i<=4;i++){
        //     for(int j =1;j<=5;j++){
        //         if(i == 1 || i == 4 || j == 1 || j == 5){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //print reversed half pyramid
        // reversed_half_pyramid(4);

        //print inverted half pyramid with numbers
        // inverted_half_pyramid_number(5);

        //print Floyd's triangle
        // floyds_triangle(4);

        //0-1 triangle
        // zero_one_triangle(4);

        //print butterfly pattern
        // printButterFly(5);

        //print solid rhumbas
        // print_solid_rhumbus(5);

        //print hollow rhumbas 
        // print_hollow_rhumbus(5);

        //print diamond
        print_diamond(4);
    }
}
