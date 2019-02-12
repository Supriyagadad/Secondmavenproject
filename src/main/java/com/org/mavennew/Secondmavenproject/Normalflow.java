package com.org.mavennew.Secondmavenproject;

public class Normalflow {

	public Normalflow() {
		this(10);
		System.out.println("no parameter");
	}

	public Normalflow(int x) {
		this(20, "abcdff");
		System.out.println("one  parameter");

	}

	public Normalflow(int y, String name) {

		System.out.println(" two parameter");
	}

	public static void main(String[] args) {

		System.out.println(" method first");
		Normalflow ref = new Normalflow();
		ref.method1();

	}

	public void method1() {

		try {
			try {
				System.out.println("20/0");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("false");
			}
			finally {
				System.out.println("finally third block");
			}

			System.out.println(10 / 0);
			method2();
		}

		catch (Exception e) {

			System.out.println("error");

			// System.out.println("method 1");
			method2();
		}
		try {
			System.out.println(30 / 0);

		} catch (Exception e) {

			// TODO: handle exception
			System.out.println("wrong");
			method2();
		} finally {
			System.out.println("finally block");
		}

	}

	public void method2() {
		System.out.println("method 2");
		this.method3();

	}

	public void method3() {
		System.out.println("method 3");

	}

}
