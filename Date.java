public class Date {
    // variables for date class
private int day;
private int month;
private int year;


// arg constructor, has exceptions
    // months are between 1 and 12
    // days are between 1 and 31
    Date(int day, int month, int year) {

        if (month > 0 && month <= 12)
        {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Month should be between 1 and 12.");
        }
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Days should be between 1 and 31");
        }

        this.year = year;
    }


    // days are between 1 and 31
    // conditional to ensure days are set correctly
    public void setDay(int day) {

        if(day < 1 && day > 31){
            throw new IllegalArgumentException("Days should be between 1 and 31");
        }
        else {
            this.day = day;
        }
    }

    // months are between 1 and 12
    public void setMonth(int month) {
        if(month < 1 && month > 12){
            throw new IllegalArgumentException("Months should be between 1 and 12.");

        }
        else {
            this.month = month;
        }
    }


    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return month + "-" + day + "-"+ year;
    }
}

