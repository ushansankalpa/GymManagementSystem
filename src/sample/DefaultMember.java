package sample;

public class DefaultMember {

    private String MembershipNumber;
    private String MembershipName;
    private String date;




    public DefaultMember(String membershipNumber, String membershipName, String date) {
        this.MembershipNumber = membershipNumber;
        this.MembershipName = membershipName;
        this.date = date;
    }

    public String getMembershipNumber() {
        return MembershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        MembershipNumber = membershipNumber;
    }

    public String getMembershipName() {
        return MembershipName;
    }

    public void setMembershipName(String membershipName) {
        MembershipName = membershipName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
