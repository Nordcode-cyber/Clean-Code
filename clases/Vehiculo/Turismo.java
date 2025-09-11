package clases.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Turismo extends Vehiculo {
    protected int nro_puertas;
	protected int nro_pasajeros;
	private ArrayList<Turismo> Lista = new ArrayList<Turismo>();
public Turismo(int id,String matricula,String marca,String modelo,int nro_puertas,int nro_pasajeros) {
	super(id,matricula,marca,modelo);
	Lista = new ArrayList<Turismo>();
	this.id=id;
	this.matricula=matricula;
	this.marca=marca;
	this.modelo=modelo;
	this.nro_puertas=nro_puertas;
	this.nro_pasajeros=nro_pasajeros;
	
	}

public int getNro_puertas() {
	return nro_puertas;
}
public void setNro_puertas(int nro_puertas) {
	this.nro_puertas = nro_puertas;
}
public int getNro_pasajeros() {
	return nro_pasajeros;
}
public void setNro_pasajeros(int nro_pasajeros) {
	this.nro_pasajeros = nro_pasajeros;
}
    
}
