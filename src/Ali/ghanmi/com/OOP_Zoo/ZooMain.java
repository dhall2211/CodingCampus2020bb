package Ali.ghanmi.com.OOP_Zoo;

public class ZooMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("county Zoo Park");

        Enclosure_gehege Vivarum = new Enclosure_gehege("Vivarum", 1970, 400,20,null,zoo);
        Enclosure_gehege ReptilesWater = new Enclosure_gehege("Wasser reptiles", 1975, 20, 4,Vivarum,zoo);
        Enclosure_gehege ReptilesErth = new Enclosure_gehege("Wasser reptiles", 1976, 40, 40,Vivarum,zoo);
        Enclosure_gehege Marina = new Enclosure_gehege("Ocean&see", 1980, 300, 40,Vivarum, zoo);

        Enclosure_gehege WildAfrika =new Enclosure_gehege("Savana",1970,2000,50,null,zoo);
        Enclosure_gehege WildCatS =new Enclosure_gehege("Raubkatzen",1970,500,10,WildAfrika,zoo);
        Enclosure_gehege Wildsahara =new Enclosure_gehege("Sahara wild",1980,1000,50,WildAfrika,zoo);
        Enclosure_gehege WildZentrallAfrika =new Enclosure_gehege("Zentrall afrika vielfalt",1980,1000,10,WildAfrika,zoo);



        zoo.printZoo("*");
        System.out.println(zoo);
    }
}
