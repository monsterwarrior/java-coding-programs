package org.com.multipleinheritance;

//Using interface java will support multiple inheritence

public class CodingB implements JavaDeveloperInterface, SqlDeveloperInterface {

	@Override
	public void doCoding() {
		// TODO Auto-generated method stub
		System.out.println("Do Java/Sql coding (implementation depends on subclass)");
		
	}

	public static void main(String[] args) {
		
		CodingB b = new CodingB();
		
		b.doCoding();
	}
}
