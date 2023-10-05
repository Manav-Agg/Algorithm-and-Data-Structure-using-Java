package com.manav;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringOperations{
    public String revertString(String text){
//        String --> 0(N*N)     StringBuilder --> 0(N)
        int lengthOfText = text.length();   //0(1)
        StringBuilder reversedString = new StringBuilder();

        for(int index = lengthOfText - 1; index >= 0; index--){ //0(N)
            reversedString.append(text.charAt(index));  //0(1)
        }

        return reversedString.toString();
    }

    public List<String> getSuffixes(String text){
        int lengthOfText = text.length();   //0(1)
        List<String> suffixesList = new ArrayList<>();

        for(int index = 0; index < lengthOfText; index++){
            suffixesList.add(text.substring(index, lengthOfText));  //0(1)
        }

        return suffixesList;
    }

//    0(N)
    public String longestCommonPrefix(String text1, String text2){
        int commonLength = Math.min(text1.length(), text2.length());

        for(int index = 0; index < commonLength; index++){
            if(text1.charAt(index) != text2.charAt(index)){
                return text1.substring(0, index);   //0(1)
            }
        }

        return text1.substring(0, commonLength);
    }

//    0(N)
    public List<String> getPrefixes(String text){
        int lengthOfText = text.length();
        List<String> prefixList = new ArrayList<>();

        for(int index = 1; index < lengthOfText + 1; index++){
            prefixList.add(text.substring(0, index));   //0(1)
        }

        return prefixList;
    }

    public String longestRepeatedSubstring(String text){
        int lengthOfText = text.length();
        List<String> suffixes = getSuffixes(text);
        Collections.sort(suffixes);
        String longestSubstring = "";

        for(int i = 0; i < lengthOfText - 1; i++){
            String tempString = longestCommonPrefix(suffixes.get(i), suffixes.get(i + 1));

            if(tempString.length() > longestSubstring.length()){
                longestSubstring = tempString;
            }
        }

        return longestSubstring;
    }
}