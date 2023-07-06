import javax.swing.*;

public class App {

    public static void main(String[] args) throws NumeroFueraDeRango {
        UIManager.put("OptionPane.okButtonText", "Traducir");
        UIManager.put("OptionPane.cancelButtonText", "Salir");
        String dato = JOptionPane.showInputDialog(null, "Ingrese un número entre 1 - 9999 para traducirlo a Kichwa",
                "Traductor Kichwa", JOptionPane.INFORMATION_MESSAGE);
        if (!esValido(dato)) {
            UIManager.put("OptionPane.okButtonText", "ok");
            JOptionPane.showMessageDialog(null, "El dato ingresado no cumple con los requisitos:\n- Debe ser un número entero positivo\n- Debe ser menor a 9999\n- No puede incluir el cero", "Error", JOptionPane.ERROR_MESSAGE);
            int confirmResult = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?", "Salir",
                    JOptionPane.YES_NO_OPTION);

            if (confirmResult == JOptionPane.YES_OPTION) {
                System.exit(0);
            } else {
                main(args);
            }
        }

        try {
            int numero = Integer.parseInt(dato);
            JOptionPane.showMessageDialog(null,
                    "El número " + numero + " traducido en Kichwa es:\n" + traducirNumero(numero),
                    "Traductor Kichwa", JOptionPane.INFORMATION_MESSAGE);
            main(args);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No se ha ingresado un número válido", "Error",
                    JOptionPane.ERROR_MESSAGE);
            // Volver a mostrar el cuadro de diálogo de ingreso
            main(args);
        }
    }

    private static boolean esValido(String dato) throws NumeroFueraDeRango {
        return dato.matches("[1-9][0-9]{0,3}");
    }



    // Metodo para traducir el numero
    public static String traducirNumero(int numero) {

        String[] unidades = {"", "shuk", "ishkay", "kimsa", "chusku", "pichka", "sukta", "kanchis", "pusak", "iskun"};
        String[] decenas = {"", "chunka", "ishkay", "kimsa", "chusku", "pichka", "sukta", "kanchis", "pusak",
                "iskun"};
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
