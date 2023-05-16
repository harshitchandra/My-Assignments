public class StringOperationsExample {
    public static void main(String[] args) {
        String str = "Java String pool refers to collection of Strings which are stored in heap memory";
        
        // a. Print the string to console in lowercase
        System.out.println("Lowercase string: " + str.toLowerCase());
        
        // b. Print the string to console in uppercase
        System.out.println("Uppercase string: " + str.toUpperCase());
        
        // c. Replace all 'a' character in the string with $ sign
        String replacedStr = str.replace('a', '$');
        System.out.println("Replaced string: " + replacedStr);
        
        // d. Check if the original String contains the word "collection"
        boolean containsCollection = str.contains("collection");
        System.out.println("Contains 'collection': " + containsCollection);
        
        // e. Check if the following String "java string pool refers to collection of strings which are stored in heap memory" matches the original
        boolean matches = str.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory");
        System.out.println("Matches: " + matches);
        
        // f. If the string does not match check if there is another method which can be used to check if the strings are equal
        if (!matches) {
            boolean equals = str.equals("java string pool refers to collection of strings which are stored in heap memory");
            System.out.println("Equals: " + equals);
        }
    }
}
