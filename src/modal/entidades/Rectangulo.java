package modal.entidades;

import modal.entidades.AbstracFigura;
import modal.enums.Color;
public class Rectangulo extends AbstracFigura {
	private Double largo;
	private Double alto;

	public Rectangulo(Color color, Double largo, Double alto) {
		super(color);
		this.largo = largo;
		this.alto = alto;
	}

	public Double getLargo() {
		return largo;
	}
	public void setLargo(Double largo) {
		this.largo = largo;
	}

	public Double getAlto() {
		return alto;
	}
	public void setAlto(Double alto) {
		this.alto = alto;
	}
	
   @Override
   public double area() {
	   return alto * largo;
   }
   

}
