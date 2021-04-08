import * as find from '../utils/find.js';

export default class State {
  constructor(value, parent, level) {
    this._level = level;
    this._value = value;
    this._parent = parent;
  }

  set parent(parent){
    this._parent = parent;
  }

  get parent(){
    return this._parent;
  }

  set value(value){
    this._value = value;
  }

  get value(){
    return this._value;
  }

  set level(level){
    this._level = level;
  }

  get level(){
    return this._level;
  }

  successors(){
    const values = find.getSuccessorsValue(this.value);
    return values.map(value => new State(value, this, this._level + 1));
  }

}