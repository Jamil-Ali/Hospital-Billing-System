public class Bill {

    // variables for bills, includes id, medicine charge,
    // room charge, and doctor fee
    private int patient_id;
    private double medicine_charge;
    private double room_charge;
    private double doc_fee;


    // arg constructor
    public Bill(int patient_id, double medicine_charge, double room_charge, double doc_fee) {
        this.patient_id = patient_id;
        this.medicine_charge = medicine_charge;
        this.room_charge = room_charge;
        this.doc_fee = doc_fee;
    }

    // getter for patientID
    public int getPatient_id() {
        return patient_id;
    }


    // setter for patientID
    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public double getMedicine_charge() {
        return medicine_charge;
    }

    public void setMedicine_charge(double medicine_charge) {
        this.medicine_charge = medicine_charge;
    }

    public double getRoom_charge() {
        return room_charge;
    }

    public void setRoom_charge(double room_charge) {
        this.room_charge = room_charge;
    }

    public double getDoc_fee() {
        return doc_fee;
    }

    public void setDoc_fee(double doc_fee) {
        this.doc_fee = doc_fee;
    }

    @Override
    public String toString() {
        return "Pharmacy Charges: $" + medicine_charge +
                "\nRoom Charges: $" + room_charge +
                "\nDoctor Fees: $" + doc_fee +
                "\n----------------------------------------\n" + "Total Charges: " + (medicine_charge + room_charge + doc_fee);
    }
}
