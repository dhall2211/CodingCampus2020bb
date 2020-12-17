package Ali.ghanmi.com.ZooGyula.zoo;

import Daniel.Zoo.Veterinary;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<Gehege> gehegeList;
    private Vector<Futter> futterList;
    private Vector<EmployeeZoo> mitarbeiterListe;
    private Vector<Veterinary> veterinarian;



    public Zoo(String name) {
        this.name = name;
        gehegeList = new Vector<>();
        futterList = new Vector<>();
        mitarbeiterListe = new Vector<>();
        veterinarian = new Vector<>();

    }
/*
    public EmployeeZoo searchAndCreateMitarbeiter(String name, Tier tier) {
        EmployeeZoo e = searchAndCreateMitarbeiter(name, tier);
        e.setName(name);
        return e;
    }


 */

    public EmployeeZoo searchAndCreateMitarbeiter(String name,Tier tier, String[] gehege) {
        for (int i = 0; i < mitarbeiterListe.size(); i++) {
            if (mitarbeiterListe.get(i).getName().equals(name)) {
                return mitarbeiterListe.get(i);
            }
        }

        EmployeeZoo emp = new EmployeeZoo(this,name,tier,gehege);
        mitarbeiterListe.add(emp);
        return emp;
    }


    public Futter searchAndCreateFutter(String name, String einheit, int minimalStock) {//
        Futter f = searchAndCreateFutter(name);
        f.setEinheit(einheit);
        f.setFutterImLager(minimalStock);
        return f;
    }

    public Futter searchAndCreateFutter(String name) {
        for (int i = 0; i < futterList.size(); i++) {
            if (futterList.get(i).getName().equals(name)) {
                return futterList.get(i);
            }
        }
        Futter f = new Futter(name, "N.N.",0);
        futterList.add(f);
        return f;

    }
    public Gehege searchAndCreateGehege(String name) {
        for (int i = 0; i < gehegeList.size(); i++) {
            if (gehegeList.get(i).getName().equals(name)) {
                return gehegeList.get(i);
            }
        }
        Gehege g = new Gehege(name);
        gehegeList.add(g);
        return g;
    }

    public Veterinary searchAndCreateVeterinary(String name) {
        // search
        for (var veterinary : veterinarian) {
            if (veterinary.getName().equals(name)) {
                return veterinary;
            }
        }

        // or create
        var veterinary = new Veterinary(name);
        veterinarian.add(veterinary);
        return veterinary;
    }



    public Tier createTier(String gehege, String name, String gattung, String lieblingsFutter, int futterBedarf) {
        return new Tier(this, gehege, name, gattung, lieblingsFutter, futterBedarf);


    }

    public void printStruktur(String prefix) {
        System.out.println(prefix + name);
        System.out.println(prefix + "  Gehege:");
        for (int i = 0; i < gehegeList.size(); i++) {
            gehegeList.get(i).printStruktur(prefix + "    ");
        }
        System.out.println(prefix + "  Futter Tagesbedarf&Lager übersicht\n");
        for (int i = 0; i < futterList.size(); i++) {
            futterList.get(i).printStruktur(prefix + "    ");
        }

        System.out.println(prefix + "Mitarbeiter&Verantwortlichkeit:\n");
        for (int i = 0; i < mitarbeiterListe.size(); i++) {
            mitarbeiterListe.get(i).printStruktur("*" );
        }
        System.out.println("  Tierärzte:");
        for (var veterinary : veterinarian) {
            veterinary.printStruktur("    ");


        }

    }


}