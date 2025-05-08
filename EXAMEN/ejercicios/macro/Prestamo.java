package macro;

import java.util.Date;

public class Prestamo {
    private String ISBN;
    private String usuario;
    private Date fecha;

    public Prestamo(String ISBN, String usuario, Date fecha) {
        this.ISBN = ISBN;
        this.usuario = usuario;
        this.fecha = fecha;
    }
}
