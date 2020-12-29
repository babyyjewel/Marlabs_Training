abstract class RBI{

     abstract void loan();


}

class SBI extends RBI{

            void loan(){   System.out.println(" SBI loan");}

}

class ICICI extends RBI{

            void loan(){   System.out.println(" ICICI loan");}

}

 class AXIS extends RBI{

            void loan(){   System.out.println(" AXIS loan");}

}


class abs{
   public static void main(String args[]){
   
         SBI r = new SBI();
         r.loan();
         ICICI i = new ICICI();
          i.loan();
          RBI s = new SBI();
          s.loan();
         AXIS a = new AXIS();
          a.loan();



}
}