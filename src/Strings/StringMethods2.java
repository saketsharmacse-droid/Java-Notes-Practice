package Strings;

import java.util.Locale;

public class StringMethods2 {
    static void main() {
        String name = "Saket";
        System.out.println(name);

        int value = name.length();
        System.out.println(value); //5

        //toLowerCase() toUpperCase()
        String name1 = "SAKET";
        String lstring = name1.toLowerCase();
        System.out.println(lstring);//saket
        String ustring = name.toUpperCase(); //original string change nhi ho rhi yeh sab mei.
        System.out.println(ustring); //SAKET

        //trim()
        String nontrimmed = "    Saket Sharma    ";
        System.out.println(nontrimmed); //    Saket Sharma
        String trimmedname = nontrimmed.trim();
        System.out.println(trimmedname); //Saket Sharma

        //substring()
        String str = "Mississippi";
        System.out.println(str.substring(0)); //isme original string return hoyega.
        System.out.println(str.substring(5)); //

        System.out.println(str.substring(1,5)); //isi --> yaha pe last waala include nhi hota.


        //replace()
        String sttr = "Cherry";
        System.out.println(name.replace('r','p')); //Cheppy
        //replace will replce all the occurrences of a particular character.
        System.out.println(sttr.replace("rry", "meleon")); //chemeleon
        System.out.println(sttr.replace("r", "iii")); //yeh r ke saare occurrences ko string se change krr dega.
        System.out.println(sttr.replace("rry","a")); //yeh string ko ek char mei krr dega


        //startsWith() endsWith()
        String ss = "MachiPichu";
        System.out.println(ss.startsWith("Mac")); //true
        System.out.println(ss.endsWith("ch")); //false
        //boolean values return krega.


        //charAt()
        System.out.println(ss.charAt(5));//P
        System.out.println(ss.charAt(1));//a
        System.out.println(ss.charAt(9)); //u

        //indexOf()
        System.out.println(ss.indexOf("P"));//5
        System.out.println(ss.indexOf("ichu")); //first character ka index dega
        String ss1 = "Saketket";
        System.out.println(ss1.indexOf("ket", 4));
        System.out.println(ss1.indexOf("yolo"));//-1
        //string nhi milega toh -1

        //lastIndexOf()
        System.out.println(ss1.lastIndexOf("ket")); //5
        //if kuch presen nhi hai toh -1 dega
        System.out.println(ss1.lastIndexOf("ket", 2));//search last se krega yeh.


        //equals()
        System.out.println(name.equals("saket"));//false

        //agar meko case sensitive krke compare nhi krna hai:
        //.equalsIgnoreCase(str)
        System.out.println(name.equalsIgnoreCase("saKet"));//true


        //Escape Sequence:
        System.out.println("I am an Escape Sequence of \" Double Quotes \" ");


    }
}

//There are string methods that can be used to get information related to strings, or change etc
//strings are immutable, so we cannot change the exact string, but we surely can make a copy and store at a different memory location for all the manipulations;

//String index starts from 0
//String methods:
//String name = "Saket";
//name.length() --> returns the length of the string.
//name.toLowerCase(); --> returns a string having all lowercase characters.
//name.toUpperCase(); --> returns a string having all uppercase characters.
//name.trim(); --> returns a new string after removing all the leading and trailing spaces.
//name.substring(int start) --> returns a substring from start to end.
//name.substring(int start, int end) --> returns substring from start index to the end index, start is included end is excluded.
//name.replace('char1','char2') --> returns a new string after replacing the char 1 with char2
//name.replace('str1','str2')
//name.replace('char','str')

//name.startsWith("string") --> returns true if name starts with the string as argument.
//name.endsWith("string") --> returns true if name ends with the passed value.
//name.charAt(int) --> returns the character at the given index position.
//name.indexOf(str) --> returns the index of a given string.
//name.indexOf(str, from index)
//name.lastIndexOf(str) --> returns the last index of given string, if repetition hua hai toh sabse last waale ka index dega.
//name.lastIndexOf(str, int) --> returns the last index of a given string before index 2.
//name.equals(str) --> returns true if the given string is equal to the str.
//jab bhi do strings ko match krna hoga toh .euqals() hi use krna, do not use == operator(not recommended)
//name.equalsIgnorecase(str) --> returns true if two strings are equal ignoring the case of characters.



//Escape Sequence Characters:
// \n --> newline
// \t --> tab jitti space dega
// \' --> single quotes escape
// \" --> double quotes escape
// \\ --> backslash
// \b --> inserts a backspace in the text at this point.
// \r --> inserts a carriage return in the text at this point.
// \f --> inserts a formfeed in the text at this point.