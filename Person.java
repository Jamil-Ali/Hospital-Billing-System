public class Person {
    private String first, last;


    // create default constructor
    public Person(){
        this.first = "";
        this.last = "";
    }


    // constructor with 2 parameters
    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    // get first name
    public String getFirst() {
        return first;
    }


    // set first name
    public void setFirst(String first) {
        this.first = first;
    }

    // get last name
    public String getLast() {
        return last;
    }

    // set last name
    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return first + "" + last;
    }
}


