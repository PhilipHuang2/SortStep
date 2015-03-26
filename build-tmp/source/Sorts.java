import java.util.*;

public class Sorts
{
  public void bubbleSort(int[] list)
  {
    for(int outer = 0; outer < list.length - 1;  outer++)
    {
      for(int inner = 0; inner < list.length-outer -1; inner++)
      {
        if(list[inner] > list[inner +1] )
        {
          int temp = list[inner];
          list[inner] = list[inner + 1];
          list[inner + 1] = temp; 
        }
      }  
    }
  }
  public void selectionSort(int[] list)
  {
    int flag, nTemp;
    for(int outer = 0; outer < list.length-1; outer++)
    {
      flag = outer;
      for(int inner = outer+ 1; inner < list.length; inner++)
      {
        if(list[inner] < list[flag])
          flag = inner;
      }
      nTemp = list[outer];
      list[outer] = list[flag];
      list[flag] = nTemp;
    }
  }

  public void insertionSort(int[] list)
  {
    for (int outer = 1; outer < list.length; outer++) {
      int position = outer;
      int key  = list[position];
      while(position > 0 && list[position -1] > key)
      {
        list[position] = list[position-1];
        position--;
      }
      list[position] = key;
    }
  }

  private void merge(int[] a, int first, int mid, int last)
  {
   int[] half = new int[mid - first];
   int[] half2 = new int[last - mid+1];
   for(int c = 0; c < half.length; c++)
   { half[c] = a[first + c]; }
   for (int c = 0; c < half2.length; c++ ) 
   {half2[c] = a[mid+1+c]; }
   int nA= 0; int nB = 0;
   for(int c = 0; c < a.length; c++)
   {
     if(nA > half.length) {a[c] = half2[nB]; nB++;}
     else if(nB > half2.length) {a[c] = half[nA]; nA++;}
     else if(half[nA] > half2[nB]) {a[c] = half2[nB]; nB++;}
     else {a[c] = half[nA]; nA++;}
   }   
  }

  public void mergeSort(int[] a, int first, int last)
  {
    /*int start = 0;
    int end = list.length-1;
    int middle = (start + end)/2;
    int[] firstHalf = a[];
    */
  }
}

