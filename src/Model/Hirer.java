
package Model;

import java.sql.Date;

public class Hirer {
    
private Integer ID; 
private String Name; 
private String Surname; 
private String EmailAddress; 
private String PhoneNumber;
private String City; 
private Date DateofBirth;
private String Photo;
private String About;
private String LinktoFacebook;
private String LinktoSkype;
private Integer Active;

    @Override
    public String toString() {
        return "Hirer{" + "Name=" + Name + ", Surname=" + Surname + ", EmailAddress=" + EmailAddress + ", PhoneNumber=" + PhoneNumber + '}';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public Date getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(Date DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String About) {
        this.About = About;
    }

    public String getLinktoFacebook() {
        return LinktoFacebook;
    }

    public void setLinktoFacebook(String LinktoFacebook) {
        this.LinktoFacebook = LinktoFacebook;
    }

    public String getLinktoSkype() {
        return LinktoSkype;
    }

    public void setLinktoSkype(String LinktoSkype) {
        this.LinktoSkype = LinktoSkype;
    }

    public Integer getActive() {
        return Active;
    }

    public void setActive(Integer Active) {
        this.Active = Active;
    }

    

}