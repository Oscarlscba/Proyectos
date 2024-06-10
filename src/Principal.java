import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        ConvertidorDeMonedas convertidor = new ConvertidorDeMonedas();
        try {
            convertidor.convertir();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}


