package ListaQuickSort;

import ListaQuickController.ControllerQuick;

public class ex2 {

	public static void main(String[] args) {
		
		int vetor[] = {44, 43, 42, 41, 40, 39, 38};
		
		ControllerQuick sort = new ControllerQuick();
		
		sort.QuickSort(vetor);
		for(int i : vetor) {
			System.out.print(i + " ");
		}
	}
}
