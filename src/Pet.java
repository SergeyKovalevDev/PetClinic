import java.time.LocalDateTime;
import java.util.Objects;

public class Pet {

    private final String breed;
    private final String nickName;
    private final Integer ageInYears;
    private final LocalDateTime recordingDate;

    public Pet(String breed, String nickName, Integer ageInYears, LocalDateTime recordingDate) {
        if (breed == null || nickName == null || ageInYears == null || recordingDate == null)
            throw new IllegalArgumentException();
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
                ", recordingDate=" + recordingDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return breed.equals(pet.breed) && nickName.equals(pet.nickName) && ageInYears.equals(pet.ageInYears);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, nickName, ageInYears);
    }
}
