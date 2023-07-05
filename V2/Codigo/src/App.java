import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws NumeroFueraDeRango {

        String dato = JOptionPane.showInputDialog(null, "Ingrese un número entre 1 - 9999 para traducirlo a Kichwa",
                "Traductor Kichwa", JOptionPane.INFORMATION_MESSAGE);
        int numero = Integer.parseInt(dato);
        JOptionPane.showMessageDialog(null,
                "El número " + numero + " traducido en Kichwa es:\n" + traducirNumero(numero), "Traductor Kichwa",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // Metodo para traducir el numero
    public static String traducirNumero(int numero) {

        String[] unidades = { "", "shuk", "ishkay", "kimsa", "chusku", "pichka", "sukta", "kanchis", "pusak", "iskun" };
        String[] decenas = { "", "chunka", "ishkay", "kimsa", "chusku", "pichka", "sukta", "kanchis", "pusak",
                "iskun" };
        // Variables para obtener los valores de cada numero
        int unidad = numero % 10;
        int decena = (numero / 10) % 10;
        int centena = (numero / 100) % 10;
        int mil = (numero / 1000) % 10;
        String resultado = "";
        // Agregando al resultado el numero traducido correspondiente a la cantidad de
        // miles
        if (mil > 0) {
            if (numero == 1000) {
                resultado = "waranka";
            } else {
                resultado += decenas[mil] + " waranka ";

            }
        }
        // Agregando al resultado el numero traducido correspondiente a la cantidad de
        // centenas
        if (centena > 0) {
            if (numero == 100) {
                resultado = "patsak";
            } else {
                resultado += decenas[centena] + " patsak ";
            }
        }
        // Agregando al resultado el numero traducido correspondiente a la cantidad de
        // decenas
        if (decena > 0) {
            if (numero == 10) {
                resultado += decenas[decena];
            } else {
                resultado += decenas[decena] + " " + "chunka ";
            }
        }
        // Agregando al resultado el numero traducido correspondiente a la cantidad de
        // unidades
        if (unidad > 0) {
            resultado += unidades[unidad];
        }
        // Concatenando el resultado
        return resultado.trim();
    }
}
