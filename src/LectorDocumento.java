public abstract class LectorDocumento {
    protected String texto = "";
    public abstract boolean abrirArchivo(String ruta);
    public String extraerTexto() { return texto; }
}
