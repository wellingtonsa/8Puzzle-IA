package utils;

import java.util.Comparator;

import models.State;

public class StateComparator implements Comparator<State> {

	@Override
	public int compare(State firstState, State secondState) {
		int sort = firstState.getCost() - secondState.getCost();
		return sort != 0 ? sort : secondState.getLevel() - firstState.getLevel();
	}

}
