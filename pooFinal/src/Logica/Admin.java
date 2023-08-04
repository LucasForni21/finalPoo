package Logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;
import Logica.*;
public class Admin extends Persona {
	 private List<Partido> listaPartidos;
	private String email;
	private String contraseña;

	public Admin(String nombre, String apellido, String dni, String email, String contraseña) {
		super(nombre, apellido, dni);
		this.email = email;
		this.contraseña = contraseña;
		listaPartidos = new ArrayList<>();
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Admin [email=" + email + ", contraseña=" + contraseña + "]";
		
		
	}
	public void partidosOctavos(Pais pais1, Pais pais2, int indicePartido) {
		String estadio = null;
		int estadioRandom = (int)(Math.random()*8+1);
		if (estadioRandom == 1) {
			estadio = "Estadio 974";
		} else if(estadioRandom == 2) {
			estadio = "Estadio Internacional Khalifa";
		} else if(estadioRandom == 3) {
			estadio = "Estadio Ahmad Bin Ali";
		}else if(estadioRandom == 4) {
			estadio = "Estadio Al Bayt";
		} else if (estadioRandom ==5) {
			estadio = "Estadio Al Janoub";
		} else if(estadioRandom == 6){
			estadio = "Estadio Al Thumama";
		}else if(estadioRandom == 7) {
			estadio = "Estadio Ciudad de la Educación";
		}else if(estadioRandom == 8) {
			estadio = "Estadio Lusail";
		}
		 Partido partido = Partido.generarPartido(pais1, pais2, 0);
		 
		 
   
		    // Obtener los resultados del partido
		    int golesPais1 = partido.getgolesPais1();
		    int golesPais2 = partido.getgolesPais2();
		    int golesTotalesPartido = partido.getGolesTotales();
		    
		    // GOLES DE TIEMPO SUPLMENTARIO
		    int golesSuplementarioPais1 = (int)(Math.random()*3+1);
		    int golesSuplementarioPais2 = (int)(Math.random()*3+1);
		    //GOLES DE PENALES
		    int golesPenalesPais1 = (int)(Math.random()*10+1);
		    int golesPenalesPais2 = (int)(Math.random()*10+1);
		    //
		    int sumaGoles1 = golesPais1;
		    int sumaGoles2 = golesPais2;
		    int maxDuracion = 90;
 
            
		    if (golesPais1 == golesPais2) {
		     
		  
		        golesSuplementarioPais1 = (int)(Math.random() * 3 + 1);
		        golesSuplementarioPais2 = (int)(Math.random() * 3 + 1);
		        sumaGoles1 += golesSuplementarioPais1;
		        sumaGoles2 += golesSuplementarioPais2;
		        
		        

		        // Si aún hay empate después del tiempo suplementario, se van a penales
		        if (sumaGoles1 == sumaGoles2) {
		     
		              partido.setPenales1(golesPenalesPais1);
		              partido.setPenales2(golesPenalesPais2);
		            String resultadoPenales = "Resultado Final "+ "\n" + pais1.getNombre() + " " +sumaGoles1+"("+ partido.getPenales1()+")" + " vs " + pais2.getNombre() + " " +sumaGoles2+"("+partido.getPenales2()+")" + "\n" + estadio ;
		            		 pais1.agregarResultadoPartido(indicePartido, resultadoPenales);
		            		 pais2.agregarResultadoPartido(indicePartido, resultadoPenales);
		            if (golesPenalesPais1 > golesPenalesPais2) {
		            
		                pais2.setClasificado(false);
		                pais1.setClasificado(true);
		            } else if (golesPenalesPais1 < golesPenalesPais2) {
		             
		                pais1.setClasificado(false);
		                pais2.setClasificado(true);
		            } else {
		            	int sorteo = (int)(Math.random()*2+1);
		            	if (sorteo == 1) {
							pais1.setClasificado(true);
							pais2.setClasificado(false);
						}else {
							pais1.setClasificado(false);
							pais2.setClasificado(true);
						}
		            }
		        } else {
		            // Si hay un ganador después del tiempo suplementario, se muestra el resultado final
		            
		            String resultado120min = "Resultado Final " + "\n" + pais1.getNombre() + " " + sumaGoles1 + " vs " + pais2.getNombre() + " " + sumaGoles2 + "\nDuracion del partido: " + (maxDuracion + 30) + " minutos." + "\n" + estadio;
		            		 pais1.agregarResultadoPartido(indicePartido, resultado120min);
		            		 pais2.agregarResultadoPartido(indicePartido, resultado120min);
		            if (sumaGoles1 > sumaGoles2) {
		                pais2.setClasificado(false);
		                pais1.setClasificado(true);
		            } else {
		                pais1.setClasificado(false);
		                pais2.setClasificado(true);
		                
		            }
		        }
		    } else {
		        // Si hay un ganador en tiempo reglamentario, se muestra el resultado final
		        String resultado90min =  "Resultado Final " + "\n" + pais1.getNombre() + " " + golesPais1 + " vs " + pais2.getNombre() + " " + golesPais2 + "\nDuracion del partido: " + maxDuracion + " minutos." + "\n" + estadio  ;
				        pais1.agregarResultadoPartido(indicePartido, resultado90min);
				        pais2.agregarResultadoPartido(indicePartido, resultado90min);
				        
		        if (golesPais1 > golesPais2) {
		            pais2.setClasificado(false);
		            pais1.setClasificado(true);
		        } else if (golesPais1 < golesPais2) {
		            pais1.setClasificado(false);
		            pais2.setClasificado(true);
		        }
		    }

		   
		    // Actualizar los goles totales de cada país con los goles del partido actual
		    pais1.setGolesTotales(pais1.getGolesTotales() + golesPais1);
		    pais2.setGolesTotales(pais2.getGolesTotales() + golesPais2);
		    
	         
		    listaPartidos.add(partido);


	}
	 
	
	 public List<Partido> getListaPartidos() {
	        return listaPartidos;
	    }

