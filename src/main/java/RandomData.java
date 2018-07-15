
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by surfer on 2017/07/09.
 */
public  class RandomData {

    public enum FoodMenu {
        Sushi, Pizza, Ramen, Tonkatsu, Yakiniku, Pasta,
        Salad, Udon, Somen, Soba, Inari, Burger, Yakitori, Tofu, Sakana;

        private static final List<FoodMenu> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static FoodMenu randomFoodMenu()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }



    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

        private static final List<Month> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Month randomMonth()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;


        private static final List<Day> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Day randomDay()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

    public enum Country {
        JAPAN, FRANCE, INDIA, CANADA, CHILI, BRAZIL, HAWAII;

//        JAPAN, FRANCE, INDIA, CANADA, CHILI, BRAZIL, HAWAII, KOREA, CHINA, US, UK, DE, Australia,
//        Denmark, Egypt, Greece, Mexico, Norway, Poland, Thailand, Vietnam, Zambia;


        private static final List<Country> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Country randomCountry()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

    public enum JapanCity {
        Tokyo, Kyoto, Osaka, Nara;

        private static final List<JapanCity> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static JapanCity randomJapanCity()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

    public enum Group {
        G1, G2, G3, G4, G5;


        private static final List<Group> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Group randomGroup()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }

        public static String randomGroup_100 (Random random_number) {
            String group = "G" + random_number.nextInt(200);
            return group;

        }
    }



    public enum Car {
        car1, car2, car3, car4, car5, car6, car7, car8, car9, car10,
        car11, car12, car13, car14, car15, car16, car17, car18, car19, car20,
        car21, car22, car23, car24, car25, car26, car27, car28, car29, car30;



        private static final List<Car> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Car randomCar()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

    public enum payment_method {
        Cash, credit, BitCoin ;

        private static final List<payment_method> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static payment_method randomPayment_method()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }


    public enum issuer {
        amex, visa, master, jcb ;

        private static final List<issuer> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static issuer randomIssuer()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

}
