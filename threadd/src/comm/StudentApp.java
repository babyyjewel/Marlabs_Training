package comm;
class A extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
			
	}
}

public class StudentApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		A a1 = new A();
		System.out.println("Name :" +a1.getName());
		a1.start();
		try {
			a1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		A a2 = new A();
		System.out.println("Name :" +a2.getName());
		a2.start(); 
		a2.join();
		
		A a3 = new A();
		System.out.println("Name :" +a3.getName());
		a3.start();
		
		A a4 = new A();
		System.out.println("Name :" +a4.getName());
		a4.start();
		
		for(int j=1;j<5;j++) {
			System.out.println("we"+j);
		}

	}

}
