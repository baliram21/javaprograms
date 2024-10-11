package javaprograms;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int count=0;
        int sum=0;

        while (temp>0){
            count++;
            temp=temp/10;
        }
        temp=n;
        while (temp>0){
            int rem=temp%10;
            sum+=Math.pow(rem,count);
            temp=temp/10;
        }
        if (sum==n){
            System.out.println(n +" is a Armstrong number");
        }else {
            System.out.println(n+" is not a Armstron Number");
        }
    }
}
