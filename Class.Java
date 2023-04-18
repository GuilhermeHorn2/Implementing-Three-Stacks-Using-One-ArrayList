package misc;

import java.util.ArrayList;

public class Three_Stacks<T> {
	
	private  ArrayList<T> v = new ArrayList<>();
	private int top_1;//index
	private int top_2;//index
	private int top_3;//index
	
	
	public Three_Stacks(T a,T b,T c) {
		
		v.add(a);
		v.add(b);
		v.add(c);
		top_1 = 0;
		top_2 = 1;
		top_3 = 2;
	}
	
	public T pop(int s) {	
		if(s == 1) {
			//pop in stack 1
			int i = top_1;
			v.set(top_1,null);
			top_1 -= 3;
			return v.get(i);
			
		}
		if(s == 2) {
			//pop in stack 2
			int i = top_2;
			v.set(top_2, null);
			top_2 -= 3;
			return v.get(i);
		}
		if(s == 3) {
			//pop in stack 3
			int i = top_3;
			v.set(top_3, null);
			top_3 -= 3;
			return v.get(i);
		}	
		System.out.println("Invalid Stack");
		return null;		
	}
	
	public void push(int s,T item) {
		
		v.add(null);
		v.add(null);
		v.add(null);	
		if(s == 1) {
			//push in stack 1
			
	       int novo = top_1 + 3;
			v.set(novo, item);
			top_1 = novo;//update top value
		}
		if(s == 2) {
			//push in stack 2
			
	       int novo = top_2 + 3;
			v.set(novo, item);
			top_2 = novo;//update top value
		}
		if(s == 3) {
			//push in stack 1
			
	       int novo = top_3 + 3;
			v.set(novo, item);
			top_3 = novo;//update top value
		}
	}
	
	public T peek(int s) {
		
		if(s == 1) {
			//peek stack 1
			if(top_1 < 0) {
				System.out.println("Empty Stack");
				return null;
			}
			
			T item = v.get(top_1);
			return item;			
		}
		if(s == 2) {
			//peek stack 2
			if(top_2 < 0) {
				System.out.println("Empty Stack");
				return null;
			}
			
			T item = v.get(top_2);
			return item;			
		}
		if(s == 3) {
			//peek stack 3
			if(top_3 < 0) {
				System.out.println("Empty Stack");
				return null;
			}
			
			T item = v.get(top_3);
			return item;			
		}
		System.out.println("Invalid Stack");
		return null;		
	}
	
	public boolean is_empty(int s) {
		
		if(s == 1) {
			//is_empty on stack 1
			
			if(top_1 < 0) {
				return true;
			}
			return false;
			
		}
		if(s == 2) {
			//is_empty on stack 2
			
			if(top_2 < 0) {
				return true;
			}
			return false;
			
		}
		if(s == 3) {
			//is_empty on stack 3
			
			if(top_3 < 0) {
				return true;
			}
			return false;
			
		}
		System.out.println("Invalid Stack");
		return false;	
	}

}
