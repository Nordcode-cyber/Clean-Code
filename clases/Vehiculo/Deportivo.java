package clases.Vehiculo;
import java.util.List;
import java.util.ArrayList;

public class Deportivo extends Vehiculo {
    protected int cilindrada;
	private ArrayList<Deportivo> Lista1 = new ArrayList<Deportivo>();
	public Deportivo() {
		
	}
public Deportivo(int id,String matricula,String marca,String modelo,int cilindrada) {
	super(id,matricula,marca,modelo);
	Lista1 = new ArrayList<Deportivo>();
	this.id=id;
	this.matricula=matricula;
	this.marca=marca;
	this.modelo=modelo;
	this.cilindrada=cilindrada;
	}
public int getCilindrada() {
	return cilindrada;
}
public void setCilindrada(int cilindrada) {
	this.cilindrada = cilindrada;
}

}
