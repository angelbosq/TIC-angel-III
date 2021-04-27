package MiCodigo;

public class Circulo {
	private double radio;
	private ParejaNumeros coordenadasCentro;

	public Circulo(double radio,double centro_x,double centro_y){
		this.setRadio(radio);
		coordenadasCentro=new ParejaNumeros(centro_x,centro_y);
		
		
	}
	double devuelveArea(){
		double area;
		area=(double) (3.1416*getRadio()*getRadio());
		return (area);
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	/**
	 * @return the coordenadasCentro
	 */
	public ParejaNumeros getCoordenadasCentro() {
		return coordenadasCentro;
	}
	/**
	 * @param coordenadasCentro the coordenadasCentro to set
	 */
	public void setCoordenadasCentro(ParejaNumeros coordenadasCentro) {
		this.coordenadasCentro = coordenadasCentro;
	}
	public double getCoordenadaCentroX() {
		return(coordenadasCentro.getNum1());
	}
	public double getCoordenadaCentroY() {
		return(coordenadasCentro.getNum2());
	}
}
