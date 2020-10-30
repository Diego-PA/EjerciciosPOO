public class PruebaCiclos {

	public static void main(String[] args) {
		
		int eValor = 10;
		String aNombres[] = {"Maria", "Juan", "Sandra"};

		while (eValor > 0) {

			System.out.println("eValor = " + eValor);

			if(eValor == 5) {

				System.out.println("Esta en la mitad");
				break;
			}

			eValor --;

		}

		do {

			System.out.println("\neValor = " + eValor);
			eValor ++;

		} while (eValor <= 10 );

		for (int i = 0; i <=20; i++) {

			System.out.println("i = " + i);
		}

		for(String sNombre: aNombres){

			System.out.println("Nombre: " + sNombre);

		}

		eValor = 0;

		Ciclo:do {

			System.out.println("\neValor = " + eValor);
			
			for (int i = 0; i <=20; i++) {

				System.out.println("i = " + i);

				if (i == 7){
					System.out.println("Rompo los ciclos");
					break Ciclo;

				}
			}
			
			eValor ++;


		} while (eValor <= 10 );

		System.out.println("Salí de los ciclos");

	}
}