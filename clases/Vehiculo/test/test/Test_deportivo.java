package clases.Vehiculo.test.test;
import clases.Vehiculo.Deportivo;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Test_deportivo {
    public static void main(String[] args) {
        Deportivo dep=null;
		Scanner entra = new Scanner(System.in);
		 ArrayList<Deportivo> Lista1 = new ArrayList<Deportivo>();
		int id=0;
		String matricula=null;
		String marca=null;
		String modelo=null;
		int cilindrada =0;
		System.out.println("ingrese id 0-para salir: ");
	    id = entra.nextInt();
	   while(id!=0) {
		   System.out.println("ingrese matricula : ");
	       matricula = entra.next();
		   System.out.println("ingrese marca : ");
	       marca = entra.next();
	       dep = new Deportivo(id,matricula,marca,modelo, cilindrada);
	       System.out.println("ingrese modelo : ");
    	   modelo = entra.next();
    	   System.out.println("cuantas cilindradas: ");
    	   cilindrada = entra.nextInt();
    	   dep.setId(id);
    	   dep.setMatricula(matricula);
    	   dep.setMarca(marca);
    	   dep.setModelo(modelo);
    	   dep.setCilindrada(cilindrada);
    	   Lista1.add(dep);
    	   System.out.println("Ingrese ID o 0.- para terminar: ");
		     id=entra.nextInt();
		   for(Deportivo d:Lista1) {
			   System.out.println("id del vehiculo: "+d.getId()+"||"+"matricula del vehiculo: "+d.getMatricula()+"||"+"marca del vehiculo: "+d.getMarca()+"||"+
			   "modelo del vehiculo:" + d.getModelo()+"||"+"cilindradas: "+d.getCilindrada());
		   }
	    }
    }
    
}
