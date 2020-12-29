class A{


      final int a =10;
		public final void display(){
                    System.out.println("Value : " +a);
             }          




}
 class overr{


      public static void main(String args[]){

              A a1 =  new A();
              System.out.println(a1.a);
              a1.display();
}
}