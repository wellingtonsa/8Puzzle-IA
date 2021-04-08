import State from './src/models/state.js';
import * as constants from './src/constants/index.js';
import BFS from './src/methods/BFS.js';

function main(){
  let initial = new State(constants.INITIAL_STATE, null, 0);
  let goal = new State(constants.GOAL_STATE, null, 0);

  let BreadthFirstSearch = new BFS(initial, goal);

  BreadthFirstSearch.search();
  console.log(BreadthFirstSearch.visits);
  console.log(BreadthFirstSearch.path);
}

main();