package networking;

public class MainRouter {
    public static void main(String[] args) {
        Router router = new Router();
        router.setNombre("Router Core");
        router.setDireccionIP("192.168.1.1");
        router.setCantidadPuertos(24);
        router.encender();

        System.out.println("\n--- PROYECTO 3: ROUTER ---");
        System.out.println("Nombre: " + router.getNombre());
        System.out.println("IP: " + router.getDireccionIP());
        System.out.println("Puertos: " + router.getCantidadPuertos());
        System.out.println("¿Activo?: " + router.isActivo());
    }
}
