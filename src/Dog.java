import java.time.LocalDateTime;

public class Dog extends Pet {
    public Dog(String nickName, Integer ageInYears, LocalDateTime recordingDate) {
        super("Dog", nickName, ageInYears, recordingDate);
    }
}
