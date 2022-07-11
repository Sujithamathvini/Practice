import java.util.*;
import java.util.Arrays;
public class anagram{
public static int anag(char ac[],char bc[]){

if(ac.length!=bc.length){
return 0;
}
else{
for(int i=0;i<ac.length;i++){
if(ac[i]!=bc[i]){
return 0;
}
}
}
return 1;
}


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b=sc.nextLine();
char ac[]=a.toCharArray();
char bc[]=b.toCharArray();
Arrays.sort(ac);
Arrays.sort(bc);
int i=anag(ac,bc);
System.out.println(i);
}
}
