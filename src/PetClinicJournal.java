import java.time.LocalDateTime;
import java.util.*;

public class PetClinicJournal {

    private final List<Pet> petList;

    public PetClinicJournal() {
        this.petList = new ArrayList<>();
    }

    private <T extends Pet> boolean add(T pet) {
        for (Pet pta : petList) {
            if (pta.equals(pet)) return true;
        }
        petList.add(pet);
        return false;
    }

    private void listPrinter() {
        for (Pet pet : petList) {
            System.out.println(pet);
        }
        System.out.println("-------------------------------");
    }

    private void sortByBreed() {
        petList.sort(new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getBreed().compareTo(o2.getBreed());
            }
        });
    }

    private void sortByNickName() {
        petList.sort(new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getNickName().compareTo(o2.getNickName());
            }
        });
    }

    private void sortByAge() {
        petList.sort(new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getAgeInYears().compareTo(o2.getAgeInYears());
            }
        });
    }

    private void sortByRecordingDate() {
        petList.sort(new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getRecordingDate().compareTo(o2.getRecordingDate());
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        PetClinicJournal pc = new PetClinicJournal();
        pc.add(new Pet("Ferret", "Abu", 3, LocalDateTime.now()));
        Thread.sleep(2000);
        pc.add(new Cat("Shelby", 5, LocalDateTime.now()));
        Thread.sleep(2000);
        pc.add(new Cat("Roxy", 1, LocalDateTime.now()));
        Thread.sleep(2000);
        pc.add(new Cat("Kelly", 3, LocalDateTime.now()));
        Thread.sleep(2000);
        pc.add(new Dog("Dingo", 7, LocalDateTime.now()));
        Thread.sleep(2000);
        pc.add(new Dog("Vulcan", 2, LocalDateTime.now()));
        Thread.sleep(2000);

        if (pc.add(new Cat("Shelby", 5, LocalDateTime.now())))
            System.out.println("Such a pet already exists");

        pc.listPrinter();
        pc.sortByBreed();
        pc.listPrinter();
        pc.sortByNickName();
        pc.listPrinter();
        pc.sortByAge();
        pc.listPrinter();
        pc.sortByRecordingDate();
        pc.listPrinter();
    }
}
