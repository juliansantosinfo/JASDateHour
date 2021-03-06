/* 
 * Copyright (C) 2018 Julian A. Santos 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.juliansantosinfo.jasdatehour;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <code>JASDateHour</code> is a library for making it easy to get the system 
 * date and time.
 * @author Julian A. Santos
 * @since 22/08/2018
 * @version 0.01
 * @see <a href="https://github.com/juliansantosinfo/JASDateHour">Github</a>
 */
public class JASDateHour {
    
    public static final String DATA_FORMAT_DEFAULT = "dd/mm/yyyy";
    public static final String DATA_FORMAT_EUA = "mm/dd/yyyy";
    public static final String HOUR_FORMAT_DEFAULT = "HH:mm:ss";
    
    private static SimpleDateFormat simpleDateFormat;
    private static Date date;
    
    /**
     * Gets the object of type SimpleDateFormat.
     * @return simpleDateFormat
     */
    public SimpleDateFormat getSimpleDateFormat() {
        return simpleDateFormat;
    }
    
    /**
     * Set the simpleDateFormat with the object entered in the parameter.
     * @param simpleDateFormat instance of the SimpleDateFormat class.
     */
    public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
        JASDateHour.simpleDateFormat = simpleDateFormat;
    }
    
    /**
     * Gets the object of type Date.
     * @return date
     */
    public Date getDate() {
        date = new Date();
        return date;
    }
    
    /**
     * Set the date with the object entered in the parameter.
     * @param date instance of the Date class.
     */
    public void setDate(Date date) {
        date = new Date();
        JASDateHour.date = date;
    }
    
    /**
     * Gets the current date of the system in format "dd/mm/yyyy".
     * @return current date
     */
    public static String currentDate() {
        date = new Date();
        simpleDateFormat = new SimpleDateFormat(DATA_FORMAT_DEFAULT);
        return simpleDateFormat.format(date);
    }
    
    /**
     * Gets the current date of the system with the format entered in the parameter.
     * @param format format to which the date will be obtained.
     * @return current date
     */
    public static String getDateInFormat(String format) {
        date = new Date();
        simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
    
    /**
     * Gets the current hour of the system in format "HH:mm:ss".
     * @return current hour
     */
    public static String currentHour() {
        date = new Date();
        simpleDateFormat = new SimpleDateFormat(HOUR_FORMAT_DEFAULT);
        return simpleDateFormat.format(date);
    }
    
    /**
     * Gets the current hour of the system with the format entered in the parameter.
     * @param format format to which the hour will be obtained.
     * @return current hour
     */
    public static String getHourInFormat(String format) {
        date = new Date();
        simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
}
