package com.example.project;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.existenDuplicados(s));
        }
    }

    public boolean existenDuplicados(String str) {
        MyStack<Character> stack = new LinkedListStack<>();
        MyStack<Character> stack2 = new LinkedListStack<>();
        // Colocar codigo aqui
        for(int i=0;i<str.length();i++) {
        	char a=str.charAt(i);
        	if(a=='(' || a==')' || a=='+' || a=='-') {
        		stack.push(a);
        	}
        	
        }
        boolean es=true,es2=true,esab=false;;
        int size=stack.size();
        int ab=0,cer=0,op1=0,op2=0;
        for(int i=0;i<size;i++) {
    		char temp =stack.pop();
    		stack2.push(temp);
    		if(temp=='(') {
    			cer+=1;
    		}
    		if(temp=='+' || temp=='-') {
    			op1+=1;
    		}
    			
    		if(cer<=op1 ) {
    			es=false;
    		}else {
    			es = true;
    			break;
    		}
    	}
        for(int i=0;i<size;i++) {
    		char temp =stack2.pop();
    		if(temp==')') {
    			ab+=1;
    		}
    			
    		if(temp=='+' || temp=='-') {
    			op2+=1;
    		}
    			
    		if(ab<=op2 ) {
    			es2=false;
    		}else {
    			es2 = true;
    			break;
    		}
        }
        System.out.println(stack);

        return es || es2;
    }
}
