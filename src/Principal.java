
import java.io.File;
import java.util.HashSet;

import java.util.Set;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;


import articventas.Articulo;
import articventas.Cliente;
import articventas.Venta;

public class Principal {

	public static void main(String[] args) {
		crearbd();

	}

	/////////////////////////////////////////
	public static void crearbd() {
		// creaci�n de registros en la BD
		/*File fichero = new File("ARTICVENTAS.DAT");
		if (fichero.delete())
			System.out.println("BD Borrada");
		ODB odb = ODBFactory.open("ARTICVENTAS.DAT");
		// creo los art�culos
		Articulo ar1 = new Articulo(1, "Mesas", 30, (float) 100.5);
		Articulo ar2 = new Articulo(2, "Pupitres", 10, (float) 150.7);
		Articulo ar3 = new Articulo(6, "Cuadernos", 100, (float) 4.5);
		Articulo ar4 = new Articulo(8, "Tabletas", 10, (float) 175.4);
		Articulo ar5 = new Articulo(9, "Bol�grafos", 100, (float) 3.5);
		Articulo ar6 = new Articulo(10, "Lapiceros", 300, (float) 2.5);
		Articulo ar7 = new Articulo(14, "Sillas", 30, (float) 120.5);
		Articulo ar8 = new Articulo(16, "Port�til", 25, (float) 400.5);

		Articulo ar11 = new Articulo(17, "Espejo ba�o", 20, (float) 100.5);
		Articulo ar21 = new Articulo(18, "Reloj cocina", 10, (float) 20.7);
		Articulo ar31 = new Articulo(20, "Tarjetero", 50, (float) 14.5);
		Articulo ar41 = new Articulo(22, "Estuches", 110, (float) 20.4);
		Articulo ar51 = new Articulo(23, "Libro BD", 10, (float) 23.5);
		Articulo ar61 = new Articulo(24, "Tijeras", 30, (float) 5.0);
		Articulo ar71 = new Articulo(25, "Cubiertos", 130, (float) 10.5);
		Articulo ar81 = new Articulo(26, "Teclado", 25, (float) 40.5);

		// Almacenamos art�culos 16 art�culos
		odb.store(ar1);
		odb.store(ar2);
		odb.store(ar3);
		odb.store(ar4);
		odb.store(ar5);
		odb.store(ar6);
		odb.store(ar7);
		odb.store(ar8);
		odb.store(ar11);
		odb.store(ar21);
		odb.store(ar31);
		odb.store(ar41);
		odb.store(ar51);
		odb.store(ar61);
		odb.store(ar71);
		odb.store(ar81);

		// Creo los Clientes 12 clientes, num, nom, pob

		Cliente cli1 = new Cliente(1, "Antonio Ruiz", "Talavera");
		Cliente cli2 = new Cliente(2, "La Alameda S.L.", "Talavera");
		Cliente cli3 = new Cliente(7, "Los molinos CB", "Madrid");
		Cliente cli4 = new Cliente(8, "Pedro Mor�n S.L.", "Talavera");
		Cliente cli5 = new Cliente(12, "Azulejos Mart�n S.L.", "Talavera");
		Cliente cli6 = new Cliente(15, "Bar Girasol", "Oropesa");
		Cliente cli7 = new Cliente(9, "Escuela Mayores", "Talavera");
		Cliente cli8 = new Cliente(17, "Galer�a Madrid S.L.", "Madrid");
		Cliente cli9 = new Cliente(19, "El corte Chino", "Talavera");
		Cliente cli10 = new Cliente(20, "UNICAS S.A.", "Oropesa");
		Cliente cli11 = new Cliente(21, "Deportivo SAS", "Talavera");
		Cliente cli12 = new Cliente(22, "Academia Padel", "Madrid");

		odb.store(cli1);
		odb.store(cli2);
		odb.store(cli3);
		odb.store(cli4);
		odb.store(cli5);
		odb.store(cli6);
		odb.store(cli7);
		odb.store(cli8);
		odb.store(cli9);
		odb.store(cli10);
		odb.store(cli11);
		odb.store(cli12);

		// crear unas ventas

		// ventas para el art�culo 1
		Venta v1 = new Venta(1, cli1, 5, "05/06/2014");
		Venta v2 = new Venta(2, cli2, 4, "15/06/2014");
		Venta v3 = new Venta(3, cli6, 3, "25/06/2014");

		Set<Venta> vvvv = new HashSet<Venta>();
		vvvv.add(v1);
		vvvv.add(v2);
		vvvv.add(v3);
		ar1.setCompras(vvvv);

		// ventas para el art�culo 2
		Venta v4 = new Venta(4, cli6, 5, "03/07/2014");
		Venta v5 = new Venta(5, cli7, 4, "11/08/2014");

		Set<Venta> vv2 = new HashSet<Venta>();
		vv2.add(v4);
		vv2.add(v5);
		ar2.setCompras(vv2);
		// ventas para el art�culo 3
		Venta v6 = new Venta(6, cli1, 3, "25/04/2014");
		Set<Venta> vv3 = new HashSet<Venta>();
		vv3.add(v6);
		ar3.setCompras(vv3);

		// ventas para el art�culo 4
		Venta v7 = new Venta(7, cli10, 3, "15/03/2014");
		Venta v8 = new Venta(8, cli10, 4, "01/05/2014");
		Venta v9 = new Venta(9, cli11, 6, "25/04/2014");
		Venta v10 = new Venta(10, cli12, 2, "20/05/2014");
		Set<Venta> vv4 = new HashSet<Venta>();
		vv4.add(v7);
		vv4.add(v8);
		vv4.add(v9);
		vv4.add(v10);
		ar4.setCompras(vv4);

		// ventas para el art�culo 5
		Venta v11 = new Venta(11, cli1, 1, "10/05/2014");
		Venta v12 = new Venta(12, cli7, 3, "01/06/2014");
		Venta v13 = new Venta(13, cli8, 6, "25/06/2014");
		Venta v14 = new Venta(14, cli9, 5, "10/07/2014");
		Venta v15 = new Venta(15, cli9, 4, "15/09/2014");
		Set<Venta> vv5 = new HashSet<Venta>();
		vv5.add(v11);
		vv5.add(v12);
		vv5.add(v13);
		vv5.add(v14);
		vv5.add(v15);
		ar5.setCompras(vv5);

		odb.store(v1);
		odb.store(v2);
		odb.store(v3);
		odb.store(v4);
		odb.store(v5);
		odb.store(v6);
		odb.store(v7);
		odb.store(v8);
		odb.store(v9);
		odb.store(v10);
		odb.store(v11);
		odb.store(v12);
		odb.store(v13);
		odb.store(v14);
		odb.store(v15);

		odb.store(ar1);
		odb.store(ar2);
		odb.store(ar3);
		odb.store(ar4);
		odb.store(ar5);

		odb.commit();

		odb.close();
		System.out.println("BASE DE DATOS CREADA");*/

	}

}
