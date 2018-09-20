package com.example.mrifk.idpotato;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class tab3 extends Fragment {
    //Calendar birthday = Calendar.getInstance();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab3, container, false);
        CalendarView calendar = rootView.findViewById(R.id.calendarView);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                String picked = String.valueOf(dayOfMonth)+"/"+String.valueOf(month+1)+"/"+String.valueOf(year);
                TextView str_date = rootView.findViewById(R.id.textViewCalendar);
                str_date.setText(getAge(picked));
                /*birthday.set(year, month, dayOfMonth);
                TextView str_date = rootView.findViewById(R.id.textViewCalendar);
                int age = getAge(birthday.getTime());
                if (age < 0){
                    str_date.setText("You are not born yet!");
                } else {
                    str_date.setText("You are "+String.valueOf(age) + " old");
                }*/
            }

        });


        return rootView;
    }
    public static String getAge(String picked){
        Date mydob;
        ZoneId defaultZoneId = ZoneId.systemDefault();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            mydob = dateFormat.parse(picked);
        } catch (Exception e) {
            return "GAGAL PARSING";
        }
        Date current = new Date();
        // Convert Date mydob to LocalDate
        Instant instant1 = mydob.toInstant();
        LocalDate localeDateMyDob = instant1.atZone(defaultZoneId).toLocalDate();
        // Convert Date current to LocalDate
        Instant instant2 = current.toInstant();
        LocalDate localeDateCurrent = instant2.atZone(defaultZoneId).toLocalDate();

        if (current.before(mydob)){
            return "You are not born yet!";
        }

        Period period = Period.between(localeDateCurrent, localeDateMyDob);
        String age = "You are \n"+String.valueOf(Math.abs(period.getYears()))+" Year "+String.valueOf(Math.abs(period.getMonths()))+" Month "+String.valueOf(Math.abs(period.getDays())) + " Day Old";
        return age;
    }
 /*   public static int getAge(Date dateOfBirth) {
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(dateOfBirth);
        if (birthDate.after(today)) {
            return -1;
        }
        int todayYear = today.get(Calendar.YEAR);
        int birthDateYear = birthDate.get(Calendar.YEAR);
        int todayDayOfYear = today.get(Calendar.DAY_OF_YEAR);
        int birthDateDayOfYear = birthDate.get(Calendar.DAY_OF_YEAR);
        int todayMonth = today.get(Calendar.MONTH);
        int birthDateMonth = birthDate.get(Calendar.MONTH);
        int todayDayOfMonth = today.get(Calendar.DAY_OF_MONTH);
        int birthDateDayOfMonth = birthDate.get(Calendar.DAY_OF_MONTH);
        int age = todayYear - birthDateYear;

        // If birth date is greater than todays date (after 2 days adjustment of leap year) then decrement age one year
        if ((birthDateDayOfYear - todayDayOfYear > 3) || (birthDateMonth > todayMonth)){
            age--;

            // If birth date and todays date are of same month and birth day of month is greater than todays day of month then decrement age
        } else if ((birthDateMonth == todayMonth) && (birthDateDayOfMonth > todayDayOfMonth)){
            age--;
        }
        return age;
    }*/

}
