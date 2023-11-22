package datojava.jcalendar;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import com.toedter.calendar.IDateEvaluator;
public class DJFechasEspInv implements IDateEvaluator {
Calendar calendar = Calendar.getInstance();
public DJFechasEspInv() {
}
@Override
public boolean isSpecial(Date date) { calendar.setTime(date);
 return calendar.get(Calendar.MONTH) == Calendar.DECEMBER
 && calendar.get(Calendar.DAY_OF_MONTH) == 24;
}
@Override
public Color getSpecialForegroundColor() {
 return Color.GREEN;
}
@Override
public Color getSpecialBackroundColor() {
 return Color.WHITE;
}
@Override
public String getSpecialTooltip() {
 return "Es Navidad"; }
@Override
public boolean isInvalid(Date date) {
 calendar.setTime(date);
 return calendar.get(Calendar.MONTH) == Calendar.JANUARY
 && calendar.get(Calendar.DAY_OF_MONTH) == 01;
}
@Override
public Color getInvalidForegroundColor() {
 return Color.WHITE;
}
@Override
public Color getInvalidBackroundColor() {
 return Color.BLACK;
}
@Override
public String getInvalidTooltip() {
 return "No es día Laborable";
}
}
public static List<calendar> fechasEspeciales() {
List<calendar> fechas = new ArrayList<calendar>();
 
Calendar calendar = new GregorianCalendar(2015, Calendar.SEPTEMBER, 10);
fechas.add(calendar);
calendar = new GregorianCalendar(2015, Calendar.NOVEMBER, 10);
fechas.add(calendar);
calendar = new GregorianCalendar(2015, Calendar.NOVEMBER, 18);
fechas.add(calendar);
return fechas;
}
//Método que retorna la lista de ToolTip por cada fecha:
public static List<string> tipFechas() {
List<string> tips = new ArrayList<string>();
tips.add("Septiembre 10");
tips.add("Noviembre 10");
tips.add("Noviembre 18");
return tips;
}
//Ahora en la implementación del método boolean isSpecial(Date date) recorremos la lista de fechas 
//especiales y vamos pintando en el calendario las mismas:
private int i = 0;
@Override
public boolean isSpecial(Date date) {
calendar.setTime(date);
for (i = 0; i < DJJCalendar.fechasEspeciales().size(); i++) {
 if (calendar.get(Calendar.MONTH) == DJJCalendar.fechasEspeciales()
 .get(i).get(Calendar.MONTH)
 && calendar.get(Calendar.DAY_OF_MONTH) == DJJCalendar
 .fechasEspeciales().get(i)
 .get(Calendar.DAY_OF_MONTH)) {
 return true;
 }
}
return false;
}
/*Hacemos lo propio en el metodo String getSpecialTooltip(), obtenemos la descripción en la posición 
correspondiente y la pintamos en el calendario*/
@Override
public String getSpecialTooltip() {
return DJJCalendar.tipFechas().get(i);
}
