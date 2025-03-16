package ListaQuickSort;

import ListaQuickController.ControllerQuick;

public class ex3 {

	public static void main(String[] args) {
		
		int vetor[] = {31, 32, 33, 34, 99, 98, 97, 96};
		
		ControllerQuick sort = new ControllerQuick();
	
		sort.QuickSort(vetor);
		for(int i : vetor) {
			System.out.print(i + " ");
		}
	}
}
