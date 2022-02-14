package ru.skypro;

public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff ( String studentName, int spellPower, int transgressionDistance,
                        int diligence, int loyalty, int honesty ) {
        super(studentName, spellPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String toString(){
        return "\tТрудолюбие: " + diligence + "\n\tВерность: " + loyalty + "\n\tЧестность: "+ honesty;
    }
    public static void hufflepuffComparison(Hufflepuff studentOne, Hufflepuff studentTwo){
        boolean equalDiligence = studentOne.diligence == studentTwo.diligence;
        boolean diffDiligence = studentOne.diligence > studentTwo.diligence;
        boolean equalLoyalty = studentOne.loyalty == studentTwo.loyalty;
        boolean diffLoyalty = studentOne.loyalty > studentTwo.loyalty;
        boolean equalHonesty = studentOne.honesty == studentTwo.honesty;
        boolean diffHonesty = studentOne.honesty > studentTwo.honesty;
        if (equalDiligence){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково трудолюбивы");
        } else if (diffDiligence){
            System.out.println(studentOne.getStudentName() +" трудолюбивее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" трудолюбивее, чем " + studentOne.getStudentName());
        }
        if (equalLoyalty){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково верны");
        } else if (diffLoyalty){
            System.out.println(studentOne.getStudentName() +" вернее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" вернее, чем " + studentOne.getStudentName());
        }
        if (equalHonesty){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково честны");
        } else if (diffHonesty){
            System.out.println(studentOne.getStudentName() +" честнее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" честнее, чем " + studentOne.getStudentName());
        }
    }
}
