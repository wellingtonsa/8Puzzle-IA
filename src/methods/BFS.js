export default class BFS {
  constructor(initial, goals){
    this._initial = initial;
    this._goals = goals;
    this._path = [];
		this._visits = 0;
  }

	get visits() {
		return this._visits;
	}

	get path() {
		return this._path;
	}


  search(){
    let current = this._initial;
		let amount = [];
    while(current !== null && JSON.stringify(current.value) !== JSON.stringify(this._goals.value)){
      
      let promise = new Promise((resolve, reject) => {
        current.successors()
        .forEach(state => {
          amount.push(state);
        })

        current = amount.shift();

        resolve();
      })

      promise.then(res => this._visits++);
    }

		if(current !== null){
			this._path.push(current);

			while(current && current.parent !== null){
				current = current.parent;
				this._path.push(current);
			}
		}
    return current;
  }
}