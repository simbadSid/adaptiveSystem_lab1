




public class Person
{
// ----------------------------------
// Attributes
// ----------------------------------
	private String	name;
	private int		age;

// ----------------------------------
// Builder
// ----------------------------------
	public Person(String name, int age)
	{
		this.name	= new String(name);
		this.age	= age;
	}

// ----------------------------------
// Accesser
// ----------------------------------
	public String	getName	()	{return new String(this.name);}
	public int		getAge	()	{return this.age;}

// ----------------------------------
// Local methods
// ----------------------------------
	public void update(Person newVersion)
	{
		this.name	= new String(newVersion.name);
		this.age	= newVersion.age;
	}

	public boolean equals(Person p)
	{
		if (!this.name.equals(p.name))	return false;
		if (this.age != p.age)			return false;
		return true;
	}

	public boolean equals(String personName)
	{
		return (this.name.equals(this.name));
	}

	public String toString()
	{
		String res = "";

		res += "Name:\t "	+ this.name	+ "\n";
		res += "Age:\t"		+ this.age;

		return res;
	}
}
