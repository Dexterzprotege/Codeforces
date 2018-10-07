import java.io.*; 
import java.util.*; 
public class Watermelon{
 public static void main(String args[]){
 Scanner in = new Scanner(System.in);
 long m = in.nextLong();
 long n = in.nextLong();
 long a = in.nextLong();
 long x = m;
 long y = n;
 if(m%a!=0 && a!=1)
  x=a*((m/a)+1);
 if(n%a!=0 && a!=1)
  y=a*((n/a)+1);
 System.out.println((x*y)/(a*a));
}
}
