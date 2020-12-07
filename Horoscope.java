import java.util.Scanner;

public class Horoscope {
    Scanner scan = new Scanner(System.in);

    public void zodiac() {
        System.out.println("Enter a Month: ");
        String month = scan.nextLine();
        System.out.println("Enter a Day: ");
        int day = scan.nextInt();

        if ((month.equals("December") && day >= 22 && day <= 31) || (month.equals("January") && day >= 1 && day <= 19))
            System.out.println("Your zodiac sign is: Capricorn");
        else if ((month.equals("January") && day >= 20 && day <= 31) || (month.equals("February") && day >= 1 && day <= 17))
            System.out.println("Your zodiac sign is: Aquarius");
        else if ((month.equals("February") && day >= 18 && day <= 29) || (month.equals("March") && day >= 1 && day <= 19))
            System.out.println("Your zodiac sign is: Pisces");
        else if ((month.equals("March") && day >= 20 && day <= 31) || (month.equals("April") && day >= 1 && day <= 19))
            System.out.println("Your zodiac sign is: Aries");
        else if ((month.equals("April") && day >= 20 && day <= 30) || (month.equals("May") && day >= 1 && day <= 20))
            System.out.println("Your zodiac sign is: Taurus");
        else if ((month.equals("May") && day >= 21 && day <= 31) || (month.equals("June") && day >= 1 && day <= 20))
            System.out.println("Your zodiac sign is: Gemini");
        else if ((month.equals("June") && day >= 21 && day <= 30) || (month.equals("July") && day >= 1 && day <= 22))
            System.out.println("Your zodiac sign is: Cancer");
        else if ((month.equals("July") && day >= 23 && day <= 31) || (month.equals("August") && day >= 1 && day <= 22))
            System.out.println("Your zodiac sign is: Leo");
        else if ((month.equals("August") && day >= 23 && day <= 31) || (month.equals("September") && day >= 1 && day <= 22))
            System.out.println("Your zodiac sign is: Virgo");
        else if ((month.equals("September") && day >= 23 && day <= 30) || (month.equals("October") && day >= 1 && day <= 22))
            System.out.println("Your zodiac sign is: Libra");
        else if ((month.equals("October") && day >= 23 && day <= 31) || (month.equals("November") && day >= 1 && day <= 21))
            System.out.println("Your zodiac sign is: Scorpio");
        else if ((month.equals("November") && day >= 22 && day <= 30) || (month.equals("December") && day >= 1 && day <= 21))
            System.out.println("Your zodiac sign is: Sagittarius");
        else
            System.out.println("This is an illegal date!");

        String[] fortunes = {
                "A dubious friend may be an enemy in camouflage.",
                "Your success will astonish everyone.",
                "You will soon be surrounded by good friends and laughter.",
                "Many will travel to hear you speak.",
                "Now is a good time to buy stock.",
                "Physical activity will dramatically improve your outlook today.",
                "Say hello to others. You will have a happier day.",
                "You should be able to undertake and complete anything.",
                "You will be pleasantly surprised tonight.",
                "You will be traveling and coming into a fortune.",
        };

        int one;
        int two;
        int three;

        System.out.println("What's your first name?");
        String name = scan.next();
        one = name.length();

        System.out.println("What's your favorite color?");
        String color = scan.next();
        two = name.length();

        System.out.println("What's your favorite food?");
        String food = scan.next();
        three = name.length();

        int res = one + two +three;
        res = res % fortunes.length;
        System.out.println(fortunes[res]);


    }

}
