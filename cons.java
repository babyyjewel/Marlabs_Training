class Abc{
      int x;
      int y;    
      String name;
      Abc( int x , int y){
           this.x=x;
           this.y=y;
           System.out.println("Parameterized constructor");
       }

 	public void display(){
        		 System.out.println("X : " +x+" Y :" +y);
       }
}



class Def{
            Def(){
                      System.out.println("Default constructor");
			}
                    

}
 class cons{
       public static void main(String args[]){
        Abc a1 = new Abc(20,50);
         a1.display();
         System.out.println(a1.name);
          Def a2 = new Def();


       }
} 