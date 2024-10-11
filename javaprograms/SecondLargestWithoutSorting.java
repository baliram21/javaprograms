package javaprograms;

public class SecondLargestWithoutSorting {
    public static void main(String[] args) {
        int[] a = {3,5,2,6,8,4,9};

        if (a.length<2){
            System.out.println("Array must contain atleast two elements");
            return;
        }
        int largest= Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i]>largest){
                secondLargest=largest;
                largest=a[i];
            } else if (a[i]>secondLargest  && a[i] != largest) {
                secondLargest=a[i];
            }
        }

        if (secondLargest==Integer.MIN_VALUE){
            System.out.println("There is no Second Largest element exit in Array");
        }else {
            System.out.println("Second Largest element is "+secondLargest);
        }

    }
}
