
public class BubbleSorter implements Sorter{
	
	boolean complete = false;
	
	public void step(int[] array, int size) {
		complete = true;
		for(int iii = 1; iii < size; iii++) {
			if(array[iii - 1] > array[iii])
			{
				complete = false;
				int swap = array[iii - 1];
				array[iii - 1] = array[iii];
				array[iii] = swap;
			}
		}
	}
	
	public boolean isComplete() {
		return complete;
	}
	
}
