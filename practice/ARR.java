package practice;

public class ARR {
    public static void main(String[] args) {
        int[] a={5,6,7,2,3};
        insertElement(a);
        deleteElement(a);
    }

    private static void deleteElement(int[] a) {

    }

    private static void insertElement(int[] a) {

        int pos=3;
        int num=10;
      //  int[] newArr=new int[a.length+1];

        for (int i=a.length-1; i>pos-1; i--){
            a[i]=a[i-1];
            //a[i-1]=a[i];
        }
        a[pos-1]=num;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

        }
    }
}
