/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tugbanurturkmen
 */
import java.util.UUID;
import java.time.LocalDate;

public class Instructors {
    private UUID id;
    private String employeeNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String email;
    private UUID departmentId;
    private String title;
    private String specialization;
    private LocalDate hireDate;
    private Boolean isActive;

    public Instructors() {
        // TODO Auto-generated constructor stub
    }

    
    public Instructors(UUID id,String employeeNo,String nationalId, String firstName, String lastName, String email,UUID departmentId,String title,String specialization,LocalDate hireDate,Boolean isActive) {
   
    this.id=id;
     this.employeeNo=employeeNo;
      this.nationalId=nationalId;
       this.firstName=firstName;
        this.lastName=lastName;
         this.departmentId=departmentId;
          this.title=title;
           this.email=email;
            this.specialization=specialization;
             this.hireDate=hireDate;
              this.isActive=isActive;  
        
    }
    
   
    
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(UUID departmentId) {
        this.departmentId = departmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public LocalDate gethireDate() {
        return hireDate;
    }

    public void sethireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public Boolean isActive() {
        return isActive;
    }

    public void setActive(Boolean isActive) {
        this.isActive = isActive;
    }


@Override  
   public String toString(){
    
    return "Instructor:"+"id="+id+", employee id="+employeeNo+", name= "+firstName+" "+lastName+", email="+email+", title="+title;
    
    }
}   
      



