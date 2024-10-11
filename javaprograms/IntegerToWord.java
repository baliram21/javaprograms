package javaprograms;



import java.util.List;
import java.util.stream.Collectors;

public class IntegerToWord {

    public static void main(String[] args) {
        List<Integer> list = List.of(5, 1, 6, 8, 7, 3, 9, 2);
        List<String> str = list.stream().map(IntegerToWord::intToWord).collect(Collectors.toList());
        System.out.println(str);
    }

    private static String intToWord(int n) {
        switch (n) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "unknown";
        }
    }
}
