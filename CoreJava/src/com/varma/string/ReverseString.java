package com.varma.string;

/**
 * Created by varma on 12/23/2019.
 */
public class ReverseString {
    public static void main(String args[]){
        String str = "How to do in java";
        StringBuilder strBuilder =  new StringBuilder(str);
        System.out.println(strBuilder.reverse());

        System.out.println(reverseString(str));
        System.out.println(reverseRecursive(str));
        System.out.println(reverseIterative(str));

        System.out.println(reverseWords(str));
    }

    public static StringBuilder reverseString(String str){
        StringBuilder stringBuilder = new StringBuilder();
        char[] toCharArr = str.toCharArray();

        for(int i=toCharArr.length-1;i>=0;i--){
            stringBuilder.append(toCharArr[i]);
        }
        return stringBuilder;
    }

    public static String reverseRecursive(String str){
        if(str.length() < 2){
            return str;
        }

        return reverseRecursive(str.substring(1))+str.charAt(0);
    }

    public static String reverseIterative(String str){
        char[] charArr = str.toCharArray();

        for(int i =0 ;i<str.length();i++){
            for(int j=charArr.length-1;j>i;j--){
            char temp = charArr[j];
                charArr[j] = charArr[j-1];
                charArr[j-1]=temp;
            }
        }

        return new String(charArr);
    }

    public static String reverseWords(String str){
        String arr[] = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=arr.length-1;i>=0;i--){
            stringBuilder.append(arr[i]+"");
        }
        return stringBuilder.toString();
    }
}
