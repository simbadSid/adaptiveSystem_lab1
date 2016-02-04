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
	public Catalog()
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
		Person toUpdate = null;

		for (Person p:this.personList)
		{
			if (!p.equals(name))	continue;
			toUpdate = p;
			break;
		}
		if (toUpdate == null) return false;

		toUpdate.update(newPerson);
		return true;
	}

	public boolean delete(String name)
	{
		for (int i=0; i<this.personList.size(); i++)
		{
			if (!this.personList.get(i).equals(name))	continue;
			this.personList.remove(i);
			return true;
		}
		return false;
	}
}
