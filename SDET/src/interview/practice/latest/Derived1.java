package interview.practice.latest;

class Derived1 extends Parent
{
	// constructor 3
	Derived1()
	{
		
		System.out.println("No-argument constructor " +
						"of derived");
	}

	// parameterized constructor 4
	Derived1(String name)
	{
		// invokes base class constructor 2
		//super(name);
		this();
		System.out.println("Calling parameterized " +
						"constructor of derived");
	}

	public static void main(String args[])
	{
		// calls parameterized constructor 4
		Derived1 obj = new Derived1("Name");
	}
}

