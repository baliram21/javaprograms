package javaprograms.interfaces.example;
@FunctionalInterface
public interface A {

   // void name(String s);
   // int sum(int a, int b);
    String hello(String s);

    default int sum(int a, int b){
        return a+b;
    }
    default int mul(int a, int b){
        return a*b;
    }


}
