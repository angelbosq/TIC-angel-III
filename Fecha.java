package MiCodigo;

public class Fecha {
	private int dia;
	private int mes;
	private int anho;
	public Fecha(int dia, int mes, int anho) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anho = anho;
	}
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the anho
	 */
	public int getAnho() {
		return anho;
	}
	/**
	 * @param anho the anho to set
	 */
	public void setAnho(int anho) {
		this.anho = anho;
	}
	
	public String getFechaConFormatolargo() {
		String FechaConFormatolargo;
		FechaConFormatolargo="Zaragoza a " + dia + " del " + mes +  "de" + anho;
		return(FechaConFormatolargo);
		
 	}
	public String getFechaConFormatoCorto() {
		String FechaConFormatoCorto;
		FechaConFormatoCorto= dia + "/" + mes+ "/" + anho;
		return(FechaConFormatoCorto);
	}
}
