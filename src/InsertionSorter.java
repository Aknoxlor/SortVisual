
public class InsertionSorter implements Sorter {
	
	int current;
	boolean complete = false;
	
	public void step(int[] array, int size) {
		if(current >= size) {
			complete = true;
			return;
		}
		int swap = array[current];
		int iii = current - 1;
		while(iii >= 0 && array[iii] > swap) {
			array[iii + 1] = array[iii];
			iii--;
		}
		array[iii + 1] = swap;
		current++;
	}
	
	public boolean isComplete() {
		return complete;
	}
}
