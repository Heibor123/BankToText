import java.io.PrintWriter;

public class Entry {
    String nombre;
    String pais;
    String prov;
    String ciudad;
    String edad;
    String doc;

    Entry(String nombre_, String pais_, String prov_, String ciudad_, String edad_, String doc_){
	nombre = nombre_;
	pais = pais_;
	prov = prov_;
	ciudad = ciudad_;
	edad = edad_;
	doc = doc_;
    }

    void printToFile(PrintWriter out){
	out.println("-----------------------------------------------");
	out.println("Nombre: " + nombre);
	out.println("País: " + pais);
	out.println("Provincia" + prov);
	out.println("Ciudad" + ciudad);
	out.println("Edad" + edad);
	out.println("Número de Documento: " + doc);
    }
}
