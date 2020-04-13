package edu.wit.cs.comp1050;

import java.util.ArrayList;
import java.util.Arrays;

//TODO: document this class
public class PA5b {
	
	/**
	 * Returns an array of all sequences of substrings
	 * of haystack that match the needle pattern.
	 * 
	 * The dash (-) is a single-character wildcard (i.e.
	 * it can match any character), all others much
	 * match directly.
	 * 
	 * @param needle pattern for which to search
	 * @param haystack text over which to search
	 * @return an array of substrings of haystack that match needle
	 */
	public static String[] patternMatch(String pattern, String text) {

        ArrayList<String> patterns = new ArrayList<>();
        int index = 1;
        for (int i = 0; i <= text.length() - pattern.length(); i++) {

            String subText = text.substring(i, i + pattern.length());
            boolean match = true;
            for (int j = 0; j < pattern.length(); j++) {
                if (subText.charAt(j) == pattern.charAt(j) || pattern.charAt(j) == '-'
                 ) {
                    continue;
                } else {
                    match = false;
                    break;
                }
            }
            if(match){
                patterns.add(subText);
            }


        }

        String [] matches = new String[patterns.size()];
        for(int pos=0;pos<patterns.size();pos++){
            matches[pos]=patterns.get(pos);
        }
        return matches;

    }

    public static void main(String[] args) {

        String[] matches = patternMatch("A--G-", "ACTGGTACTGA");
        System.out.println(Arrays.toString(matches));
         matches = patternMatch("-GG-", "ACTGGTACTGA");
        System.out.println(Arrays.toString(matches));
        matches = patternMatch("-GGC", "ACTGGTACTGA");
        System.out.println(Arrays.toString(matches));

    }
}