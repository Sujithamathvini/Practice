import java.util.*;
public class prime{
public static boolean prime(int n){
if(n==0 || n==1)
return true;
else{
for(int i=2;i<n/2;i++){
if(n%i==0)
return false;
}
}
return true;
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=0;
for(int i=1;i<=n;i++){
if(n%i==0){
if(prime(i)==true&&i>m){
m=i;
}
}
}
System.out.println(m);
}
}
