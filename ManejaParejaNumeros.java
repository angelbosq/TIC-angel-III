package MiCodigo;

public class ManejaParejaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParejaNumeros misNumeros;
		int num1=3;
		int num2=5;
		misNumeros= new ParejaNumeros (num1,num2);
		System.out.println("La suma vale ");
		System.out.print(misNumeros.devuelveSuma());
		System.out.println("La resta vale");
		System.out.print(misNumeros.devuelveResta());
		System.out.print("La suma de el numero");
		System.out.print("y el número");
		System.out.print(num2);
		System.out.print("es igual a");
		System.out.print(misNumeros.devuelveSuma());
	}

}
