export function getSuccessorsValue(parentValue){
  let index = parentValue.indexOf('*');
  let successors = [];

  switch(index){
    case 0:
      swapAndSave(0, 1);
      swapAndSave(0, 3);
      break;
    case 1:
      swapAndSave(1, 0);
      swapAndSave(1, 2);
      swapAndSave(1, 4);
      break;
    case 2:
      swapAndSave(2, 1);
      swapAndSave(2, 5);
      break;
    case 3:
      swapAndSave(3, 0);
      swapAndSave(3, 4);
      swapAndSave(3, 6);
      break;
    case 4:
      swapAndSave(4, 1);
      swapAndSave(4, 5);
      swapAndSave(4, 7);
      break;
    case 5:
      swapAndSave(5, 2);
      swapAndSave(5, 8);
      swapAndSave(5, 4);
      break;
    case 6:
      swapAndSave(6, 3);
      swapAndSave(6, 7);
      break;
    case 7:
      swapAndSave(7, 4);
      swapAndSave(7, 8);
      swapAndSave(1, 4);
      break;
    case 8:
      swapAndSave(8, 5);
      swapAndSave(8, 7);
      break;
      default:
        break;
  }

  function swapAndSave(a, b){
    let array = parentValue.slice(0);
    array[a] = array[b];
    array[b] = '*';

    successors.push(array);
  }

  return successors;
}