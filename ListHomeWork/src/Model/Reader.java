package Model;
import Enum.Gender;
public class Reader {
    public static int next = 0;
    private int instanceId;
   private String fullName;
   private String email;
   private int phoneNumber;
   private Gender gender;

    public Reader(String fullName, String email, int phoneNumber, Gender gender) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.instanceId= next++;
    }

    public static int getNext() {
        return next;
    }

    public static void setNext(int next) {
        Reader.next = next;
    }

    public int getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nReader{" +
                "instanceId=" + instanceId +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", gender=" + gender +
                '}';
    }
}
