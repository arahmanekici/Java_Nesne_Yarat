public class Main {
    public static void Main (String[] args) {

        Car audi = new Car();
        Car bmw = new Car();
        Car supra = new Car();


        audi.speed = 250;
        bmw.speed = 310;
        supra.speed = 420;

        supra.color= "Blood Red";
        bmw.color= "Night Dark";
        audi.color= "Cute White";

        supra.type = "Sport";
        audi.type = "Sedan";
        bmw.type = "Sport";

        System.out.println("Audi' nin özellikleri: ");
        System.out.println("Hızı:"+audi.speed+" Rengi: "+ audi.color+ "Kasa tipi: "+ audi.type);


        System.out.println("bmw' nin özellikleri: ");
        System.out.println("Hızı:"+bmw.speed+" Rengi: "+ bmw.color+ "Kasa tipi: "+ bmw.type);

        System.out.println("supra' nin özellikleri: ");
        System.out.println("Hızı:"+supra.speed+" Rengi: "+ supra.color+ "Kasa tipi: "+ supra.type);



        audi.hızarttır(50);
        System.out.println("Audi' nin özellikleri: ");
        System.out.println("Hızı:"+audi.speed+" Rengi: "+ audi.color+ "Kasa tipi: "+ audi.type);

        bmw.hızarttır(20);
        System.out.println("bmw' nin özellikleri: ");
        System.out.println("Hızı:"+bmw.speed+" Rengi: "+ bmw.color+ "Kasa tipi: "+ bmw.type);

        supra.hızarttır(100);
        System.out.println("supra' nin özellikleri: ");
        System.out.println("Hızı:"+supra.speed+" Rengi: "+ supra.color+ "Kasa tipi: "+ supra.type);


        audi.hızdüşür(200);
        System.out.println("Audi' nin özellikleri: ");
        System.out.println("Hızı:"+audi.speed+" Rengi: "+ audi.color+ "Kasa tipi: "+ audi.type);

        bmw.hızdüşür(200);
        System.out.println("bmw' nin özellikleri: ");
        System.out.println("Hızı:"+bmw.speed+" Rengi: "+ bmw.color+ "Kasa tipi: "+ bmw.type);

        supra.hızdüşür(200);
        System.out.println("supra' nin özellikleri: ");
        System.out.println("Hızı:"+supra.speed+" Rengi: "+ supra.color+ "Kasa tipi: "+ supra.type);






    }

}
