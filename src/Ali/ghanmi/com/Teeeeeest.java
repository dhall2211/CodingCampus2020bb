package Ali.ghanmi.com;

public class Teeeeeest {
        public static void main(String[] args) {

            String[][] stundenListe = getList();
            int stundenlohn = 8;
            int[] summe = getSumme(stundenListe);
            print(stundenlohn, summe);
        }

        private static void print(int stundenlohn, int[] summe) {
            System.out.println("Peter " + summe[0] * stundenlohn + " €");
            System.out.println("Hans " + summe[1] * stundenlohn + " €");
            System.out.println("Monika " + summe[2] * stundenlohn + " €");
        }

        private static int[] getSumme(String[][] stundenListe) {
            int[] summe = new int[3];
            for (String[] strings : stundenListe) {
                switch (strings[0]) {
                    case "Peter" -> summe[0] += Integer.parseInt(strings[1]);
                    case "Hans" -> summe[1] += Integer.parseInt(strings[1]);
                    case "Monika" -> summe[2] += Integer.parseInt(strings[1]);
                }
            }
            return summe;
        }

        private static String[][] getList() {
            return new String[][]{
                    {"Peter", "15"},
                    {"Hans", "10"},
                    {"Monika", "7"},
                    {"Hans", "6"},
                    {"Peter", "-3"},
                    {"Monika", "2"},
                    {"Monika", "5"},
                    {"Hans", "3"},
                    {"Peter", "7"},
            };
        }
    }


/*

    public static void main(String[] args) {
            /*
            String[] emplyers = getSemplyerlist();
            String[][] hourList = gethourlist();

            int hourSalry = 8;
            int summeStd = 0;
            for (int j = 0; j < emplyers[j].length(); j++) {
                for (int i = 0; i < hourList[i][0].length(); i++) {
                    if (emplyers[j].equals(hourList[i][0])) {
                        summeStd += Integer.parseInt(hourList[i][1]);
                    }
                }
                System.out.println(emplyers[j] + "  Stdunden Summe:  " + summeStd + "  TotalLoan: " + summeStd * hourSalry);
            }

        }

        private static String[] getSemplyerlist() {
            return new String[]{"Daniel", "Alex", "Michael", "Mia", "frank"};
        }

        private static String[][] gethourlist() {
            return new String[][]{{"Daniel", "7"},
                    {"Alex", "9"},
                    {"Michael", "8"},
                    {"Daniel", "5"},
                    {"Daniel", "3"},
                    {"Alex", "7"},
                    {"Michael", "6"},
                    {"Alex", "4"},
                    {"Michael", "5"},
                    {"Mia", "5"},
                    {"Daniel", "55"},};
        }
    }


}
}//////////////////////

        String[] emplyers = {"Daniel", "Alex", "Michael", "frank", "Aleana"};

        String[][] hourlist = {{"Daniel", "7"},
                {"Alex", "8"},
                {"Michael", "10"},
                {"Daniel", "7"},
                {"Daniel", "7"},
                {"Alex", "8"},
                {"Michael", "10"},
                {"Alex", "10"},
                {"Michael", "5"},
                {"Daniel", "7"},};
        int hourSalry = 8;
        int summeStd = 0;
        int summeStdN&auml;chste = 0;

        boolean nameChange = false;
        while (!nameChange) {

            for (int j = 0; j < emplyers[j].length(); j++) {
                System.out.println(emplyers[j]);
                if (!nameChange)
                    for (int i = 0; i < hourlist[i][0].length()-1; i++) {
                        if (emplyers[j].equals(hourlist[i][0])) {
                            summeStd += Integer.parseInt(hourlist[i][1]);
                            System.out.println(emplyers[j] + "  Stdunden Summe:  " + summeStd + "  TotalLoan: " + summeStd * hourSalry);

                        } else if (nameChange) {
                            summeStd = 0;
                        }

                    }

                System.out.println();
                //System.out.println(hourlist[i][0]);
                // System.out.println(hourSum);
                // System.out.println(hourlist[0][1]);
                //System.out.println(hourlist[j]);

            }
        }

    }
}



 */
