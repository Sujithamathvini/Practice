public class plant{
//public static func(int n, int g, int b){

public static void main(String[] args){
int n=10;
int g=3;
int b=3;
int p=0,d=0;
int r=n%g;
for(int i=1;p<=n;i++){
p=p+g;
if(p<n)
d+=g+b;
else
d+=r;
}
System.out.println(d);
}
}
