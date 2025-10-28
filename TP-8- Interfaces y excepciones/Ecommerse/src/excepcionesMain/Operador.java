package excepcionesMain;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import excepcionesMain.EdadInvalidaExcepcion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Operador {
    private static Scanner scan;
    
    public Operador() {
        this.scan = new Scanner(System.in);
    }
    
    public int pedirDosNumeros(){
        int result = 0;
        
        try {
           System.out.println("Ingresa un numero: ");
           int num1 = scan.nextInt();
           System.out.println("Ingresa otro numero: ");
           int num2 = scan.nextInt();
           scan.nextLine();
           result = num1 / num2;
            System.out.println("Resultado : " + result);
        } catch (Exception e) {
            System.out.println("No se puede dividir por 0.");
        }
        return result;
    }
    
    public void cadenaANumero() {
        System.out.println("Ingresa un numero: ");
        String numeroTexto = scan.nextLine();
        try {
           int numero = Integer.parseInt(numeroTexto); 
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir texto a int");
        }
    }
    
    public void leerArchivo(){
        String ruta = "archivo.txt";
        
        try {
            File archivo = new File(ruta);
            Scanner lector = new Scanner(archivo);
            
            
            System.out.println("Contenido del archivo:");
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }
            lector.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + ruta + "' no existe o no se pudo abrir.");
        }
    }
    
    public void validadorEdad() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresá tu edad: ");
            int edad = sc.nextInt();
            
            if (edad < 0) {
            throw new EdadInvalidaExcepcion("La edad no puede ser negativa.");
            } else if (edad > 120) {
            throw new EdadInvalidaExcepcion("La edad no puede ser mayor a 120 años.");
            }
            
            System.out.println("Edad registrada: " + edad);
        } catch (EdadInvalidaExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
    
    
    public void leerArchivoConBufferedReader() {
        String ruta = "src/excepcionesMain/archivo.txt"; 

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            System.out.println("Contenido del archivo con BufferedReader:");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println(" Error al leer el archivo: " + e.getMessage());
        }
    }
}
