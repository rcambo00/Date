package es.unileon.prg.tema7;
/**
 * Clase que representa una fecha.
 *
 * @author RCAMBO00
 * @version 1.0
 */
public class Date{
	
	/**
	 * dia
	 * 
	 * @see int
	 */
	private int  day;
	/**
	 * mes
	 * 
	 * @see int
	 */
	private int month;
	/**
	 * año
	 *@see int 
	 */
	private int year;

	/**
	 * Constructor de la clase. Crea una fecha con la informacion recibida
	 *
	 * @param dia
	 *            Dia del mes
	 * @param mes
	 *            mes del año
 	 * @param año
	 *           Año de la fecha
	 */
	public Date(int day, int month, int year) throws DateException {
		this.year = year;
	/*Comprobamos que el mes dado es valido, es decir, 
	está entre 1 y 12.Sinó nos dará un aviso de error;*/		
		if (month < 1 || month > 12){
		throw new DateException( "Mes: "+month+" no es valido");				
		}else{
		this.month=month;		
		}
		//Crearemos un metodo de comprobacion de los días mas abajo
		this.day = day;
	}
	//Creamos los metodos get$ y set$ para modificar los atributos  de la clase
	/**
	 * Obtiene el dia de la fecha
	 * 
	 * @return Retorna el dia de la fecha
	 */
	public int getDay(){
		return this.day;
	}
	
	
	/**
	 * Obtiene el mes de la fecha
	 * 
	 * @return Retorna el mes de la fecha
	 */
	public int getMonth(){
		return this.month;
	}

	/**
	 * Obtiene el año de la fecha
	 * 
	 * @return Retorna el año de la fecha
	 */
	public int getYear(){
		return this.year;
	}

	/**
	 * Modifica el dia de la fecha, si el día está entre 1 y 31(Se modificará mas tarde este metodo)
	 * 
	 * @param day 
	 * 		dia de la fecha
	 */
	public void setDay(int day){
		if(day>0 && day < 31){
		this.day=day;		
		}
		
				
	}
	
	/**
	 * Modifica el mes de la  fecha, solo si este está entre 1 y 12
	 * 
	 * @param month 
	 * 		Mes de la fecha
	 */
	public void setMonth(int month){
		if(month > 1 && month < 12){
		this.month=month;
		}	
	}

	/**
	 * Modifica el año del año, solo si este es mayor que 0(Calendario actual)
	 * 
	 * @param year 
	 * 		Año de la fecha
	 */
	public void setYear(int year){
		if(year > 1 && year < 12){
		this.year=year;
		}	
	}

	/**
	 * Retorna si el día es el actual
	 * 
	 * @return
	 * 		Retorna true si el día es igual al actual
	 */
	public boolean isSameDay(Date other){
	if ( this.day == other.getDay() ) {
		return true;
	} else {
		return false;
	}
	}
	/**
	 * Retorna si el mes es el mismo que el actual
	 * 
	 * @return
	 * 		Retorna true si el mes es el mismo que el actual
	 **/
	public boolean isSameMonth(Date other){
	if ( this.month == other.getMonth() ) {
		return true;
	} else {
		return false;
	}
	}
	/**
	 * Retorna si el año es el mismo que el actual
	 * 
	 * @return
	 * 		Retorna true si el año es igual al actual
	 */

	public boolean isSameYear(Date other){
	if ( this.year == other.getYear() ) {
		return true;
	} else {
		return false;
	}
	}
	/**
	 * Retorna si la fecha es igual al dia actual, para ello utiliza los metodos isSame* anteriores
	 * 
	 * @return
	 * 		Retorna true si la fecha actual coincide con la dada
	 */
public boolean isSame(Date other){
	if (this.isSameYear(other)==true && this.isSameYear(other)==true && this.isSameDay(other)==true ) {
		return true;
	} else {
		return false;
	}
	}
	/*
	*Los mismo 4 metodos anteriores, version V2 sin utilizar clausulas IF
	*/
	public boolean isSameYearV2(Date other){
	return this.year == other.getYear();
	}
	public boolean isSameMonthV2(Date other){
	return this.month == other.getMonth();
	}
	public boolean isSameDayV2(Date other){
	return this.day == other.getDay();
	}
	public boolean isSameV2(Date other){
	return (this.isSameYear(other) && this.isSameYear(other)&& this.isSameDay(other) );
	}