	public void administrarPartido(Pais pais1, Pais pais2, int indicePartido)  {
	    Partido partido = Partido.generarPartido(pais1, pais2, 0);
	    
	    // Obtener los resultados del partido
	    int golesPais1 = partido.getgolesPais1();
	    int golesPais2 = partido.getgolesPais2();
	    int golesTotalesPartido = partido.getGolesTotales();


	     if (golesPais1 > golesPais2) {
	            pais1.setPuntos(pais1.getPuntos() + 3);
	            // seeteo para apuestas
	         
	        } else if (golesPais1 < golesPais2) {
	            pais2.setPuntos(pais2.getPuntos() + 3);
	            
	            // seeteo para apuestas
	           
	        } else {
	        	// seteo para apuestas
	        	
	            pais1.setPuntos(pais1.getPuntos() + 1);
	            pais2.setPuntos(pais2.getPuntos() + 1);
	        }

	   
	    // Actualizar los goles totales de cada país con los goles del partido actual
	    pais1.setGolesTotales(pais1.getGolesTotales() + golesPais1);
	    pais2.setGolesTotales(pais2.getGolesTotales() + golesPais2);
	    
         
	  
			
	    	  String resultadoPais1 = pais1.getNombre() + ": " + golesPais1 + " - " + pais2.getNombre() + ": " + golesPais2;
	    	  pais1.agregarResultadoPartido(indicePartido, resultadoPais1);
	    	  
	    	  // Agregar el resultado del partido al array partidos del país 2 en la posición indicada por indicePartido
	    	  String resultadoPais2 = pais2.getNombre() + ": " + golesPais2 + " - " + pais1.getNombre() + ": " + golesPais1;
	    	  
	    	  pais2.agregarResultadoPartido(indicePartido, resultadoPais2);
	
	    	  listaPartidos.add(partido);
	  
	       // prueba
	
	
	}
	
	
	public void marcarDosPrimerosClasificados(List<Pais> paises) {
	    // Ordenar los países por puntaje (orden descendente)
	    Collections.sort(paises, Comparator.comparingInt(Pais::getPuntos).reversed());

	    // Marcar los dos primeros países como clasificados
	    if (!paises.isEmpty()) {
	        paises.get(0).setClasificado(true);
	        if (paises.size() > 1) {
	            paises.get(1).setClasificado(true);
	        }
	    }
	}

	public List<Pais> obtenerDosPrimerosClasificados(List<Pais> paises) {
	    List<Pais> dosPrimerosClasificados = new ArrayList<>();
	    for (Pais pais : paises) {
	        if (pais.isClasificado()) {
	            dosPrimerosClasificados.add(pais);
	        }
	    }
	    return dosPrimerosClasificados;
	}
	

