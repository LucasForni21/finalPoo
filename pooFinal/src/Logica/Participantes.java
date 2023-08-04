package Logica;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import Logica.*;

public class Participantes extends Persona{
	
	private double dineroDisponible;
	private int id;

	public Participantes(String nombre, String apellido, String dni, int id, double dineroDisponible) {
		super(nombre, apellido, dni);
		this.id = id;
		this.dineroDisponible = dineroDisponible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getdineroDisponible() {
		return dineroDisponible;
	}

	public void setdineroDisponible(double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}

	@Override
	public String toString() {
		return "Participantes [id=" + id + ", dineroDisponible=" + dineroDisponible + "]";
	}
	
	
	  
	  public void elegirPartido(Participantes participantes, Apuesta apuesta, Admin admin) {
		  
	        String[] opciones = {"Grupo A" , "Grupo B", "Grupo C" , "Grupo D","Grupo E", "Grupo F","Grupo G", "Grupo H","Octavos de Final","Cuartos de Final","Semifinal","Final","Salir"};
	        String opcionElegida;
           
		  do { // INICIO DO DEL SWITCH ENTERO		  
		        opcionElegida= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Mundial Qatar 2022", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
			switch (opcionElegida) {
			
			case "Grupo A":
		        String[] elegirPartidoA = {"Qatar - Ecuador","Holanda - Senegal","Ecuador - Holanda","Qatar - Senegal","Qatar - Holanda","Ecuador - Senegal","Salir"};
		        String opcionGrupoA;
		        int partido1A = 0;
		        int partido2A = 0;
		        int partido3A = 0;
		        int partido4A = 0;
		        int partido5A = 0;
		        int partido6A = 0;
		        do {  // GRUPO A 
					
		        opcionGrupoA= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo A - Apuesta", JOptionPane.PLAIN_MESSAGE, null, elegirPartidoA, elegirPartidoA[0]);
                 
		        if (opcionGrupoA.equalsIgnoreCase("Qatar - Ecuador")) {
		        	if (partido1A == 0) {
		        		apuesta.realizarApuesta(1, participantes, admin.getListaPartidos());
		        		partido1A++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 1
		        
		        if (opcionGrupoA.equalsIgnoreCase("Holanda - Senegal")) {
		        	if(partido2A == 0) {
		        	apuesta.realizarApuesta(2, participantes, admin.getListaPartidos());
		        	partido2A++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } //PARTIDO 2
		        
		        if (opcionGrupoA.equalsIgnoreCase("Ecuador - Holanda")) {
		        	if(partido3A == 0) {
		        	apuesta.realizarApuesta(3, participantes, admin.getListaPartidos());
		        	partido3A++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 3
		        
		        if (opcionGrupoA.equalsIgnoreCase("Qatar - Senegal")) {
		        	if(partido4A == 0) {
		        	apuesta.realizarApuesta(4, participantes, admin.getListaPartidos());
		        	partido4A++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 4
		        
		        if (opcionGrupoA.equalsIgnoreCase("Qatar - Holanda")) {
		        	if(partido5A == 0) {
		        	apuesta.realizarApuesta(5, participantes, admin.getListaPartidos());
		        	partido5A++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 5
		        
		        if (opcionGrupoA.equalsIgnoreCase("Ecuador - Senegal")) {
		        	if(partido6A == 0) {
		        	apuesta.realizarApuesta(6, participantes, admin.getListaPartidos());
		        	partido6A++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 6
		        
		        
		        
		        } while (!opcionGrupoA.equals("Salir")); // GRUPO A
		        						        		       		
				break;
				
				
			case "Grupo B":
				
				  String[] elegirPartidoB = { "Inglaterra - Iran","Estados Unidos - Gales","Gales - Iran","Inglaterra - Estados Unidos","Gales - Inglaterra","Estados Unidos - Iran","Salir"};
			        String opcionGrupoB;
			        int partido1B = 0;
			        int partido2B = 0;
			        int partido3B = 0;
			        int partido4B = 0;
			        int partido5B = 0;
			        int partido6B = 0;
			        do {  // GRUPO B 
						
			        opcionGrupoB= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo B - Apuesta", JOptionPane.PLAIN_MESSAGE, null, elegirPartidoB, elegirPartidoB[0]);
	                 
			        if (opcionGrupoB.equalsIgnoreCase("Inglaterra - Iran")) {
			        	if (partido1B == 0) {
			        		apuesta.realizarApuesta(7, participantes, admin.getListaPartidos());
			        		partido1B++;						
						}else {
							JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
						}   
					}  //PARTIDO 7
			        
			        if (opcionGrupoB.equalsIgnoreCase("Estados Unidos - Gales")) {
			        	if(partido2B == 0) {
			        	apuesta.realizarApuesta(8, participantes, admin.getListaPartidos());
			        	partido2B++;
					} else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					} 
			        } //PARTIDO 8
			        
			        if (opcionGrupoB.equalsIgnoreCase("Gales - Iran")) {
			        	if(partido3B == 0) {
			        	apuesta.realizarApuesta(9, participantes, admin.getListaPartidos());
			        	partido3B++;
					} else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					} 
			        } // PARTIDO 9
			        
			        if (opcionGrupoB.equalsIgnoreCase("Inglaterra - Estados Unidos")) {
			        	if(partido4B == 0) {
			        	apuesta.realizarApuesta(10, participantes, admin.getListaPartidos());
			        	partido4B++;
					} else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					} 
			        } // PARTIDO 10
			        
			        if (opcionGrupoB.equalsIgnoreCase("Gales - Inglaterra")) {
			        	if(partido5B == 0) {
			        	apuesta.realizarApuesta(11, participantes, admin.getListaPartidos());
			        	partido5B++;
					} else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					} 
			        } // PARTIDO 11
			        
			        if (opcionGrupoB.equalsIgnoreCase("Estados Unidos - Iran")) {
			        	if(partido6B == 0) {
			        	apuesta.realizarApuesta(12, participantes, admin.getListaPartidos());
			        	partido6B++;
					} else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					} 
			        } // PARTIDO 12
			        
			        
			        
			        } while (!opcionGrupoB.equals("Salir")); // GRUPO B
				
				break;
				
			case "Grupo C":
				
				String[] elegirPartidoC = {"Argentina - Arabia Saudita","Mexico - Polonia","Argentina - Mexico","Polonia - Arabia Saudita","Argentina - Polonia","Mexico - Arabia Saudita","Salir"};
		        String opcionGrupoC;
		        int partido1C = 0;
		        int partido2C = 0;
		        int partido3C = 0;
		        int partido4C = 0;
		        int partido5C = 0;
		        int partido6C = 0;
		        do {  // GRUPO C 
					
		        opcionGrupoC= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo C - Apuesta", JOptionPane.PLAIN_MESSAGE, null, elegirPartidoC, elegirPartidoC[0]);
                 
		        if (opcionGrupoC.equalsIgnoreCase("Argentina - Arabia Saudita")) {
		        	if (partido1C == 0) {
		        		apuesta.realizarApuesta(13, participantes, admin.getListaPartidos());
		        		partido1C++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 13
		        
		        if (opcionGrupoC.equalsIgnoreCase("Mexico - Polonia")) {
		        	if(partido2C == 0) {
		        	apuesta.realizarApuesta(14, participantes, admin.getListaPartidos());
		        	partido2C++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } //PARTIDO 14
		        
		        if (opcionGrupoC.equalsIgnoreCase("Argentina - Mexico")) {
		        	if(partido3C == 0) {
		        	apuesta.realizarApuesta(15, participantes, admin.getListaPartidos());
		        	partido3C++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 15
		        
		        if (opcionGrupoC.equalsIgnoreCase("Polonia - Arabia Saudita")) {
		        	if(partido4C == 0) {
		        	apuesta.realizarApuesta(16, participantes, admin.getListaPartidos());
		        	partido4C++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 16
		        
		        if (opcionGrupoC.equalsIgnoreCase("Argentina - Polonia")) {
		        	if(partido5C == 0) {
		        	apuesta.realizarApuesta(17, participantes, admin.getListaPartidos());
		        	partido5C++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 17
		        
		        if (opcionGrupoC.equalsIgnoreCase("Mexico - Arabia Saudita")) {
		        	if(partido6C == 0) {
		        	apuesta.realizarApuesta(18, participantes, admin.getListaPartidos());
		        	partido6C++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 18
		        
		        
		        
		        } while (!opcionGrupoC.equals("Salir")); // GRUPO C
				
				break;
				
			case "Grupo D":
				String[] elegirPartidoD = {"Francia - Australia","Dinamarca - Tunez","Francia - Dinamarca","Tunez - Australia","Francia - Tunez","Dinamarca - Australia","Salir"};
		        String opcionGrupoD;
		        int partido1D = 0;
		        int partido2D = 0;
		        int partido3D = 0;
		        int partido4D = 0;
		        int partido5D = 0;
		        int partido6D = 0;
		        do {  // GRUPO d 
					
		        opcionGrupoD= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo D - Apuesta", JOptionPane.PLAIN_MESSAGE, null, elegirPartidoD, elegirPartidoD[0]);
                 
		        if (opcionGrupoD.equalsIgnoreCase("Francia - Australia")) {
		        	if (partido1D == 0) {
		        		apuesta.realizarApuesta(19, participantes, admin.getListaPartidos());
		        		partido1D++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 19
		        
		        if (opcionGrupoD.equalsIgnoreCase("Dinamarca - Tunez")) {
		        	if(partido2D == 0) {
		        	apuesta.realizarApuesta(20, participantes, admin.getListaPartidos());
		        	partido2D++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } //PARTIDO 20
		        
		        if (opcionGrupoD.equalsIgnoreCase("Francia - Dinamarca")) {
		        	if(partido3D == 0) {
		        	apuesta.realizarApuesta(21, participantes, admin.getListaPartidos());
		        	partido3D++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 21
		        
		        if (opcionGrupoD.equalsIgnoreCase("Tunez - Australia")) {
		        	if(partido4D == 0) {
		        	apuesta.realizarApuesta(22, participantes, admin.getListaPartidos());
		        	partido4D++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 22
		        
		        if (opcionGrupoD.equalsIgnoreCase("Francia - Tunez")) {
		        	if(partido5D == 0) {
		        	apuesta.realizarApuesta(23, participantes, admin.getListaPartidos());
		        	partido5D++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 23
		        
		        if (opcionGrupoD.equalsIgnoreCase("Dinamarca - Australia")) {
		        	if(partido6D == 0) {
		        	apuesta.realizarApuesta(24, participantes, admin.getListaPartidos());
		        	partido6D++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 24
		        
		        } while (!opcionGrupoD.equals("Salir")); // GRUPO D
				
				break;
				
			case "Grupo E":
				String[] elegirPartidoE = {"España - Costa Rica","Alemania - Japon","España - Alemania","Japon - Costa Rica", "España - Japon","Alemania - Costa Rica","Salir"};
		        String opcionGrupoE;
		        int partido1E = 0;
		        int partido2E = 0;
		        int partido3E = 0;
		        int partido4E = 0;
		        int partido5E = 0;
		        int partido6E = 0;
		        do {  // GRUPO E 
					
		        opcionGrupoE= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo E - Apuesta", JOptionPane.PLAIN_MESSAGE, null, elegirPartidoE, elegirPartidoE[0]);
                 
		        if (opcionGrupoE.equalsIgnoreCase("España - Costa Rica")) {
		        	if (partido1E == 0) {
		        		apuesta.realizarApuesta(25, participantes, admin.getListaPartidos());
		        		partido1E++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 25
		        
		        if (opcionGrupoE.equalsIgnoreCase("Alemania - Japon")) {
		        	if(partido2E == 0) {
		        	apuesta.realizarApuesta(26, participantes, admin.getListaPartidos());
		        	partido2E++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } //PARTIDO 26
		        
		        if (opcionGrupoE.equalsIgnoreCase("España - Alemania")) {
		        	if(partido3E == 0) {
		        	apuesta.realizarApuesta(27, participantes, admin.getListaPartidos());
		        	partido3E++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 27
		        
		        if (opcionGrupoE.equalsIgnoreCase("Japon - Costa Rica")) {
		        	if(partido4E == 0) {
		        	apuesta.realizarApuesta(28, participantes, admin.getListaPartidos());
		        	partido4E++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 28
		        
		        if (opcionGrupoE.equalsIgnoreCase("España - Japon")) {
		        	if(partido5E == 0) {
		        	apuesta.realizarApuesta(29, participantes, admin.getListaPartidos());
		        	partido5E++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 29
		        
		        if (opcionGrupoE.equalsIgnoreCase("Alemania - Costa Rica")) {
		        	if(partido6E == 0) {
		        	apuesta.realizarApuesta(30, participantes, admin.getListaPartidos());
		        	partido6E++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 30
		        
		        } while (!opcionGrupoE.equals("Salir")); // GRUPO E
				break;
			case "Grupo F":
				String[] elegirPartidoF = {"Belgica - Canada","Marruecos - Croacia","Belgica - Croacia","Marruecos - Canada","Belgica - Marruecos","Croacia - Canada","Salir"};
		        String opcionGrupoF;
		        int partido1F = 0;
		        int partido2F = 0;
		        int partido3F = 0;
		        int partido4F = 0;
		        int partido5F = 0;
		        int partido6F = 0;
		        do {  // GRUPO F 
					
		        opcionGrupoF= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo F - Apuesta", JOptionPane.PLAIN_MESSAGE, null, elegirPartidoF, elegirPartidoF[0]);
                 
		        if (opcionGrupoF.equalsIgnoreCase("Belgica - Canada")) {
		        	if (partido1F == 0) {
		        		apuesta.realizarApuesta(31, participantes, admin.getListaPartidos());
		        		partido1F++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 31
		        
		        if (opcionGrupoF.equalsIgnoreCase("Marruecos - Croacia")) {
		        	if(partido2F == 0) {
		        	apuesta.realizarApuesta(32, participantes, admin.getListaPartidos());
		        	partido2F++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } //PARTIDO 32
		        
		        if (opcionGrupoF.equalsIgnoreCase("Belgica - Croacia")) {
		        	if(partido3F == 0) {
		        	apuesta.realizarApuesta(33, participantes, admin.getListaPartidos());
		        	partido3F++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 33
		        
		        if (opcionGrupoF.equalsIgnoreCase("Marruecos - Canada")) {
		        	if(partido4F == 0) {
		        	apuesta.realizarApuesta(34, participantes, admin.getListaPartidos());
		        	partido4F++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 34
		        
		        if (opcionGrupoF.equalsIgnoreCase("Belgica - Marruecos")) {
		        	if(partido5F == 0) {
		        	apuesta.realizarApuesta(35, participantes, admin.getListaPartidos());
		        	partido5F++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 35
		        
		        if (opcionGrupoF.equalsIgnoreCase("Croacia - Canada")) {
		        	if(partido6F == 0) {
		        	apuesta.realizarApuesta(36, participantes, admin.getListaPartidos());
		        	partido6F++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 36
		        
		        } while (!opcionGrupoF.equals("Salir")); // GRUPO F
		        
				break;
			case "Grupo G":
				String[] elegirPartidoG = {"Brasil - Serbia","Suiza - Camerun","Brasil - Camerun","Serbia - Suiza","Brasil - Suiza","Serbia - Camerun","Salir"};
		        String opcionGrupoG;
		        int partido1G = 0;
		        int partido2G = 0;
		        int partido3G = 0;
		        int partido4G = 0;
		        int partido5G = 0;
		        int partido6G = 0;
		        do {  // GRUPO G
					
		        opcionGrupoG= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo G - Apuesta", JOptionPane.PLAIN_MESSAGE, null, elegirPartidoG, elegirPartidoG[0]);
                 
		        if (opcionGrupoG.equalsIgnoreCase("Brasil - Serbia")) {
		        	if (partido1G == 0) {
		        		apuesta.realizarApuesta(37, participantes, admin.getListaPartidos());
		        		partido1G++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 37
		        
		        if (opcionGrupoG.equalsIgnoreCase("Suiza - Camerun")) {
		        	if(partido2G == 0) {
		        	apuesta.realizarApuesta(38, participantes, admin.getListaPartidos());
		        	partido2G++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } //PARTIDO 38
		        
		        if (opcionGrupoG.equalsIgnoreCase("Brasil - Camerun")) {
		        	if(partido3G == 0) {
		        	apuesta.realizarApuesta(39, participantes, admin.getListaPartidos());
		        	partido3G++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 39
		        
		        if (opcionGrupoG.equalsIgnoreCase("Serbia - Suiza")) {
		        	if(partido4G == 0) {
		        	apuesta.realizarApuesta(40, participantes, admin.getListaPartidos());
		        	partido4G++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 40
		        
		        if (opcionGrupoG.equalsIgnoreCase("Brasil - Suiza")) {
		        	if(partido5G == 0) {
		        	apuesta.realizarApuesta(41, participantes, admin.getListaPartidos());
		        	partido5G++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 41
		        
		        if (opcionGrupoG.equalsIgnoreCase("Serbia - Camerun")) {
		        	if(partido6G == 0) {
		        	apuesta.realizarApuesta(42, participantes, admin.getListaPartidos());
		        	partido6G++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 42
		        
		        } while (!opcionGrupoG.equals("Salir")); // GRUPO G
				
				break;
			case "Grupo H":
				String[] elegirPartidoH = {"Uruguay - Ghana","Portugal - Corea del Sur","Corea del Sur - Uruguay","Portugal - Ghana","Corea del Sur - Ghana","Portugal - Uruguay","Salir"};
		        String opcionGrupoH;
		        int partido1H = 0;
		        int partido2H = 0;
		        int partido3H = 0;
		        int partido4H = 0;
		        int partido5H = 0;
		        int partido6H = 0;
		        do {  // GRUPO H
					
		        opcionGrupoH= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Grupo H - Apuesta", JOptionPane.PLAIN_MESSAGE, null, elegirPartidoH, elegirPartidoH[0]);
                 
		        if (opcionGrupoH.equalsIgnoreCase("Uruguay - Ghana")) {
		        	if (partido1H == 0) {
		        		apuesta.realizarApuesta(43, participantes, admin.getListaPartidos());
		        		partido1H++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 43
		        
		        if (opcionGrupoH.equalsIgnoreCase("Portugal - Corea del Sur")) {
		        	if(partido2H == 0) {
		        	apuesta.realizarApuesta(44, participantes, admin.getListaPartidos());
		        	partido2H++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } //PARTIDO 44
		        
		        if (opcionGrupoH.equalsIgnoreCase("Corea del Sur - Uruguay")) {
		        	if(partido3H == 0) {
		        	apuesta.realizarApuesta(45, participantes, admin.getListaPartidos());
		        	partido3H++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 45
		        
		        if (opcionGrupoH.equalsIgnoreCase("Portugal - Ghana")) {
		        	if(partido4H == 0) {
		        	apuesta.realizarApuesta(46, participantes, admin.getListaPartidos());
		        	partido4H++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 46
		        
		        if (opcionGrupoH.equalsIgnoreCase("Corea del Sur - Ghana")) {
		        	if(partido5H == 0) {
		        	apuesta.realizarApuesta(47, participantes, admin.getListaPartidos());
		        	partido5H++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 47
		        
		        if (opcionGrupoH.equalsIgnoreCase("Portugal - Uruguay")) {
		        	if(partido6H == 0) {
		        	apuesta.realizarApuesta(48, participantes, admin.getListaPartidos());
		        	partido6H++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
				} 
		        } // PARTIDO 48
		        
		        } while (!opcionGrupoH.equals("Salir")); // GRUPO G
															
				break;
				
			case "Octavos de Final":
			
        
				Partido partido1 = null;
				Partido partido2 = null;
				Partido partido3 = null;
				Partido partido4 = null;
				Partido partido5 = null;
				Partido partido6 = null;
				Partido partido7 = null;
				Partido partido8 = null;
				String primerEncuentro = null;
				String segundoEncuentro = null;
				String tercerEncuentro = null;
				String cuartoEncuentro = null;
				String quintoEncuentro = null;
				String sextoEncuentro = null;
				String septimoEncuentro = null;
				String octavoEncuentro = null;
				
				for (Partido partido : admin.getListaPartidos()) {
				    if (partido.getId() == 49) {
				        partido1 = partido;
				        
				        primerEncuentro = partido1.getPais1().getNombre() +" - "+ partido1.getPais2().getNombre();
				    }
				    if (partido.getId() == 50) {
				        partido2 = partido;
				      
				        segundoEncuentro = partido2.getPais1().getNombre() +" - "+ partido2.getPais2().getNombre();
				    }
				    if (partido.getId() == 51) {
				        partido3 = partido;
				        
				        tercerEncuentro = partido3.getPais1().getNombre() +" - "+ partido3.getPais2().getNombre();
				    }
				    if (partido.getId() == 52) {
				        partido4 = partido;
				       
				        cuartoEncuentro = partido4.getPais1().getNombre() +" - "+ partido4.getPais2().getNombre();
				    }
				    if (partido.getId() == 53) {
				        partido5 = partido;
				     
				        quintoEncuentro = partido5.getPais1().getNombre() +" - "+ partido5.getPais2().getNombre();
				    }
				    if (partido.getId() == 54) {
				        partido6 = partido;
				     
				        sextoEncuentro = partido6.getPais1().getNombre() +" - "+ partido6.getPais2().getNombre();
				    }
				    if (partido.getId() == 55) {
				        partido7 = partido;
				     
				        septimoEncuentro = partido7.getPais1().getNombre() +" - "+ partido7.getPais2().getNombre();
				    }
				    if (partido.getId() == 56) {
				        partido8 = partido;
				
				        octavoEncuentro = partido8.getPais1().getNombre() +" - "+ partido8.getPais2().getNombre();
				    }
				    
				}

				String[] elegirPartidoOctavos = {primerEncuentro,segundoEncuentro,tercerEncuentro,cuartoEncuentro,quintoEncuentro,sextoEncuentro,septimoEncuentro,octavoEncuentro,"Salir"};
				 String opcionOctavos;
				int octavosEncuentro1 = 0;
				int octavosEncuentro2 = 0;
				int octavosEncuentro3 = 0;
				int octavosEncuentro4 = 0;
				int octavosEncuentro5 = 0;
				int octavosEncuentro6 = 0;
				int octavosEncuentro7 = 0;
				int octavosEncuentro8 = 0;
				 do {
		       opcionOctavos= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Octavos de final - Apuesta", JOptionPane.PLAIN_MESSAGE, null, elegirPartidoOctavos, elegirPartidoOctavos[0]);
			
		       
		        if (opcionOctavos.equalsIgnoreCase(primerEncuentro)) {
		        	if (octavosEncuentro1 == 0) {
		        		apuesta.realizarApuesta(49, participantes, admin.getListaPartidos());
		        		octavosEncuentro1++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 49
		       
		        if (opcionOctavos.equalsIgnoreCase(segundoEncuentro)) {
		        	if (octavosEncuentro2 == 0) {
		        		apuesta.realizarApuesta(50, participantes, admin.getListaPartidos());
		        		octavosEncuentro2++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 50
		        if (opcionOctavos.equalsIgnoreCase(tercerEncuentro)) {
		        	if (octavosEncuentro3 == 0) {
		        		apuesta.realizarApuesta(51, participantes, admin.getListaPartidos());
		        		octavosEncuentro3++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 51
		        if (opcionOctavos.equalsIgnoreCase(cuartoEncuentro)) {
		        	if (octavosEncuentro4 == 0) {
		        		apuesta.realizarApuesta(52, participantes, admin.getListaPartidos());
		        		octavosEncuentro4++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 52
		        if (opcionOctavos.equalsIgnoreCase(quintoEncuentro)) {
		        	if (octavosEncuentro5 == 0) {
		        		apuesta.realizarApuesta(53, participantes, admin.getListaPartidos());
		        		octavosEncuentro5++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 53
		        if (opcionOctavos.equalsIgnoreCase(sextoEncuentro)) {
		        	if (octavosEncuentro6 == 0) {
		        		apuesta.realizarApuesta(54, participantes, admin.getListaPartidos());
		        		octavosEncuentro6++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 54
		        if (opcionOctavos.equalsIgnoreCase(septimoEncuentro)) {
		        	if (octavosEncuentro7 == 0) {
		        		apuesta.realizarApuesta(55, participantes, admin.getListaPartidos());
		        		octavosEncuentro7++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 55
		        if (opcionOctavos.equalsIgnoreCase(octavoEncuentro)) {
		        	if (octavosEncuentro8 == 0) {
		        		apuesta.realizarApuesta(56, participantes, admin.getListaPartidos());
		        		octavosEncuentro8++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 56
		        
				 }while(!opcionOctavos.equals("Salir"));
				
              break;
				
			case"Cuartos de Final":
				Partido partidoCuartos1 = null;
				Partido partidoCuartos2 = null;
				Partido partidoCuartos3 = null;
				Partido partidoCuartos4 = null;				
				String primerEncuentroCuartos = null;
				String segundoEncuentroCuartos = null;
				String tercerEncuentroCuartos = null;
				String cuartoEncuentroCuartos = null;
			
				
				for (Partido partido : admin.getListaPartidos()) {
				    if (partido.getId() == 57) {
				    	partidoCuartos1 = partido;
				        
				    	primerEncuentroCuartos = partidoCuartos1.getPais1().getNombre() +" - "+ partidoCuartos1.getPais2().getNombre();
				    }
				    if (partido.getId() == 58) {
				    	partidoCuartos2 = partido;
				      
				    	segundoEncuentroCuartos = partidoCuartos2.getPais1().getNombre() +" - "+ partidoCuartos2.getPais2().getNombre();
				    }
				    if (partido.getId() == 59) {
				    	partidoCuartos3 = partido;
				        
				    	tercerEncuentroCuartos = partidoCuartos3.getPais1().getNombre() +" - "+ partidoCuartos3.getPais2().getNombre();
				    }
				    if (partido.getId() == 60) {
				    	partidoCuartos4 = partido;
				       
				    	cuartoEncuentroCuartos = partidoCuartos4.getPais1().getNombre() +" - "+ partidoCuartos4.getPais2().getNombre();
				    }						    
				}

				String[] elegirPartidoCuartos = {primerEncuentroCuartos,segundoEncuentroCuartos,tercerEncuentroCuartos,cuartoEncuentroCuartos,"Salir"};
				 String opcionCuartos;
				int cuartosEncuentro1 = 0;
				int cuartosEncuentro2 = 0;
				int cuartosEncuentro3 = 0;
				int cuartosEncuentro4 = 0;
				
				 do {
		       opcionCuartos= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Cuartos de final - Apuesta", JOptionPane.PLAIN_MESSAGE, null, elegirPartidoCuartos, elegirPartidoCuartos[0]);
			
		       
		        if (opcionCuartos.equalsIgnoreCase(primerEncuentroCuartos)) {
		        	if (cuartosEncuentro1 == 0) {
		        		apuesta.realizarApuesta(57, participantes, admin.getListaPartidos());
		        		cuartosEncuentro1++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 57
		       
		        if (opcionCuartos.equalsIgnoreCase(segundoEncuentroCuartos)) {
		        	if (cuartosEncuentro2 == 0) {
		        		apuesta.realizarApuesta(58, participantes, admin.getListaPartidos());
		        		cuartosEncuentro2++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 58
		        if (opcionCuartos.equalsIgnoreCase(tercerEncuentroCuartos)) {
		        	if (cuartosEncuentro3 == 0) {
		        		apuesta.realizarApuesta(59, participantes, admin.getListaPartidos());
		        		cuartosEncuentro3++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 59
		        if (opcionCuartos.equalsIgnoreCase(cuartoEncuentroCuartos)) {
		        	if (cuartosEncuentro4 == 0) {
		        		apuesta.realizarApuesta(60, participantes, admin.getListaPartidos());
		        		cuartosEncuentro4++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 60
		   
		        
				 }while(!opcionCuartos.equals("Salir"));
				
              
				break;
			case "Semifinal":
				Partido partidoSemi1 = null;
				Partido partidoSemi2 = null;
					
				String primerEncuentroSemi = null;
				String segundoEncuentroSemi = null;
			
			
				
				for (Partido partido : admin.getListaPartidos()) {
				    if (partido.getId() == 61) {
				    	partidoSemi1 = partido;
				        
				    	primerEncuentroSemi = partidoSemi1.getPais1().getNombre() +" - "+ partidoSemi1.getPais2().getNombre();
				    }
				    if (partido.getId() == 62) {
				    	partidoSemi2 = partido;
				      
				    	segundoEncuentroSemi = partidoSemi2.getPais1().getNombre() +" - "+ partidoSemi2.getPais2().getNombre();
				    }
										    
				}

				String[] elegirPartidoSemi = {primerEncuentroSemi,segundoEncuentroSemi,"Salir"};
				 String opcionSemi;
				int SemiEncuentro1 = 0;
				int SemiEncuentro2 = 0;
		
				
				 do {
		       opcionSemi= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Semifinal - Apuesta", JOptionPane.PLAIN_MESSAGE, null, elegirPartidoSemi, elegirPartidoSemi[0]);
			
		       
		        if (opcionSemi.equalsIgnoreCase(primerEncuentroSemi)) {
		        	if (SemiEncuentro1 == 0) {
		        		apuesta.realizarApuesta(61, participantes, admin.getListaPartidos());
		        		SemiEncuentro1++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 61
		       
		        if (opcionSemi.equalsIgnoreCase(segundoEncuentroSemi)) {
		        	if (SemiEncuentro2 == 0) {
		        		apuesta.realizarApuesta(62, participantes, admin.getListaPartidos());
		        		SemiEncuentro2++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 62
			  		   	
				 }while(!opcionSemi.equals("Salir"));
				break;
				
			case "Final":
				Partido partidoFinal = null;		
				String encuentroFinal= null;
			
			
				for (Partido partido : admin.getListaPartidos()) {
				    if (partido.getId() == 63) {
				    	partidoFinal = partido;
				        
				    	encuentroFinal = partidoFinal.getPais1().getNombre() +" - "+ partidoFinal.getPais2().getNombre();
				    }														    
				}

				String[] elegirPartidoFinal= {encuentroFinal,"Salir"};
				 String opcionFinal;
				int FinalEncuentro = 0;

				 do {
		       opcionFinal= (String) JOptionPane.showInputDialog(null, "Elegir Opcion: ", "Semifinal - Apuesta", JOptionPane.PLAIN_MESSAGE, null, elegirPartidoFinal, elegirPartidoFinal[0]);
				       
		        if (opcionFinal.equalsIgnoreCase(encuentroFinal)) {
		        	if (FinalEncuentro == 0) {
		        		apuesta.realizarApuesta(63, participantes, admin.getListaPartidos());
		        		FinalEncuentro++;						
					}else {
						JOptionPane.showMessageDialog(null, "Ya se ha realizado la apuesta de este partido");
					}   
				}  //PARTIDO 63
		       
		       
			  		   	
				 }while(!opcionFinal.equals("Salir"));
				
				break;
				
			} // FINAL SWITCH COMPLETO
		} while (!opcionElegida.equals("Salir"));
		  
	  }

}
