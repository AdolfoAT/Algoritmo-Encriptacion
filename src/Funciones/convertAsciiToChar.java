/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;
import javax.swing.JOptionPane;
/**
 *
 * @author Adolfo
 */

public class convertAsciiToChar {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("Input code ascii");
		
		int d = Integer.parseInt(data);
		char c = (char)(d);
		System.out.println(data + " = " + c);
	}

}

