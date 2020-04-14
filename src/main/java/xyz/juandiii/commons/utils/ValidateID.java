package xyz.juandiii.commons.utils;

public class ValidateID {

    public static boolean validarCedula(String cedula) {
        cedula = cedula.trim();
        if (cedula.length() != 11) {
            return false;
        }

        if (!cedula.matches("\\d+")) {
            return false;
        }

        int SUMA = 0;
        int DIVISION = 0;
        int DIGITO = 0;

        int[] peso = new int[10];
        peso[0] = 1;
        peso[1] = 2;
        peso[2] = 1;
        peso[3] = 2;
        peso[4] = 1;
        peso[5] = 2;
        peso[6] = 1;
        peso[7] = 2;
        peso[8] = 1;
        peso[9] = 2;

        for (int i = 0; i < peso.length; i++) {
            int a = Integer.parseInt(cedula.substring(i, i + 1));
            int b = peso[i];

            int nResultado = a * b;
            if (String.valueOf(nResultado).length() > 1) {
                a = Integer.parseInt(String.valueOf(nResultado).substring(0, 1));
                b = Integer.parseInt(String.valueOf(nResultado).substring(1, 2));
            } else {
                a = 0;
                b = nResultado;
            }
            SUMA = SUMA + a + b;
        }

        DIVISION = SUMA % (10);
        if (DIVISION > 0) {
            DIGITO = 10 - DIVISION;
        } else {
            DIGITO = DIVISION;
        }

        if (DIGITO != Integer.parseInt(cedula.substring(10, 11))) {
            return false;
        }
        return true;
    }
}
