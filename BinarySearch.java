public class BinarySearch {
  /** Main method */
 
  /** Binary search to find the key in the list */
  public static int binarySearch(int[] myList, int key) {
    int low = 0;
    int high = myList.length - 1;

    while (high >= low) {
      int mid = (low + high) / 2;
      if (key < myList[mid])
        high = mid - 1;
      else if (key == myList[mid])
        return mid;
      else
        low = mid + 1;
    }

  return -low - 1;
  }  
}
