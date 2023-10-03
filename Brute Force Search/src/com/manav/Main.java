package com.manav;
public class Main {
    public static int search(String text, String pattern){
        int lengthOfText = text.length();
        int lengthOfPattern = pattern.length();

        for(int i = 0; i < lengthOfText - lengthOfPattern; i++){
            int j;
            for(j = 0; j < lengthOfPattern; j++){
                if(text.charAt(i + j) != pattern.charAt(j)){
                    break;
                }
            }

            if(j == lengthOfPattern){
                return i;
            }
        }
        return lengthOfText;
    }

    public static void main(String[] args) {
        String text = "This is just a text";
        String pattern = "just";
        System.out.println(search(text, pattern));
    }
}