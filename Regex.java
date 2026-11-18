package StringProblems;

public class Regex {
    
    public static void main(String[] args) {
        
        String text = "a";
        System.out.println(text.matches("."));

        //Matches Exactly
        System.out.println(text.matches("[abc]"));
    
        System.out.println(text.matches("[abc][vz]"));

        System.out.println(text.matches("[^abc]"));

        System.out.println(text.matches("[a-z1-7]"));

        //Matches A | B
        System.out.println(text.matches("A|B"));

        //Matches exact Sequences and do not matches zx
        System.out.println(text.matches("XZ"));
    }
}
