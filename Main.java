package listSetMapLegacy;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		Animals object=new Animals("cat","Animal");
		Animals object1=new Animals("tiger","Animal");
		Animals object2=new Animals("dog","animal");
		Animals object3=new Animals("bird","animal");
		Animals object4=new Animals("elephant","animal");
		
		
		Set<Animals> varset=new TreeSet<Animals>();
		
		varset.add(object);
		varset.add(object1);
		varset.add(object2); 
		varset.add(object3);
		varset.add(object4);
		
//		Collections.sort(varset);
		 
	   for(Animals a:varset)
	   {
		   System.out.println(a.getName()+" "+a.getCategory());
	   }
	}

}



















