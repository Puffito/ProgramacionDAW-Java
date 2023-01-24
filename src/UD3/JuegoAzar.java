package UD3;
import javax.swing.JOptionPane;
import java.io.*;

import static javax.swing.JOptionPane.DEFAULT_OPTION;

public class JuegoAzar {

	public static void comprobacionfinal(int a, int b, int c) {
		if ((a!=b)) {
			JOptionPane.showMessageDialog(null, "Has perdido... El n�mero era: "+b+" M�s suerte la pr�xima vez","PERDISTE", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "���Has acertado el n�mero en "+ c +" intentos!!! ���FELICIDADES!!!","GANASTE", JOptionPane.PLAIN_MESSAGE);
		}
	}

	public static void main(String[] args) throws IOException {
		int correcto, intento, numadivinar;
		// Definir 
		// Inicializar
		correcto = (int) Math.floor(Math.random()*101);
		intento = 1;
		numadivinar = 0;
		// Proceso y Salida
		while ((numadivinar!=correcto) && intento<6) {
			numadivinar = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Adivina el n�mero entre 1 y 100 incluidos en 10 intentos. INTENTO #"+intento, "Adivina", JOptionPane.PLAIN_MESSAGE));
			if (numadivinar<correcto) {
				JOptionPane.showMessageDialog(null, "�El n�mero correcto es mayor!","MAL",JOptionPane.DEFAULT_OPTION);
			} else {
				if (numadivinar>correcto) {
					JOptionPane.showMessageDialog(null, "�El n�mero correcto es menor!","MAL",JOptionPane.DEFAULT_OPTION);
				}
			}
			intento = intento+1;
		}
		comprobacionfinal(numadivinar-1,correcto-1,intento-1);
	}


}

