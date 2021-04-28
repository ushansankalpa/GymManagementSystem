package sample;

public class StudentMember extends DefaultMember {

    private String schoolName;

    public StudentMember(String membershipNumber, String membershipName, String date, String schoolName) {
        super(membershipNumber, membershipName, date);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
