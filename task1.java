class HelloWorld {
    public static void main(String[] args) {
        String s1 = "How are you!?";
        String str = "I'm good";
        String str1 = str.concat(":)");
        String str2 = new String("Java");
        //intern method:
        String s5 = str2.intern();
        System.out.println(s1);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(s5);
    }
}

/*
Output :
java -cp /tmp/yeBrahzk1o/HelloWorld
How are you!?
I'm good
Java
Java

=== Code Execution Successful ===
*/
