import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner key  = new Scanner(System.in);
        System.out.println("Welcome, let's build your resume!");

        //Create a new resume
        Resume resume = new Resume();
        System.out.println("Enter your full name: ");
        resume.setName(key.nextLine());
        System.out.println("Enter your email: ");
        resume.setEmail(key.nextLine());

        Education education = new Education();
        System.out.println();//just a space
        System.out.println("Now, let's fill up your education information!");
        System.out.println("Enter your type of degree e.g(Associate's, Bachelor's, Master's, PhD): ");
        education.setDegreeType(key.nextLine());
        System.out.println("Enter your major: ");
        education.setMajor(key.nextLine());
        System.out.println("Enter your University name: ");
        education.setUniversity(key.nextLine());
        System.out.println("Enter your graduation year: ");
        education.setGraduationYear(key.nextLine());

        Experience experience = new Experience();
        System.out.println();//just a space
        System.out.println("Now, let's fill up your Work Experience information!");
        System.out.println("Enter company name: ");
        experience.setCompany(key.nextLine());
        System.out.println("Enter your job title: ");
        experience.setJobTitle(key.nextLine());
        System.out.println("Enter your start date e.g, June 28, 2018: ");
        experience.setStartDate(key.nextLine());
        System.out.println("Enter your end date e.g, July 28, 2019:: ");
        experience.setEndDate(key.nextLine());
        System.out.println("Enter a short job description: ");
        experience.setJobDescription(key.nextLine());

        Skills skills = new Skills();
        ArrayList<String> skillsList = new ArrayList<>();
        ArrayList<String> proficiencyList = new ArrayList<>();
        //Fill in the skill arrayList and the proficiency arrayList
        System.out.println();//just a space
        System.out.println("Now, let's fill up your skills information!");
        System.out.println("Enter a skill");
        skillsList.add(key.nextLine());
        System.out.println("What's your proficiency in that skill? (Fundamental, Novice, Intermediate, Advance, Expert)");
        proficiencyList.add(key.nextLine());
        System.out.println("Enter a second skill");
        skillsList.add(key.nextLine());
        System.out.println("What's your proficiency in that skill? (Fundamental, Novice, Intermediate, Advance, Expert)");
        proficiencyList.add(key.nextLine());
        System.out.println("Enter a third skill");
        skillsList.add(key.nextLine());
        System.out.println("What's your proficiency in that skill? (Fundamental, Novice, Intermediate, Advance, Expert)");
        proficiencyList.add(key.nextLine());
        skills.setSkillName(skillsList);
        skills.setProficiency(proficiencyList);

        resume.displayLines();//Display Resume formatting

        ArrayList<Resume> resumeList = new ArrayList<>();
        resumeList.add(resume);
        for(Resume r : resumeList){
            r.displayText();
        }

        ArrayList<Education> educationList = new ArrayList<>();
        educationList.add(education);
        for(Education e : educationList){
            e.displayText();
        }

        ArrayList<Experience> experienceList = new ArrayList<>();
        experienceList.add(experience);
        for(Experience ex : experienceList){
            ex.displayText();
        }

        ArrayList<Skills> skillsArrayList = new ArrayList<>();
        skillsArrayList.add(skills);
        for(Skills s : skillsArrayList){
            s.displayText();
        }

    }
}
