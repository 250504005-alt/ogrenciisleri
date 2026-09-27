/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tugbanurturkmen
 */
import java.util.UUID;
public class Programs {
    
    private UUID id;
    private String code;
    private String name;
    private UUID departmentId;
    private DegreeLevel degreeLevel;
    private Integer totalCredits;
    private Integer durationYears;
    private String language;
    private Boolean isActive;

    public Programs() {
        // TODO Auto-generated constructor stub
    }

    
    public Programs(UUID id,String code, String name,UUID departmentId, DegreeLevel degreeLevel,  Integer totalCredits, Integer durationYears, String language ,Boolean isActive )
    { 
    this.id=id;
     this.code=code;
      this.name=name;
       this.departmentId=departmentId;
        this.degreeLevel=degreeLevel;
         this.totalCredits=totalCredits;
          this.durationYears=durationYears;
           this.language=language;
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

    public UUID getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(UUID departmentId) {
        this.departmentId = departmentId;
    }

    public DegreeLevel getdegreeLevel() {
        return degreeLevel;
    }

    public void setDegreeLevel(DegreeLevel degreeLevel) {
        this.degreeLevel = degreeLevel;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public int getDurationYears() {
        return durationYears;
    }

    public void setDurationYears(int durationYears) {
        this.durationYears = durationYears;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
 @Override
public String toString(){  
    
    
    return "Program: "+name+" Degree Level:"+degreeLevel;
}
}
  
    
    
    
    

