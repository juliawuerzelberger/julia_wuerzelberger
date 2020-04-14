
public class Product
{
	private String name = "Coca Cola";
	
	// --------------Konstruktor----------------------
	
	public Product(String name)
	{
		setName(name);
	}

	// ----------------getter & setter------------------
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}

