package com.demo;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		
		String str="Rajitha is a good girl";
		String str1=str.replaceAll("\\s", "");
		String[] strarr=str1.split("");
		/*for(int i=0;i<strarr.length;i++)
		{
			int count = 0;
			Pattern p=Pattern.compile(strarr[i]);
			Matcher m=p.matcher(str1);
			while(m.find())
			{
				count++;
			}
			
			if(count>1)
			{
			System.out.println(strarr[i]+":"+count);
			}
		}*/
		
		for(int i=0;i<str1.length();i++)
		{
			int count = 0;
			for(int j=0;j<str1.length();j++)
			{
				if((str1.charAt(i))==str1.charAt(j))
				{
					count++;
				}
		
			}
			if(count>1)
			{
				System.out.println(str1.charAt(i)+":"+count);
				String d=str1.valueOf(str1.charAt(i));
				str1=str1.replaceAll(d, "");
			}
			
			
		}System.out.println(str1);
	}
}
