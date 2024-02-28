import enums.DiseaseDescription;
import util.RandomUtil;

public class Patient extends Person{
    private Disease disease;

    public Patient( String name, int age) {
        super(name, age);
        this.disease= new Disease(RandomUtil.generateRandomDiseaseDescription(), RandomUtil.getRandomDay(3,22));
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "disease=" + disease +
                '}';
    }
}


