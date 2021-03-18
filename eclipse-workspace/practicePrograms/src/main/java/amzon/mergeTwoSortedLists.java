//package amzon;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.TreeSet;
//
//import com.google.common.primitives.Ints;
//
//public class mergeTwoSortedLists {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int[] lst1 = {
//            1,
//            2,
//            4,
//            3,
//            6,
//            7,
//            8
//        };
//        int[] lst2 = {
//            9,
//            10,
//            12,
//            11,
//            13,
//            15,
//            14,
//            17,
//            16
//        };
//        Set < Integer > arr1 = new TreeSet(Ints.asList(lst1));
//        System.out.println(arr1);
//        Set < Integer > arr2 = new TreeSet(Ints.asList(lst2));
//        System.out.println(arr2);
//        if (arr1 == null) {
//            System.out.println("result: " + arr2);
//        }
//        if (arr2 == null) {
//            System.out.println("result: " + arr1);
//        } else {
//
//            //mergeSet(arr1,arr2);
//            System.out.println("result: " + mergeSet1(arr1, arr2));
//        }
//    }
//    public static < T > Set < T > mergeSet(Set < T > a, Set < T > b) {
//        return new TreeSet < T > () {
//            {
//                addAll(a);
//                addAll(b);
//            }
//        };
//    }
//    public static  <T> Set<T> mergeSet1(Set<T> a, Set<T> b) 
//    { 
//  
//        // Creating an empty set 
//        Set<T> mergedSet = new HashSet<T>(); 
//  
//        // add the two sets to be merged 
//        // into the new set 
//        mergedSet.addAll(a); 
//        mergedSet.addAll(b); 
//  
//        // returning the merged set 
//        return mergedSet; 
//    } 
//}