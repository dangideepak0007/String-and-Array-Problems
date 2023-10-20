
package com.mycompany.arrays;

import java.util.stream.Stream;

public class Methods {
    public static void main(String[] args) {
        String str = "Ram is Deepak Classmete";
        String s1 = "Deepak Dangi is a intern in AmstechIn.prvt.lmt.";
        //1
        char s2 = s1.charAt(1);
        System.out.println(s2);
        //2
        int s3 = s1.length();
        System.out.println(s3);
        //3
        str = str.repeat(s3);
        System.out.println(str);
        //4
        String str1 = "who is your classmate";
        str1 = str1.concat(s1);
        System.out.println(str1);
        //5
        s1.codePointAt(2);
        System.out.println(s1);
        //6
        String s6 = "Ram Kumar Verma";
       
        int s6output = s6.indexOf("Kumar");
        System.out.println(" Index of is = " + s6output);
        //7 
        int S6output = s6.indexOf("u", 4);
        System.out.println(S6output);
        //8
        int s2output = s1.lastIndexOf("d");
        System.out.println("the last index of is " + s2output);
        //9
        boolean s1out = s1.equals("Deepak");
        System.out.println(s1out);
        //10 imp
        String c1 = "Today is Monday";
        int c1out = c1.compareTo("Today is Friday");
        System.out.println(c1out);
        //11
        String st = "namaste india";
        String st1 = st.toUpperCase();
        System.out.println("Upper case of String is = " + st1);
        //12
        String string = "HELLO INDIA";
        String string1 = string.toLowerCase();
        System.out.println("Upper case of String is = " + string1);
        //13
        String w1 = "JAVA is an object oriented programming";
        String w2 = w1.trim();
        System.out.println(w2);
        //14
        String str0 = "What is your name";
        String str2 = str0.replace("What","Deepak");
        System.out.println(str2);
        //15
        String st0 = "What is your name";
        String st2 = st0.replace('a','o');
        System.out.println(st2);
        //16
        String wo1 = new String(" What you think about Stock marcket ");
        String wo2 = wo1.trim();
        System.out.println(wo2);
        //17
        String s7 = "What you think AI will replace Humens in most of the jobs";
        String s8 = "AI replace Humens";
        s7.contains(s8);
        System.out.println(s8);
        //18
        String out5 = s7.intern();
        System.out.println(out5);
        //19 
        String out6 = s8.strip();
        System.out.println(out6);
        //20
        String out7 = s7.translateEscapes();
        System.out.println(out7);
        //21
        int out8 = s8.codePointAt(5);
        System.out.println(out8);
        //22
        int out9 = str.codePointBefore(6);
        System.out.println(out9);
        //23
        int o1 = s1.offsetByCodePoints(4, 6);
        System.out.println(o1);
        //24
        int o2 = str.hashCode();
        System.out.println(" the hashcode of str is = " + o2);
        //25
        boolean o3 = s1.contentEquals("Deepak");
        System.out.println(o3);
        //26
        String s10 = "What is your college name" ;
        String st5 = new String(s10);
        st5 = s10.replaceFirst("What", "Sage");
        System.out.println(st5);
        //27
        boolean st6 = st5.endsWith("e");
        System.out.println(st6);
        //28
        boolean st7 = str.matches("Ram");
        System.out.println(st7);
        //29
        
        byte[] st8=st5.getBytes();
        System.out.println(st8);
        //30
        int st9 = st5.codePointCount(0, 6);
        System.out.println(st9);
        Object[] Ram = null;
       
        //31
//        System.out.println(String.format(str,6));
     str1 =str1.formatted(Ram);
        System.out.println(str1);
             
        
        
        
        
        
    }

}
