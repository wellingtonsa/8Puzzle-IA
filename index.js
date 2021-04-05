import State from './src/models/state.js';
import * as constants from './src/constants/index.js';
import BFS from './src/methods/BFS';

function main(){
  let initial = new State(constants.INITIAL_STATE, null, 0);
  let goal = new State(constants.GOAL_STATE, null, 0);

  const BFS = new BFS(initial, goal);

  BSF.search();
}

main();