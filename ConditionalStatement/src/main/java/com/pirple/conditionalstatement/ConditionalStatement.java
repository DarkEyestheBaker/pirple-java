
package com.pirple.conditionalstatement;

import java.util.*;

public class ConditionalStatement {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input now: ");
        String input = reader.next();
        
        if(input.equals ("password"))
        {
        System.out.println("YES!");
        }
        else
        {
        System.out.println("NO!");
        }
    }
}
