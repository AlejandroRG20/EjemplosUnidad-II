package unidadiiVariableestado;

public class ambitoDeVariables {

		
		private static int y = 99;
		public static void main (String[]args) {
		  int x = y;
		  {
			int j = 100;
			System.out.println("El valor de j = " + j + "y de x = " + x);
			int d = 100;
			
		  }
			  
			  
			  
			System.out.println("El valor de x = " + x);  

	}
}
