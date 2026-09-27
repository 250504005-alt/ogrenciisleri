/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tugbanurturkmen
 */
import java.util.UUID;

public class ProgramCourses {
    private UUID id;
    private UUID programId;
    private UUID courseId;
    private Integer semesterOrder;
    private CourseType courseType;
    private Boolean isActive;

    public ProgramCourses() {
        // TODO Auto-generated constructor stub
    }

    public ProgramCourses(UUID id,UUID programId,UUID courseId,Integer semesterOrder,CourseType courseType,Boolean isActive) {
      
        this.id=id;
         this.programId=programId;
          this.courseId=courseId;
           this.semesterOrder=semesterOrder;
            this.courseType=courseType;
             this.isActive=isActive;
             
    }
    
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getProgramId() {
        return programId;
    }

    public void setProgramId(UUID programId) {
        this.programId = programId;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    public Integer getSemesterOrder() {
        return semesterOrder;
    }

    public void setSemesterOrder(Integer semesterOrder) {
        this.semesterOrder = semesterOrder;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public Boolean isActive() {
        return isActive;
    }

    public void setActive(Boolean isActive) {
        this.isActive = isActive;
    }
    

@Override  
   public String toString(){
    
    return "program course:"+"id="+id+", COURSE id="+courseId+", Program Id= "+programId+", semester Order="+semesterOrder;
    
    }
} 

