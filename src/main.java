public class main {
    public static void main(String[] args) {
        LectorDocumento lector = new LectorPDF();
        if (lector.abrirArchivo("informe.pdf")) System.out.println(lector.extraerTexto());
        lector = new LectorWord();
        if (lector.abrirArchivo("contrato.docx")) System.out.println(lector.extraerTexto());
        lector = new LectorTextoPlano();
        if (lector.abrirArchivo("notas.txt")) System.out.println(lector.extraerTexto());
    }
}
