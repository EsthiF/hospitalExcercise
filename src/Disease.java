import enums.DiseaseDescription;
import util.RandomUtil;

import java.util.Arrays;

public class Disease {

    private DiseaseDescription diseaseDescription;
    private int timeToRecover;
    private Disease [] diseases;

    public DiseaseDescription getDiseaseDescription() {
        return diseaseDescription;
    }

    public Disease(DiseaseDescription diseaseDescription, int timeToRecover) {
        this.diseaseDescription = RandomUtil.generateRandomDiseaseDescription();
        this.timeToRecover = RandomUtil.getRandomDay(3,22);
    }

    public void setDiseaseDescription(DiseaseDescription diseaseDescription) {
        this.diseaseDescription = diseaseDescription;
    }

    public int getTimeToRecover() {
        return timeToRecover;
    }

    public void setTimeToRecover(int timeToRecover) {
        this.timeToRecover = timeToRecover;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "diseaseDescription:" + diseaseDescription +
                ", timeToRecover:" + timeToRecover +
                ", diseases:" + Arrays.toString(diseases) +
                '}';
    }
}
