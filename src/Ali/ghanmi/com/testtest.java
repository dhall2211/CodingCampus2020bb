package Ali.ghanmi.com;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;


public class testtest {

    /**
     * @author hütte
     */


        private String nam;
        private String str;
        private String plz;
        private String ort;
        private String geb;
        private static final Pattern nam_ort_pat = Pattern.compile("^[a-zA-Z \\-]+$");
        private static final Pattern str_pat     = Pattern.compile("^[a-zA-Z]+ \\d+$");
        private static final Pattern plz_pat     = Pattern.compile("^\\d{5}$");
        private static final Pattern geb_pat     = Pattern.compile("^\\d{2}\\.\\d{2}\\.\\d{4}$");

        public testtest(String nam, String str, String plz, String ort, String geb) {
            setNam(nam);
            setStr(str);
            setPlz(plz);
            setOrt(ort);
            setGeb(geb);
        }

        public String getNam() {
            return nam;
        }

        public final void setNam(String nam) {
            if (!nam_ort_pat.matcher(nam).find()) {
                throw new IllegalArgumentException(nam);
            }
            this.nam = nam;
        }

        public String getStr() {
            return str;
        }

        public final void setStr(String str) {
            if (!str_pat.matcher(str).find()) {
                throw new IllegalArgumentException(str);
            }
            this.str = str;
        }

        public String getPlz() {
            return plz;
        }

        public final void setPlz(String plz) {
            if (!plz_pat.matcher(plz).find()) {
                throw new IllegalArgumentException(plz);
            }
            this.plz = plz;
        }

        public String getOrt() {
            return ort;
        }

        public final void setOrt(String ort) {
            if (!nam_ort_pat.matcher(ort).find()) {
                throw new IllegalArgumentException(ort);
            }
            this.ort = ort;
        }

        public String getGeb() {
            return geb;
        }

        public final void setGeb(String geb) {
            if (!geb_pat.matcher(geb).find()) {
                throw new IllegalArgumentException(geb);
            }
            this.geb = geb;
        }

        @Override
        public String toString() {
            return "Adresse{" + "nam=" + nam + ", str=" + str + ", plz=" + plz + ", ort=" + ort + ", geb=" + geb + '}';
        }

        public static void main(String[] args) {
            // Menü basteln, evtl. neue Klasse für Liste
            List<testtest> adressen = Arrays.asList(
                    new testtest("Max Muster", "MStrasse 99", "12345", "aaaaa", "01.01.1970"),
                    new testtest("Max MuStEr", "MStrasse 66", "67890", "MStAdT", "02.01.1970"));
            for (testtest adresse : adressen) {
                System.out.println("adresse = " + adresse);
            }
        }
    }

