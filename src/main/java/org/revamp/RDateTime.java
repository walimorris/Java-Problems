package org.revamp;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class RDateTime {

    public RDateTime() {}

    /**
     * Convert a date string to a {@link LocalDate}.
     * Standard LocalDate format is (1776-07-04) year-mm-dd
     *
     * @param dateStr {@link String}
     *
     * @return {@link LocalDate}
     */
    public LocalDate convertDateString(String dateStr) {
        LocalDate date = null;

        try {
            date = LocalDate.parse(dateStr);
        } catch (DateTimeParseException e) {
            System.out.println("Error converting date string to LocalDate Object: " + e.getMessage());
        }
        return date;
    }
}
