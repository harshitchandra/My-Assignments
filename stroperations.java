public class StringOperationse {
    public static void main(String[] args) {
        String str = "Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println("Lowercase string: " + str.toLowerCase());
        System.out.println("Uppercase string: " + str.toUpperCase());
        String replacedStr = str.replace('a', '$');
        System.out.println("Replaced string: " + replacedStr);
        boolean containsCollection = str.contains("collection");
        System.out.println("Contains 'collection': " + containsCollection);
        boolean matches = str.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory");
        System.out.println("Matches: " + matches);
        if (!matches) {
            boolean equals = str.equals("java string pool refers to collection of strings which are stored in heap memory");
            System.out.println("Equals: " + equals);
        }
    }
}
