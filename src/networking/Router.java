package networking;

public class Router {
    private String nombre;
    private String direccionIP;
    private int cantidadPuertos;
    private boolean activo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        if (direccionIP != null && !direccionIP.trim().isEmpty()) {
            this.direccionIP = direccionIP;
        }
    }

    public int getCantidadPuertos() {
        return cantidadPuertos;
    }

    public void setCantidadPuertos(int cantidadPuertos) {
        if (cantidadPuertos > 0) {
            this.cantidadPuertos = cantidadPuertos;
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void encender() {
        this.activo = true;
    }

    public void apagar() {
        this.activo = false;
    }
}
