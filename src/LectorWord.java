public class LectorWord extends LectorDocumento {
    public boolean abrirArchivo(String ruta) {
        if (ruta.toLowerCase().endsWith(".docx")) { texto = "Contenido simulado de Word " + ruta; return true; }
        System.out.println("Formato no compatible con Word."); return false;
    }
}
