package MiCodigo;

public class ManejaMascota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mascota miLindoGatito;
		miLindoGatito= new Mascota(" gato", " Silvestre", 1);
		System.out.println("Uy, Uy, mi" + miLindoGatito.getEspecie()+ " hace Uy, Uy");
		System.out.println("y se llama" + miLindoGatito.getNombre());
		miLindaTortuga= new Mascota(" tortuga", " Doc Hudson", 16);
		miLindaTortuga.setCuidados("No estresarla");
		System.out.println(" Mi "+ miLindaTortuga.getEspecie());
		System.out.println(" se llama "+ miLindaTortuga.getNombre());
		System.out.println(" y se conviene")
	}

}
