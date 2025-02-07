
import java.util.Scanner;
public class Addoddeven{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  File file = new File("input1.txt");
int size = sc.nextInt();
int arr[] = new int[size];
for(int i=0;i<size;i++){
arr[i] = sc.nextInt();
}
int odd = 0;
int even =0;
for(int i=0;i<size;i++){
if(arr[i] % 2 == 0){
even++;
}
else{
odd++;
}
  Systom.out.println("EVEN NUMBER:"+even);
  System.out.println("ODD NUMBER: "+odd);
}
}
}
