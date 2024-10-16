class HelloWorld {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "programming";
        String str5 = "language";
        String uppercased = str4.toUpperCase();
        String concatenate = str1 + "" + str2 + "" + str3 + "" + str4.toUpperCase() + "" + str5;
        
        String substring = concatenate.substring(8);
        
        System.out.println(substring);
    }
}
