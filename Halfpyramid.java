// Author : @theprasenjeet

import java.util.*;
class HalfPyramid {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter N : ");
int n=sc.nextInt(); 
System.out.print("Enter Symbol to print: ");
char c = sc.next().charAt(0);
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(c);
    }
    System.out.println();
    }
 }
}
