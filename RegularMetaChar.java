package StringProblems;

public class RegularMetaChar {
    
    public static void main(String[] args)
    {
        demo1();
        demo2();
        demo3();
        demo4();
        demoNonSpacesChar();
        demoNonWordChar();

        starQuantifier();
        plusQuantifeir();
        ExactCountQuantifeir();
        minAndMaxQuantifeir();
        questionQuantifeir();


    }

    //1) \d--> matches one digit
    public static void demo1()
    {
        String str = "8";
        System.out.println(str.matches("\\d"));
        System.out.println("A".matches("\\d"));
        System.out.println();
    } 

    //2) \w matches one word character
    public static void demo2()
    {
        System.out.println("A".matches("\\w"));
        System.out.println("9".matches("\\w"));
        System.out.println("@".matches("\\w"));
        System.out.println("_".matches("\\w"));
        System.out.println();
    }

    //3) \D non word matching
    public static void demo3()
    {
        System.out.println("A".matches("\\D"));
        System.out.println("5".matches("\\D"));
        System.out.println();
    }

    public static void demo4()
    {
        System.out.println(" ".matches("\\s"));
        System.out.println("A".matches("\\s"));
        System.out.println();
    }

    //5) non Space Charter
    public static void demoNonSpacesChar()
    {
        System.err.println("A".matches("\\S"));
        System.out.println(" ".matches("\\S"));
        System.out.println();
    }

    public static void demoNonWordChar()
    {
        System.out.println("@".matches("\\W"));
        System.err.println("#".matches("\\W"));
        System.out.println("A".matches("\\W"));
    }

    //Quantifier --> tell how many char to match
    //1) Star Quantifier --> 0 or more
    
    public static void starQuantifier()
    {
        String str = "abcbbccab";
        String str1 = "";
        String str2 = "abc7";

        System.out.println(str.matches("[abc]*"));
        System.out.println(str1.matches("[abc]*"));
        System.out.println(str2.matches("[abc]*"));
        

        System.out.println();

    }

    public static void plusQuantifeir()
    {
        String str1 = "abc";
        String str2 = "";
        String str3 = "aaabbc";

        System.out.println(str1.matches("[abc]+"));
        System.out.println(str2.matches("[abc]+"));
        System.out.println(str3.matches("[abc]+"));

        System.out.println();
    }

    public static void ExactCountQuantifeir()
    {
        String str1 = "acc";
        String str2 = "ab";
        String str3 = "abcd";

        System.out.println(str1.matches("[abc]{3}"));
        System.out.println(str2.matches("[abc]{3}"));
        System.err.println(str3.matches("[abc]{3}"));

        System.out.println();
    }

    public static void minAndMaxQuantifeir()
    {
        String str1 = "aabbcc";
        String str2 = "ab";
        String str3 = "abccbbcaa";

        System.out.println(str1.matches("[abc]{3}"));
        System.out.println(str2.matches("[abc]{3}"));
        System.out.println(str3.matches("[abc]{3}"));

        System.out.println();
    }

    public static void questionQuantifeir()
    {
        String str1 = "ac";
        String str2 = "abc";
        String str3 = "acbc";

        System.out.println(str1.matches("ab?c"));
        System.out.println(str2.matches("abc?"));
        System.out.println(str3.matches("a?bc"));

        System.out.println();

    }
}