	/**
	 * Retorna el nombre del mes dado
	 * 
	 * @return
	 * 		Retorna un String con el nombre del mes en función del Numero;
	 */
	public String nameOfMonth(){
	String name ="";
	switch (this.month){
		case 1:
			name="Enero";
			break;
		case 2:
			name="Febrero";
			break;
		case 3:
			name="Marzo";
			break;
		case 4:
			name="Abril";
			break;
		case 5:
			name="Mayo";
			break;
		case 6:
			name="Junio";
			break;
		case 7:
			name="Julio";
			break;
		case 8:
			name="Agosto";
			break;
		case 9:
			name="Septiembre";
			break;
		case 10:
			name="Octubre";
			break;
		case 11:
			name="Noviembre";
			break;
		case 12:
			name="Diciembre";
			break;
		default:
			name = "Error";
	}
	return name;
	}

	/**
	 * Retorna los días maximos de cada mes
	 * 
	 * @return
	 * 		Retorna un int con los días maximos de cada mes.
	 */
	public int daysOfMonth(){
	int number = 0;
	switch (this.month){
		case 1: // next
		case 3: // next
		case 5: // next
		case 7: // next
		case 8: // next
		case 10: // next
		case 12:
			number = 31;
			break;
		case 4: // next
		case 6: // next
		case 9: // next
		case 11: 
			number = 30;
			break;
		case 2:
			// we do not consider leap years
			number = 28;
			break;
		default:
			number = -1;
	}
	return number;
	}

	/**
	 * Retorna los días maximos de cada mes
	 * 
	 * @return
	 * 		Retorna un int con los días maximos de cada mes.
	 */
	public String seasonOfMonth(){
	String season = "";
	switch (this.month){

		case 3: // next
		case 4: // next
		case 5:
			season ="Primavera";
			break;
		case 6: // next
		case 7: // next
		case 8: // next 
			season ="Verano";
			break;
		case 9: // next
		case 10: // next
		case 11: // next 
			season ="Otoño";
			break;
		case 12: // next
		case 1: // next
		case 2: // next 
			season ="Invierno";
			break;
		default:
			season="Error";
	}
	return season;
	}
	/**
	 * Retorna los meses que restan hasta final de año.Entendiendo que si estamos en Diciembre faltan 0 meses
	 * y si estamos en Enero faltan 11
	 * 
	 * @return
	 * 		Retorna un StringBuffer con el nombre de los meses que restan de año utilizando la funcion 		 *	nameOfMonth()
	 */
	public String getMonthsLeft() throws DateException{
	Date aux = new Date(0,this.month,0);
	StringBuffer monthsLeft = new StringBuffer();
	monthsLeft.append("Meses Restantes: "+" ");
		for(int i=this.month; i<=12; i++){
			aux.setMonth(i);
			monthsLeft.append(aux.nameOfMonth()+" ");
}			//POR ALGUN ERROR, ME IMPRIME NOVIEMBRE REPETIDAS VECES EN LUGAR DE DICIEMBRE
	return monthsLeft.toString();
	}
	/**
	 * Retorna todas las fechas restantes hasta el último dia del mess
	 * 
	 * 
	 * @return
	 * 		Retorna un String con todas las fechas restantes hasta final de mes
	 */
	public String getAllDates() throws DateException{
	//Date aux=new Date(this);
	StringBuffer allDates = new StringBuffer();
		for (int i = this.day + 1; i <=daysOfMonth(); i++){
			allDates.append(i+"/"+this.month+"/"+this.year+" ");		
		}
	return allDates.toString();
	}

