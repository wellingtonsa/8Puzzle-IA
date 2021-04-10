package methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import models.State;
import utils.StateComparator;

public class AStar {
	private static State initial;
	private static State goals;
	private static ArrayList<ArrayList<Integer>> path;
	private int visits;
	
	public AStar(State initial, State goals) {
		super();
		AStar.initial = initial;
		AStar.goals = goals;
		AStar.path = new ArrayList<ArrayList<Integer>>();
		this.visits = 0;
	}


	public State getInitial() {
		return initial;
	}


	public void setInitial(State initial) {
		AStar.initial = initial;
	}


	public State getGoals() {
		return goals;
	}


	public void setGoals(State goals) {
		AStar.goals = goals;
	}


	public ArrayList<ArrayList<Integer>> getPath() {
		return path;
	}


	public int getVisits() {
		return visits;
	}
	
	public ArrayList<ArrayList<Integer>> search(){
		State current = new State(initial.getLevel(), initial.getValue(), initial.getParent(), initial.getCost());
		
		LinkedList<State> amount = new LinkedList<State>();
		
		 while(current != null && !current.equals(goals)){
			 ArrayList<State> successors =  current.successors();
			 
			 Collections.sort(successors, new StateComparator());
			 Collections.reverse(successors);
			 
			 for(State successor : successors) {
				 amount.add(successor);
			 }
			 
			 current =  amount.pop();
			 System.out.println(this.visits);
			 this.visits++;
		 }
		 
		 
		 while(current != null) {
			 
			 AStar.path.add(current.getValue());
			 System.out.println(current.toString());
			 current = current.getParent();
		 }
		 
		return path;
		
	}
	
}
