public class Condicionales{

		public static int Condicion = 4;
		public static char Condicionales = 'A';
		public static String Texto = "Hola";


		public static void main(String[] args) {
			
			switch(Texto){

				case "A": System.out.println("La variable condicion almaceno la letra A");
				break;

				case "Hola": System.out.println("La variable condicion almaceno el numero Hola");
				break;

				case "no": System.out.println("La variable condicion almaceno el numero 3");
				break;

				default : System.out.println("no se cumple la condicion");
			}

		}








}