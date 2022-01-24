
package BehavioralDP;

import java.util.Arrays;

interface Sort
{
    public int[] Sortable(int []arr);
}

class ArraysSort implements Sort
{

    @Override
    public int[] Sortable(int[] arr) {
         Arrays.sort(arr);;
        return arr;
     }
    
}
class MergeSort implements Sort
{

    @Override
    public int[] Sortable(int[] arr) {
        
        return arr;
    }
    
}
class Complex
{
    Sort sort;
    public Complex(Sort sort)
    {
        this.sort=sort;
    }
    public int[] SortTheNumber(int arr[])
    {
      return  sort.Sortable(arr);
    }
}

public class StrategyPattern{

    public static void main(String[] args) {
        Complex complex=new Complex(new ArraysSort());
       int res[]=complex.SortTheNumber(new int[]{5,4,3,2,1});
        for(int temp:res)
        {
            System.out.println(temp);
        }
    }
}
