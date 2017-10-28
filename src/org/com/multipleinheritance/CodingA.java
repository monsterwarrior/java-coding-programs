package org.com.multipleinheritance;


// By class java will not support multiple inheritence

//public class CodingA extends JavaDeveloper, SqlDeveloper {

//public class CodingA extends SqlDeveloper {

public class CodingA extends JavaDeveloper {

	public static void main(String[] args) {
		
		CodingA a = new CodingA();

		a.doCoding();
	}
}
