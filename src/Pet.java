import java.time.LocalDateTime;

public class Pet {

    private final String breed;
    private final String nickName;
    private final Integer ageInYears;
    private final LocalDateTime recordingDate;

    public Pet(String breed, String nickName, Integer ageInYears, LocalDateTime recordingDate) {
        this.breed = breed;
        this.nickName = nickName;
        this.ageInYears = ageInYears;
        this.recordingDate = recordingDate;
    }

    public String getBreed() {
        return breed;
    }

    public String getNickName() {
        return nickName;
    }

    public Integer getAgeInYears() {
        return ageInYears;
    }

    public LocalDateTime getRecordingDate() {
        return recordingDate;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "breed='" + breed + '\'' +
                ", nickName='" + nickName + '\'' +
                ", Age=" + ageInYears +
                ", recordindDate=" + recordingDate +
                '}';
    }
}
