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
     int[] sorted = new int[ last - first + 1];
      int nA = first; int nB = mid +1;
      for(int c = 0; c < sorted.length;c++)
      { 
        if(nA > mid)
          {sorted[c] = a[nB]; nB++;}
        else if(nB > last)
          {sorted[c] = a[nA]; nA++;}
        else if(a[nA] > a[nB])
          {sorted[c] = a[nB]; nB++;}
        else
          {sorted[c] = a[nA]; nA++;}
      }
      int control = 0;
      for(int n = first; n <= last; n++)
      {
        a[n] = sorted[control];
        control++;
      }

  }

  public void mergeSort(int[] a, int first, int last)
  {
     //declare and initialize
     int mid = (first + last)/2;
     if(first  < last) //more than one element
     {
        mergeSort(a, first, mid ); //first half
        mergeSort(a, mid +1 , last); //second half
     } 
     merge(a, first, mid , last);

  }
}

