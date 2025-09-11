package clases.Vehiculo;

import java.util.ArrayList;

public class Utilitario extends Vehiculo {
    protected int carga;
	private ArrayList<Utilitario> Lista2 = new ArrayList<Utilitario>();
    public Utilitario(int id,String matricula,String marca,String modelo,int carga) {
        super(id,matricula,marca,modelo);
        Lista2 = new ArrayList<Utilitario>();
        this.id=id;
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.carga=carga;
        }
        public int getCarga() {
            return carga;
        }
        public void setCarga(int carga) {
            this.carga=carga;
        }

    
}
