import java.util.*;

public class Arrays {
    public static void update(int marks[]){
        for(int i = 0;i<marks.length;i++){
            marks[i] += 1;
        }
    }

    public static int linearSearch(int arr[],int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int findLargest(int arr[]){
        // int largest = 0; //or
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("The smallest number is :"+smallest);
        return largest;
    }

    public static int binarySearch(int numbers[],int key){
        int start = 0,end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                //find in right side 
                start = mid+1;
            } else {
                //find in left side if mid is greater then key
                end = mid-1;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]){
        int start = 0,end=numbers.length-1;

        while(start<end){
            //swapping first and last elements of the array
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }

    public static void printPairOfArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
            }
            System.out.println();
        }
    }

    // public static void printSubArrays(int numbers[]){
    //     for(int i=0;i<numbers.length;i++){
    //         for(int j=i;j<numbers.length;j++){
    //             for(int k=i;k<=j;k++){
    //                 System.out.print(numbers[k]+",");
    //             }
    //             System.out.print(" ");
    //         }
    //         System.out.println();
    //     }
    // }
    //modified version of sub-array printing with sum and minimum and maximum sum of sub arrays
    public static void printSubArrays(int numbers[]){
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += numbers[k];
                    System.out.print(numbers[k]+" ");
                }
                System.out.print("= "+sum+", ");
                if(minSum>sum){
                    minSum = sum;
                }
                if(maxSum<sum){
                    maxSum =sum;
                }
            }
            System.out.println();
        }
        System.out.println("minimum sum ="+minSum+" ,max sum ="+maxSum);
    }

    public static void maxSumPrefix(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i = 1;i<numbers.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                 if(maxSum<currSum){
                    maxSum=currSum;
                }
                System.out.println(currSum);
            }
        }
        System.out.println("The max sum is :"+maxSum);
    }

    public static void maxSumKadanes(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0;i<numbers.length;i++){
            currSum += numbers[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum = Math.max(maxSum,currSum);
        }
        System.out.println("The max sum is :"+maxSum);
    }

    public static int trappedRainWater(int height[]){
        int n = height.length;

        //calculate the max boundary of left
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate the max boundary of right
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0;i<n;i++){
            //waterLevel = min(leftMax boundary,rightMax boundary)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //trapped water = water level - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            } else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    //practice questions 1
    public static boolean chkDistinct(int numbers[]){
        for(int i = 1;i<numbers.length;i++){
            for(int j = 0;j<i;j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //2 liner method
    public static int fndTarget(int[] nums,int target){
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    //2 binary search method;
    public static int searchMin(int[] arr){
        int min = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }

    public static int search(int[] nums,int target){
        int min = searchMin(nums);
        if(nums[min] <= target && target <= nums[nums.length-1]){
            return search(nums,min,nums.length-1,target);
        }else {
            return search(nums,0,min-1,target);
        }
    }

    public static int search(int[] nums,int start,int end,int target){
        while (start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void threeSum(int[] nums){
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){
                    int sum = nums[i]+nums[k]+nums[j];
                    if( sum == 0){
                        System.out.println(nums[i]+","+nums[j]+","+nums[k]);
                    }
                }
            }
        }   
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int marks[] = new int[50];

        // // int phy = sc.nextInt();
        // marks[0] = sc.nextInt(); //phy
        // marks[1] = sc.nextInt(); //maths
        // marks[2] = sc.nextInt(); //sci

        // //or another way to declare an array 
        // int arr[] = {98,99,93};

        // System.out.println("phy :"+marks[0]);
        // System.out.println("maths :"+marks[1]);
        // System.out.println("sci :"+marks[2]);
        
        // marks[1] = marks[1] + 1;
        // System.out.println("maths :"+marks[1]);

        // //print length of marks array
        // System.out.println("the length of an array is :"+marks.length);

        //proof that arrays are passed as reference in arguments not by value
        // int marks[] = {97,98,99};
        // update(marks);

        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }

        //method of linear searching in arrays 
        // int arr[] = {2,4,6,8,10,12,14,16,18};
        // int key = 10;

        // int index = linearSearch(arr, key);
        // if(index == -1){
        //     System.out.print("NOT FOUND");
        // }else{
        //     System.out.print("The key found index :"+index);
        // }

        //find largest from an array
        // int arr[] = {2,4,6,8,10,12,14,16,18};
        // int largest = findLargest(arr);
        // System.out.print("The largest number in this array is :"+largest);

        //Binary Search 
        // int number[] = {2,4,6,8,10,12,14,16};
        // int key = 10;
        // System.out.println(binarySearch(number, key));

        //reverse an array with binary search method
        // int numbers[] = {2,4,6,8,10};
        // reverse(numbers); 
        // for(int i=0;i<numbers.length;i++){
        //     System.out.print(numbers[i]+" ");
        // }

        //print pairs of array elements
        // int numbers[] = {2,4,6,8,10};
        // printPairOfArray(numbers);

        //print sub-arrays of an array
        // int numbers[] = {2,4,6,8,10};
        // printSubArrays(numbers);

        //find max sum of sub-arrays with prefix method
        // int numbers[] = {1,-2,6,-1,3};
        // maxSumPrefix(numbers);

        //kadanes algorithm of finding max sum
        // int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        // maxSumKadanes(numbers);

        //trapped water problem 
        // int height[] = {4,2,0,6,3,2,5};
        // System.out.println(trappedRainWater(height));

        //find the max profit from buy and selling stocks 
        // int prices[] = {7,1,5,3,6,4};
        // System.out.println(buyAndSellStocks(prices));

        //practice questions
        //1
        // int numbers[] = {1,1,1,4,3,2,1,5,6};
        // System.out.println(chkDistinct(numbers));

        //2
        // int[] numbers = {4,5,6,7,0,1,2};
        // System.out.println(search(numbers,0));

        //5
        int[] nums = {-1,0,1,2,-1,-4};
        threeSum(nums);
    }
}


