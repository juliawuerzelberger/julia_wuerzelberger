
public class Product
{
	private String name = "Coca Cola";
	private float price = 10;
	private int id;
	
	// --------------Konstruktor----------------------
	

	public Product(String name, float price)
	{
		setName(name);
		setPrice(price);
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
	
	public float getPrice()
	{
		return price;
	}

	public void setPrice(float price)
	{
		this.price = price;
}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
}
