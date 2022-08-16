public class Car {

    String color, name, type;
    int speed;

    int hızdüşür(int düşür) {
        if (speed<500) {speed -=düşür;}

        return speed;

    }

    int hızarttır(int arttır) {
        if (speed>0) {speed+= arttır;
        }

        return speed;
    }
    void hızyazdır() {
        System.out.println("Hızınız:"+ speed);
    }

}

