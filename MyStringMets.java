/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author X870
 */
public class MyStringMets {
    
    static boolean myEquals(String s, String s2){
        boolean result = false;
        if(s.length()!=s2.length()){
            return result;
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=s2.charAt(i)){
                System.out.println("o1");
                return result;
            }
            else if(i==s.length()-1){
                result = true;
            }
        }
        return result;
    }
    
    static boolean myStartWith(String whereToSeek, String whatToSeek){
        boolean result = false;
        if(whatToSeek.length()>whereToSeek.length()){
            return result;
        }
        for (int i = 0; i < whatToSeek.length(); i++) {
            if(whatToSeek.charAt(i)!=whereToSeek.charAt(i)){
                return result;
            }
            else if(i==whatToSeek.length()-1){
                result = true;
            }
        }
        return result;
    }
    
    static boolean myContains(String whereToSeek, String whatToSeek){
        boolean result = false;
        if(whatToSeek.length()>whereToSeek.length()) return result;
        mainBreakpoint:
        for (int i = 0; i < whereToSeek.length(); i++) {
            breakpoint:
            if(whereToSeek.charAt(i)==whatToSeek.charAt(0)){
                for (int j = 1; j < whatToSeek.length(); j++) {
                    if(whatToSeek.charAt(j)!=whereToSeek.charAt(i+j)){
                        i++;
                        break breakpoint;
                    }
                    else if(j==whatToSeek.length()-1){
                        result = true;
                        break mainBreakpoint;
                    }
                }
            }
        }
        return result;
    }
    
}
