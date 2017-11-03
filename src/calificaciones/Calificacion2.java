/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;
import javax.swing.JOptionPane;
/**
 *
 * @author LAB15
 */
public class Calificacion2 

{
    
public static void main(String[] args) 

  {
  float nota;  
  nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota"));
   if(nota ==7)
      {
    JOptionPane.showInputDialog("NOTABLE");
    
    }
    else
      {
   if(nota==6)   
        { 
      JOptionPane.showInputDialog("Bien");
        }
       else 
       {
      if(nota > 4&& nota < 5)  
      {         
       JOptionPane.showInputDialog("Siguiente");   
         
               }
    
       }