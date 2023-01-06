import java.util.Objects;

public class FullName {
    private final String firstName;
    private final String fullName;

    public FullName(String firstName, String fullName) {
        this.firstName = firstName;
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullName fullName1 = (FullName) o;
        return Objects.equals(firstName, fullName1.firstName) && Objects.equals(fullName, fullName1.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, fullName);
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
