import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortVisual {
	
	int[] list;
	int size;
	Random randomizer;
	Sorter sorter;
	
	SortVisual(int size) {
		randomizer = new Random();
		sorter = new BubbleSorter();
		
		list = new int[size];
		for(int iii = 0; iii < size; iii++) {
			list[iii] = iii;
		}
		this.size = size;
		shuffle();

	}
	
	public void shuffle() {
		for(int iii = 0; iii < size; iii++) {
			int random = randomizer.nextInt(size);
			int swap = list[random];
			list[random] = list[iii];
			list[iii] = swap;
		}
	}
	
	public void process() {
		if(sorter.isComplete()) {
			shuffle();
			sorter = new SelectionSorter();
			//sorter = getNewSorter(sorter);
		} else {
			sorter.step(list, size);
		}
	}

	public void paint(Graphics g) {
		for(int iii = 0; iii < size; iii++) {
			g.drawLine(iii, 10, iii, list[iii] + 10);
		}
	}
}
