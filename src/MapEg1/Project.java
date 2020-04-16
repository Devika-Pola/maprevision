package MapEg1;

import java.io.Serializable;

import java.util.Date;

public class Project implements Comparable<Project>, Serializable,Cloneable
{
 @Override
	public String toString() {
		return "Project [id2=" + id2 + ", domain2=" + domain2 + ", startdate2=" + startdate2 + ", enddate2=" + enddate2
				+ "]";
	}
int id2;
 
public Project(int id2, String domain2, Date startdate2, Date enddate2) {
	super();
	this.domain2=domain2;
	this.enddate2=enddate2;
	this.id2=id2;
	this.startdate2=startdate2;
}
public int getId2() {
	return id2;
}
public void setId2(int id2) {
	this.id2 = id2;
}

public void setDomain2(String domain2) {
	this.domain2 = domain2;
}
public Date getStartdate2() {
	return startdate2;
}
public void setStartdate2(Date startdate2) {
	this.startdate2 = startdate2;
}
public Date getEnddate2() {
	return enddate2;
}
public void setEnddate2(Date enddate2) {
	this.enddate2 = enddate2;
}
String domain2;
 Date startdate2;
 Date enddate2;

public String getDomain2() {
	
	return domain2;
}

@Override
public int compareTo(Project o) {
	 if(this.id2>o.id2)
	    {
	    	return 1;
	    }
	 else if(this.id2<o.id2) {
		 return -1;
	 }
	 return 0;
	 
}
 
}
