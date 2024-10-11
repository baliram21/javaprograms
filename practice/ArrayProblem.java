package practice;

import java.util.Arrays;

public class ArrayProblem {
    public static void main(String[] args) {
        int[] arr={2,8,2,6,5,7,6};
        //int[] arr={6,6,1,2,2,3,3,4,5,5,5};
       // int[] arr={-4,-3,-8,-2,-6};

      //findSecondMaxAndMaxSum(arr);
       // removeDuplicate(arr);
       // findFirstDuplicate(arr);
       // insertElement(arr);
    }



    private static void findFirstDuplicate(int[] arr) {
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]){
                temp=temp+1;
                System.out.println("first duplicate element :- "+arr[i]);
                break;
            }
            if (temp>1){
                break;
            }

        }
    }

    private static void removeDuplicate(int[] arr) {
        int[] newArr=new int[arr.length];
        int j=0;
        for (int i=0; i<arr.length-1 ;i++){
            if (arr[i]!=arr[i+1]){
                newArr[j]=arr[i];
                j++;
            }
        }
        newArr[j]=arr[arr.length-1];
        //System.out.println(arr[i]+);
       // System.out.println(arr[j]);
        for (int a:newArr){
            System.out.print(a +" ");
        }
    }

    private static void findSecondMaxAndMaxSum(int[] arr) {
        int max=0;
        int secondMax=0;
        for (int i=0; i<arr.length; i++){
            if (max<arr[i]){
                secondMax=max;
                max=arr[i];
            }
            if (max!=arr[i]&&secondMax<arr[i]){
                secondMax=arr[i];
            }
        }
        System.out.println("second max : "+secondMax);
        System.out.println("max sum from array : "+(max+secondMax));
    }
}