	/**
	 *Calcula los días del mes actual.Calcula los días del resto de meses.Devuelve una cadena con los valores de los 		 *meses con los mismos días al actual.
	 * 
	 * 
	 * @return
	 * 		Retorna un String con todos los meses con los mismo días que el de la fecha
	 */

	public String getMonthsSameDays()throws DateException{
	
	StringBuffer sameDays = new StringBuffer();
	Date aux=new Date(1,1,1);
	sameDays.append("Meses con los mismos días que "+this.nameOfMonth()+": ");
	//Almacena el numero de días que tiene el mes de la fecha aux
	int dias_actual=this.daysOfMonth();
	//Almacena el numero de días que tiene el mes i;
	int dias_i;
		for (int i = 1; i <=12; i++){
			aux.setMonth(i);
			dias_i=aux.daysOfMonth();
			if(dias_actual==dias_i){
			sameDays.append(" "+aux.nameOfMonth());		
			}
		}
		
	return sameDays.toString();
	}

	/**
	 *Calcula el numero de días que llevamos hasta la fecha, desde el 1 de Enero.
	 * 
	 * 
	 * @return
	 * 		Retorna el numero total de días desde el día 1 de Enero
	 */
	



	public int getDaysUntilActual()throws DateException{
	Date aux=new Date(1,1,1);
	//Cuenta los días
	int dias_totales;
	int dias_mes_i;
	int total=0;
		for (int i = 1; i <=this.month; i++){
			if(i!=aux.month){
			aux.setMonth(i);
			dias_mes_i=aux.daysOfMonth();
			total=total+dias_mes_i;	
			}else{
			total=total+aux.day;
			}

			
		}
		
	return total;
}

	/**
	 * Calcula los intentos que han hecho falta para generar una fecha aleatoria igual a la fecha dada
	 * 
	 * @return
	 * 		Retorna el numero de intentos
	 */
	public int randomDateEquals()throws DateException{
	int attemps=0;
	Date aux=new Date(1,1,1);
	int i=0;
	while(i==0){
	aux.month=(int)(Math.random()*12)+1;
	aux.day=(int)(Math.random()*aux.daysOfMonth())+1;
	attemps++;
	if(aux.day==this.day&&aux.month==this.month){
		i=1;	
	}		
	}
	return attemps;	
	}
	//El mismo metodo pero utilizando do while
	public int randomDateEqualsV2()throws DateException{
	int attemps=0;
	Date aux=new Date(1,1,1);
	int i=0;
	do{
	aux.month=(int)(Math.random()*12)+1;
	aux.day=(int)(Math.random()*aux.daysOfMonth())+1;
	attemps++;
	if(aux.day==this.day&&aux.month==this.month){
		i=1;	
	};		
	}while(i==0);
	return attemps;	
	}
	/**
	 *Calcula el día de la semana en el que estamos, partiendo de que día de la semana fue el 1 de Enero
	 * 
	 * 
	 * @return
	 * 		Retorna un String con el nombre del día de la semana de la fecha
	 */
	public String dayOfWeek(int day)throws DateException{
		//Almacena la posición del día de la semana
	String name ="";
	//Cuenta todos los días hasta el actual
	int total_days=getDaysUntilActual();
	//Divide los días entre 7, y al resto le suma la posición del primer día del año
	int day_week=(total_days%7)+day;
	switch (day_week){
		case 1:
			name="Lunes";
			break;
		case 2:
			name="Martes";
			break;
		case 3:
			name="Miercoles";
			break;
		case 4:
			name="Jueves";
			break;
		case 5:
			name="Viernes";
			break;
		case 6:
			name="Sabado";
			break;
		case 7:
			name="Domingo";
			break;
		default:
			name = "Error";
	}
	return name.toString();
	}

	@Override
	public String toString() {
	return this.day + "/" + this.month + "/" + this.year;
	}

	
}
