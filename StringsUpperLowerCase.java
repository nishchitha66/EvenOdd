public class StringsUpperLowerCase {
    public static void main(String[] args) {
        String originalText = "Hello World! Java 2026";

        // 1. Convert to Uppercase
        String upperText = originalText.toUpperCase();
        System.out.println("Uppercase: " + upperText); 
        // Outputs: "HELLO WORLD! JAVA 2026"

        // 2. Convert to Lowercase
        String lowerText = originalText.toLowerCase();
        System.out.println("Lowercase: " + lowerText); 
        // Outputs: "hello world! java 2026"

        // 3. Bonus: Toggle Case (Switch each character's case manually)
        String toggledText = toggleCase(originalText);
        System.out.println("Toggled Case: " + toggledText);
        // Outputs: "hELLO wORLD! jAVA 2026"
    }

    // Helper method to alternate/toggle the case of each character
    public static String toggleCase(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // Keeps spaces, numbers, and punctuation as they are
            }
        }
        return result.toString();
    }
}