	public void mostrarTablaPosicionesOrdenada(List<Pais> paises) {
	    // Ordenar los países por puntaje (orden descendente)
	    Collections.sort(paises, Comparator.comparingInt(Pais::getPuntos).reversed());

	    StringBuilder tabla = new StringBuilder("Tabla de Posiciones:\n");
	    for (Pais pais : paises) {
	        tabla.append(pais.getNombre()).append(": ").append(pais.getPuntos()).append(" puntos\n");
	    }
	    JOptionPane.showMessageDialog(null, tabla.toString());
	}
	
	
	
	public void mostrarPartidosGrupo(List<Pais> paises) {
	    String[] opcionesGrupo = new String[paises.size()];
	    for (int i = 0; i < paises.size(); i++) {
	        opcionesGrupo[i] = paises.get(i).getNombre();
	    }

	    String paisElegido = (String) JOptionPane.showInputDialog(
	        null, "Elegir un país: ", "Ver partidos del Grupo", 
	        JOptionPane.PLAIN_MESSAGE, null, opcionesGrupo, opcionesGrupo[0]
	    );

	    if (paisElegido != null) {
	        Pais paisSeleccionado = null;
	        for (Pais pais : paises) {
	            if (pais.getNombre().equals(paisElegido)) {
	                paisSeleccionado = pais;
	                break;
	            }
	        }
	        if (paisSeleccionado != null) {
	            String[] partidos = paisSeleccionado.getPartidos();
	            StringBuilder listaPartidos = new StringBuilder("Partidos de ").append(paisElegido).append(":\n");
	            
	            // CON ESO MUESTRO LOS 3 PRIMEROS PARTIDOS - SINO MUESTRO TODOS Y NO QUIERO ESO
	            for (int i = 0; i < Math.min(partidos.length, 3); i++) {        
	                if (partidos[i] != null) {
	                    listaPartidos.append(partidos[i]).append("\n");
	                }
	            }
	            
	            JOptionPane.showMessageDialog(null, listaPartidos.toString());
	        }
	    }
	}

	

	
	public void mostrarPartidosOctavos(List<Pais> paises) {
	    do {
	        String[] opcionesGrupo = new String[paises.size() + 1];
	        for (int i = 0; i < paises.size(); i++) {
	            opcionesGrupo[i] = paises.get(i).getNombre();
	        }
	        opcionesGrupo[paises.size()] = "Salir";

	        String paisElegido = (String) JOptionPane.showInputDialog(
	            null, "Elegir una opcion", "Octavos de final", 
	            JOptionPane.PLAIN_MESSAGE, null, opcionesGrupo, opcionesGrupo[0]
	        );

	        if (paisElegido != null) {
	            if (paisElegido.equals("Salir")) {
	                break;
	            }

	            Pais paisSeleccionado = null;
	            for (Pais pais : paises) {
	                if (pais.getNombre().equals(paisElegido)) {
	                    paisSeleccionado = pais;
	                    break;
	                }
	            }
	            if (paisSeleccionado != null) {
	                String[] partidos = paisSeleccionado.getPartidos();
	                if (partidos.length > 3 && partidos[3] != null) { // aca verifico que existe la posicion  4
	                    String partidoSeleccionado = partidos[3];
	                    JOptionPane.showMessageDialog(
	                        null, "Partido de " + paisElegido + ":\n" + partidoSeleccionado
	                    );
	                } else {
	                    JOptionPane.showMessageDialog(
	                        null, "Error de que no tiene indice en el string array"
	                    );
	                }
	            }
	        } else {
	            break; // Si el usuario cierra la ventana o hace clic en 'Cancelar', salimos del ciclo
	        }
	    } while (true);
	}


	public void mostrarPartidosCuartos(List<Pais> paises) {
	    do {
	        String[] opcionesGrupo = new String[paises.size() + 1];
	        for (int i = 0; i < paises.size(); i++) {
	            opcionesGrupo[i] = paises.get(i).getNombre();
	        }
	        opcionesGrupo[paises.size()] = "Salir";

	        String paisElegido = (String) JOptionPane.showInputDialog(
	            null, "Elegir una opcion", "Cuartos de final", 
	            JOptionPane.PLAIN_MESSAGE, null, opcionesGrupo, opcionesGrupo[0]
	        );

	        if (paisElegido != null) {
	            if (paisElegido.equals("Salir")) {
	                break;
	            }

	            Pais paisSeleccionado = null;
	            for (Pais pais : paises) {
	                if (pais.getNombre().equals(paisElegido)) {
	                    paisSeleccionado = pais;
	                    break;
	                }
	            }
	            if (paisSeleccionado != null) {
	                String[] partidos = paisSeleccionado.getPartidos();
	                if (partidos.length > 4 && partidos[4] != null) { // aca verifico que existe la posicion  5
	                    String partidoSeleccionado = partidos[4];
	                    JOptionPane.showMessageDialog(
	                        null, "Partido de " + paisElegido + ":\n" + partidoSeleccionado
	                    );
	                } else {
	                    JOptionPane.showMessageDialog(
	                        null, "Error de que no tiene indice en el string array"
	                    );
	                }
	            }
	        } else {
	            break; // Si el usuario cierra la ventana o hace clic en 'Cancelar', salimos del ciclo
	        }
	    } while (true);
	}

