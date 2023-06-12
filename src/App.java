import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero entre 0 - 9999:  ");
        int numero = input.nextInt();
        if (numero >= 0 && numero <= 9999) {
            System.out.println(traducirNumero(numero));
        } else {
            System.out.println("El numero ingresado esta fuera de rango.");
        }
    }

    public static String traducirNumero(int numero) {

        String[] unidades = { "", "shuk", "ishkay", "kimsa", "chusku", "pichka", "sukta", "kanchis", "pusak", "iskun" };
        String[] decenas = { "", "chunka", "ishkay", "kimsa", "chusku", "pichka", "sukta", "kanchis", "pusak",
                "iskun" };

        int unidad = numero % 10;
        int decena = (numero / 10) % 10;
        int centena = (numero / 100) % 10;
        int mil = (numero / 1000) % 10;
        String resultado = "";
        if (mil > 0) {
            resultado += decenas[mil] + " waranka ";
        }
        if (centena > 0) {
            resultado += decenas[centena] + " patsak ";
        }
        if (decena > 0) {
            resultado += decenas[decena] + " " + "chunka ";
        }
        if (unidad > 0) {
            resultado += unidades[unidad];
        }
        return resultado.trim();
    }
}
