import util.RandomUtil;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        hospital.setName("Uni Spital");

        for (int i = 0; i < hospital.getNumberOfRooms(); i++) {
            Room room = new Room();
            Doctor doctor = new Doctor("Doctor" + (i + 1), "Specialization" + (i + 1));
            Nurse nurse = new Nurse("Nurse" + (i + 1));
            room.setDoctor(doctor);
            room.setNurse(nurse);
        }
            Patient[] patients = new Patient[5];
            for (int j = 0; j < patients.length; j++) {
                int age = RandomUtil.getRandomAge(18, 100);
                patients[j] = new Patient("Patient" + (j + 1), "Disease" + (j + 1), age);
            }
            room.setPatients(patients);{
            System.out.println(hospital)
        }


