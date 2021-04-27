package MiCodigo;

public class ManejaAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno pepe;
		AlumnoBecado juana;
		Fecha nacimientoJuana;
		Fecha nacimientoJose;
		nacimientoJose= new Fecha(14,03,2021);
		nacimientoJuana=new Fecha(1,2,1988);
		juana=new AlumnoBecado ("Juana", "Pérez", "Gonzalez", nacimientoJuana);
		pepe=new Alumno("José", "García", "López", nacimientoJose);
		System.out.println("NUEVO Alummno: ");
		System.out.println(pepe.getNombre());
		System.out.println(pepe.getApellido1());
		System.out.println(pepe.getApellido2());
		System.out.println((pepe.getFechaNacimiento()).getFechaConFormatolargo());
		System.out.println("Alumna becada");
		System.out.println(juana.getNombre());
		System.out.println(juana.getApellido1());
		System.out.println(juana.getApellido2());
		System.out.println(juana.getFechaNacimiento().getFechaConFormatolargo());
		System.out.println("¿Becada?:"+juana.isBeca());
	}
	

}
