package javapracticse;

public class SuperB extends SuperA{

	public SuperB()
	{
		super();
		System.out.println("Super B constructer");
	}
	 public int x= 50;
	 public void m() 
	 {
		System.out.println("m of super B");
		super.m();
		System.out.println(super.x);
	}
	
}
