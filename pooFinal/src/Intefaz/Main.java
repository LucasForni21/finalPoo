package Intefaz;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Logica.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {

		LinkedList<Pais> octavos = new LinkedList<>();
		LinkedList<Pais> cuartos = new LinkedList<>();
		LinkedList<Pais> semiFinal = new LinkedList<>();
		LinkedList<Pais> Final = new LinkedList<>();
	   
		Admin admin = new Admin("Lucas", "Forni", "123456", "Lucas.forni@davinci.edu.ar", "123");
        Participantes participantes = new Participantes("Tomas","Rodriguez","0123",1,10000);
        Apuesta apuesta = new Apuesta(participantes, null, 0, 0, 0, 0, false);
     
        
		//GRUPO A
		Pais Qatar = new Pais("Qatar", 0,0,false, new String[8]);
		Pais Ecuador = new Pais("Ecuador",0,0,false,new String[8]);
		Pais Senegal = new Pais("Senegal",0,0,false,new String[8]);
		Pais Holanda = new Pais("Holanda",0,0,false,new String[8]);	
		
		LinkedList <Pais> grupoA = new LinkedList<>();
		grupoA.add(Qatar);
		grupoA.add(Ecuador);
		grupoA.add(Senegal);
		grupoA.add(Holanda);
		
		//Primera vuelta
		admin.administrarPartido(Qatar, Ecuador,0);
		admin.administrarPartido(Holanda, Senegal,0);
	
		//Segunda Vuelta//
		admin.administrarPartido(Ecuador, Holanda,1);
		admin.administrarPartido(Qatar, Senegal,1);
		//Tercera Vuelta//
		admin.administrarPartido(Qatar, Holanda,2);
		admin.administrarPartido(Ecuador, Senegal,2);
		
		  admin.marcarDosPrimerosClasificados(grupoA);	
		  List<Pais> dosPrimerosClasificadosA = admin.obtenerDosPrimerosClasificados(grupoA);
		  System.out.println("Los dos primeros países clasificados son:");
	          for (Pais pais : dosPrimerosClasificadosA) {
	              System.out.println(pais.getNombre()  + "\n"); 	                
	            if (pais.isClasificado() && !octavos.contains(pais)) {
			octavos.add(pais);
		
			} 
	          }
	   
		
		//GRUPO B
		Pais Inglaterra = new Pais("Inglaterra",0,0,false,new String[8]);
		Pais Iran = new Pais("Iran",0,0,false,new String[8]);
		Pais EstadosUnidos = new Pais("Estados Unidos",0,0,false,new String[8]);
		Pais Gales = new Pais("Gales",0,0,false,new String[8]);
		LinkedList<Pais> grupoB = new LinkedList<>();
		
		grupoB.add(Inglaterra);
		grupoB.add(Iran);
		grupoB.add(EstadosUnidos);
		grupoB.add(Gales);
		
		     //Primera vuelta
				admin.administrarPartido(Inglaterra, Iran,0);
				admin.administrarPartido(EstadosUnidos, Gales,0);
			          
				//Segunda Vuelta//
				admin.administrarPartido(Gales, Iran,1);
				admin.administrarPartido(Inglaterra, EstadosUnidos,1);
				//Tercera Vuelta//
				admin.administrarPartido(Gales, Inglaterra,2);
				admin.administrarPartido(EstadosUnidos, Iran,2);
				
				  admin.marcarDosPrimerosClasificados(grupoB);	
				  List<Pais> dosPrimerosClasificadosB = admin.obtenerDosPrimerosClasificados(grupoB);
				  System.out.println("Los dos primeros países clasificados son:");
			          for (Pais pais : dosPrimerosClasificadosB) {
			              System.out.println(pais.getNombre()  + "\n"); 	                
			            if (pais.isClasificado() && !octavos.contains(pais)) {
					octavos.add(pais);
				
					} 
			          }
		
		
		  // GRUPO C
        Pais Argentina = new Pais("Argentina", 0,0,false, new String[8]);
        Pais ArabiaSaudita = new Pais("Arabia Saudita", 0,0, false, new String[8]);
        Pais Mexico = new Pais("México", 0,0,false,  new String[8]);
        Pais Polonia = new Pais("Polonia", 0,0, false, new String[8]);

        LinkedList<Pais> grupoC = new LinkedList<>();
        grupoC.add(Argentina);
        grupoC.add(ArabiaSaudita);
        grupoC.add(Mexico);
        grupoC.add(Polonia);

        //Primera vuelta
		admin.administrarPartido(Argentina, ArabiaSaudita,0);
		admin.administrarPartido(Mexico, Polonia,0);
	
		//Segunda Vuelta//
		admin.administrarPartido(Argentina, Mexico,1);
		admin.administrarPartido(Polonia, ArabiaSaudita,1);
		//Tercera Vuelta//
		admin.administrarPartido(Argentina, Polonia,2);
		admin.administrarPartido(Mexico, ArabiaSaudita,2);
		
		  admin.marcarDosPrimerosClasificados(grupoC);	
		  List<Pais> dosPrimerosClasificadosC = admin.obtenerDosPrimerosClasificados(grupoC);
		  System.out.println("Los dos primeros países clasificados son:");
	          for (Pais pais : dosPrimerosClasificadosC) {
	              System.out.println(pais.getNombre()  + "\n"); 	                
	            if (pais.isClasificado() && !octavos.contains(pais)) {
			octavos.add(pais);
		
			} 
	          }
		
        
        // GRUPO D
        Pais Francia = new Pais("Francia", 0,0,false,  new String[8]);
        Pais Australia = new Pais("Australia", 0,0, false, new String[8]);
        Pais Dinamarca = new Pais("Dinamarca", 0,0, false, new String[8]);
        Pais Tunez = new Pais("Túnez", 0,0,false,  new String[8]);

        LinkedList<Pais> grupoD = new LinkedList<>();
        grupoD.add(Francia);
        grupoD.add(Australia);
        grupoD.add(Dinamarca);
        grupoD.add(Tunez);

		admin.administrarPartido(Francia, Australia,0);
		admin.administrarPartido(Dinamarca, Tunez,0);
	
		//Segunda Vuelta//
		admin.administrarPartido(Francia, Dinamarca,1);
		admin.administrarPartido(Tunez, Australia,1);
		//Tercera Vuelta//
		admin.administrarPartido(Francia, Tunez,2);
		admin.administrarPartido(Dinamarca, Australia,2);
        
        
		  admin.marcarDosPrimerosClasificados(grupoD);	
		  List<Pais> dosPrimerosClasificadosD = admin.obtenerDosPrimerosClasificados(grupoD);
		  System.out.println("Los dos primeros países clasificados son:");
	          for (Pais pais : dosPrimerosClasificadosD) {
	              System.out.println(pais.getNombre()  + "\n"); 	                
	            if (pais.isClasificado() && !octavos.contains(pais)) {
			octavos.add(pais);
		
			} 
	          }
        
        // GRUPO E
        Pais España = new Pais("España", 0,0,false,  new String[8]);
        Pais CostaRica = new Pais("Costa Rica", 0,0, false, new String[8]);
        Pais Alemania = new Pais("Alemania", 0,0, false, new String[8]);
        Pais Japon = new Pais("Japón", 0,0,false,  new String[8]);

        LinkedList<Pais> grupoE = new LinkedList<>();
        grupoE.add(España);
        grupoE.add(CostaRica);
        grupoE.add(Alemania);
        grupoE.add(Japon);
        
        
        admin.administrarPartido(España, CostaRica,0);
		admin.administrarPartido(Alemania, Japon,0);
	
		//Segunda Vuelta//
		admin.administrarPartido(España, Alemania,1);
		admin.administrarPartido(Japon, CostaRica,1);
		//Tercera Vuelta//
		admin.administrarPartido(España, Japon,2);
		admin.administrarPartido(Alemania, CostaRica,2);
        
		  admin.marcarDosPrimerosClasificados(grupoE);	
		  List<Pais> dosPrimerosClasificadosE = admin.obtenerDosPrimerosClasificados(grupoE);
		  System.out.println("Los dos primeros países clasificados son:");
	          for (Pais pais : dosPrimerosClasificadosE) {
	              System.out.println(pais.getNombre()  + "\n"); 	                
	            if (pais.isClasificado() && !octavos.contains(pais)) {
			octavos.add(pais);
		
			} 
	          }

        // GRUPO F
        Pais Belgica = new Pais("Belgica", 0,0, false, new String[8]);
        Pais Canada = new Pais("Canada", 0,0, false, new String[8]);
        Pais Marruecos = new Pais("Marruecos", 0,0,false, new String[8]);
        Pais Croacia = new Pais("Croacia", 0,0, false, new String[8]);

        LinkedList<Pais> grupoF = new LinkedList<>();
        grupoF.add(Belgica);
        grupoF.add(Canada);
        grupoF.add(Marruecos);
        grupoF.add(Croacia);
        
        
    	    //Primera vuelta//
            admin.administrarPartido(Belgica, Canada,0);
    		admin.administrarPartido(Marruecos, Croacia,0);
    	
    		//Segunda Vuelta//
    		admin.administrarPartido(Belgica, Croacia,1);
    		admin.administrarPartido(Marruecos, Canada,1);
    		//Tercera Vuelta//
    		admin.administrarPartido(Belgica, Marruecos,2);
    		admin.administrarPartido(Croacia, Canada,2);
        
    		
    		  admin.marcarDosPrimerosClasificados(grupoF);	
			  List<Pais> dosPrimerosClasificadosF = admin.obtenerDosPrimerosClasificados(grupoF);
			  System.out.println("Los dos primeros países clasificados son:");
		          for (Pais pais : dosPrimerosClasificadosF) {
		              System.out.println(pais.getNombre()  + "\n"); 	                
		            if (pais.isClasificado() && !octavos.contains(pais)) {
				octavos.add(pais);
			
				} 
		          }

        // GRUPO G
        Pais Brasil = new Pais("Brasil", 0,0, false, new String[8]);
        Pais Serbia = new Pais("Serbia", 0,0, false, new String[8]);
        Pais Suiza = new Pais("Suiza", 0,0, false, new String[8]);
        Pais Camerun = new Pais("Camerun", 0,0, false, new String[8]);

        LinkedList<Pais> grupoG = new LinkedList<>();
        grupoG.add(Brasil);
        grupoG.add(Serbia);
        grupoG.add(Suiza);
        grupoG.add(Camerun);

        //Primera vuelta//
        admin.administrarPartido(Brasil, Serbia,0);
		admin.administrarPartido(Suiza, Camerun,0);
	
		//Segunda Vuelta//
		admin.administrarPartido(Brasil, Camerun,1);
		admin.administrarPartido(Serbia, Suiza,1);
		//Tercera Vuelta//
		admin.administrarPartido(Brasil, Suiza,2);
		admin.administrarPartido(Serbia, Camerun,2);
    
      
		  admin.marcarDosPrimerosClasificados(grupoG);	
		  List<Pais> dosPrimerosClasificadosG = admin.obtenerDosPrimerosClasificados(grupoG);
		  System.out.println("Los dos primeros países clasificados son:");
	          for (Pais pais : dosPrimerosClasificadosG) {
	              System.out.println(pais.getNombre()  + "\n"); 	                
	            if (pais.isClasificado() && !octavos.contains(pais)) {
			octavos.add(pais);
		
			} 
	          }
		
        // GRUPO H
        Pais Portugal = new Pais("Portugal", 0,0, false, new String[8]);
        Pais Ghana = new Pais("Ghana", 0,0, false, new String[8]);
        Pais Uruguay = new Pais("Uruguay", 0,0,false, new String[8]);
        Pais CoreaDelSur = new Pais("Corea del Sur", 0,0, false, new String[8]);

        LinkedList<Pais> grupoH = new LinkedList<>();
        grupoH.add(Portugal);
        grupoH.add(Ghana);
        grupoH.add(Uruguay);
        grupoH.add(CoreaDelSur);
        
        
        //Primera vuelta//
        admin.administrarPartido(Uruguay, Ghana,0);
		admin.administrarPartido(Portugal, CoreaDelSur,0);
	
		//Segunda Vuelta//
		admin.administrarPartido(CoreaDelSur, Uruguay,1);
		admin.administrarPartido(Portugal, Ghana,1);
		//Tercera Vuelta//
		admin.administrarPartido(CoreaDelSur, Ghana,2);
		admin.administrarPartido(Portugal, Uruguay,2);
    
		
		  admin.marcarDosPrimerosClasificados(grupoH);	
		  List<Pais> dosPrimerosClasificadosH = admin.obtenerDosPrimerosClasificados(grupoH);
		  System.out.println("Los dos primeros países clasificados son:");
	          for (Pais pais : dosPrimerosClasificadosH) {
	              System.out.println(pais.getNombre()  + "\n"); 	                
	            if (pais.isClasificado() && !octavos.contains(pais)) {
			octavos.add(pais);
		
			} 
	          }
	          
	          
	          
	
        	  // OCTAVOS PARTIDOS
	        
	        
	          
        	  admin.partidosOctavos(octavos.get(0), octavos.get(3), 3);  
        	  admin.partidosOctavos(octavos.get(1), octavos.get(2), 3);  
        	  admin.partidosOctavos(octavos.get(4), octavos.get(7), 3);  
        	  admin.partidosOctavos(octavos.get(5), octavos.get(6), 3);  
        	  admin.partidosOctavos(octavos.get(8), octavos.get(11), 3);  
        	  admin.partidosOctavos(octavos.get(9), octavos.get(10), 3);  
        	  admin.partidosOctavos(octavos.get(12), octavos.get(15), 3);  
        	  admin.partidosOctavos(octavos.get(13), octavos.get(14), 3);
        	  
        
        	  
           	  //CUARTOS PARTIDOS
        	  for (Pais pais : octavos) {        /// ESTO AGREGA A CUARTOS 
        		  if (pais.isClasificado()) {
        			  cuartos.add(pais);
        		  }
        	  }
        	  admin.partidosOctavos(cuartos.get(0), cuartos.get(1), 4);  
        	  admin.partidosOctavos(cuartos.get(2), cuartos.get(3), 4);  
        	  admin.partidosOctavos(cuartos.get(4), cuartos.get(5), 4);  
        	  admin.partidosOctavos(cuartos.get(6), cuartos.get(7), 4);  
        	  
              //SEMIFINAL PARTIDOS
        	  for (Pais pais : cuartos) {
      	        if (pais.isClasificado()) {
      	            semiFinal.add(pais);
      	    
      	        }
      	    }
        	  
          	  admin.partidosOctavos(semiFinal.get(0), semiFinal.get(1), 5);  
          	  admin.partidosOctavos(semiFinal.get(2), semiFinal.get(3), 5);  
            	  
          	  
          	  //FINAL  PARTIDOS
          	
          	  for(Pais pais : semiFinal) {
          		  if(pais.isClasificado()) {
          			 Final.add(pais);
          		  }
          	  }
       
          	  // lista de los partidos
             
          	 admin.partidoFinal(Final.get(0), Final.get(1), 6);
          	  
          	  
          	 
          	
          	  
               //  participantes.elegirPartido(participantes, apuesta, admin);
              // apuesta.realizarApuesta(1,participantes,admin.getListaPartidos());
             
		
             String[] inicio = {"Apostar","Ver mundial","Salir"};   
             String inicioEleccion;
             int noPodes = 0;
             do {
           	 inicioEleccion = (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Mundial Qatar 2022", JOptionPane.PLAIN_MESSAGE, null, inicio, inicio[0]);
           	 switch (inicioEleccion) {
			case "Apostar":
				if (noPodes == 0) {
					
					participantes.elegirPartido(participantes, apuesta, admin);
					noPodes++;
				}else {
					JOptionPane.showMessageDialog(null, "Ya haz seleccionado esta opcion o ya viste los resultados ");
				}
				break;

			case"Ver mundial":
				noPodes++;
	        String[] opciones = {"Grupo A" , "Grupo B", "Grupo C" , "Grupo D","Grupo E", "Grupo F","Grupo G", "Grupo H","Octavos de Final","Cuartos de Final","Semifinal","Final","Salir"};
	        String opcionElegida;
	        do {
	        opcionElegida= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Mundial Qatar 2022", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
	
	       switch (opcionElegida) {
	   
			case "Grupo A":
				
				String []OpcionesGrupoA = {"Ver tabla de posiciones","Ver partidos","Ver datos del pais","Salir"};
				String opcionElegidaGrupoA;
				do {
				 opcionElegidaGrupoA= (String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo A", JOptionPane.PLAIN_MESSAGE, null, OpcionesGrupoA, OpcionesGrupoA[0]);
			  
			    switch (opcionElegidaGrupoA) {
				case "Ver tabla de posiciones":	
					
					
	              admin.mostrarTablaPosicionesOrdenada(grupoA);
	              
          	  
   
	        
					break;
				case "Ver partidos":
	              admin.mostrarPartidosGrupo(grupoA);
				  
			            break;
				case "Ver datos del pais":
					
					String []VerDatos = {"Qatar","Holanda","Ecuador","Senegal","Salir"};
					String VerDatosOpcionElegida; 
					do {
						VerDatosOpcionElegida =	(String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo A", JOptionPane.PLAIN_MESSAGE, null, VerDatos, VerDatos[0]);
						switch (VerDatosOpcionElegida) {
						case "Qatar":
							String qatar =   "Pais: "  + Qatar.getNombre() + "\n" + "Puntos conseguidos: " + Qatar.getPuntos() + "\n"
									+ "Goles Totales: " + Qatar.getGolesTotales();
							
							   JOptionPane.showMessageDialog(null, qatar,"Qatar",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/qatar.png")));
						
							break;
						case "Holanda":
							
							String holanda =   "Pais: "  + Holanda.getNombre() + "\n" + "Puntos conseguidos: " + Holanda.getPuntos() + "\n"
									+ "Goles Totales: " + Holanda.getGolesTotales();
							
							   JOptionPane.showMessageDialog(null, holanda,"Holanda",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/holanda.png")));
							
							break;
						case "Ecuador":
							String ecuador =   "Pais: "  + Ecuador.getNombre() + "\n" + "Puntos conseguidos: " + Ecuador.getPuntos() + "\n"
									+ "Goles Totales: " + Ecuador.getGolesTotales();
							   JOptionPane.showMessageDialog(null, ecuador,"Holanda",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/ecuador.png")));
	
							break;
						case "Senegal":
							
							String senegal =   "Pais: "  + Senegal.getNombre() + "\n" + "Puntos conseguidos: " + Senegal.getPuntos() + "\n"
									+ "Goles Totales: " + Senegal.getGolesTotales();
							   JOptionPane.showMessageDialog(null, senegal,"Holanda",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/senegal.png")));
							break;
					
						}
					} while (!VerDatosOpcionElegida.equals("Salir"));
					break;
					
				} // FINAL DEL SWITCH DEL GRUPO A
			}while(!opcionElegidaGrupoA.equals("Salir"));
			
				break;
	
			case "Grupo B":
				
				String []OpcionesGrupoB = {"Ver tabla de posiciones","Ver partidos","Ver datos del pais","Salir"};
				String opcionElegidaGrupoB;
				do {
				 opcionElegidaGrupoB= (String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo B", JOptionPane.PLAIN_MESSAGE, null, OpcionesGrupoB, OpcionesGrupoB[0]);
			  
			    switch (opcionElegidaGrupoB) {
				case "Ver tabla de posiciones":	
					
					
	              admin.mostrarTablaPosicionesOrdenada(grupoB);
	              
	           
					break;
				case "Ver partidos":
	              admin.mostrarPartidosGrupo(grupoB);
				
			            break;
				case "Ver datos del pais":
					
					String []VerDatos = {"Inglaterra","Iran","Estados Unidos","Gales","Salir"};
					String VerDatosOpcionElegida; 
					do {
						VerDatosOpcionElegida =	(String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo B", JOptionPane.PLAIN_MESSAGE, null, VerDatos, VerDatos[0]);
						switch (VerDatosOpcionElegida) {
						case "Inglaterra":
							String inglaterra =   "Pais: "  + Inglaterra.getNombre() + "\n" + "Puntos conseguidos: " + Inglaterra.getPuntos() + "\n"
									+ "Goles Totales: " + Inglaterra.getGolesTotales();
							
							   JOptionPane.showMessageDialog(null, inglaterra,"Inglaterra",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/inglaterra.png")));
						
							break;
						case "Iran":
							
							String iran =   "Pais: "  + Iran.getNombre() + "\n" + "Puntos conseguidos: " + Iran.getPuntos() + "\n"
									+ "Goles Totales: " + Iran.getGolesTotales();
							
							   JOptionPane.showMessageDialog(null, iran,"Iran",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/iran.png")));
							
							break;
						case "Estados Unidos":
							String usa =   "Pais: "  + EstadosUnidos.getNombre() + "\n" + "Puntos conseguidos: " + EstadosUnidos.getPuntos() + "\n"
									+ "Goles Totales: " + Ecuador.getGolesTotales();
							   JOptionPane.showMessageDialog(null, usa,"Estados Unidos",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/estadosUnidos.png")));
	
							break;
						case "Gales":
							
							String gales =   "Pais: "  + Gales.getNombre() + "\n" + "Puntos conseguidos: " + Gales.getPuntos() + "\n"
									+ "Goles Totales: " + Gales.getGolesTotales();
							   JOptionPane.showMessageDialog(null, gales,"Gales",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/gales.png")));
							break;
					
						}
					} while (!VerDatosOpcionElegida.equals("Salir"));
					break;
					
				} // FINAL DEL SWITCH DEL GRUPO B
			}while(!opcionElegidaGrupoB.equals("Salir"));
				
				break;
				
			case "Grupo C":
				
				String []OpcionesGrupoC = {"Ver tabla de posiciones","Ver partidos","Ver datos del pais","Salir"};
				String opcionElegidaGrupoC;
				do {
				 opcionElegidaGrupoC= (String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo C", JOptionPane.PLAIN_MESSAGE, null, OpcionesGrupoC, OpcionesGrupoC[0]);
			  
			    switch (opcionElegidaGrupoC) {
				case "Ver tabla de posiciones":	
					
					
	              admin.mostrarTablaPosicionesOrdenada(grupoC);
	              
	            
	              
					break;
				case "Ver partidos":
	              admin.mostrarPartidosGrupo(grupoC);
				
			            break;
				case "Ver datos del pais":
					
					String []VerDatos = {"Argentina","Polonia","Arabia Saudita","Mexico","Salir"};
					String VerDatosOpcionElegida; 
					do {
						VerDatosOpcionElegida =	(String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo C", JOptionPane.PLAIN_MESSAGE, null, VerDatos, VerDatos[0]);
						switch (VerDatosOpcionElegida) {
						case "Argentina":
							String argentina =   "Pais: "  + Argentina.getNombre() + "\n" + "Puntos conseguidos: " + Argentina.getPuntos() + "\n"
									+ "Goles Totales: " + Argentina.getGolesTotales();
							
							   JOptionPane.showMessageDialog(null, argentina,"Argentina",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/argentina.png")));
						
							break;
						case "Polonia":
							
							String polonia =   "Pais: "  + Polonia.getNombre() + "\n" + "Puntos conseguidos: " + Polonia.getPuntos() + "\n"
									+ "Goles Totales: " + Polonia.getGolesTotales();
							
							   JOptionPane.showMessageDialog(null, polonia,"Polonia",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/polonia.png")));
							
							break;
						case "Arabia Saudita":
							String arabiaSaudita =   "Pais: "  + ArabiaSaudita.getNombre() + "\n" + "Puntos conseguidos: " + ArabiaSaudita.getPuntos() + "\n"
									+ "Goles Totales: " + ArabiaSaudita.getGolesTotales();
							   JOptionPane.showMessageDialog(null, arabiaSaudita,"Arabia Saudita",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/arabiaSaudita.png")));
	
							break;
						case "Mexico":
							
							String mexico =   "Pais: "  + Mexico.getNombre() + "\n" + "Puntos conseguidos: " + Mexico.getPuntos() + "\n"
									+ "Goles Totales: " + Mexico.getPuntos();
							   JOptionPane.showMessageDialog(null, mexico,"Mexico",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/mexico.png")));
							break;
					
						}
					} while (!VerDatosOpcionElegida.equals("Salir"));
					break;
					
				} // FINAL DEL SWITCH DEL GRUPO C
			}while(!opcionElegidaGrupoC.equals("Salir"));
				break;
				
			case "Grupo D":
				
				String []OpcionesGrupoD = {"Ver tabla de posiciones","Ver partidos","Ver datos del pais","Salir"};
				String opcionElegidaGrupoD;
				do {
				 opcionElegidaGrupoD= (String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo D", JOptionPane.PLAIN_MESSAGE, null, OpcionesGrupoD, OpcionesGrupoD[0]);
			  
			    switch (opcionElegidaGrupoD) {
				case "Ver tabla de posiciones":	
					
					
	              admin.mostrarTablaPosicionesOrdenada(grupoD);
	              
	              
					break;
				case "Ver partidos":
	              admin.mostrarPartidosGrupo(grupoD);
				
			            break;
				case "Ver datos del pais":
					
					String []VerDatos = {"Francia","Dinamarca","Australia","Tunez","Salir"};
					String VerDatosOpcionElegida; 
					do {
						VerDatosOpcionElegida =	(String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo D", JOptionPane.PLAIN_MESSAGE, null, VerDatos, VerDatos[0]);
						switch (VerDatosOpcionElegida) {
						case "Francia":
							String francia =   "Pais: "  + Francia.getNombre() + "\n" + "Puntos conseguidos: " + Francia.getPuntos() + "\n"
									+ "Goles Totales: " + Francia.getGolesTotales();
							
							   JOptionPane.showMessageDialog(null, francia,"Francia",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/francia.png")));
						
							break;
						case "Dinamarca":
							
							String dinamarca =   "Pais: "  + Dinamarca.getNombre() + "\n" + "Puntos conseguidos: " + Dinamarca.getPuntos() + "\n"
									+ "Goles Totales: " + Dinamarca.getGolesTotales();
							
							   JOptionPane.showMessageDialog(null, dinamarca,"Dinamarca",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/dinamarca.png")));
							
							break;
						case "Australia":
							String australia =   "Pais: "  + Australia.getNombre() + "\n" + "Puntos conseguidos: " + Australia.getPuntos() + "\n"
									+ "Goles Totales: " + Australia.getGolesTotales();
							   JOptionPane.showMessageDialog(null, australia,"Australia",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/australia.png")));
	
							break;
						case "Tunez":
							
							String tunez =   "Pais: "  + Tunez.getNombre() + "\n" + "Puntos conseguidos: " + Tunez.getPuntos() + "\n"
									+ "Goles Totales: " + Tunez.getGolesTotales()   ;
							   JOptionPane.showMessageDialog(null, tunez,"Tunez",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/tunez.png")));
							break;
					
						}
					} while (!VerDatosOpcionElegida.equals("Salir"));
					break;
					
				} // FINAL DEL SWITCH DEL GRUPO D
			}while(!opcionElegidaGrupoD.equals("Salir"));
				break;
				case "Grupo E":
				
				String []OpcionesGrupoE = {"Ver tabla de posiciones","Ver partidos","Ver datos del pais","Salir"};
				String opcionElegidaGrupoE;
				do {
				 opcionElegidaGrupoE= (String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo E", JOptionPane.PLAIN_MESSAGE, null, OpcionesGrupoE, OpcionesGrupoE[0]);
			  
			    switch (opcionElegidaGrupoE) {
				case "Ver tabla de posiciones":	
					
					
	              admin.mostrarTablaPosicionesOrdenada(grupoE);
	              
	              
					break;
				case "Ver partidos":
	              admin.mostrarPartidosGrupo(grupoE);
				
			            break;
				case "Ver datos del pais":
					
					String []VerDatos = {"España","Costa Rica","Alemania","Japon","Salir"};
					String VerDatosOpcionElegida; 
					do {
						VerDatosOpcionElegida =	(String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo E", JOptionPane.PLAIN_MESSAGE, null, VerDatos, VerDatos[0]);
						switch (VerDatosOpcionElegida) {
						case "España":
							String espana =   "Pais: "  + España.getNombre() + "\n" + "Puntos conseguidos: " + España.getPuntos() + "\n"
									+ "Goles Totales: " + España.getGolesTotales();
							
							   JOptionPane.showMessageDialog(null, espana,"España",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/espana.png")));
						
							break;
						case "Costa Rica":
							
							String Costarica =   "Pais: "  + CostaRica.getNombre() + "\n" + "Puntos conseguidos: " + CostaRica.getPuntos() + "\n"
									+ "Goles Totales: " + CostaRica.getGolesTotales();
							
							   JOptionPane.showMessageDialog(null, Costarica,"Costa Rica",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/costaRica.png")));
							
							break;
						case "Alemania":
							String alemania =   "Pais: "  + Alemania.getNombre() + "\n" + "Puntos conseguidos: " + Alemania.getPuntos() + "\n"
									+ "Goles Totales: " + Alemania.getGolesTotales();
							   JOptionPane.showMessageDialog(null, alemania,"Alemania",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/alemania.png")));
	
							break;
						case "Japon":
							
							String japon =   "Pais: "  + Japon.getNombre() + "\n" + "Puntos conseguidos: " + Japon.getPuntos() + "\n"
									+ "Goles Totales: " + Japon.getGolesTotales()   ;
							   JOptionPane.showMessageDialog(null, japon,"Japon",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/japon.png")));
							break;
					
						}
					} while (!VerDatosOpcionElegida.equals("Salir"));
					break;
					
				} // FINAL DEL SWITCH DEL GRUPO E
			}while(!opcionElegidaGrupoE.equals("Salir"));
		
				break;
	
				
				case "Grupo F":
					
					String []OpcionesGrupoF = {"Ver tabla de posiciones","Ver partidos","Ver datos del pais","Salir"};
					String opcionElegidaGrupoF;
					do {
					 opcionElegidaGrupoF= (String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo F", JOptionPane.PLAIN_MESSAGE, null, OpcionesGrupoF, OpcionesGrupoF[0]);
				  
				    switch (opcionElegidaGrupoF) {
					case "Ver tabla de posiciones":	
						
						
		              admin.mostrarTablaPosicionesOrdenada(grupoF);
		              
		              
						break;
					case "Ver partidos":
		              admin.mostrarPartidosGrupo(grupoF);
					
				            break;
					case "Ver datos del pais":
						
						String []VerDatos = {"Belgica","Canada","Croacia","Marruecos","Salir"};
						String VerDatosOpcionElegida; 
						do {
							VerDatosOpcionElegida =	(String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo F", JOptionPane.PLAIN_MESSAGE, null, VerDatos, VerDatos[0]);
							switch (VerDatosOpcionElegida) {
							case "Belgica":
								String belgica =   "Pais: "  + Belgica.getNombre() + "\n" + "Puntos conseguidos: " + Belgica.getPuntos() + "\n"
										+ "Goles Totales: " + Belgica.getGolesTotales();
								
								   JOptionPane.showMessageDialog(null, belgica,"Belgica",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/belgica.png")));
							
								break;
							case "Canada":
								
								String canada =   "Pais: "  + Canada.getNombre() + "\n" + "Puntos conseguidos: " + Canada.getPuntos() + "\n"
										+ "Goles Totales: " + Canada.getGolesTotales();
								
								   JOptionPane.showMessageDialog(null, canada,"Canada",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/canada.png")));
								
								break;
							case "Croacia":
								String croacia =   "Pais: "  + Croacia.getNombre() + "\n" + "Puntos conseguidos: " + Croacia.getPuntos() + "\n"
										+ "Goles Totales: " + Croacia.getGolesTotales();
								   JOptionPane.showMessageDialog(null, croacia,"Croacia",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/croacia.png")));
	
								break;
							case "Marruecos":
								
								String marruecos =   "Pais: "  + Marruecos.getNombre() + "\n" + "Puntos conseguidos: " + Marruecos.getPuntos() + "\n"
										+ "Goles Totales: " + Marruecos.getGolesTotales()   ;
								   JOptionPane.showMessageDialog(null, marruecos,"Marruecos",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/marruecos.png")));
								break;
						
							}
						} while (!VerDatosOpcionElegida.equals("Salir"));
						break;
						
					} // FINAL DEL SWITCH DEL GRUPO F
				}while(!opcionElegidaGrupoF.equals("Salir"));
			
					break;
				
	                  case "Grupo G":
					
					String []OpcionesGrupoG = {"Ver tabla de posiciones","Ver partidos","Ver datos del pais","Salir"};
					String opcionElegidaGrupoG;
					do {
					 opcionElegidaGrupoG= (String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo G", JOptionPane.PLAIN_MESSAGE, null, OpcionesGrupoG, OpcionesGrupoG[0]);
				  
				    switch (opcionElegidaGrupoG) {
					case "Ver tabla de posiciones":	
						
						
		              admin.mostrarTablaPosicionesOrdenada(grupoG);
		              
		           		              	              
						break;
					case "Ver partidos":
		              admin.mostrarPartidosGrupo(grupoG);
					
				            break;
					case "Ver datos del pais":
						
						String []VerDatos = {"Brasil","Serbia","Camerun","Suiza","Salir"};
						String VerDatosOpcionElegida; 
						do {
							VerDatosOpcionElegida =	(String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo G", JOptionPane.PLAIN_MESSAGE, null, VerDatos, VerDatos[0]);
							switch (VerDatosOpcionElegida) {
							case "Brasil":
								String brasil =   "Pais: "  + Brasil.getNombre() + "\n" + "Puntos conseguidos: " + Brasil.getPuntos() + "\n"
										+ "Goles Totales: " + Brasil.getGolesTotales();
								
								   JOptionPane.showMessageDialog(null, brasil,"Brasil",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/brasil.png")));
							
								break;
							case "Serbia":
								
								String serbia =   "Pais: "  + Serbia.getNombre() + "\n" + "Puntos conseguidos: " + Serbia.getPuntos() + "\n"
										+ "Goles Totales: " + Serbia.getGolesTotales();
								
								   JOptionPane.showMessageDialog(null, serbia,"Serbia",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/serbia.png")));
								
								break;
							case "Camerun":
								String camerun =   "Pais: "  + Camerun.getNombre() + "\n" + "Puntos conseguidos: " + Camerun.getPuntos() + "\n"
										+ "Goles Totales: " + Camerun.getGolesTotales();
								   JOptionPane.showMessageDialog(null, camerun,"Camerun",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/camerun.png")));
	
								break;
							case "Suiza":
								
								String suiza =   "Pais: "  + Suiza.getNombre() + "\n" + "Puntos conseguidos: " + Suiza.getPuntos() + "\n"
										+ "Goles Totales: " + Suiza.getGolesTotales()   ;
								   JOptionPane.showMessageDialog(null, suiza,"Suiza",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/suiza.png")));
								break;
						
							}
						} while (!VerDatosOpcionElegida.equals("Salir"));
						break;
						
					} // FINAL DEL SWITCH DEL GRUPO G
				}while(!opcionElegidaGrupoG.equals("Salir"));
			
					break;
				
	                  case "Grupo H":
	      				
	      				String []OpcionesGrupoH = {"Ver tabla de posiciones","Ver partidos","Ver datos del pais","Salir"};
	      				String opcionElegidaGrupoH;
	      				do {
	      				 opcionElegidaGrupoH= (String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo G", JOptionPane.PLAIN_MESSAGE, null, OpcionesGrupoH, OpcionesGrupoH[0]);
	      			  
	      			    switch (opcionElegidaGrupoH) {
	      				case "Ver tabla de posiciones":	
	      					
	      					
	      	              admin.mostrarTablaPosicionesOrdenada(grupoH);
	      	           	      	          	      	     	      	              	      	              
	  	              
	      					break;
	      				case "Ver partidos":
	      	              admin.mostrarPartidosGrupo(grupoH);
	      				
	      			            break;
	      				case "Ver datos del pais":
	      					
	      					String []VerDatos = {"Uruguay","Portugal","Corea del sur","Ghana","Salir"};
	      					String VerDatosOpcionElegida; 
	      					do {
	      						VerDatosOpcionElegida =	(String)JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo H", JOptionPane.PLAIN_MESSAGE, null, VerDatos, VerDatos[0]);
	      						switch (VerDatosOpcionElegida) {
	      						case "Uruguay":
	      							String uruguay =   "Pais: "  + Uruguay.getNombre() + "\n" + "Puntos conseguidos: " + Uruguay.getPuntos() + "\n"
	      									+ "Goles Totales: " + Uruguay.getGolesTotales();
	      							
	      							   JOptionPane.showMessageDialog(null, uruguay,"Uruguay",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/uruguay.png")));
	      						
	      							break;
	      						case "Portugal":
	      							
	      							String portugal =   "Pais: "  + Portugal.getNombre() + "\n" + "Puntos conseguidos: " + Portugal.getPuntos() + "\n"
	      									+ "Goles Totales: " + Portugal.getGolesTotales();
	      							
	      							   JOptionPane.showMessageDialog(null, portugal,"Portugal",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/portugal.png")));
	      							
	      							break;
	      						case "Corea del sur":
	      							String coreadelsur =   "Pais: "  + CoreaDelSur.getNombre() + "\n" + "Puntos conseguidos: " + CoreaDelSur.getPuntos() + "\n"
	      									+ "Goles Totales: " + CoreaDelSur.getGolesTotales();
	      							   JOptionPane.showMessageDialog(null, coreadelsur,"Corea del sur",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/corea-del-sur.png")));
	
	      							break;
	      						case "Ghana":
	      							
	      							String ghana =   "Pais: "  + Ghana.getNombre() + "\n" + "Puntos conseguidos: " + Ghana.getPuntos() + "\n"
	      									+ "Goles Totales: " + Ghana.getGolesTotales()   ;
	      							   JOptionPane.showMessageDialog(null, ghana,"Ghana",JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/ghana.png")));
	      							break;
	      					
	      						}
	      					} while (!VerDatosOpcionElegida.equals("Salir"));
	      					break;
	      					
	      				} // FINAL DEL SWITCH DEL GRUPO H
	      			}while(!opcionElegidaGrupoH.equals("Salir"));
	      		
	      				break;
	      				
	                  case "Octavos de Final":	
	                		        	                	  	                	         
	                		 admin.mostrarPartidosOctavos(octavos);
	                	
	                	  
	                	  break;
	                  	  
	                  case "Cuartos de Final":	                	         	  	                	  	             	                	  	             	                	                      	 	               	  	             	            	    
	                	    admin.mostrarPartidosCuartos(cuartos);
	                	    	                	    	                			                      		                	    
	                	  break;
	                	  
	                  case "Semifinal":	                	  	                	  	                		  	             	                           	    
	                	    admin.mostrarPartidosSemiFinal(semiFinal);
	                	    
	                	    	                	    	                	    	                	  	                	    
	                	  break;
	                	  
	                  case "Final":
	               	                	   
	                	    admin.mostrarPartidosFinal(Final);
	                	  
	                	  break;	      				
			} //FINAL SWITCH VER MUNDIAL
	        }while(!opcionElegida.equals("Salir"));
	    	break;
 			}
             }while(!inicioEleccion.equals("Salir")); // FINAL SWITCH PRINCIPAL
             
	        	      
		}
	
	}
