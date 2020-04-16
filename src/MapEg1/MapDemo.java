package MapEg1;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	static Comparator<Project> pcComparator = new Comparator<Project>() 

	{
@Override
public int compare(Project p1,Project p2) {
String sd=p1.getDomain2();
String sd1=p2.getDomain2();
return sd.compareTo(sd1);
	}
	};

public static void main(String args[])
{
	
	Employee e1=new Employee(1,"harry",23000.00,"harry@gmail.com");
	Employee e2=new Employee(2,"ron",22000.00,"ron@gmail.com");
	
	SimpleDateFormat d=new SimpleDateFormat("dd/mm/yyyy");
	Date d1=new Date("20/12/2020");
	Date d2=new Date("20/04/2021");
	Project p1=new Project(101,"python",d1,d2);
	Project p2=new Project(102,"bigdata",d1,d2);
	
	TreeMap<Project,Employee> map=new TreeMap<Project,Employee>((pcComparator));
	map.put(p1,e1);
	map.put(p2,e2);
	displayByProjectID(map);
	displayByProjectDomain(map);

}
public static void displayByProjectID(Map<Project,Employee> empMap)
{
	TreeMap<Project,Employee > empMap1 = new TreeMap<Project, Employee>(empMap);
	
	 empMap1.entrySet().stream().forEach(t->System.out.println(t));
}
public static void displayByProjectDomain(Map<Project,Employee> empMap) 
{
  System.out.println("**********");	

 empMap.entrySet().stream().forEach(t->System.out.println(t));
}

}
