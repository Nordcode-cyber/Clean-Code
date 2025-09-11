package clases.Vehiculo;
public class Vehiculo{
    protected int id;
	protected String matricula;
	protected String marca;
	protected String modelo;

	public Vehiculo() {
		
	}
	public Vehiculo(int id,String matricula,String marca,String modelo) {
		this.id=id;
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
    
}