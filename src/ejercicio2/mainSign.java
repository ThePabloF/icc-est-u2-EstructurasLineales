package ejercicio2;

public class mainSign {
    public static void main(String[] args) {
        SignValidator signValidator = new SignValidator();

        if (signValidator.validarSign("[{()}]")) {
            System.out.println("Correcto");
        }else{
        System.out.println("Incorrecto");
        }
        
        
    }
}
