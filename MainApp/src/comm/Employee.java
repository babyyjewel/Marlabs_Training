package comm;

public class Employee {
	public static void main(String args[]) {
	
	
	int b[]= new int[6];
	b[0]=60;
	b[1]=70;
	b[2]=10;
	b[3]=20;
	b[4]=30;
	b[5]=40;
	int c[]= {10,20,30,40,50,60};
	for (int i=0;i<b.length;i++) {
	    System.out.print(b[i]+" ");	
	}
	
	for(int j:c) {   System.out.println("\n"+j); }
	
	
	}
}
