/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pro_calculadora_mafa;

import javax.swing.JOptionPane;

/**
 *
 * @author ceti
 */
public class borja {

    
     
   public void calcular(String numero1, String numero2){
     

    int num1, num2, suma, resta, multiplicacion, division;

    if(!numero1.isEmpty() && !numero2.isEmpty()){

        num1=Integer.parseInt(numero1);
        num2=Integer.parseInt(numero2);

        suma=num1+num2;
        resta=num1-num2;
        multiplicacion=num1*num2;
        division=num1/num2;

        lblSuma.setText(String.valueOf(suma));
        lblResta.setText(String.valueOf(resta));
        lblMultiplicacion.setText(String.valueOf(multiplicacion));
        lblDivision.setText(String.valueOf(division));

    }else{

        JOptionPane.showMessageDialog(null, "Debe ingresar los números para "
        + "realizar las operaciones", "Error en la operación", JOptionPane.ERROR_MESSAGE);

    }

}         
}
