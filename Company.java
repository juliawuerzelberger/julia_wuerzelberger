import java.util.ArrayList;

public class Company
{
    private ArrayList products;
    private String name = "IBM";
    
    public Company()
    {
       products = new ArrayList<>();   
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
