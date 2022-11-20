import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
public class Principal{
	public static void main(String args []){
		String[] texto = {"Esto es una prueba"};
		
		FileWriter fichero = null;
		try{
			fichero = new FileWriter("fichero.txt");
			for(String txt : texto){
				fichero.write(txt);
			}

			fichero.close();
		} catch (Exception ex){
			System.out.println("no funciona =(");
		}

		
		leerPeticion();
	}
	 	public static void leerPeticion(){
                        File fichero = new File("fichero.txt");	
			Scanner sc = null;
			try{

				sc = new Scanner(fichero);
                                String cadena = sc.nextLine();
				System.out.print(cadena);
                		
               				
		}catch (Exception ex1){
			System.out.println(" ;( " + ex1.getMessage());
		
	        }
		}
	}


