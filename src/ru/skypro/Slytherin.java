package ru.skypro;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int ambition;
    private int determination;
    private int resourcefulness;
    private int leadership;

    public Slytherin ( String studentName, int spellPower, int transgressionDistance,
                       int cunning, int ambition, int determination, int resourcefulness, int leadership ) {
        super(studentName, spellPower, transgressionDistance);
        this.cunning = cunning;
        this.ambition = ambition;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.leadership = leadership;
    }

    public String toString(){
        return "\tХитрость: " + cunning + "\n\tАмбициозность: " + ambition + "\n\tРешительность:" + determination
                +"\n\tНаходчивость: " + resourcefulness + "\n\tЖажда власти: " + leadership;
    }
    public static void slytherinComparison(Slytherin studentOne, Slytherin studentTwo){
        boolean equalCunning = studentOne.cunning == studentTwo.cunning;
        boolean diffCunning = studentOne.cunning > studentTwo.cunning;
        boolean equalAmbition = studentOne.ambition == studentTwo.ambition;
        boolean diffAmbition = studentOne.ambition > studentTwo.ambition;
        boolean equalDetermination = studentOne.determination == studentTwo.determination;
        boolean diffDetermination = studentOne.determination > studentTwo.determination;
        boolean equalResourcefulness = studentOne.resourcefulness == studentTwo.resourcefulness;
        boolean diffResourcefulness = studentOne.resourcefulness > studentTwo.resourcefulness;
        boolean equalLeadership = studentOne.leadership == studentTwo.leadership;
        boolean diffLeadership = studentOne.leadership > studentTwo.leadership;
        if (equalCunning){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково хитры");
        } else if (diffCunning){
            System.out.println(studentOne.getStudentName() +" хитрее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" хитрее, чем " + studentOne.getStudentName());
        }
        if (equalAmbition){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково амбициозны");
        } else if (diffAmbition){
            System.out.println(studentOne.getStudentName() +" амбициознее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" амбициознее, чем " + studentOne.getStudentName());
        }
        if (equalDetermination){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково решительны");
        } else if (diffDetermination){
            System.out.println(studentOne.getStudentName() +" решительнее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" решительнее, чем " + studentOne.getStudentName());
        }
        if (equalResourcefulness){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково находчивы");
        } else if (diffResourcefulness){
            System.out.println(studentOne.getStudentName() +" находчивее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" находчивее, чем " + studentOne.getStudentName());
        }
        if (equalLeadership){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково властительны");
        } else if (diffLeadership){
            System.out.println(studentOne.getStudentName() +" властительнее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" властительнее, чем " + studentOne.getStudentName());
        }
    }
}
