import java.util.*;
class marks{
  public static void main(String args[]){
     
    System.out.println("Enter your mark : ");
     Scanner sc= new Scanner(System.in);
     int mark = sc.nextInt(); 
     if (mark<45)
     { System.out.println(" Failed ");
      }
     if( mark>=45 && mark<=50)
    {    System.out.println("Grade is  C");
    }

       if( mark>50 && mark<=60)
    {    System.out.println("Grade is  B");
    }

 if( mark>60 && mark<=70)
    {    System.out.println("Grade is  A");
    }

if( mark>70 && mark<=80)
    {    System.out.println("Grade is  A+");
    }

else if ( mark>80)
  { System.out.println("Grade is  Outstanding ");
    }


    }
}