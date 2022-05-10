public class Patient extends Person{

    // variables that include multiple classes
    private int patientID;
    private Date dob;
    private Doctor physician;
    private Date attendDate;
    private Date dischargeDate;

    Patient(String first, String last, int patientID, Date dob, Doctor physician, Date attendDate, Date dischargeDate) {
        // call super class constructor
        super(first,last);
        this.patientID = patientID;
        this.dob = dob;
        this.physician = physician;
        this.attendDate = attendDate;
        this.dischargeDate = dischargeDate;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Doctor getPhysician() {
        return physician;
    }

    public void setPhysician(Doctor physician) {
        this.physician = physician;
    }

    public Date getAttendDate() {
        return attendDate;
    }

    public void setAttendDate(Date attendDate) {
        this.attendDate = attendDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    @Override
    public String toString(){
        return "Patient: " + super.toString() +
                "\nDate of Birth: " + dob +
                "\nAttending Physician: " + physician +
                "\nAdmit Date: " + attendDate +
                "\nDischarge Date: " + dischargeDate;
    }
}
