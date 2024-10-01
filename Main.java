import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date;

        System.out.println("Introduce tu fecha de nacimiento");
        String fecha = teclado.nextLine();

        try {
            date = sdf.parse(fecha);
            if (date.after(sdf.parse("20/03/2002")) && date.before(sdf.parse("21/04/2002"))) {
                System.out.println("ARIES");
            } else if (date.after(sdf.parse("20/04/2002")) && date.before(sdf.parse("21/05/2002"))) {
                System.out.println("TAURO");
            } else if (date.after(sdf.parse("20/05/2002")) && date.before(sdf.parse("21/06/2002"))) {
                System.out.println("GEMINIS");
            } else if (date.after(sdf.parse("20/06/2002")) && date.before(sdf.parse("23/07/2002"))) {
                System.out.println("CANCER");
            } else if (date.after(sdf.parse("22/07/2002")) && date.before(sdf.parse("23/08/2002"))) {
                System.out.println("LEO");
            } else if (date.after(sdf.parse("22/08/2002")) && date.before(sdf.parse("23/09/2002"))) {
                System.out.println("VIRGO");
            } else if (date.after(sdf.parse("22/09/2002")) && date.before(sdf.parse("23/10/2002"))) {
                System.out.println("LIBRA");
            } else if (date.after(sdf.parse("22/10/2002")) && date.before(sdf.parse("23/11/2002"))) {
                System.out.println("ESCORPIO");
            } else if (date.after(sdf.parse("21/11/2002")) && date.before(sdf.parse("22/12/2002"))) {
                System.out.println("SAGITARIO");
            } else if (date.after(sdf.parse("21/12/2002")) && date.before(sdf.parse("20/01/2003"))) {
                System.out.println("CAPRICORNIO");
            } else if (date.after(sdf.parse("19/01/2003")) && date.before(sdf.parse("19/02/2003"))) {
                System.out.println("ACUARIO");
            } else if (date.after(sdf.parse("18/02/2003")) && date.before(sdf.parse("21/03/2003"))) {
                System.out.println("PISCIS");
            }

            Random random = new Random();
            int numero = random.nextInt(3) + 1;

            if (numero == 1) {
                System.out.println("Hoy tendrás buen día");
            } else if (numero == 2) {
                System.out.println("Hoy tendrás un mal día");
            } else if (numero == 3) {
                System.out.println("Hoy tendrás dinero");
            }

        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto");
        }
    }
}
