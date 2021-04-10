package constants;

import java.util.ArrayList;

public class Table {
	
	public static ArrayList<Integer> INITIAL_STATE(){
		ArrayList<Integer> initial = new ArrayList<Integer>(9);
		
		/*initial.add(1);
		initial.add(2);
		initial.add(3);
		initial.add(4);
		initial.add(5);
		initial.add(6);
		initial.add(7);
		initial.add(0);
		initial.add(8);*/
		
		initial.add(7);
		initial.add(2);
		initial.add(4);
		initial.add(5);
		initial.add(0);
		initial.add(6);
		initial.add(8);
		initial.add(3);
		initial.add(1);
		

		return initial;
		
	};
	
	
	public static ArrayList<Integer> GOAL_STATE(){
		ArrayList<Integer> goal = new ArrayList<Integer>(9);
		
		/*goal.add(1);
		goal.add(2);
		goal.add(3);
		goal.add(4);
		goal.add(5);
		goal.add(6);
		goal.add(7);
		goal.add(8);
		goal.add(0);*/
		
		goal.add(0);
		goal.add(8);
		goal.add(7);
		goal.add(6);
		goal.add(5);
		goal.add(4);
		goal.add(3);
		goal.add(2);
		goal.add(1);

		return goal;
		
	};

}
