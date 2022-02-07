import java.time.LocalDateTime;

public class Cat extends Pet {
    public Cat(String nickName, Integer ageInYears, LocalDateTime recordingDate) {
        super("Cat", nickName, ageInYears, recordingDate);
    }
}
