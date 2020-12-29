package comm;
import java.io.Serializable;
import java.util.Iterator;

public class Student implements Serializable {
	int marks;
	String name;
	int mobileno;
	
	Student(int x, String y, int z){
		marks=x;
		name=y;
		mobileno=z;
		
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + ", mobileno=" + mobileno + "]";
	}

	

}
