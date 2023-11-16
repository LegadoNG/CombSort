Este programa solicitará al usuario que ingrese el tamaño del arreglo y luego los elementos del arreglo. Después de recibir la entrada, aplicará el algoritmo de Comb Sort y mostrará el arreglo original y el arreglo ordenado. 
Importaciones:// java.util.Scanner;
 	
Este método es el punto de entrada del programa.
	Objeto Scanner y Tamaño del Arreglo:
    scanner = new Scanner(System.in); System.out.print("Ingrese el tamaño del arreglo: "); int size = scanner.nextInt();

    Se crea un objeto Scanner para leer la entrada del usuario. Luego, se solicita al usuario que ingrese el tamaño del arreglo.
	Arreglo y Entrada de Datos:
    
    int arr[] = new int[size]; System.out.println("Ingrese los elementos del arreglo:"); for (int i = 0; i < size; i++)  arr[i] = scanner.nextInt(); 
    
    Se crea un arreglo de enteros con el tamaño ingresado y se llena con los elementos proporcionados por el usuario.Instancia de CombSort -> CombSort combSort = new CombSort();
    
     ///Se crea una instancia de la clase CombSort para poder utilizar sus métodos.
	Impresión del Arreglo Original: System.out.println("Arreglo original:"); combSort.printArray(arr); //Se imprime el arreglo original antes de ser ordenado.

	Aplicación del Comb Sort y Resultado Final://combSort.combSort(arr); System.out.println("Arreglo ordenado:"); combSort.printArray(arr);
    Se aplica el algoritmo de Comb Sort al arreglo y se imprime el arreglo resultante después de la ordenación.

	Cierre del Scanner y fin del codigo.