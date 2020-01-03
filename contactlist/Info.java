package contactlist;

import java.util.ArrayList;
import java.util.List;

public class Info implements ISavable {

    private String name;
    private int contactnumber;
    private String mail;

    public Info(String name, int contactnumber, String mail) {
        this.name = name;
        this.contactnumber = contactnumber;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(int contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", contactnumber=" + contactnumber +
                ", mail='" + mail + '\'' +
                '}';
    }

    @Override
    public List<String> write() {

        List<String> list = new ArrayList<>();
        list.add(0,this.name);
        list.add(1,"" +  this.contactnumber);
        list.add(2,this.mail);

        return list;

    }

    @Override
    public void read(List<String> list) {

        if (list != null){

            this.name = list.get(0);
            this.contactnumber= Integer.parseInt(list.get(1));
            this.mail= list.get(2);


        }

    }
}
