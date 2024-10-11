package strings;

public class Examples {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        String domain = url.substring(url.indexOf("www."), url.indexOf(".com") + 4);  // "www.example.com"
        System.out.println(domain);  // Output: www.example.com

        String fileaName= "file.txt";
        String extension = fileaName.substring(fileaName.lastIndexOf(".") + 1);
        System.out.println(extension);

    }
}
