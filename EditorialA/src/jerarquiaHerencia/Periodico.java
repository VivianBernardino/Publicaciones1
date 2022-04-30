package jerarquiaHerencia;

public class Periodico extends Publicaciones implements Periodicidad
{
    private String editor;
    private String secciones;
    //public String getSecciones;

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getSecciones() {
        return secciones;
    }
    
    public void setSecciones(String seccioness) {
        this.secciones = seccioness;
    }
    
    
}
