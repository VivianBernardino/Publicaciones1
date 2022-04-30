package editoriala;

import java.util.ArrayList;
import java.util.Iterator;
import jerarquiaHerencia.Libro;
import jerarquiaHerencia.Publicaciones;
import jerarquiaHerencia.Revista;
import jerarquiaHerencia.Periodico;

public class ManPublica {
    static ArrayList<Publicaciones> Arrpublica = new ArrayList<Publicaciones>();
    private Libro objLibro;
    private Revista objRevista;
    private Publicaciones objPublicaciones;
    private Periodico objPeriodico;
    
    public ManPublica(String tit, double precio, int np) {
        objPublicaciones = new Publicaciones();
        objPublicaciones.setTitulo(tit);
        objPublicaciones.setPrecio(precio);
        objPublicaciones.setNoPag(np);
    }

    public ManPublica() {
    }
    
    public void alta (String ISBN, String Autor, String edicion)
    {
         objLibro = new Libro();
         objLibro.setTitulo(objPublicaciones.getTitulo());
         objLibro.setPrecio(objPublicaciones.getPrecio());
         objLibro.setNoPag(objPublicaciones.getNoPag());
         objLibro.setAutor(Autor);
         objLibro.setISBN(ISBN);
         objLibro.setEdicion(edicion);
         Arrpublica.add(objLibro);
    }

public void desplegar() {
    System.out.println("...OBJETOS EN LA PUBLICACION...");
     
    Iterator<Publicaciones> itrPublica = Arrpublica.iterator();
    while(itrPublica.hasNext()){
        Publicaciones publica = itrPublica.next();
        if (publica instanceof Libro ){
            Libro book = new Libro();
            book = (Libro)publica;
            System.out.println("-----LIBRO-----");
            System.out.println("Titulo: " + book.getTitulo());
            System.out.println("Precio: " + book.getPrecio());
            System.out.println("No. Paginas: " + book.getNoPag());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Autor: " + book.getAutor());
        }else{
            if(publica instanceof Revista ){
                Revista maga = new Revista();
                maga = (Revista)publica;
                System.out.println("-----REVISTA-----");
                System.out.println("Titulo: " + maga.getTitulo());
                System.out.println("Precio: " + maga.getPrecio());
                System.out.println("No.Pagninas: " + maga.getNoPag());
                System.out.println("ISSN: " + maga.getISSN());
                System.out.println("Número : " + maga.getNumero());
            } else{
                if(publica instanceof Periodico){
                    Periodico newspaper = new Periodico();
                    newspaper = (Periodico)publica;
                    System.out.println("-----PERIODICO-----");
                    System.out.println("Título: " + newspaper.getTitulo());
                    System.out.println("Precio: " + newspaper.getPrecio());
                    System.out.println("No.Pagninas: " + newspaper.getNoPag());
                    System.out.println("Editor: " + newspaper.getEditor());
                    System.out.println("Secciones: " + newspaper.getSecciones());
                    }
                }        
            }        
        }
    }
   
    public void alta (String ISSN, int num)
    {
         objRevista = new Revista();
         objRevista.setTitulo(objPublicaciones.getTitulo());
         objRevista.setPrecio(objPublicaciones.getPrecio());
         objRevista.setNoPag(objPublicaciones.getNoPag());
         objRevista.setNumero(num);
         objRevista.setISSN(ISSN);
         Arrpublica.add(objRevista);
    }
    
    public void alta(String editor, String secciones){
        objPeriodico = new Periodico();
        objPeriodico.setTitulo(objPublicaciones.getTitulo());
        objPeriodico.setPrecio(objPublicaciones.getPrecio());
        objPeriodico.setNoPag(objPublicaciones.getNoPag());
        objPeriodico.setEditor(editor);
        objPeriodico.setSecciones(secciones);
        Arrpublica.add(objPeriodico);
        
        
    }
    public ArrayList datos() {
        return Arrpublica;
    }
}
