public class LectorTextoPlano extends LectorDocumento {
    public boolean abrirArchivo(String ruta) {
        if (ruta.toLowerCase().endsWith(".txt")) { texto = "Contenido simulado de texto " + ruta; return true; }
        System.out.println("Formato no compatible con TXT."); return false;
    }
}
