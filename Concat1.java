import java.util.Arrays;
class Concat1{
	public static void main(String args[]){
 int arr1[]={1,2,3};
 int arr2[]={4,5,6};
 int len=arr1.length+arr2.length;
 int result[]=new int[len];
int pos=0;
 for(int n1:arr1){
   result[pos]=n1;
   pos++;
 }		
 for(int n2:arr2){
 	result[pos]=n2;
 	pos++;
 }
 System.out.println(Arrays.toString(result));
	}
}