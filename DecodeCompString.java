package StringProblems;
//Problem: Decode Compreesed String
//intput: a2b3c2
//output: aabbbcc
public class DecodeCompString {
    
    public static void main(String[] args)
    {
        testDecode("a3b2c3");
        testDecode("x1y5");
        testDecode("m2n3");
    }

    //Test Method
    public static void testDecode(String input)
    {
        System.out.println("Input: " + input);
        System.out.println("Output: " + decode(input));
    }

    //Decode MEthod
    public static String decode(String input)
    {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < input.length(); i = i + 2)
        {
            //read Chars
            char currentChar = input.charAt(i);

            //read digit
            int numbers = input.charAt(i + 1) - '0';//parsing --> converting one format to other format
            //number = number * 10 + (input.charAt(i) - '0') --any Type input
            //int number = '3' - '0' 51 - 48 = 3
            
            //append
            for(int count = 1; count <= numbers; count++)
            {
                answer.append(currentChar);
            }
        }
        return answer.toString();
    }
}
