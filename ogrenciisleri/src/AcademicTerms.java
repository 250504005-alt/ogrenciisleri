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

public class AcademicTerms {
     private UUID id;
    private String code;
    private String name;
    private String academicYear;
    private Semester semester;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate registrationStart;
    private LocalDate registrationEnd;
    private LocalDate addDropEnd;
    private Boolean isActive;

    public AcademicTerms() {
        // TODO Auto-generated constructor stub
    }

   public AcademicTerms(UUID id,String code,String name,String academicYear,Semester semester, LocalDate startDate,LocalDate endDate,LocalDate registrationStart,LocalDate registrationEnd,LocalDate addDropEnd,Boolean isActive) {
      
       
       this.id=id;
        this.code=code;
         this.name=name;
          this.academicYear=academicYear;
           this.semester=semester;
            this.startDate=startDate;
             this.endDate=endDate;
              this.registrationStart=registrationStart;
               this.registrationEnd=registrationEnd;
                this.addDropEnd=addDropEnd;
                 this.isActive=isActive;   
          
    }  
    
  
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getRegistrationStart() {
        return registrationStart;
    }

    public void setRegistrationStart(LocalDate registrationStart) {
        this.registrationStart = registrationStart;
    }

    public LocalDate getRegistrationEnd() {
        return registrationEnd;
    }

    public void setRegistrationEnd(LocalDate registrationEnd) {
        this.registrationEnd = registrationEnd;
    }

    public LocalDate getAddDropEnd() {
        return addDropEnd;
    }

    public void setAddDropEnd(LocalDate addDropEnd) {
        this.addDropEnd = addDropEnd;
    }

    public Boolean isActive() {
        return isActive;
    }

    public void setActive(Boolean isActive) {
        this.isActive = isActive;
    }

@Override  
   public String toString(){
    
    return "academic term:"+"id="+id+", code="+code+", name= "+name;
    
    }
}   

