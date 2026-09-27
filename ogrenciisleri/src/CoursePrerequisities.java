/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tugbanurturkmen
 */
import java.util.UUID;

public class CoursePrerequisities {
    private UUID id;
    private UUID courseId;
    private UUID prerequisiteCourseId;
    private PrerequisiteType type;
    private String minGrade;

    public CoursePrerequisities () {
        // TODO Auto-generated constructor stub
    }

    
     public CoursePrerequisities (UUID id,UUID courseId,UUID prerequisiteCourseId,PrerequisiteType type,String minGrade) {
         
       this.id=id;
        this.courseId=courseId;
         this.prerequisiteCourseId=prerequisiteCourseId;
          this.type=type;
           this.minGrade=minGrade;
        
    }
    
    
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    public UUID getPrerequisiteCourseId() {
        return prerequisiteCourseId;
    }

    public void setPrerequisiteCourseId(UUID prerequisiteCourseId) {
        this.prerequisiteCourseId = prerequisiteCourseId;
    }

    public PrerequisiteType getType() {
        return type;
    }

    public void setType(PrerequisiteType type) {
        this.type = type;
    }

    public String getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(String minGrade) {
        this.minGrade = minGrade;
    }




@Override  
   public String toString(){
    
    return "Course Prerequisite:"+"id="+id+", COURSE id="+courseId+", Prerequisite Course Id= "+prerequisiteCourseId+", type="+type;
    
    }
}  