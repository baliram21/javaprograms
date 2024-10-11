package javaprograms;

public class StringProgramm1 {
    public static void main(String[] args) {
        //input="nayan" ||| output=n1y2n

        String name="nayanan";
        char targetChar='k';

        if (name.indexOf(targetChar)==-1){
            System.out.println(targetChar +" not present in string");
            System.exit(0);
        }
        int count=1;
        for (int i=0; i<name.length();i++){
            char c=name.charAt(i);
            if(c==targetChar){
                name=name.replaceFirst(String.valueOf(targetChar),String.valueOf(count));
                ++count;
            }
        }
        System.out.println(name);
    }
}
