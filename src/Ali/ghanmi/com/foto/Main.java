package ghanmi.com.foto;

public class Main {
    public static void main(String[] args) {
        FotoApparat fotoapp = new FotoApparat("Canon", "EOA250", 12345678, "EOS 250D EF-S 18-55 mm/75-300", "Japan",
                "Black", 24, 25000, "4K", 7.62, 55, 449, 9.26, 12.24, 6.68);

        printfotoapp(fotoapp);

        System.out.println(fotoapp);
    }

    public static void printfotoapp(FotoApparat fotoApparat) {
        System.out.printf("%-10s %-10s %-10d %-10sn", fotoApparat.getBrand(), fotoApparat.getArtikelbezeichnung(), fotoApparat.getMegapixel(), fotoApparat.getVideoauflösung());
    }
}
