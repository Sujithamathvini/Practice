import java.util.*;
public class placement{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=n-1;i>=0;i--){
int c=0;
for(int j=i-1;j>=0;j--){
if(a[j]>a[i]){
c++;
}
}
a[i]=c;
}
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
}
