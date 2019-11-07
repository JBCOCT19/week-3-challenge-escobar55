import java.util.ArrayList;

public class Skills {
    private ArrayList<String> skillName;
    private ArrayList<String> proficiency;

    public Skills() {
    }//Default constructor

    public Skills(ArrayList<String> skillName, ArrayList<String> proficiency ) {
        this.skillName = skillName;
        this.proficiency = proficiency;
    }

    //getters and setters
    public ArrayList<String> getSkillName() {
        return skillName;
    }

    public void setSkillName(ArrayList<String> skillName) {
        this.skillName = skillName;
    }

    public ArrayList<String> getProficiency() {
        return proficiency;
    }

    public void setProficiency(ArrayList<String> proficiency) {
        this.proficiency = proficiency;
    }

    public void displayText(){
        System.out.println();//Space
        System.out.println("Skills");
        System.out.println(skillName.get(0) + ", " + proficiency.get(0));
        System.out.println(skillName.get(1) + ", " + proficiency.get(1));
        System.out.println(skillName.get(2) + ", " + proficiency.get(2));

    }
}
