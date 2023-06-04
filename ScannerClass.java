package org.scan;

public class ScannerClass{
	
	// step 1 : create object
	
	public static ScannerClass object;
	
	public static ScannerClass Createobject() {
		
		if (object == null) {
			
			System.out.println("Before Object Creation:" + System.identityHashCode(object) );
			
			object = new ScannerClass();
			
			System.out.println("After Object Creation:" + System.identityHashCode(object));
			
			
		}
		return object;
	}

	private void empId() {
		
		System.out.println("Empid is method");

	}
	
	private void empno() {
		
		System.out.println("Employee no is method");
	}
	
	public static void main(String[] args) {
		
		ScannerClass Createobject = Createobject();
		
		Createobject.empId();
		System.out.println(System.identityHashCode(Createobject));
		
		
		Createobject.empno();
		System.out.println(System.identityHashCode(Createobject));
		
	}
}
