public class Vowels{
    public static void main(String[] args) {
        String testStr = "Learn Java Coding!";
        int vowelCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < testStr.length(); i++) {
            char ch = testStr.charAt(i);
            
            if (isVowel(ch)) {
                vowelCount++;
            }
        }

        System.out.println("Total vowels: " + vowelCount); // Outputs: 6
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        // Convert to lowercase so we don't have to check uppercase letters separately
        ch = Character.toLowerCase(ch);
        
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}