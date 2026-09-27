/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tugbanurturkmen
 */
import java.util.UUID;

public class Courses {
    private UUID id;
    private String code;
    private String name;
    private UUID departmentId;
    private Integer credits;
    private Integer theoryHours;
    private Integer labHours;
    private CourseType courseType;
    private String language;
    private String description;
    private Boolean isActive;

    public Courses() {
        // TODO Auto-generated constructor stub
    }

    
    
   public Courses(UUID id,String code,String name,UUID departmentId,Integer credits,Integer theoryHours,Integer labHours,CourseType courseType,String language,String description,Boolean isActive) {
  
       
       this.id=id;
        this.code=code;
         this.name=name;
          this.departmentId=departmentId;
           this.credits=credits;
            this.theoryHours=theoryHours;
             this.labHours=labHours;
              this.courseType=courseType;
               this.language=language;
                this.description=description;
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

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getTheoryHours() {
        return theoryHours;
    }

    public void setTheoryHours(Integer theoryHours) {
        this.theoryHours = theoryHours;
    }

    public Integer getLabHours() {
        return labHours;
    }

    public void setLabHours(Integer labHours) {
        this.labHours = labHours;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isActive() {
        return isActive;
    }

    public void setActive(Boolean isActive) {
        this.isActive = isActive;
    }

@Override  
   public String toString(){
    
    return "Course:"+"id="+id+", code="+code+", name= "+name+", credits="+credits;
    
    }
}   
  



