package edu.jsu.mcis.cs310;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        StringBuilder Message=new StringBuilder();
        Message.append(message);
        Message.reverse();
        message=Message.toString();
        return message;
    }
    
}