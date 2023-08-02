package model;

import java.util.Scanner;

public class ConvertCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String inputString = scanner.nextLine();

        String result = convertCase(inputString);
        System.out.println("Resultado: " + result);

        scanner.close();
    }

    public static String convertCase(String inputString) {
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                // Convertir letra mayúscula a minúscula
                resultBuilder.append(Character.toLowerCase(currentChar));
            } else if (Character.isLowerCase(currentChar)) {
                // Convertir letra minúscula a mayúscula
                resultBuilder.append(Character.toUpperCase(currentChar));
            } else if (Character.isWhitespace(currentChar)) {
                // Omitir carácter en blanco
                continue;
            } else {
                // Mantener números y otros caracteres
                resultBuilder.append(currentChar);
            }
        }

        return resultBuilder.toString();
    }
}
