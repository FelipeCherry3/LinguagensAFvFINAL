/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resources;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Pc Felipe
 */

public class DateUtils {
    public static Date stringToDate(String dateString) throws ParseException {
        String formato = "yyyy/MM/dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
        java.util.Date utilDate = dateFormat.parse(dateString);
        return new Date(utilDate.getTime());
    }
    public static String dateToString(Date date) {
        String formato = "yyyy/MM/dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
        String dateString = dateFormat.format(date);
        return dateString;
    }
}
