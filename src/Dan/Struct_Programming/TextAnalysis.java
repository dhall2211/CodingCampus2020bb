

/*
Ein langer String über Hermann Hesse


_ Anzahl Characters
_ Anzahl “echte” (ausgesprochen) Characters
_ Anzahl Wörter
_ Kürzeste / Längste Wort
_ Anzahl vorkommen von Wort “Hesse”
_ Anzahl Wörter mit ausschließlich klein oder GROßBUCHSTABEN

 */
public class TextAnalysis {

    private final static String text = "Zur Zeit des Zweiten Weltkriegs waren seine großen Werke Siddhartha und Der Steppenwolf noch verboten. Heute gehört Hermann Hesse zu den bekanntesten deutschen Schriftstellern. Mehr über den Weltveränderer lest ihr hier\n" +
            "Hermann Hesse\n" +
            "\n" +
            "Hermann Hesse erhielt den Nobelpreis für Literatur\n" +
            "Hermann Hesse: Kurz-Steckbrief\n" +
            "\n" +
            "    Vollständiger Name: Hermann Karl Hesse\n" +
            "    Lebensdaten: 2. Juli 1877 bis 9. August 1962\n" +
            "    Nationalität: deutsch, später schweizerisch\n" +
            "    Zitat: \"Wenn wir einen Menschen glücklicher und heiterer machen können, so sollten wir es auf jeden Fall tun, mag er uns darum bitten oder nicht.\"\n" +
            "\n" +
            "Als Schriftsteller, Dichter und Maler prägte Hermann Hesse die Literatur und Kunst des 19. Jahrhunderts.\n" +
            "Wie Hermann Hesse lebte\n" +
            "\n" +
            "Hermann Hesse wurde am 2. Juli 1877 in Calw, einer Stadt in Württemberg geboren. Seine Familie war sehr religiös, der Vater Johannes sogar Missionar, also so genannter \"Gesandter\", der seinen Glauben weiterverbreiten wollte.\n" +
            "\n" +
            "So sollten auch die Kinder in die Fußstapfen der religiösen Eltern treten. Hesse war davon aber gar nicht begeistert und soll einmal gesagt haben, dass er \"entweder Dichter oder gar nichts werden\" wolle.\n" +
            "\n" +
            "1893 verließ der junge Hesse das Gymnasium mit dem Abschluss der Mittleren Reife. Danach schloss er zwei Lehren ab: eine als Turmuhrenmechaniker und eine als Buchhändler.\n" +
            "\n" +
            "Gegen den Willen seiner Eltern ließ er sich in der Schweizer Stadt Basel nieder, um seinem Traum vom Dichter-Dasein näher zu kommen. 1899 veröffentlichte er seine erste Lyriksammlung. In dieser Zeit heiratete er auch seine erste Frau Maria Bernoulli, von der er sich aber 15 Jahre später wieder trennte. Aus der Ehe gingen drei Söhne hervor.\n" +
            "\n" +
            "Zwölf Jahre lang ist Adolf Hitler Deutschlands Reichskanzler. Viele Menschen sind damals von ihm begeistert, doch es wird eine Schreckensherrschaft. Wir haben die Geschichte des Nationalsozialismus auf dieser Themenseite für euch zusammengefasst\n" +
            "\n" +
            "\n" +
            "Wie Hermann Hesse die Welt veränderte\n" +
            "\n" +
            "Um das Jahr 1904 gelang ihm der Durchbruch. Der Roman \"Peter Camenzind\" stimmt an vielen Stellen mit Hesses Leben überein. Literatur-Experten handeln das Werk als \"Beginn des modernen Bildungsromans\". Auf den ersten großen Erfolg folgten weitere beeindruckende Erzählungen und Romane.\n" +
            "\n" +
            "1914, als der erste Weltkrieg begann, meldete sich der Schriftsteller zum Militärdienst für das Deutsche Reich. Aufgrund seiner Kurzsichtigkeit wurde er aber ausgemustert und der deutschen Kriegsgefangenenfürsorge zugeteilt. Seine Aufgabe war es, für die Gefangenen Bücher zu sammeln. Außerdem leitete er die \"Bücherei für deutsche Kriegsgefangene\".\n" +
            "\n" +
            "Diese Erfahrungen prägten Hesse sehr. In vielen seiner folgenden Texte sprach er sich deutlich gegen Krieg und Patriotismus (\"Vaterlandsliebe\") aus. Zusätzlich belasteten ihn familiäre Schicksalsschläge: 1916 starb sein Vater, sein Sohn litt an einer schweren Erkrankung und seine Ehe mit Bernoulli ging in die Brüche. Das ging Hesse so nahe, dass er eine Therapie machte. In dieser Phase seines Lebens widmete er sich auch erstmals der Malerei.\n" +
            "\n" +
            "Innerhalb kurzer Zeit heiratete er daraufhin zweimal: 1924 Ruth Wenger, die Tochter einer bekannten Schriftstellerin, 1931 die Kunsthistorikerin Ninon Dolbin. Gleichzeitig begann der Zweite Weltkrieg. Die Nationalsozialisten erklärten seine Werke als volksfeindlich und verbaten beispielsweise \"Unterm Rad\", \"Der Steppenwolf\" und \"Betrachtungen\". Hesses Verleger Peter Suhrkamp wurde 1944 sogar verhaftet.\n" +
            "\n" +
            "Hermann Hesse ließ sich den Mund aber nicht verbieten: Weiterhin schrieb er Regime-kritische Texte, also Texte, die die nationalsozialistische Herrschaft unter Adolf Hitler angriffen. Nach dem Zweiten Weltkrieg wurden diese dann auch veröffentlicht.\n" +
            "\n" +
            "Er hasste den Krieg. In seinem Testament widmete der Physiker und Chemiker Alfred Nobel sein Vermögen unter anderem der Vergabe des jährlichen Friedenspreises\n" +
            "Hermann Hesses Tod in der Schweiz\n" +
            "\n" +
            "1946 zog sich Hesse zurück, da sein Gesundheitszustand immer schlechter wurde. \"Das Glasperlenspiel\" und \"Krieg und Frieden\" waren Anlass dafür, dass er am 14. November desselben Jahres mit dem Nobelpreis für Literatur ausgezeichnet wurde. Für sein Lebenswerk wurde er ein Jahr später zum Ehrendoktor sowie Ehrenbürger von Calw, seiner Geburtsstadt, ernannt. 1955 folgte der Friedenspreis des Deutschen Buchhandels.\n" +
            "\n" +
            "Am 9. August 1962 starb Hermann Hesse an einem Gehirnschlag in seinem Haus in der Schweiz. Heute gehört Hermann Hesse zu denbekanntesten deutschsprachigenr Schriftstellern. Seine Werke wurden in 55 Sprachen übersetzt.\n" +
            "Zitate von Hermann Hesse\n" +
            "\n" +
            "\"Man muß das Unmögliche versuchen, um das Mögliche zu erreichen.\"\n" +
            "Hermann Hesse\n" +
            " \n" +
            "\n" +
            "\"Man braucht vor niemand Angst zu haben. Wenn man jemanden fürchtet, dann kommt es daher, daß man diesem Jemand Macht über sich eingeräumt hat.\"\n" +
            "Hermann Hesse, Demian\n" +
            " \n" +
            "\n" +
            "\"Man hat nur Angst, wenn man mit sich selber nicht einig ist.\"\n" +
            "Hermann Hesse, Demian\n" +
            " \n" +
            "\n" +
            "\"Recht als wolle es ihn mit der Nase darauf stoßen, hatte sein Glück ihm diese prächtige Figur in seinen Weg gestellt, daß er sich an sie halte. Aber der Mensch ist zu nichts schwerer zu bringen als zu seinem Glück.\"\n" +
            "Hermann Hesse, Der Weltverbesserer\n" +
            " \n" +
            "\n" +
            "\"Wenn wir einen Menschen glücklicher und heiterer machen können, so sollten wir es in jedem Fall tun, mag er uns darum bitten oder nicht.\"\n" +
            "Hermann Hesse, Das Glasperlenspiel\n" +
            " \n" +
            "\n" +
            "\"Die Welt zu durchschauen, sie zu verachten, mag großer Denker Sache sein. Mir aber liegt einzig daran, die Welt lieben zu können, sie und mich und alle Wesen mit Liebe und Bewunderung und Ehrfurcht betrachten zu können.\"\n" +
            "Hermann Hesse";

    public static void main(String [] arg) {
        StringBuilder str = new StringBuilder(text);
        System.out.println("length = " + str.length());
        char [] character = text.toCharArray();
        String strrr = new String (character);
        String [] myarray = strrr.split("");

        int counter = 0;
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i].matches("[a-zA-Z0-9]*")) {
                counter++;

            }
        }
        System.out.println(counter);

        String [] wordArr = text.split("\\s+");
        int words= wordArr.length;
        System.out.println(words);








    }
}

