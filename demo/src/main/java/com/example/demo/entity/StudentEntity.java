package com.example.demo.entity;
import java.util.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;



@Entity
@Table(name ="students" )
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "First Name")
    private String firstName;

    @Column(name ="Last Name")
    private String lastName;

    @Column(name = "Email ID")
    private String email;

    @Column(name = "Phone Number")
    private Long phoneNo;

    @Column(name = "Address")
    private String address;

    @Column(name = "Father Name")
    private String fatherName;

    @Column(name = "Father Phone Number")
    private Long fatherPhoneNo;  
    
    @Column(name = "Mother Name")
    private String motherName;

    @Column(name = "Mother Phone Number")
    private Long motherPhoneNo;    
    
    @Column(name = "SSLC Percentage")
    private Integer sSLCPercentage; 

    @Column(name = "HSC Percentage")
    private Integer hSCPercentage; 

    @Column(name = "Diploma Percentage")
    private Integer diplomaPercentage;
    
    @Column(name = "College")
    private String college;

    @Column(name = "Degree")
    private String degree;    

    @Column(name = "Department")
    private String department;
    
    @Column(name = "Current Year")
    private Integer currentYear;

    @Column(name = "Year of Passout")
    private Integer yearofPassout;

    @Column(name = "Mode")
    private String mode;

    @Column(name = "Admission Date")
    private Date admissionDate;

    @Column(name = "Where did you hear about us")
    private String hearUs;

    @Column(name = "Payment Type")
    private String paymentType;

    @Column(name = "Student ID")
    private Integer stID;

    @Column(name = "Status")
    private String status;

    @Column(name = "Installment 1")
    private Integer ins1;

    @Column(name = "Installment Date 1")
    private Date ins1date;

    @Column(name = "Installment 2")
    private Integer ins2;

    @Column(name = "Installment Date 2")
    private Date ins2date;

    @Column(name = "Installment 3")
    private Integer ins3;

    @Column(name = "Installment Date 3")
    private Date ins3date;

    @Column(name = "Installment 4")
    private Integer ins4;

    @Column(name = "Installment Date 4")
    private Date ins4date;

    @Lob
    @Column(name = "Image")
    private byte[] image;


    public StudentEntity() {
        // Default constructor
        // super(); // Call to superclass constructor (if necessary)
    }

    

    public StudentEntity(Long id, String firstName, String lastName, String email, Long phoneNo, String address,
            String fatherName, Long fatherPhoneNo, String motherName, Long motherPhoneNo, Integer sSLCPercentage,
            Integer hSCPercentage, Integer diplomaPercentage, String college, String degree, String department,
            Integer currentYear, Integer yearofPassout, String mode, Date admissionDate, String hearUs,
            String paymentType, Integer stID, String status, Integer ins1, Date ins1date, Integer ins2, Date ins2date,
            Integer ins3, Date ins3date, Integer ins4, Date ins4date, byte[] image) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
        this.fatherName = fatherName;
        this.fatherPhoneNo = fatherPhoneNo;
        this.motherName = motherName;
        this.motherPhoneNo = motherPhoneNo;
        this.sSLCPercentage = sSLCPercentage;
        this.hSCPercentage = hSCPercentage;
        this.diplomaPercentage = diplomaPercentage;
        this.college = college;
        this.degree = degree;
        this.department = department;
        this.currentYear = currentYear;
        this.yearofPassout = yearofPassout;
        this.mode = mode;
        this.admissionDate = admissionDate;
        this.hearUs = hearUs;
        this.paymentType = paymentType;
        this.stID = stID;
        this.status = status;
        this.ins1 = ins1;
        this.ins1date = ins1date;
        this.ins2 = ins2;
        this.ins2date = ins2date;
        this.ins3 = ins3;
        this.ins3date = ins3date;
        this.ins4 = ins4;
        this.ins4date = ins4date;
        this.image = image;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Long getFatherPhoneNo() {
        return fatherPhoneNo;
    }

    public void setFatherPhoneNo(Long fatherPhoneNo) {
        this.fatherPhoneNo = fatherPhoneNo;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Long getMotherPhoneNo() {
        return motherPhoneNo;
    }

    public void setMotherPhoneNo(Long motherPhoneNo) {
        this.motherPhoneNo = motherPhoneNo;
    }

    public Integer getsSLCPercentage() {
        return sSLCPercentage;
    }

    public void setsSLCPercentage(Integer sSLCPercentage) {
        this.sSLCPercentage = sSLCPercentage;
    }

    public Integer gethSCPercentage() {
        return hSCPercentage;
    }

    public void sethSCPercentage(Integer hSCPercentage) {
        this.hSCPercentage = hSCPercentage;
    }

    public Integer getDiplomaPercentage() {
        return diplomaPercentage;
    }

    public void setDiplomaPercentage(Integer diplomaPercentage) {
        this.diplomaPercentage = diplomaPercentage;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(Integer currentYear) {
        this.currentYear = currentYear;
    }

    public Integer getYearofPassout() {
        return yearofPassout;
    }

    public void setYearofPassout(Integer yearofPassout) {
        this.yearofPassout = yearofPassout;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getHearUs() {
        return hearUs;
    }

    public void setHearUs(String hearUs) {
        this.hearUs = hearUs;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getStID() {
        return stID;
    }

    public void setStID(Integer stID) {
        this.stID = stID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getIns1() {
        return ins1;
    }

    public void setIns1(Integer ins1) {
        this.ins1 = ins1;
    }

    public Date getIns1date() {
        return ins1date;
    }

    public void setIns1date(Date ins1date) {
        this.ins1date = ins1date;
    }

    public Integer getIns2() {
        return ins2;
    }

    public void setIns2(Integer ins2) {
        this.ins2 = ins2;
    }

    public Date getIns2date() {
        return ins2date;
    }

    public void setIns2date(Date ins2date) {
        this.ins2date = ins2date;
    }

    public Integer getIns3() {
        return ins3;
    }

    public void setIns3(Integer ins3) {
        this.ins3 = ins3;
    }

    public Date getIns3date() {
        return ins3date;
    }

    public void setIns3date(Date ins3date) {
        this.ins3date = ins3date;
    }

    public Integer getIns4() {
        return ins4;
    }

    public void setIns4(Integer ins4) {
        this.ins4 = ins4;
    }

    public Date getIns4date() {
        return ins4date;
    }

    public void setIns4date(Date ins4date) {
        this.ins4date = ins4date;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    

}
