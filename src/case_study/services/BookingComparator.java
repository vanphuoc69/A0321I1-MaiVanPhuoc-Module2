package case_study.services;

import case_study.models.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        if(o1.getStartDay().equals(o2.getStartDay())){
            return o1.getEndDay().compareTo(o2.getEndDay());
        }
        return 1;
    }
}
