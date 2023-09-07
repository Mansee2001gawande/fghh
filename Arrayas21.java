//write a program for sorting an array
import java.util.Scanner;
public class Arrayas21 {
    public static void main(String[] args) {
            Scanner sc=new Scanner (System.in);
            int temp;
            
        System.out.print("enter array length");
        int length=sc.nextInt();

        int a[]=new int[length];
        System.out.println(" enter array elements "+length);
        for(int i=0;i<a.length;i++){
         a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)   {
        for(int j=i+1;j<a.length;j++) { 
        if(a[i]>a[j])      {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;

        }
    }
}
System.out.printf("sorted list of array = ");
for(int i=0;i<length;i++){
    System.out.print(a[i]);
}
}
}   
