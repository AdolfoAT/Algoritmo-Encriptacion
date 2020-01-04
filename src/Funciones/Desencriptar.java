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
public class Desencriptar {
    int MatrizTexto [][]=new int [4][4];
    char MatrizTexto2[][]=new char[4][4];
    int MatrizClave [][]=new int[4][4];
    char MatrizClave2[][]=new char[4][4];
    int[][] AuxTex1 =new int [4][4];
    int [][] AuxTex2=new int[4][4];
    int [][] AuxClav1=new int[4][4];
    int [][] AuxClav2=new int [4][4];
    int [][] NumeroTexto=new int[4][4];
    int [][]NumeroClave=new int[4][4];
    String[][] BinarioTex=new String[4][4]; 
    String[][] BinarioCla=new String[4][4]; 
    int[][] ResultadoSuma=new int [4][4];
    int[][] ResultadoResta=new int [4][4];
    int[][] Xor1=new int [2][4];
    int[][] Xor2=new int [1][4];
    char TextEncr[][]=new char[4][4];
    String TextoEncriptado[][]=new String[4][4];
    int contador=0;
    public void SeparaLetras(String Texto, String Clave)
    {
        for (int i = 0; i<4; i++){
            for(int k=0; k<4;k++)
            {
                MatrizTexto[i][k]= Texto.charAt(contador);
                MatrizClave[i][k]= Clave.charAt(contador);
                contador++;
            }
        
        }
        mostrar();
    }
    public void mostrar ()
    { 
        System.out.println("Matriz Texto ");
         for (int i = 0; i<4; i++){
            for(int k=0; k<4;k++)
            {
                System.out.print(" "+MatrizTexto[i][k]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriz Clave");
        for (int i = 0; i<4; i++){
            for(int k=0; k<4;k++)
            {
                System.out.print(" "+MatrizClave[i][k]);
            }
            System.out.println();
        }
        System.out.println();
      // Des_Arriba_Abajo();
      Transposicion();
    }
    public void Transposicion()
    {
        int Aux;
        int Aux2;
        Aux=MatrizTexto[0][0];
        MatrizTexto[0][0]=MatrizTexto[3][3];
        MatrizTexto[3][3]=Aux;
        Aux2=MatrizTexto[0][3];
        MatrizTexto[0][3]=MatrizTexto[3][0];
        MatrizTexto[3][0]=Aux2;
        System.out.println("Resultado Transposicion ");
        for (int i = 0; i<4; i++){
            for(int k=0; k<4;k++)
            {
                System.out.print(" "+MatrizTexto[i][k]);
            }
            System.out.println();
        }
        //Terminado();
        Des_Arriba_Abajo();
    }
    public void Des_Arriba_Abajo()
    {
        
        for(int w=0; w<4; w++)
        {
            
            AuxClav1[2][w]=MatrizClave[0][w];
            AuxClav1[3][w]=MatrizClave[1][w];
            AuxClav1[0][w]=MatrizClave[2][w];
            AuxClav1[1][w]=MatrizClave[3][w];
        }
        
        System.out.println();
        System.out.println("Matriz Clave 2 Desplazamientos(Fila) hacia abajo ");
        for (int i = 0; i<4; i++){
            for(int k=0; k<4;k++)
            {
                System.out.print(" "+AuxClav1[i][k]);
            }
            System.out.println();
        }
        System.out.println();
       Des_Izq_Der();
    }
    public void Des_Izq_Der()
    {
        for(int w=0; w<4; w++)
        {
            
            AuxClav2[w][2]=AuxClav1[w][0];
            AuxClav2[w][3]=AuxClav1[w][1];
            AuxClav2[w][0]=AuxClav1[w][2];
            AuxClav2[w][1]=AuxClav1[w][3];
        }
        System.out.println("Matriz Clave  2 Desplazamientos(Columna) Izq-Der ");
        for (int i = 0; i<4; i++){
            for(int k=0; k<4;k++)
            {
                System.out.print(" "+AuxClav2[i][k]);
            }
            System.out.println();
        }
       //PasarNumeroBinario();
       System.out.println();
      // InteraccionSuma();
      XOR();
    }
    public void XOR()
    {
        System.out.println("Xor Entre fila 1 y 3, 2 y 4");
        for(int w=0;w<4;w++)
        {
            Xor1[0][w]= AuxClav2[0][w] ^ AuxClav2[1][w];
            Xor1[1][w]= AuxClav2[2][w] ^ AuxClav2[3][w];
           System.out.print(" "+Xor1[0][w]);
        }
        System.out.println();
        for(int w=0;w<4;w++)
        {
           System.out.print(" "+Xor1[1][w]);
        }
        System.out.println();
        System.out.println("Xor Entre fila 1 y 2");
        for(int w=0;w<4;w++)
        {
            Xor2[0][w]= Xor1[0][w] ^ Xor1[1][w];
           System.out.print(" "+Xor2[0][w]);
        }
         System.out.println();
        Resta();
    }
    public void Resta()
    {
        System.out.println("Xor entre la Suma de matrices (Texto Y Clave) y el resultado XOR ");
        for (int i = 0; i<4; i++){
            for(int k=0; k<4;k++)
            {
                ResultadoResta[i][k]=MatrizTexto[i][k] ^ Xor2[0][k];
                System.out.print(" "+ResultadoResta[i][k]);
            }
            System.out.println();
        }
        //Transposicion();
        InteraccionSuma();
    }
    public void InteraccionSuma()
    {
        System.out.println("Texto Obtenido");
         for (int i = 0; i<4; i++){
            for(int k=0; k<4;k++)
            {
               AuxTex2[i][k] = ResultadoResta[i][k] - AuxClav2[i][k];
               System.out.print(" "+AuxTex2[i][k]);
            }
            System.out.println();
        }
         Des_Izq_Der2();
    }
    public void Des_Izq_Der2()
    {
        for(int w=0; w<4; w++)
        {
            AuxTex1[w][2]=AuxTex2[w][0];
            AuxTex1[w][3]=AuxTex2[w][1];
            AuxTex1[w][0]=AuxTex2[w][2];
            AuxTex1[w][1]=AuxTex2[w][3];  
        }
        System.out.println("Matriz Texto  2 Desplazamientos(Columna) Izq-Der ");
        for (int i = 0; i<4; i++){
            for(int k=0; k<4;k++)
            {
                System.out.print(" "+AuxTex1[i][k]);
            }
            System.out.println();
        }
        
       //PasarNumeroBinario();
       System.out.println();
      // InteraccionSuma();
      Des_Arriba_Abajo2();
    }
    public void Des_Arriba_Abajo2()
    {
        
        for(int w=0; w<4; w++)
        {
          MatrizTexto[0][w] = AuxTex1[2][w];
          MatrizTexto[1][w] = AuxTex1[3][w];
          MatrizTexto[2][w] = AuxTex1[0][w];
          MatrizTexto[3][w] = AuxTex1[1][w]; 
            
        }
        System.out.println("Matriz Texto  2 Desplazamientos(Fila) hacia abajo ");
        for (int i = 0; i<4; i++){
            for(int k=0; k<4;k++)
            {
                System.out.print(" "+MatrizTexto[i][k]);
            }
            System.out.println();
        }       
        System.out.println();
        
    }
    public String Terminado()
    { 
    String Texto="";
    int Variable;
    char AUXX;
    System.out.println("Conversion de numeros a letras ACII");
        for (int i = 0; i<4; i++){
            for(int k=0; k<4;k++)
                
            { 
                
              Variable =MatrizTexto[i][k];
              //System.out.println(" "+Variable);
              AUXX=(char)Variable;
              //System.out.print(" "+TextEncr[i][k]);
              System.out.print(" "+AUXX);
              TextEncr[i][k]=AUXX;
              TextoEncriptado[i][k]=String.valueOf(TextEncr[i][k]);
              Texto=Texto+TextoEncriptado[i][k];
            }
            System.out.println();
        }
        // JOptionPane.showMessageDialog(null,"Texto Encriptado: " + Texto, "Importante", JOptionPane.WARNING_MESSAGE);
        return Texto;
    }
}
