package sujoy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.NoSuchElementException;

class A {
	public void abc() throws FileNotFoundException {
		System.out.print("A");
	}
}

/**
 * 
 * You can't throw any new checkecd exception in child class method. example sql
 * exception,io exception, invocation targetexception.
 *
 */
class B extends A {
	public void abc() throws NullPointerException {
		System.out.print("B");
	}

}

class Main {
	public static void main(String[] args) throws Exception {
		A obj = new B();
		obj.abc();
	}
}