	public void mostrarPartidosSemiFinal(List<Pais> paises) {
	    do {
	        String[] opcionesGrupo = new String[paises.size() + 1];
	        for (int i = 0; i < paises.size(); i++) {
	            opcionesGrupo[i] = paises.get(i).getNombre();
	        }
	        opcionesGrupo[paises.size()] = "Salir";

	        String paisElegido = (String) JOptionPane.showInputDialog(
	            null, "Elegir una opcion", "Semifinal", 
	            JOptionPane.PLAIN_MESSAGE, null, opcionesGrupo, opcionesGrupo[0]
	        );

	        if (paisElegido != null) {
	            if (paisElegido.equals("Salir")) {
	                break;
	            }

	            Pais paisSeleccionado = null;
	            for (Pais pais : paises) {
	                if (pais.getNombre().equals(paisElegido)) {
	                    paisSeleccionado = pais;
	                    break;
	                }
	            }
	            if (paisSeleccionado != null) {
	                String[] partidos = paisSeleccionado.getPartidos();
	                if (partidos.length > 5 && partidos[5] != null) { // aca verifico que existe la posicion  5
	                    String partidoSeleccionado = partidos[5];
	                    JOptionPane.showMessageDialog(
	                        null, "Partido de " + paisElegido + ":\n" + partidoSeleccionado
	                    );
	                } else {
	                    JOptionPane.showMessageDialog(
	                        null, "Error de que no tiene indice en el string array"
	                    );
	                }
	            }
	        } else {
	            break; // Si el usuario cierra la ventana o hace clic en 'Cancelar', salimos del ciclo
	        }
	    } while (true);
	}
	

	public void mostrarPartidosFinal(List<Pais> paises) {
		
	    do {
	        String[] opcionesGrupo = new String[paises.size() + 1];
	        for (int i = 0; i < paises.size(); i++) {
	            opcionesGrupo[i] = paises.get(i).getNombre();
	        }
	        opcionesGrupo[paises.size()] = "Salir";

	        String paisElegido = (String) JOptionPane.showInputDialog(
	            null, "Elegir una opcion", "Final", 
	            JOptionPane.PLAIN_MESSAGE, null, opcionesGrupo, opcionesGrupo[0]
	        );

	        if (paisElegido != null) {
	            if (paisElegido.equals("Salir")) {
	                break;
	            }

	            Pais paisSeleccionado = null;
	            for (Pais pais : paises) {
	                if (pais.getNombre().equals(paisElegido)) {
	                    paisSeleccionado = pais;
	                    break;
	                }
	            }
	            if (paisSeleccionado != null) {
	                String[] partidos = paisSeleccionado.getPartidos();
	                if (partidos.length > 6 && partidos[6] != null) { // aca verifico que existe la posicion  5
	                    String partidoSeleccionado = partidos[6];
	                    JOptionPane.showMessageDialog(
	                        null, "Partido de " + paisElegido + ":\n" + partidoSeleccionado
	                    );
	                } else {
	                    JOptionPane.showMessageDialog(
	                        null, "Error de que no tiene indice en el string array"
	                    );
	                }
	            }
	        } else {
	            break; // Si el usuario cierra la ventana o hace clic en 'Cancelar', salimos del ciclo
	        }
	    } while (true);
	}
	
