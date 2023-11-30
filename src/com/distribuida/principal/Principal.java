package com.distribuida.principal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosLibreria;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;

public class Principal {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Autor autor = context.getBean("autor",Autor.class);
		Categoria categoria = context.getBean("categoria",Categoria.class);
		Cliente cliente = context.getBean("cliente",Cliente.class);
		DetalleFactura detalleFactura = context.getBean("detalleFactura",DetalleFactura.class);
		Factura factura = context.getBean("factura",Factura.class);
		Libro libro = context.getBean("libro",Libro.class);
		DatosLibreria datosLibreria =context.getBean("datosLibreria",DatosLibreria.class);

    //Datos Cliente		
	    cliente.setIdCliente(1);
	    cliente.setCedula(1755462650);
	    cliente.setNombre("Darwin");
	    cliente.setApellido("Sosa");
	    cliente.setDireccion("Pifo");
	    cliente.setTelefono(990562860);
	    cliente.setCorreo("sosadarwin2002@gmail.com");
	    
	//Datos Libro
	    libro.setIdLibro(12);
	    libro.setTitulo("harry potter y la piedra filosofal");
	    libro.setEditorial("‎Salamandra Infantil y Juvenil");
	    
	    libro.setEdicion("081 edición");
	    libro.setIdioma("Español");
	    libro.setFechaPublicacion("1 Enero 1999");
	    libro.setDescripcion("Libro de historia de magia y fantasia");
	    libro.setTipoPasta("Pasta Dura");
	    libro.setIsbn("ISBN-10: ‎8498387094");
	    libro.setNumEjemplares(14);
	    libro.setPortada("A Color");
	    libro.setPresentacion(null);
	    libro.setPrecio(11.36);
	    
	 //Autor
	    autor.setIdAutor(3);
	    autor.setNombreAutor("Joanne");
	    autor.setApellidoAutor("Rowling​");
	    autor.setPais("ReinoUnido");
	    autor.setDireccion("Inglaterra");
	    autor.setTelefono("32030492389");
	    autor.setCorreo("autor@outlook.com");
	    
	 //Categoria
	    categoria.setIdCategoria(1);
	    categoria.setCategoria("Fantasia");
	    categoria.setDescripcion("Fantasia y magia");
	    
	 //Factura
	    factura.setIdFactura(2);
	    factura.setNumFactura("Factura 003");
	    factura.setFecha("26/11/2023");
	    factura.setTotalNeto(11.36);
	    factura.setIva(0);
	    factura.setTotal(11.36);

	 //DetalleFactura
	    detalleFactura.setIdDetalleFcatura(1);
	    detalleFactura.setCantidad(2);
	    detalleFactura.setSubtotal(22.72);
	    
	 //Imprimer los datos 
	    System.out.println(cliente.toString());
	    System.out.println(libro.toString());
	    System.out.println(autor.toString());
	    System.out.println(categoria.toString());
	    System.out.println(factura.toString());
	    System.out.println(detalleFactura.toString());
	    
	    System.out.println(datosLibreria.toString());

	    context.close();
	}

}
