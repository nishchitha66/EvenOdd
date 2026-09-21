import java.util.Arrays;

public class Strings{
    public static void main(String[] args) {
    
        String greeting = "Hello, World!"; 
        System.out.println("Length: " + greeting.length()); 
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName; 
        String combined = firstName.concat(lastName);  
        System.out.println("Full Name: " + fullName);  

        String str1 = "Java";
        String str2 = new String("Java");
        System.out.println("Using ==: " + (str1 == str2));       
        System.out.println("Using .equals(): " + str1.equals(str2)); 
        System.out.println("Ignore Case: " + str1.equalsIgnoreCase("JAVA"));
        
        String sentence = "Programming is fun";
        char firstLetter = sentence.charAt(0); 
        String word = sentence.substring(12, 14); 
        System.out.println("Extracted: " + word);

       
        boolean containsJava = sentence.contains("Java"); 
        int indexOfIs = sentence.indexOf("is");          

        
        String messyText = "   Clean Me Up!   ";
        System.out.println("Trimmed: '" + messyText.trim() + "'"); 
        String replaced = sentence.replace("fun", "awesome");   

       
        String csvData = "apple,banana,cherry";
        String[] fruits = csvData.split(",");
        System.out.println("Split array: " + Arrays.toString(fruits)); 
       
    }
}