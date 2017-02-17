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

   try(PrintWriter out = new PrintWriter("filename.txt"){
	out.printl(nombre);
        out.printl(pais);
        out.printl(prov);
        out.printl(ciudad);
        out.printl(edad);
	out.printl(doc);
}
	   
}
}
