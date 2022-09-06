package listSetMapLegacy;

import java.util.Set;
import java.util.TreeSet;

public class Animals implements Comparable<Animals> {
	
	private String name;
	private String Category;
	
	public Animals(String name ,String category) {
		this.name=name;
		this.Category=category;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	
	public int compareTo(Animals o) {
		
		return name.length()>o.name.length()?1:-1 ;
		}

  

}
//this.name.length()-(((Animals)o).getName()).length()