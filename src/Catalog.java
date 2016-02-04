import java.util.HashMap;






public class Catalog
{
// ----------------------------------
// Attributes
// ----------------------------------
	private HashMap<String, Person>	personList;

// ----------------------------------
// Builder
// ----------------------------------
	public Catalog()
	{
		this.personList	= new HashMap<String, Person>();
	}

// ----------------------------------
// Local methods
// ----------------------------------
	public static void main(String[] args)
	{
		Catalog c = new Catalog();

		System.out.println("Initial catalog:");
		c.print();

		c.register(new Person ("Karima",	2));
		c.register(new Person ("bigboss",	3));
		c.register(new Person ("nanak",		4));

		System.out.println("\n\n\nIntermediate catalog:");
		c.print();

		c.delete("bigboss");
		c.delete("nanak");
		System.out.println("\n\n\nFinal catalog:");
	}

// ----------------------------------
// Local methods
// ----------------------------------
	public void register(Person p)
	{
		this.personList.put(p.getName(), p);
	}

	public boolean update(String name, Person newPerson)
	{
		Person toUpdate = null;

		for (String n:this.personList.keySet())
		{
			if (!n.equals(name))	continue;
			toUpdate = this.personList.get(n);
			break;
		}
		if (toUpdate == null) return false;

		toUpdate.update(newPerson);
		return true;
	}

	public boolean delete(String name)
	{
		for (String n:this.personList.keySet())
		{
			if (!n.equals(name))	continue;
			this.personList.remove(n);
			return true;
		}
		return false;
	}

	public void print()
	{
		if (this.personList.isEmpty())
		{
			System.out.println("***Empty  catalog ***");
			return;
		}

		for (String name:this.personList.keySet())
		{
			Person p = this.personList.get(name);
			System.out.println("-------------------------------");
			System.out.println(p);
		}
	}
}
