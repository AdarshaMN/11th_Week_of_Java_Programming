package StringProblems;

//Approach 3: best Approach using String and two pointers
//Reason: only traversal is required, no extra objects
//TC: O(n)
//SC: O(1)
public class isPalApproachThree {
    
    public static void main(String[] args) {
        
        testPalindrome("Madam");
        testPalindrome("");
        testPalindrome("A man, a plan, a canal: Panama");
        testPalindrome("hello");
        testPalindrome("GaDaG");
        testPalindrome("12321");
        testPalindrome("A1@b#b@1a");
    }

    public static void testPalindrome(String input)
    {
        boolean ans = isPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + ans);
    }

    public static boolean isPalindrome(String input)
    {
        input = input.toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        while(left < right)
        {
            while(left < right && !Character.isLetterOrDigit(input.charAt(left)))
            {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(input.charAt(right)))
            {
                right--;
            }
            
            while (input.charAt(left) != input.charAt(right)) 
            {
                return false;    
            }
            left++;
            right--;
        }
        return true;
    }
}
