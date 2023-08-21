package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(alphanumeric("１strangedigit"));
    }

    public static boolean alphanumeric(String s){
        String space = s.replaceAll(" ", "");
        String underscore = s.replaceAll("_", "");
        if(s.length() != space.length() || s.isEmpty() || s.length() != underscore.length()) {
            return false;
        }
        String regex = "[^a-zA-Z\\d\\s:]";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(s);
        if(matcher.find()) {
            return false;
        }
        else {
            return true;
        }
    }
}