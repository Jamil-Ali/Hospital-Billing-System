public class Doctor extends Person{

    // doctors speciality : ex physical therapist
    String speciality;

    // uses super classes constructor
    public Doctor(String first, String last, String speciality) {
        super(first, last);
        this.speciality = speciality;
    }

    // getter for speciality
    public String getSpeciality() {
        return speciality;
    }

    // setter for specialty
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString() + this.speciality;
    }
}
