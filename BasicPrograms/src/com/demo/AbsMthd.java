package com.demo;

public class AbsMthd extends AbsMthd1 {
	public void disp()
	{
		System.out.println("disp");
	}

	public void run() {
		System.out.println("run");
	}

//demo p

	public static void main(String[] args) {
		/*AbsMthd ab = new AbsMthd();
		ab.disp();
		ab.run();
		AbsMthd2 ab1 = new AbsMthd2();
		ab1.disp();
		ab1.run();*/
		/*if("to".compareToIgnoreCase("iat")>0)
		{
			System.out.println("to".compareToIgnoreCase("is"));
		}*/
		String str1="This is a to far too and to havee have";
		String[] str2=str1.split(" ");String temp=null;
		for(int i=0;i<str2.length;i++)
		{
			for(int j=0;j<str2.length;j++)
			{
				if(str2[i].length()<=str2[j].length() && str2[i].compareToIgnoreCase(str2[j])<=0)
				{
					temp=str2[j];
					str2[j]=str2[i];
					str2[i]=temp;
				}
			}
		}
		/*for(int i=0;i<str2.length;i++)
		{
			for(int j=0;j<str2.length;j++)
			{
				if(str2[i].length()<=str2[j].length())
				{
					temp=str2[j];
					str2[j]=str2[i];
					str2[i]=temp;
				}
			}
		}*/
		for(int i=0;i<str2.length;i++)
		{
			System.out.println(str2[i]);
		}
	}
	
}
