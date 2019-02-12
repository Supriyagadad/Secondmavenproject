package javapracticse;

public class ThisB {

	public ThisB()
	{
		this(9000);
		System.out.println("constructer this B class");
	}
	
	public ThisB(int z)
	{
		System.out.println("constructer this B with int" +z+20);
	}

public int x=50;
public void m()
{
	System.out.println(this.x);
	System.out.println("m of this B");
	}
}
