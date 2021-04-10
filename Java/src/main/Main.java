package main;

import constants.Table;
import methods.AStar;
import methods.BFS;
import models.State;

public class Main {

	public static void main(String[] args) {
		State initial = new State(0, Table.INITIAL_STATE(), null, State.heuristic(Table.INITIAL_STATE(), Table.GOAL_STATE()));
		State goal = new State(0, Table.GOAL_STATE(), null, 0);
		
		//BFS BreadthFirstSearch = new BFS(initial, goal);
		AStar AS = new AStar(initial, goal);
		
		//BreadthFirstSearch.search();
		AS.search();
		

	}

}
