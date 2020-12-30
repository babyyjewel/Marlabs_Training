package comm;

class Task1 extends Thread{
	public void run() {
	display();
	}

	public void display() {
		for(int j=0;j<10;j++) {
			System.out.println("New "+j);
		}
		
	}
}






public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<10;i++) {
			System.out.println("Welcome "+i);
		}
		Task1 t = new Task1();
		//t.display();
		t.start();
		
		
		
	}

}