	public void partidoFinal(Pais pais1, Pais pais2, int indicePartido) {
		 Partido partido = Partido.generarPartido(pais1, pais2, 0);
       
		    // Obtener los resultados del partido
		    int golesPais1 = partido.getgolesPais1();
		    int golesPais2 = partido.getgolesPais2();
		    int golesTotalesPartido = partido.getGolesTotales();
		    
		    // GOLES DE TIEMPO SUPLMENTARIO
		    int golesSuplementarioPais1 = (int)(Math.random()*3+1);
		    int golesSuplementarioPais2 = (int)(Math.random()*3+1);
		    //GOLES DE PENALES
		    int golesPenalesPais1 = (int)(Math.random()*5+1);
		    int golesPenalesPais2 = (int)(Math.random()*5+1);
		    //
		    int sumaGoles1 = golesPais1;
		    int sumaGoles2 = golesPais2;
		    int maxDuracion = 90;


		 
           
		    if (golesPais1 == golesPais2) {
		     
		  
		        golesSuplementarioPais1 = (int)(Math.random() * 3 + 1);
		        golesSuplementarioPais2 = (int)(Math.random() * 3 + 1);
		        sumaGoles1 += golesSuplementarioPais1;
		        sumaGoles2 += golesSuplementarioPais2;
		        
		        // Si aún hay empate después del tiempo suplementario, se van a penales
		        if (sumaGoles1 == sumaGoles2) {
		     
		              partido.setPenales1(golesPenalesPais1);
		              partido.setPenales2(golesPenalesPais2);
		            String resultadoPenales = "Resultado Final "+ "\n" + pais1.getNombre() + " " +sumaGoles1+"("+ partido.getPenales1()+")" + " vs " + pais2.getNombre() + " " +sumaGoles2+"("+partido.getPenales2()+")" + "\nEstadio Lusail" ;
		            		 pais1.agregarResultadoPartido(indicePartido, resultadoPenales);
		            		 pais2.agregarResultadoPartido(indicePartido, resultadoPenales);
		            if (golesPenalesPais1 > golesPenalesPais2) {
		            //	JOptionPane.showMessageDialog(null, pais1.getNombre() +  " Es el campeon de Qatar 2022" +"\nEstadio Lusail");
		                pais2.setClasificado(false);
		                pais1.setClasificado(true);
		               
		            } else if (golesPenalesPais1 < golesPenalesPais2) {
		           // 	JOptionPane.showMessageDialog(null, pais2.getNombre() + " Es el campeon de Qatar 2022" + "\nEstadio Lusail");
		                pais1.setClasificado(false);
		                pais2.setClasificado(true);
		            } 
		        } else {
		            // Si hay un ganador después del tiempo suplementario, se muestra el resultado final
		            
		            String resultado120min = "Resultado Final " + "\n" + pais1.getNombre() + " " + sumaGoles1 + " vs " + pais2.getNombre() + " " + sumaGoles2 + "\nDuracion del partido: " + (maxDuracion + 30) + " minutos." + "\nEstadio Lusail";
		            		 pais1.agregarResultadoPartido(indicePartido, resultado120min);
		            		 pais2.agregarResultadoPartido(indicePartido, resultado120min);
		            if (sumaGoles1 > sumaGoles2) {
		         //   	JOptionPane.showMessageDialog(null, pais1.getNombre() + "Es el campeon de Qatar 2022");
		                pais2.setClasificado(false);
		                pais1.setClasificado(true);
		            } else {
		                pais1.setClasificado(false);
		                pais2.setClasificado(true);
		          //      JOptionPane.showMessageDialog(null, pais2.getNombre() + "Es el campeon de Qatar 2022");
		            }
		        }
		    } else {
		        // Si hay un ganador en tiempo reglamentario, se muestra el resultado final
		        String resultado90min =  "Resultado Final " + "\n" + pais1.getNombre() + " " + golesPais1 + " vs " + pais2.getNombre() + " " + golesPais2 + "\nDuracion del partido: " + maxDuracion + " minutos." + "\nEstadio Lusail";
				        pais1.agregarResultadoPartido(indicePartido, resultado90min);
				        pais2.agregarResultadoPartido(indicePartido, resultado90min);
				        
		     /*   if (golesPais1 > golesPais2) {
		            pais2.setClasificado(false);
		            pais1.setClasificado(true);
		            JOptionPane.showMessageDialog(null, pais1.getNombre() + " Es el campeon de Qatar 2022");
		        } else if (golesPais1 < golesPais2) {
		            pais1.setClasificado(false);
		            pais2.setClasificado(true);
		            JOptionPane.showMessageDialog(null, pais2.getNombre() + " Es el campeon de Qatar 2022");
		        } */
		    }
		    // Actualizar los goles totales de cada país con los goles del partido actual
		    pais1.setGolesTotales(pais1.getGolesTotales() + golesPais1);
		    pais2.setGolesTotales(pais2.getGolesTotales() + golesPais2);
		    listaPartidos.add(partido);
		   
	}
	
	
	
	
	
	
}
