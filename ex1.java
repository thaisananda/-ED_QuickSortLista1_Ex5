package ListaQuickSort;

import ListaQuickController.ControllerQuick;

public class ex1 {

	public static void main(String[] args) {
		
		int vetor[] = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		ControllerQuick sort = new ControllerQuick();
		
		sort.QuickSort(vetor);
		for(int i : vetor) {
			System.out.print(i + " ");
		}
	}
}
