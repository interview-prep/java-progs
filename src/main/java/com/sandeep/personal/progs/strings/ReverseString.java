package com.sandeep.personal.progs.strings;

/**
 * Created by smala on 9/1/2016.
 */
public class ReverseString {

    private static final String NAME = "Our programs";

    public String reverseStringForMethod() {

        StringBuilder reversedName = new StringBuilder();
        System.out.println("Length : " + NAME.length());
        for (int i = NAME.length() - 1; i >= 0; i--) {
            reversedName.append(NAME.charAt(i));
        }
        return reversedName.toString();
    }

    public String reverseStringRecursiveMethod(String name) {

        if (null == name || name.isEmpty()) {
            return name;
        }
        return reverseStringRecursiveMethod(name.substring(1)) + name.charAt(0);
    }

    public String reverseStringReverseMethod() {
        StringBuffer sb = new StringBuffer(NAME);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        ReverseString rs = new ReverseString();
        System.out.println("Using for method : " + rs.reverseStringForMethod());
        System.out.println("\nLength : " + (ReverseString.NAME.length()));
        System.out.println("Using Recursive method : " + rs.reverseStringRecursiveMethod(ReverseString.NAME));
        System.out.println("\nUsing reverse method : " + rs.reverseStringReverseMethod());
    }
}
