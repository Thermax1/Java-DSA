import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();

//        int x = random.nextInt(6)+1; //goes from 0 to 5. Add 1 to make it 1 to 6

//        double y = random.nextDouble();

        boolean z = random.nextBoolean(); //true or false
        System.out.println(z); //from 0 to 1
    }
}
