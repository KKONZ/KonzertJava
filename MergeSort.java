import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

// this example serves as an educational analysis of mergesort in java
public class MergeSort{
	public static int[] mergeSort(int [] myList){
		if(myList.length <= 1){
			return myList;
		}
		int[] myFirst = new int[myList.length / 2];
		int[] mySecond = new int[myList.length - myFirst.length];
		System.arraycopy(myList, 0, myFirst, 0, myFirst.length);
		System.arraycopy(myList, myFirst.length, mySecond, 0, mySecond.length);
		
		mergeSort(myFirst);
		mergeSort(mySecond);
		
		merge(myFirst, mySecond, myList);
		return myList;
	}
	
	private static void merge(int[] myFirst, int[] mySecond, int [] result){
		int imyFirst = 0;
		int imySecond = 0;
		
		int j = 0;
		while(imyFirst < myFirst.length && imySecond < mySecond.length){
			if(myFirst[imyFirst] < mySecond[imySecond]){
				result[j] = myFirst[imyFirst];
				imyFirst++;} 
				else{
					result[j] = mySecond[imySecond];
					imySecond++;
				}
				j++;
				
			}
			
			System.arraycopy(myFirst, imyFirst, result, j, myFirst.length - imyFirst);
			System.arraycopy(mySecond, imySecond, result, j, mySecond.length - imySecond);
		}
		
		public static void main(String[]args)throws Exception{
			String myList="";
			int i =0;
			int n=0;
			MergeSort x = new MergeSort();
			ArrayList<Integer> arrMyList= new ArrayList<Integer>();
			System.out.println(" ");
			System.out.println("Enter your list: ");
			System.out.println("c^s to exit");
			BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
			while(!(myList=bf.readLine()).equalsIgnoreCase("c^s")){
				int intElmt = Integer.parseInt(myList);
				arrMyList.add(intElmt);	
			}
			int elmtList[] = new int[arrMyList.size()];
			Iterator<Integer> itr = arrMyList.iterator();
			for(int j=0;itr.hasNext();j++){
				elmtList[j] = itr.next();
			}
			elmtList=mergeSort(elmtList);
			System.out.println(" ");
			System.out.println("Sorted using mergesort algorithm: ");
			for(int j=0; j<elmtList.length;j++){
				System.out.println(elmtList[j]+ " ");
			}
		}
}
