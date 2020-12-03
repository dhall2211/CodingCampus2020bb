package Ali.ghanmi.com;

public class StundenRechnung3DoubleEingagen {
     public static void main(String[] args) {
            String[][] stunden = SimpleCSVReader.readCSV("C:\\Users\\DCV\\Downloads\\Stunden.csv", ",");
            String[] employee = arrName(stunden);

            int hourSalry = 8;
            for (int j = 0; j < employee.length; j++) {
                double summeStd = 0.0;
                int arbeitsTage = 0;
                for (int k = 1; k < stunden.length; k++) {
                    if (employee[j].equals(stunden[k][0])) {


                        boolean isvalid = isvalid(stunden[k][1]);
                        if (!isvalid) {
                            System.out.println("fehler falsche Eintrag: " + (stunden[k][0])+" "+(stunden[k][1]));
                            stunden[k] = new String[2];
                            continue;

                        }
                        summeStd += Double.parseDouble(stunden[k][1]);
                        arbeitsTage++;


                    }
                }
                if (arbeitsTage > 0) {
                    double Durchschnitt = (summeStd * hourSalry) / arbeitsTage;
                    System.out.println(employee[j] + ":  Stdunden Summe:   " + "  " + summeStd + "\n" +
                            "        TotalLoan: $   " + "     " + summeStd * hourSalry + "\n" +
                            "        Arbeit Tage Summe:  " + arbeitsTage + "\n" +
                            "        Durschnitt Tagslohn: " + Durchschnitt);
                } else {
                    System.out.println(employee[j] + ":      hat nichts gemeldet.");
                }

                System.out.println("========================");

            }
        }


        public static int countMA(String[][] stunden) {
            int countname = 0;
            String namenall = "%";
            for (int i = 1; i < stunden.length; i++) {
                if (namenall.indexOf("%" + stunden[i][0] + "%") < 0) {
                    namenall += stunden[i][0] + "%";
                    countname++;
                }

                //System.out.println(namenall);

            }

            return countname;

        }

        public static String[] arrName(String[][] stunden) {
            int countname = 0;
            String namenall = "#";
            for (int i = 1; i < stunden.length; i++) {
                if (namenall.indexOf("#" + stunden[i][0] + "#") < 0) {
                    namenall += stunden[i][0] + "#";

                }
            }
            String[] list = namenall.substring(1).split("#");


            return list;
        }

        public static boolean isvalid(String value) {
            try {
                Double.parseDouble(value);
                return true;
            } catch (NumberFormatException nfe) {
                return false;
            }
        }

    }


