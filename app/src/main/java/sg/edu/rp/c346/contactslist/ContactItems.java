package sg.edu.rp.c346.contactslist;

/**
 * Created by 16039013 on 23/7/2018.
 */

public class ContactItems {

    private  String name;
    private String phoneC;
    private int phoneN;

    public ContactItems(String name, String phoneC, int phoneN) {
        this.name = name;
        this.phoneC = phoneC;
        this.phoneN = phoneN;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneC() {
        return phoneC;
    }

    public void setPhoneC(String phoneC) {
        this.phoneC = phoneC;
    }

    public int getPhoneN() {
        return phoneN;
    }

    public void setPhoneN(int phoneN) {
        this.phoneN = phoneN;
    }

    @Override
    public String toString() {
        return "ContactItems{" +
                "name='" + name + '\'' +
                ", phoneC='" + phoneC + '\'' +
                ", phoneN=" + phoneN +
                '}';
    }
}
