package Ali.ghanmi.com.ZooGyula.zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<Gehege> gehegeList;
    private Vector<Futter> futterList;
    private Vector<EmployeeZoo> mitarbeiterListe;


    public Zoo(String name) {
        this.name = name;
        gehegeList = new Vector<>();
        futterList = new Vector<>();
        mitarbeiterListe = new Vector<>();

    }
/*
    public EmployeeZoo searchAndCreateMitarbeiter(String name, Tier tier) {
        EmployeeZoo e = searchAndCreateMitarbeiter(name, tier);
        e.setName(name);
        return e;
    }


 */

    public EmployeeZoo searchAndCreateMitarbeiter(String name) {
        for (int i = 0; i < mitarbeiterListe.size(); i++) {
            if (mitarbeiterListe.get(i).getName().equals(name)) {
                return mitarbeiterListe.get(i);
            }
        }

        EmployeeZoo emp = new EmployeeZoo(name);
        mitarbeiterListe.add(emp);
        return emp;
    }


    public Futter searchAndCreateFutter(String name, String einheit) {
        Futter f = searchAndCreateFutter(name);
        f.setEinheit(einheit);
        return f;
    }

    public Futter searchAndCreateFutter(String name) {
        for (int i = 0; i < futterList.size(); i++) {
            if (futterList.get(i).getName().equals(name)) {
                return futterList.get(i);
            }
        }
        Futter f = new Futter(name, "N.N.");
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

    public Tier createTier(String gehege, String name, String gattung, String lieblingsFutter, int futterBedarf, String Verantwortlich) {
        return new Tier(this, gehege, name, gattung, lieblingsFutter, futterBedarf,Verantwortlich);
    }

    public void printStruktur(String prefix) {
        System.out.println(prefix + name);
        System.out.println(prefix + "  Gehege:");
        for (int i = 0; i < gehegeList.size(); i++) {
            gehegeList.get(i).printStruktur(prefix + "    ");
        }
        System.out.println(prefix + "  Futter Tagesbedarf:");
        for (int i = 0; i < futterList.size(); i++) {
            futterList.get(i).printStruktur(prefix + "    ");
        }
        System.out.println(prefix + " Mitarbeiter Verantwortlichkeit:");
        for (int i = 0; i < mitarbeiterListe.size(); i++) {
            mitarbeiterListe.get(i).printStruktur("**" );
        }
    }
}