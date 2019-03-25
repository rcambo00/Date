package es.unileon.prg.tema7;

public class MainDate {

	public static void main(String[] args) {

		Date today, day2;

		try {
			today = new Date(26,10, 2017);
			day2 = new Date(20, 4, 2017);
			
			System.out.println(today.toString());
			
			System.out.println("Mes:" +today.nameOfMonth());
			System.out.println("Estación:" +today.seasonOfMonth());
			System.out.println("IGUALDAD:" +today.isSame(day2));
			System.out.println(today.getMonthsLeft());
			System.out.println("day2: "+day2.toString());
			System.out.println(today.getAllDates());
			System.out.println(today.getMonthsSameDays());
			System.out.println("Dias transcurridos del año: "+today.getDaysUntilActual());
			System.out.println("fecha atleatoria (while): "+today.randomDateEquals());
			System.out.println("fecha atleatoria (do-while): "+today.randomDateEqualsV2());
			System.out.println("Día de la semana empezando en Lunes: "+today.dayOfWeek(3));
		} catch (DateException e) {
			System.out.println(e.getMessage());

		}

	}

}
