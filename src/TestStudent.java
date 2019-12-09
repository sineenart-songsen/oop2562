 public class TestStudent{
public static void main(String[] args)  {
        Student sineenart = new Student();
        System.out.println("Object = "+sineenart);
        sineenart.studentId = "614234006";
        sineenart.major = "cs";
        sineenart.faculty = "Scinrce and ";
        sineenart.showData();
        sineenart.enrollment();
        sineenart.dropCourse();
        
        Student supansa = new Student();
        supansa.studentId = "614234022";
        supansa.studentName = "Miss Neme";
        supansa.major = "CS";
        supansa.faculty = "Science and Technorogy";
        System.out.println("Objet = "+supansa);
        supansa.showData();
        
        
        
        //instanciate Object
        GraduateStudet too = new GraduateStudet();
        too.studyLevl = "Year2";
        too.thesisAdviser = "Dr.Bean";
        
        
        
    }
    
}
