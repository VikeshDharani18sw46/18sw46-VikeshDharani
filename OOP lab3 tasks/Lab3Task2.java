import java.util.Scanner;
class Lab3Task2
{
 public static void main(String args[])
 {
  int un;
  long bill;
  Scanner ob=new Scanner(System.in);
  System.out.println("Enter number of units consumed :");
  un=ob.nextInt();
  if(un<=50)
   {
     bill=10*un;
     System.out.println("Your Bill is : "+bill); 
   }  
    else if(un>50&&un<=100){
	bill=(50*10)+(un-50)*15;
	System.out.println("Your Bill is : "+bill);
	}
	else if(un>101&&un<200){
	bill=(50*10)+(100-50)*15+(un-100)*20;
	System.out.println("Your Bill is : "+bill);
	}
	else if(un>201&&un<300){
	bill=(50*10)+(100-50)*15+(200-100)*20+(un-200)*25;
	System.out.println("Your Bill is : "+bill);	
	
	}
	else if(un>301){
	bill=(50*10)+(100-50)*15+(200-100)*20+(300-200)*25+(un-300)*30;
	System.out.println("Your Bill is : "+bill);
	}
  

 }
} 