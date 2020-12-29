interface RBI{
        
    void loan();
     static void disp()
{ System.out.println(" Display");
}


}

interface RBI2{
        
    void loanrec();



}



class SBI implements RBI,RBI2{

    public void loan(){   System.out.println(" SBI loan");}
    public void loanrec(){ System.out.println(" Loan recover");}


}





class inter{


public static void main(String args[]){
   
           
         SBI r = new SBI();
         r.loan();
         r.loanrec();
         RBI.disp();

}



}