import java.util.ArrayList;
import java.util.LinkedList;

public class Company
{
    private LinkedList products;
    private String name = "IBM";
    
    public Company()
    {
       products = new LinkedList<>();   
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
