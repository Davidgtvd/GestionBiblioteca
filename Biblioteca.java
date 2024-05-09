import java.util.ArrayList;
import java.util.Date;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private ArrayList<Item> inventario;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.inventario = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void agregarItem(Item item) {
        inventario.add(item);
    }

    public void prestarItem(Item item, Usuario usuario) {

    }

    public void reservarItem(Item item, Usuario usuario) {

    }

    public class Item {
        private String titulo;
        private boolean disponible;

        public Item(String titulo) {
            this.titulo = titulo;
            this.disponible = true;
        }

    }

    public class Prestamo {
        private Date fecha;
        private Usuario usuario;
        private Item item;
        private boolean devuelto;

        public Prestamo(Usuario usuario, Item item) {
            this.fecha = new Date();
            this.usuario = usuario;
            this.item = item;
            this.devuelto = false;
        }

    }

    public class Libro extends Item {
        private String ISBN;

        public Libro(String titulo, String ISBN) {
            super(titulo);
            this.ISBN = ISBN;
        }

    }

    public class Revista extends Item {
        private String ISSN;

        public Revista(String titulo, String ISSN) {
            super(titulo);
            this.ISSN = ISSN;
        }

    }

    public class Multimedia extends Item {
        private int duracion;
        private String formato;

        public Multimedia(String titulo, int duracion, String formato) {
            super(titulo);
            this.duracion = duracion;
            this.formato = formato;
        }

    }

    public interface Usuario {

    }

    public static void main(String[] args) {
    
    }
}
