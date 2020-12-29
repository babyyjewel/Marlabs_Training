class A{
      int a=50;
      void display()
      {
       int b=60;
        System.out.println(a);
         System.out.println(" b value is : " +b);
       }

}
class Second{
      int a=90;
 public static void main(String args[])
{
        System.out.println("demo");
         Second a2 = new Second();
         System.out.println(a2.a);
          A a1 = new A();
          a1.display();
}
}