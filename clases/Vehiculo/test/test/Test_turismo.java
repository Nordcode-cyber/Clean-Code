package clases.Vehiculo.test.test;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Vehiculo.Turismo;

public class Test_turismo {
    public static void main(String[] args) {
		Turismo tur=null;
		Scanner entra = new Scanner(System.in);
		 ArrayList<Turismo> Lista = new ArrayList<Turismo>();
		int id=0;
		String matricula=null;
		String marca=null;
		String modelo=null;
		int nro_puertas=0;
		int nro_pasajeros=0;
        System.out.println("ingrese id 0-para salir: ");
		    id = entra.nextInt();
		   while(id!=0) {
			   System.out.println("ingrese matricula : ");
		       matricula = entra.next();
			   System.out.println("ingrese marca : ");
		       marca = entra.next();
		       tur = new Turismo(id,matricula,marca,modelo, nro_puertas, nro_pasajeros);
	    	   System.out.println("ingrese modelo : ");
	    	   modelo = entra.next();
	    	   System.out.println("cantida de puertas: ");
	    	   nro_puertas = entra.nextInt();
	    	   System.out.println("cantida de pasajeros: ");
	    	   nro_pasajeros = entra.nextInt();
	    	   tur.setId(id);
	    	   tur.setMatricula(matricula);
	    	   tur.setMarca(marca);
	    	   tur.setModelo(modelo);
	    	   tur.setNro_puertas(nro_puertas);
	    	   tur.setNro_pasajeros(nro_pasajeros);
	    	   Lista.add(tur);
	    	   System.out.println("Ingrese ID o 0.- para terminar: ");
			     id=entra.nextInt();
			   for(Turismo t:Lista) {
				   System.out.println("id del vehiculo: "+t.getId()+"||"+"matricula del vehiculo: "+t.getMatricula()+"||"+"marca del vehiculo: "+t.getMarca()+"||"+
				   "mdelo del vehiculo:" + t.getModelo()+"cantidad de puertas: "+t.getNro_puertas()+"||"+"cantidad de pasajeros: "+"||"+t.getNro_pasajeros());
			   }

    	}

  }
    
}
