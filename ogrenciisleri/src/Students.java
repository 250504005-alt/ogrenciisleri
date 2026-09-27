/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tugbanurturkmen
 */
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class Students {
    
    private UUID id;
    private String studentNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    private String email;
    private String phone;
    private String address;
    private UUID programId;
    private Integer enrollmentYear;
    private Integer classYear;
    private StudentStatus status;
    private String photoUrl;
    private OffsetDateTime createdAt;

    public Students() {
        // TODO Auto-generated constructor stub
    }
public Students(UUID id,String studentNo , String nationalId,String firstName,String lastName,  LocalDate birthDate, Gender gender,String email,String phone,String address,UUID programId,Integer enrollmentYear,Integer classYear,StudentStatus status,String photoUrl,OffsetDateTime createdAt)
{ 
    
    this.id=id;
     this.studentNo=studentNo;
      this.nationalId=nationalId;
       this.firstName=firstName;
        this.lastName=lastName;
         this.birthDate=birthDate;
          this.gender=gender;
           this.email=email;
            this.phone=phone;
             this.address=address;
              this.programId=programId;
               this.enrollmentYear=enrollmentYear;
                this.classYear=classYear;
                 this.status=status;
                  this.photoUrl=photoUrl;
                   this.createdAt=createdAt;
    
    
} 
    
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UUID getProgramId() {
        return programId;
    }

    public void setProgramId(UUID programId) {
        this.programId = programId;
    }

    public Integer getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(Integer enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public Integer getClassYear() {
        return classYear;
    }

    public void setClassYear(Integer classYear) {
        this.classYear = classYear;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

   
    @Override  
   public String toString(){
    
    return "Students:"+"id="+id+", student no="+studentNo+", name= "+firstName+" "+lastName+", email="+email+", status="+status;
    
    }
}   
      
      
      
      
      
      
      
      
      
    
    
    
    

