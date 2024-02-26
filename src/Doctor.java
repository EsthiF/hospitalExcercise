import enums.DiseaseDescription;

public class Doctor extends Person {

    private int roomNumber;
    private DiseaseDescription diseaseSpecialty;
    public Doctor(int id, String name, int age, int roomNumber, DiseaseDescription diseaseSpecialty) {
        super(id, name, age);
        this.roomNumber = roomNumber;
        this.diseaseSpecialty = diseaseSpecialty;
    }
   public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public DiseaseDescription getDiseaseSpecialty() {
        return diseaseSpecialty;
    }
    public void setDiseaseSpecialty(DiseaseDescription diseaseSpecialty) {
        this.diseaseSpecialty = diseaseSpecialty;
    }

    public String toString() {
        String specialtyDescription = diseaseSpecialty.toString();
        return super.toString() + ", specialist to cure " + specialtyDescription + " and belong to room number " + roomNumber;
    }
}
