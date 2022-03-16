import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        Factura f=new Factura("PS4",1300, 2, LocalDate.of(2021,10,16), 1);
        Factura f2=new Factura("Nintendo Switch",800, 4, LocalDate.of(2020,06,10), 2);
        Factura f3=new Factura("XBOX ONE",1100, 4, LocalDate.of(2020,06,10), 3);
        Factura f4=new Factura("PC Gamer",1500, 4, LocalDate.of(2022,03,16), 4);

        List<Factura> facturas=new ArrayList<Factura>();
        facturas.add(f);
        facturas.add(f2);
        facturas.add(f3);
        facturas.add(f4);



        System.out.println("Filtro por valor del importe");
        Factura facturaFiltro=facturas.stream()
                .filter(elemento->elemento.getImporte()>1150)
                .findFirst()
                .get();
        System.out.println(facturaFiltro.getImporte());
        System.out.println("\n");



        System.out.println("Filtro por cantidad de productos");
        List<Factura> facturaFiltroCantidad= facturas.stream()
                .filter(elemento -> elemento.getCantidad() == 4)
                .collect(Collectors.toList());
        facturaFiltroCantidad.forEach(System.out::println);



        System.out.println("Filtro por codigo de factura\n");
        Factura filtrarCodigo=facturas.stream()
                .filter(elemento->elemento.getCodigoFactura() == 2)
                .findFirst()
                .orElseThrow();
        System.out.println(filtrarCodigo);



        System.out.println("Filtro por fecha igual a\n");
        List<Factura> filtrarPorFechaIgual= facturas.stream()
                .filter(elemento -> elemento.getFechaFactura()
                        .equals(LocalDate.of(2022, 03, 16)))
                .collect(Collectors.toList());

        filtrarPorFechaIgual.forEach(System.out::println);
        System.out.println("\n");



        System.out.println("Filtro por fecha menor que\n");
        List<Factura> filtrarPorFechaMenor= facturas.stream()
                .filter(elemento -> elemento.getFechaFactura()
                        .isBefore(LocalDate.of(2021, 12, 17)))
                .collect(Collectors.toList());

        filtrarPorFechaMenor.forEach(System.out::println);
        System.out.println("\n");


        
        System.out.println("filtrar por fecha mayor que\n");
        List<Factura> filtrarPorFechaMayor= facturas.stream()
                .filter(elemento -> elemento.getFechaFactura()
                        .isAfter(LocalDate.of(2021, 01, 15)))
                .collect(Collectors.toList());

        filtrarPorFechaMayor.forEach(System.out::println);
        System.out.println("\n");
    }


}
