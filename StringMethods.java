package StringProblems;

class StringMethods {

    public static void main(String[] args) {
        
        demoTrim();
        //demoSplit();
        demoIsEmpty();
        demoSubStringBegin();
        demoSubStringBeginToEnd();
        demoIndexOf();
        demoLastIndexOf();
    }

    public static void demoTrim()
    {
        String str = "  Java       ";
        String str1 = str.trim();

        System.out.println(str1);
    }

    public static void demoSplit()
    {
        String str = "I love Java Programm";
        String str1 = str.split();

        System.out.println(str1);
    }

    public static void demoIsEmpty()
    {
        String str = "";
        String str1 = "java";
        System.out.println(str.isEmpty());
        System.out.println(str1.isEmpty());
    }

    public static void demoSubStringBegin()
    {
        String str = "Programming";

        System.out.println(str.substring(3));
    }

    public static void demoSubStringBeginToEnd()
    {
        String str = "Programming";

        System.out.println(str.substring(3, 7));
    }

    public static void demoIndexOf()
    {
        String web = "www.google.com";
        System.out.println(web.indexOf("."));
    }

    public static void demoLastIndexOf()
    {
        String website = "www.google.com";
        System.out.println(website.lastIndexOf(".", 4));
    }

}