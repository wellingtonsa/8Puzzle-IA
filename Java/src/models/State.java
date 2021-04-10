package models;

import java.util.ArrayList;

import constants.Table;
import utils.Utils;

public class State {
	private int level;
	private ArrayList<Integer> value;
	private int cost;
	private State parent;
	
	
	public State(int level, ArrayList<Integer> value, State parent, int cost) {
		super();
		this.level = level;
		this.value = value;
		this.cost = cost;
		this.parent = parent;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public ArrayList<Integer> getValue() {
		return value;
	}


	public void setValue(ArrayList<Integer> value) {
		this.value = value;
	}


	public State getParent() {
		return parent;
	}


	public void setParent(State parent) {
		this.parent = parent;
	}
	
	
	
	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public ArrayList<State> successors(){
		ArrayList<ArrayList<Integer>> values = Utils.getSuccessorsValue(this.value);
		ArrayList<State> sucessors = new ArrayList<State>(4);
		
		for(ArrayList<Integer> value : values) {
			State state = new State( this.level + 1, value, this, State.heuristic(value, Table.GOAL_STATE()));
			sucessors.add(state);
		}

		return sucessors;
	}
	
	// Heuristic based on the distance between the expected positions
	public static int heuristic(ArrayList<Integer> currentState, ArrayList<Integer> goalState) {
		int heurist = 0;
		
		for(int i = 0; i < currentState.size(); i++) {
			int index = goalState.get(i);
			int currentLine = i / 3;
			int currentColumn = i % 3;
			int expectedLine = index / 3;
			int expectedColumn = index % 3;
			int dist = Math.abs(expectedLine - currentLine) + Math.abs(expectedColumn - currentColumn);
			heurist += dist;
		}
		
		return heurist;
	}
	
	//Heuristic based on the number of piece in a wrong position
	/*public static int heuristic(ArrayList<Integer> currentState, ArrayList<Integer> goalState) {
		int heurist = -1;
		
		for(int i = 0; i < currentState.size(); i++) {
			if(currentState.get(i) != goalState.get(i)) {
				heurist++;
			}
		}
		return heurist;
	}*/
	
	
	@Override
	public boolean equals(Object state) {
		if (this == state)
			return true;
		if (state == null)
			return false;
		if (getClass() != state.getClass())
			return false;
		if(value.equals(((State) state).getValue()))
		return true;
		
		return false;
	}
	
	@Override
	public String toString() {
		String msg = "";
		msg += "+---+---+---+";
		msg += "\n| " + value.get(0) + " | " + value.get(1) + " | " + value.get(2) + " | \n";
		msg += "+---+---+---+";
		msg += "\n| " + value.get(3) + " | " + value.get(4) + " | " + value.get(5) + " | \n";
		msg += "+---+---+---+";
		msg += "\n| " + value.get(6) + " | " + value.get(7) + " | " + value.get(8) + " |\n";
		msg += "+---+---+---+";
		return msg;
	}
	
	
}
