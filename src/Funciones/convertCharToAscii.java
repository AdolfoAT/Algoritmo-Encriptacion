package Funciones;

import javax.swing.JOptionPane;

public class convertCharToAscii {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("Input chars");
		
		System.out.println(data);   
		 
        for (int i = 0; i < data.length(); i++){
            int as = data.charAt(i);
            System.out.println(as);  
        }
	}

}