package methods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import models.State;

public class BFS {
	private static State initial;
	private static State goals;
	private static ArrayList<ArrayList<Integer>> path;
	private int visits;
	
	public BFS(State initial, State goals) {
		super();
		BFS.initial = initial;
		BFS.goals = goals;
		BFS.path = new ArrayList<ArrayList<Integer>>();
		this.visits = 0;
	}


	public State getInitial() {
		return initial;
	}


	public void setInitial(State initial) {
		BFS.initial = initial;
	}


	public State getGoals() {
		return goals;
	}


	public void setGoals(State goals) {
		BFS.goals = goals;
	}


	public ArrayList<ArrayList<Integer>> getPath() {
		return path;
	}


	public int getVisits() {
		return visits;
	}

	
	public ArrayList<ArrayList<Integer>> search(){
		State current = new State(initial.getLevel(), initial.getValue(), initial.getParent(), initial.getCost());
		
		Queue<State> amount = new LinkedList<State>();
		
		 while(current != null && !current.equals(goals)){
			 ArrayList<State> successors =  current.successors();
			 
			 for(State successor : successors) {
				 amount.add(successor);
			 }
			 
			 current = amount.poll();
			 System.out.println(this.visits);
			 this.visits++;
		 }
		
		 
		 while(current != null) {
			 
			 BFS.path.add(current.getValue());
			 System.out.println(current.toString());
			 current = current.getParent();
		 }
		 
		return path;
		
	}	
	
}
