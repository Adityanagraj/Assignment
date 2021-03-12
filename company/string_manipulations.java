package com.company;

import java.util.Locale;

public class string_manipulations {
    public static void main(String[] args) {
        String str1="hello",str2="world",str3;
        str3=str1.concat(str2);
        System.out.println("Concated String"+str3+"\n String Length "+ str3.length()+"String Char "+str3.charAt(3));
        System.out.println("\n Index of a char in String"+str3.indexOf("l")+"\n String contatins letter "+str1.contains("lllo")+" "+str2.endsWith("d"));
        System.out.println("String Comparision"+str1.compareTo(str3));
        System.out.println("String Replacement"+str3.replace("hello","hello1"));
        System.out.println("String uppercase"+str3.toUpperCase());
        StringBuilder sb=new StringBuilder("hello");
        sb.append("world");
        System.out.println("Append using string Builder "+sb);
        sb.insert(1,"1");
        System.out.println("insert using String Builder "+sb);
        sb.reverse();
        System.out.println("Reverse using String Builder "+sb);
        System.out.println(sb.capacity()); //formula=(oldstring*2)+2
    }
}
