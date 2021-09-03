package com.demo;

public class StringReverse {

	String name;
	public StringReverse(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		/*String s = "subha";
		System.out.println(s.length());
		for(int i = s.length()-1 ; i >= 0  ; i--) {
			char c = s.charAt(i);
			System.out.print(c);
		}
		String r = reverseRecursive(s);
		System.out.println("rec: " + r);

	}

	public static String reverseRecursive(String input) {
		if(input.isEmpty()) {
			return input;
		}
		return reverseRecursive(input.substring(1))+input.charAt(0);
	}*/


		StringReverse r=new StringReverse("Ra");
		StringReverse r1=new StringReverse("ji");
		Object[] obj=new Object[2]; 

		obj[0]=r.name;
		obj[1]=r1.name;
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
		String st="hjgh";

for(String i="ghr";i<st.length();i++)
{
	System.out.println(i);
}
	}
}
