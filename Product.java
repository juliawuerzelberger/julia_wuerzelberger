
public class Product
{
	private String name = "Coca Cola";
	private boolean onStock;
	
	// --------------Konstruktor----------------------
	
	public Product(String name)
	{
		setName(name);
		isOnStock(true);
	}

	// ----------------getter & setter------------------
	
	public String getName()
	{
		return name;
	}

	public boolean getOnStock()
	{
		return onStock
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void isOnStock(boolean onStock)
	{
		this.onStock = onStock;
	}
}

