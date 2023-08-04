package Logica;

import javax.swing.JOptionPane;

public class Partido {
	
	private Pais pais1;
	private Pais pais2;
	private int golesPais1;
	private int golesPais2;
	private int penales1;
	private int penales2;
	private int golesTotales;
	private int duracion;
	private int id;
	private static int contador = 1;
	
	public Partido(Pais pais1, Pais pais2, int golesPais1, int golesPais2,int penales1, int penales2, int golesTotales, int duracion) {
		super();
		this.pais1 = pais1;
		this.pais2 = pais2;
		this.golesPais1 = golesPais1;
		this.golesPais2 = golesPais2;
		this.penales1 = penales1;
		this.penales2 = penales2;
		this.golesTotales = golesTotales;
		this.duracion = duracion;
		this.id = contador++;
	}

	public int getPenales1() {
		return penales1;
	}

	public void setPenales1(int penales1) {
		this.penales1 = penales1;
	}

	public int getPenales2() {
		return penales2;
	}

	public void setPenales2(int penales2) {
		this.penales2 = penales2;
	}

	public Pais getPais1() {
		return pais1;
	}

	public void setPais1(Pais pais1) {
		this.pais1 = pais1;
	}

	public Pais getPais2() {
		return pais2;
	}

	public void setPais2(Pais pais2) {
		this.pais2 = pais2;
	}

	public int getgolesPais1() {
		return golesPais1;
	}

	public void setgolesPais1(int golesPais1) {
		this.golesPais1 = golesPais1;
	}

	public int getgolesPais2() {
		return golesPais2;
	}

	public void setgolesPais2(int golesPais2) {
		golesPais2 = golesPais2;
	}

	public int getGolesTotales() {
		return golesTotales;
	}

	public void setGolesTotales(int golesTotales) {
		this.golesTotales = golesTotales;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Partido [pais1=" + pais1 + ", pais2=" + pais2 + ", golesPais1=" + golesPais1 + ", golesPais2="
				+ golesPais2 + ", golesTotales=" + golesTotales + ", duracion=" + duracion + ", id=" + id + "]";
	}

	
	

	  

	    public static Partido generarPartido(Pais pais1, Pais pais2, int indicePartido) {
	        int golesPais1 = (int) (Math.random() * 5);
	        int golesPais2 = (int) (Math.random() * 5);
	        
	        int golesTotales = golesPais1 + golesPais2;

	        Partido partido = new Partido(pais1, pais2, golesPais1, golesPais2,0,0, golesTotales, 90);
            
        //  JOptionPane.showMessageDialog(null, partido.getId());
	 //       JOptionPane.showMessageDialog(null, "     Resultado: " + pais1.getNombre() +": "+ golesPais1 +  " - " + pais2.getNombre() +": "+ golesPais2 );
	  
	     
	      
	        return partido;
	    }
	    
	    
	    
	    
	
	    



	

}
