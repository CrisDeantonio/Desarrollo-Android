public class Test1 {

	public static String TextoDivision = "Resultado de la division";
	public static String TextoSuma = "Resultado de la suma";
	public static float operandoUno = 12;
	public static float operandoDos = 4;
	public static float resultadoDivision;
	public static boolean EsNoche = true;

	public static int numeroUno = 4;
	public static int numeroDos = 4;
	public static int Resultadosuma;

	public static void main(String[] args) {
			
				resultadoDivision = (operandoUno/operandoDos);
				Resultadosuma = numeroUno+numeroDos;
				System.out.println(TextoSuma);
				System.out.println(Resultadosuma);
				System.out.println(TextoDivision);
				System.out.println(resultadoDivision);

					if (EsNoche==false){
						System.out.println("Es de dia");
					}

					else{
						System.out.println("Es de noche");

					}

						

		
	}

}