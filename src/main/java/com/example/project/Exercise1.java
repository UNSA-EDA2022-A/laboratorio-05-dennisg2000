package com.example.project;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.esBalanceado(s));
        }
    }

    public boolean esBalanceado(String s) {
        MyStack<Character> stack = new LinkedListStack<>();
        boolean es=false,c=false;
	        int ab=0,cer=0;
	        for(int i=0;i<s.length();i++) {
	        	stack.push(s.charAt(i));
	        }
	        int size=stack.size();
	    
	        if(size%2==0) {
	        	for(int i=0;i<size/2;i++) {
		        	char temp=stack.pop();
		        	
		        	if(temp==')' || temp=='}' || temp==']')
	        			ab+=1;
	        		else ab+=1;
	        		if(stack.top()==')' || stack.top()=='}' || stack.top()==']')
	        			cer+=1;
	        		else cer+=1;
		        	if(coincide(temp,stack.top())) {
		        		es=true;
		        		
		        	}else es= false;
		        	if(temp==')' || temp=='}' || temp==']') {
		        		if (stack.top()=='(' && temp==')') {
		   				 c= true; 
		   			 	}		 
		   			 	if(stack.top()=='{' && temp=='}') {
		   				 c= true;
		   			 	}
		   			 	if(stack.top()=='[' && temp==']') {
		   				 c= true;
		   			 	}
		        	}
		        	stack.pop();
		        }
	        }
	        return es ||(ab==cer) &&(ab!=0) && c;
    }
     public boolean coincide(char o,char p) {
		 boolean c=false;
		 if(o==')' || o=='}' || o==']') {
			 if (p=='(' && o==')') {
				 c= true; 
			 }		 
			 if(p=='{' && o=='}') {
				 c= true;
			 }
			 if(p=='[' && o==']') {
				 c= true;
			 }
			 if(p==')' || p=='}' || p==']') {
				 c= true;
			 }
		 }
		 return c;
	 }
}
