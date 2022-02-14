package ru.skypro;

public class RavenClaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenClaw ( String studentName, int spellPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity ) {
        super(studentName, spellPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public String toString(){
        return "\tРазум: "+ intelligence + "\n\tМудрость: "+wisdom+"\n\tОстроумие: " + wit+"\n\tТворчество: "+ creativity;
    }
    public static void ravenClawComparison(RavenClaw studentOne, RavenClaw studentTwo) {
        boolean equalIntelligence = studentOne.intelligence == studentTwo.intelligence;
        boolean diffIntelligence = studentOne.intelligence > studentTwo.intelligence;
        boolean equalWisdom = studentOne.wisdom == studentTwo.wisdom;
        boolean diffWisdom = studentOne.wisdom > studentTwo.wisdom;
        boolean equalWit = studentOne.wit == studentTwo.wit;
        boolean diffWit = studentOne.wit > studentTwo.wit;
        boolean equalCreativity = studentOne.creativity > studentTwo.creativity;
        boolean diffCreativity = studentOne.creativity > studentTwo.creativity;
        if (equalIntelligence){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково умны");
        } else if (diffIntelligence){
            System.out.println(studentOne.getStudentName() +" умнее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" умнее, чем " + studentOne.getStudentName());
        }
        if (equalWisdom){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково мудры");
        } else if (diffWisdom){
            System.out.println(studentOne.getStudentName() +" мудрее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" мудрее, чем " + studentOne.getStudentName());
        }
        if (equalWit){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково остроумны");
        } else if (diffWit){
            System.out.println(studentOne.getStudentName() +" остроумнее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" остроумнее, чем " + studentOne.getStudentName());
        }
        if (equalCreativity){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково креативны");
        } else if (diffCreativity){
            System.out.println(studentOne.getStudentName() +" креативнее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" креативнее, чем " + studentOne.getStudentName());
        }

    }
}
