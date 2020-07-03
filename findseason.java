import java.io.*;

import java.util.Scanner;

class Season
{

    public static void main(String[] args)
{
        
Scanner sc=new Scanner(System.in);
        
int m=sc.nextInt();
        
System.out.println("Enter the month:");
        
if(m>12||m<1)
        
System.out.println("Invalid month");
        
else
{
            
if(m>=3&&m<=5)
            
{
            
System.out.println("Season:Spring");
            
}
            
else if(m>=6&&m<=8)
            
{
            
System.out.println("Season:Summer");
            
}
            
else if(m>=9&&m<=11)
            
{
            
System.out.println("Season:Autumn");
            
}
            
else
            
{
            
System.out.println("Season:Winter");
            
}
        
}
    
}

}