package utils;

import java.util.ArrayList;

public class Utils {
	
	public static ArrayList<ArrayList<Integer>> getSuccessorsValue(ArrayList<Integer> parentValue){
			
		int index = parentValue.indexOf(0);
		ArrayList<ArrayList<Integer>> successors = new ArrayList<ArrayList<Integer>>(4);
		
		 switch(index){
		    case 0:
		      swapAndSave(parentValue, successors, 0, 1);
		      swapAndSave(parentValue, successors, 0, 3);
		      break;
		    case 1:
		      swapAndSave(parentValue, successors, 1, 0);
		      swapAndSave(parentValue, successors, 1, 2);
		      swapAndSave(parentValue, successors, 1, 4);
		      break;
		    case 2:
		      swapAndSave(parentValue, successors, 2, 1);
		      swapAndSave(parentValue, successors, 2, 5);
		      break;
		    case 3:
		      swapAndSave(parentValue, successors, 3, 0);
		      swapAndSave(parentValue, successors, 3, 4);
		      swapAndSave(parentValue, successors, 3, 6);
		      break;
		    case 4:
		      swapAndSave(parentValue, successors, 4, 1);
		      swapAndSave(parentValue, successors, 4, 5);
		      swapAndSave(parentValue, successors, 4, 7);
		      swapAndSave(parentValue, successors, 4, 3);
		      break;
		    case 5:
		      swapAndSave(parentValue, successors, 5, 2);
		      swapAndSave(parentValue, successors, 5, 8);
		      swapAndSave(parentValue, successors, 5, 4);
		      break;
		    case 6:
		      swapAndSave(parentValue, successors, 6, 3);
		      swapAndSave(parentValue, successors, 6, 7);
		      break;
		    case 7:
		      swapAndSave(parentValue, successors, 7, 4);
		      swapAndSave(parentValue, successors, 7, 8);
		      swapAndSave(parentValue, successors, 7, 6);
		      break;
		    case 8:
		      swapAndSave(parentValue, successors, 8, 5);
		      swapAndSave(parentValue, successors, 8, 7);
		      break;
		  };
		
		
		return successors;
	}
	
	private static void swapAndSave(ArrayList<Integer> parentValue, ArrayList<ArrayList<Integer>> successors, int a, int b){
		ArrayList<Integer> array = cloneList(parentValue);
		array.set(a, array.get(b));
		array.set(b, 0);
		
		successors.add(array);
	 }
	
	private static ArrayList<Integer> cloneList(ArrayList<Integer> list) {
		ArrayList<Integer> clone = new ArrayList<Integer>(list.size());
	    for (Integer item : list) {
	    	clone.add(item);
	    }
	    return clone;
	}
}
