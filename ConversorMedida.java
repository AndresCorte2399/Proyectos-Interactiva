package ConversorDeMedida;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class ConversorMedida {
//	 Desarrolle una aplicaci�n en Java que permita convertir entre kilos, libras y gramos.
//	 Tambi�n de cent�metros a metros y de metros a cent�metros. Debe funcionar a trav�s de
//	 JOptionPane y funcionar con entradas en este formato (sin comillas) �convertir 3 kilos a libras�,
//	 �convertir 3 kilos a gramos�, �convertir 105 cent�metros a metros�, etc. La respuesta debe ser
//	 presentada tambi�n a trav�s de JOptionPane. En caso de entradas en formatos diferentes, la
//	 aplicaci�n debe informar dicho error.
	public static void main(String[] args) {
		while(true) {
			try {
				String value = JOptionPane.showInputDialog("Introduce el valor a trabajar: ");
				StringTokenizer st = new StringTokenizer(value,",");
				if(st.countTokens()==3) {
					double medirTr= Double.parseDouble(st.nextToken());
					String valor1 = st.nextToken();
					String valor2 = st.nextToken();
					//convertir entre kilos, libras y gramos.
					if( (valor1.equals("kilos")) && (valor2.equals("libras")) ) {
						double pasarLibras = ( (medirTr * 1000)/500 );
						JOptionPane.showMessageDialog(null, "Son: " + pasarLibras+" libras");
					}else if( (valor1.equals("kilos")) && (valor2.equals("gramos")) ) {
						double pasarKGramos= (medirTr*1000);
						JOptionPane.showMessageDialog(null, "Son:"+pasarKGramos+" gramos");
					}else if( (valor1.equals("libras")) && (valor2.equals("kilos")) ){
						double pasarKilos =(( (medirTr*1000)/2)/1000 );
						JOptionPane.showMessageDialog(null, "Son: "+ pasarKilos + " kilo");
					}else if( (valor1.equals("libras")) && (valor2.equals("gramos")) ) {
						double pasarLGramos = (medirTr*500);
						JOptionPane.showMessageDialog(null, "Son: " + pasarLGramos+" gramos");
					}else if( (valor1.equals("gramos")) && (valor2.equals("kilos")) ) {
						double pasarGKilos =(medirTr/1000);
						JOptionPane.showMessageDialog(null, "Son: "+pasarGKilos+" kilos");
					}else if( (valor1.equals("gramos")) && (valor2.equals("libras")) ) {
						double pasarGLibras = medirTr/500;
						JOptionPane.showMessageDialog(null, "Son: "+pasarGLibras+" libras");
						//convertir cent�metros a metros y de metros a cent�metros.
					}else if( (valor1.equals("cm")) && (valor2.equals("m")) ) {
						double centimetroM = medirTr/100;
						JOptionPane.showMessageDialog(null, "Son: "+centimetroM+" metros");
					}else if( (valor1.equals("m")) && (valor2.equals("cm")) ) {
						double metroCM = medirTr * 100;
						JOptionPane.showMessageDialog(null, "Son: "+metroCM+" centimetros");
					}else JOptionPane.showMessageDialog(null, "valor no permitido");
					
				}else if(st.countTokens()==1) {
					if(st.nextToken().equals("salir")) {
						break;
					}else JOptionPane.showMessageDialog(null, "Valor no permitido");
				}
			} catch (NullPointerException e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Termina la ejecucion");
				break;
			}
		}
	}
}
