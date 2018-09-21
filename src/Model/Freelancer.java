package Model;

import java.sql.Date;

public class Freelancer {

    private Long ID;
    private String Name;
    private String Surname;
    private String EmailAddress;
    private String PhoneNumber;
    private String City;
    private Date DateofBirth;
    private String Photo;
    private String PhotoIDcard;
    private String PhotowithIDcard;
    private String About;
    private String Experience;
    private String LinktoFacebook;
    private String LinktoSkype;
    private Integer Active;

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String Experience) {
        this.Experience = Experience;
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

    @Override
    public String toString() {
        return "Freelancer{" + "Name=" + Name + ", Surname=" + Surname + ", EmailAddress=" + EmailAddress + ", PhoneNumber=" + PhoneNumber + ", City=" + City + ", DateofBirth=" + DateofBirth + '}';
    }

    
       
    
    public Integer getActive() {
        return Active;
    }

    public void setActive(Integer Active) {
        this.Active = Active;
    }
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
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

    public String getPhotowithIDcard() {
        return PhotowithIDcard;
    }

    public void setPhotowithIDcard(String PhotowithIDcard) {
        this.PhotowithIDcard = PhotowithIDcard;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String About) {
        this.About = About;
    }
 
    public String getPhotoIDcard() {
        return PhotoIDcard;
    }

    public void setPhotoIDcard(String PhotoIDcard) {
        this.PhotoIDcard = PhotoIDcard;
    }

}
