public class LectorPDF extends LectorDocumento {
    public boolean abrirArchivo(String ruta) {
        if (ruta.toLowerCase().endsWith(".pdf")) { texto = "Contenido simulado del PDF " + ruta; return true; }
        System.out.println("Formato no compatible con PDF."); return false;
    }
}
