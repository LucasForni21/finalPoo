package Logica;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Apuesta {

	 private Participantes participante;
	 private Partido Partido;
	 private double montoApostado;
	 private int golesPais1;
	 private int golesPais2;
	 private int id_apuesta;
	 private static int idContador = 1;
	 private boolean resultadoApuesta;
	 
	 
	 public Apuesta(Participantes participante, Partido partido, double montoApostado, int golesPais1,
			 int golesPais2, int id_apuesta,boolean resultadoApuesta) {
		 super();
		 this.participante = participante;
		 Partido = partido;
		 this.montoApostado = montoApostado;
		 this.golesPais1 = golesPais1;
		 this.golesPais2 = golesPais2;
		 this.id_apuesta = idContador++;
		 this.resultadoApuesta  = resultadoApuesta;
	 }
	 
	

	public boolean isResultadoApuesta() {
		return resultadoApuesta;
	}



	public void setResultadoApuesta(boolean resultadoApuesta) {
		this.resultadoApuesta = resultadoApuesta;
	}



	public Participantes getParticipante() {
		return participante;
	}

	public void setParticipante(Participantes participante) {
		this.participante = participante;
	}

	public Partido getPartido() {
		return Partido;
	}

	public void setPartido(Partido partido) {
		Partido = partido;
	}

	public double getMontoApostado() {
		return montoApostado;
	}

	public void setMontoApostado(double montoApostado) {
		this.montoApostado = montoApostado;
	}

	public int getGolesPais1() {
		return golesPais1;
	}

	public void setGolesPais1(int golesPais1) {
		this.golesPais1 = golesPais1;
	}

	public int getGolesPais2() {
		return golesPais2;
	}

	public void setGolesPais2(int golesPais2) {
		this.golesPais2 = golesPais2;
	}

	public int getId_apuesta() {
		return id_apuesta;
	}

	public void setId_apuesta(int id_apuesta) {
		this.id_apuesta = id_apuesta;
	}

	 @Override
	public String toString() {
		return "Apuesta [participante=" + participante + ", Partido=" + Partido + ", montoApostado=" + montoApostado
				+ ", golesPais1=" + golesPais1 + ", golesPais2=" + golesPais2 + ", id_apuesta=" + id_apuesta
				+ ", resultadoApuesta=" + resultadoApuesta + "]";
	}

          
 
	  // lista de los partidos
          
	   
	   
	 /*  List<Partido> listaPartidos = admin.getListaPartidos();
       for (Partido partido : listaPartidos) {
    	   if (partido.getId() == 2) {
			
    		   JOptionPane.showMessageDialog(null, partido.getPais1().getNombre() +partido.getgolesPais1() + "hola" +  partido.getPais2().getNombre() + partido.getgolesPais2());
		}
		}*/
       
	 
	 
	 public void realizarApuesta(int idPartido, Participantes participante,List<Partido> listaPartidos) {
		  //  Admin admin = new Admin("Lucas", "Forni", "123456", "Lucas.forni@davinci.edu.ar", "123");
		//   admin.getListaPartidos();
          
		    // Buscar el partido en la lista por su ID
		    Partido partidoEncontrado = null;
		    for (Partido partido : listaPartidos) {
		        if (partido.getId() == idPartido) {
		            partidoEncontrado = partido;
		     
		            break;
		        }
		    }

		    if (partidoEncontrado != null) {
		        // Obtener los goles de los países desde el partido encontrado
		     
		        JOptionPane.showMessageDialog(null, "Partido \n" + partidoEncontrado.getPais1().getNombre() + " vs " + partidoEncontrado.getPais2().getNombre());
		        String encuentro = JOptionPane.showInputDialog("Ingresar cual será el resultado esperado: " + "\n1.  Gana " + partidoEncontrado.getPais1().getNombre() + "\n2.  Gana " + partidoEncontrado.getPais2().getNombre() + "\n3. Es un empate");
                 int goles1 = partidoEncontrado.getgolesPais1();
                 int goles2 = partidoEncontrado.getgolesPais2();
               
		        // Apuesta
		        double apuesta ;
		        do {
		         apuesta = Double.parseDouble(JOptionPane.showInputDialog("Ingresar dinero que quiere apostar: "));
		        if (apuesta > participante.getdineroDisponible()) {
		            JOptionPane.showMessageDialog(null, "No tiene suficiente dinero en la cuenta");
		        } else {
		            participante.setdineroDisponible(participante.getdineroDisponible() - apuesta);
		            JOptionPane.showMessageDialog(null, "Apuesta ingresada" + "\nMonto restante en su cuenta: " + participante.getdineroDisponible());
		        }
		        }while(apuesta > participante.getdineroDisponible());
		        // Resultado de la apuesta
		        if (encuentro.equals("1") && partidoEncontrado.getgolesPais1() > partidoEncontrado.getgolesPais2()) {
		            participante.setdineroDisponible(participante.getdineroDisponible() + apuesta * 2);
		            JOptionPane.showMessageDialog(null,  "Resultado Final\n" +partidoEncontrado.getPais1().getNombre() +" "+ partidoEncontrado.getgolesPais1() + " - "+ partidoEncontrado.getPais2().getNombre() +" "+ partidoEncontrado.getgolesPais2() +  "\nHa ganado su apuesta" + "\nMonto ganado: " + apuesta * 2 + "\nSaldo restante: " + participante.getdineroDisponible());
		        } else if (encuentro.equals("2") && partidoEncontrado.getgolesPais1() < partidoEncontrado.getgolesPais2()) {
		            participante.setdineroDisponible(participante.getdineroDisponible() + apuesta * 2);
		            JOptionPane.showMessageDialog(null,  "Resultado Final\n" +partidoEncontrado.getPais1().getNombre() + " "+partidoEncontrado.getgolesPais1() + " - "+ partidoEncontrado.getPais2().getNombre() +" "+ partidoEncontrado.getgolesPais2() +  "\nHa ganado su apuesta" + "\nMonto ganado: " + apuesta * 2 + "\nSaldo restante: " + participante.getdineroDisponible());
		        } else if (encuentro.equals("3") && partidoEncontrado.getgolesPais1() == partidoEncontrado.getgolesPais2()) {
		            participante.setdineroDisponible(participante.getdineroDisponible() + apuesta * 2);
		            JOptionPane.showMessageDialog(null, "Resultado Final\n" +partidoEncontrado.getPais1().getNombre() + " "+partidoEncontrado.getgolesPais1() + " - "+ partidoEncontrado.getPais2().getNombre() +" "+ partidoEncontrado.getgolesPais2() +  "\nHa ganado su apuesta" + "\nMonto ganado: " + apuesta * 2 + "\nSaldo restante: " + participante.getdineroDisponible());
		        } else {
		            JOptionPane.showMessageDialog(null,  "Resultado Final\n" +partidoEncontrado.getPais1().getNombre() +" "+ partidoEncontrado.getgolesPais1() + " - "+ partidoEncontrado.getPais2().getNombre() +" "+ partidoEncontrado.getgolesPais2() +  "\nHa perdido su apuesta" + "\nMonto perdido: " + apuesta + "\nSaldo restante: " + participante.getdineroDisponible());
		        }
		    } else {
		        JOptionPane.showMessageDialog(null, "Partido no encontrado.");
		    }
		}
       
     
	
	 
}

