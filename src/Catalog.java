import java.util.LinkedList;





public class Catalog
{
// ----------------------------------
// Attributes
// ----------------------------------
	private LinkedList<Person>	personList;
// ----------------------------------
// Builder
// ----------------------------------
	public Catalog Person()
	{
		this.personList	= new LinkedList<Person>();
	}

// ----------------------------------
// Local methods
// ----------------------------------
	public void register(Person p)
	{
		this.personList.add(p);
	}

	public boolean update(String name, Person newPerson)
	{
		for (Person p:this.personList)
	}

	public 
}
