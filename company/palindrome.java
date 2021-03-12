package com.company;

public class palindrome {
    static void palindrome_number(int n){
        int rev=0,temp=0,num=n;
        while(n>0){
            temp=n%10;
            rev=(rev*10)+temp;
            n=n/10;
        }
        if(rev==num){
            System.out.println("Given "+num+" is palindrome");

        }
        else{
            System.out.println("Given "+num+" is not palindrome");
        }
    }
    static void palindrome_string(String str){
        String rev_string="";
        char ch[]=str.toCharArray();
//        for(int i=0;i<str.length();i++){
//            ch[i]=str.charAt(i);
//        }
        for(int i=ch.length-1;i>=0;i--){
            rev_string+=ch[i];
        }
//        System.out.println(rev_string);
//        System.out.println(str);
        if (rev_string.equalsIgnoreCase(str)){
            System.out.println("Given "+str+" is palindrome");
        }
        else{
            System.out.println("Given "+str+" is not palindrome");
        }
    }
    public static void main(String[] args) {
        palindrome_number(121);
        palindrome_string("ab");
    }
}
