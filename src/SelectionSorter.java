
public class SelectionSorter implements Sorter {

	boolean complete = false;
	int current = 0;
	
	public void step(int[] array, int size) {
		if(current >= size) {
			complete = true;
			return;
		}
		int smallest = array[current];
		int smallItr = current;
		for(int iii = current + 1; iii < size; iii++) {
			if(array[iii] < smallest) {
				smallest = array[iii];
				smallItr = iii;
			}
		}
		array[smallItr] = array[current];
		array[current] = smallest;
		current++;
	}
	
	public boolean isComplete() {
		return complete;
	}

}
