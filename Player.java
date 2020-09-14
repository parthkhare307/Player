import java.util.*;
class Player
{
public static void main(String args[])
{
int n,x,m=0,Total=0;
String name,n1="";
Scanner sc=new Scanner(System.in);

for(int i=1;i<=10;i++)
{
Total=0;
System.out.println("Enter the Player Name");
name=sc.next();
System.out.println("Enter a value");
x=sc.nextInt();

  for(int j=1;j<=6;j++)
  {
     System.out.println("Score:");
     n=sc.nextInt();
      if(n>=1 && n<=6)
       {
         Total=Total+n;
       }
   }
 if(Total>m)
  {
    m=Total;
    n1=name;
  }
name="";
}
System.out.println("Name of the Player"+n1);
System.out.println("Winner"+m);
}	
}