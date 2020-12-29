class Abc{
       int x;
       int y;

    Abc(){
              
           this(30,40);
            System.out.println(" Default Constuctor");
          }

      Abc( int x, int y){
                this.x=x;
                this.y=y;
    		System.out.println(" Parameterised Constuctor");
          }
 	
	public void display(){
                this.display2();
      	System.out.println(" disp method");
    }
          
      public void display2(){
         
		System.out.println(" disp2 method");}
}








class conss{
    public static void main(String args[]){
        Abc a1 = new Abc();
         a1.display();      

}
}
