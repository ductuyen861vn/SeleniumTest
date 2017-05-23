/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE1_DATETIME;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hv
 */
public class CLASS_CARLENDER {
    
    public static Date stringToDate(String ngay) throws ParseException{
        DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        return df.parse(ngay);
    }
    
    public static String dateToString(Date ngay){
        DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        return df.format(ngay);
    }
    
    
    
}
