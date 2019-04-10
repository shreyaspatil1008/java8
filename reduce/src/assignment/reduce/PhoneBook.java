package assignment.reduce;

public class PhoneBook {

    private String name;
    private String phoneNum;

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public PhoneBook(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }
}
