public class GreatestLetter{
    public char nextGreatestLetter(char[] letters, char target) {
        // Linear scan checking conditions
        for (char c : letters) {
            if (c > target) {
                return c;
            }
        }
        // If no letter is greater, wrap around to the first character
        return letters[0];
    }
}