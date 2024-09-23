package com.evergent.corejava.privateandobjectclassmethods;

final class ImmutableString{
	private String value;
	public ImmutableString(String value)
	{
		this.value=value;
	}
	public String myValue() {
		return value;
	}
	//@override
	public String toString()
	{
	return value;	
	}
}
public class MyData {

	public static void main(String[] args) {
		
		ImmutableString str=new ImmutableString("helloStringworld");
		System.out.println(str.toString());
	}

}
