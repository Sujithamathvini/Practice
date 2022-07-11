import java.util.*;
public class zombie{
public static boolean magical(int a, int b){
if(a>b)
return true;
return false;
}

public static int perfect(int a,int b){
if(b==0)
return a;
return perfect(b,a%b);
}


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c[]=new int[n];
for(int i=0;i<n;i++){
c[i]=sc.nextInt();
}
for(int i=0;i<n-1;i++){
if(magical(c[i],c[i+1])==true){
if(perfect(c[i],c[i+1])==1){
System.out.println("Ans:"+i);
break;
}
}
}
}
}
