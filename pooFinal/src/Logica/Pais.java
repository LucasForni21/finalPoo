package Logica;

import java.util.Arrays;

public class Pais {
	
	private String nombre;
	private int golesTotales;
	private int puntos;

	private boolean clasificado;
	private String [] partidos = new String[8];
	
	
	public Pais(String nombre, int golesTotales,int puntos, boolean clasificado, String[] partidos) {
		super();
		this.nombre = nombre;
		this.golesTotales = golesTotales;
		this.puntos = puntos;
	
		this.clasificado = clasificado;
		this.partidos = partidos;
	}
	
	
	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getGolesTotales() {
		return golesTotales;
	}
	public void setGolesTotales(int golesTotales) {
		this.golesTotales = golesTotales;
	}
	public boolean isClasificado() {
		return clasificado;
	}
	public void setClasificado(boolean clasificado) {
		this.clasificado = clasificado;
	}
	public String[] getPartidos() {
		return partidos;
	}
	public void setPartidos(String[] partidos) {
		this.partidos = partidos;
	}


   

	

	

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", golesTotales=" + golesTotales + ", puntos=" + puntos + ",  clasificado=" + clasificado + ", partidos=" + Arrays.toString(partidos) + "]";
	}


	public void agregarResultadoPartido(int indice, String resultado) {
        if (indice >= 0 && indice < partidos.length) {
            partidos[indice] = resultado;
        } else {
           
            System.out.println("Índice de partido inválido.");
        }
    }
	

 
	
	
}
