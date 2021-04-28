package sample;

public class Over60Member extends  DefaultMember{

    private String age;

    public Over60Member(String membershipNumber, String membershipName, String date, String age) {
        super(membershipNumber, membershipName, date);
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
