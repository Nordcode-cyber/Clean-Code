package clases.Vehiculo.test.test;
import clases.Vehiculo.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test_Utilitario {
    public static void main(String[] args) {
    Utilitario util=null;
		Scanner entra = new Scanner(System.in);
		 ArrayList<Utilitario> Lista2 = new ArrayList<Utilitario>();
		int id=0;
		String matricula=null;
		String marca=null;
		String modelo=null;
		int carga=0;
		System.out.println("ingrese id 0-para salir: ");
	    id = entra.nextInt();
	   while(id!=0) {
		   System.out.println("ingrese matricula : ");
	       matricula = entra.next();
		   System.out.println("ingrese marca : ");
	       marca = entra.next();
	       util = new Utilitario(id,matricula,marca,modelo,carga);
	       System.out.println("ingrese modelo : ");
    	   modelo = entra.next();
    	   System.out.println("capacidad de carga: ");
    	   carga = entra.nextInt();
    	   util.setId(id);
    	   util.setMatricula(matricula);
    	   util.setMarca(marca);
    	   util.setModelo(modelo);
    	   util.setCarga(carga);
    	   Lista2.add(util);
    	   System.out.println("Ingrese ID o 0.- para terminar: ");
		     id=entra.nextInt();
		   for (Utilitario f:Lista2) {
			   System.out.println("id del vehiculo: "+f.getId()+"||"+"matricula del vehiculo: "+f.getMatricula()+"||"+"marca del vehiculo: "+f.getMarca()+"||"+
					   "modelo del vehiculo:" + f.getModelo()+"||" +"capacidad de carga: "+f.getCarga());
		   }
    	   

	}
    }
}
