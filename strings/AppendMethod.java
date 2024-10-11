package strings;


/*In Java, the append() method is used in the StringBuilder and StringBuffer classes, not in the String class.
This method appends the specified data to the end of the current StringBuilder or StringBuffer object. Unlike String,
which is immutable, both StringBuilder and StringBuffer are mutable, meaning their content can be modified without
creating new objects.
Key Differences:
->StringBuilder: Is not synchronized, which makes it faster but not thread-safe.
->StringBuffer: Is synchronized, making it thread-safe but slightly slower than StringBuilder.*/

/*StringBuilder append(DataType data)
StringBuffer append(DataType data)
Parameters:
data: The data (of different types) to append to the StringBuilder or StringBuffer. It can be:
A String
A char
A char[]  (character array)
An int, long, float, double, boolean, or Object
Return Value:->
The append() method returns the same StringBuilder or StringBuffer object after appending the specified data,
so you can chain multiple append() calls.*/

public class AppendMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("The result is ");
        sb.append(42);  // Appends an integer
        sb.append(", the temperature is ");
        sb.append(36.5);  // Appends a float
        sb.append("°C.");
        System.out.println(sb);  // Output: The result is 42, the temperature is 36.5°C.
    }
}

 class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello")
                .append(" ")
                .append("World")
                .append("!")
                .append(" Year: ")
                .append(2024);
        System.out.println(sb);  // Output: Hello World! Year: 2024
    }
}

class Main1 {
    public static void main(String[] args) {
        char[] chars = {'J', 'a', 'v', 'a'};
        StringBuilder sb = new StringBuilder("Programming in ");
        sb.append(chars);  // Appends the character array
        System.out.println(sb);  // Output: Programming in Java
    }
}


