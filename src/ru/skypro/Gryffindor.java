package ru.skypro;

public class Gryffindor extends Hogwarts{
    private int chivalry;
    private int courage;
    private int honor;

    public Gryffindor ( String studentName, int spellPower, int transgressionDistance, int chivalry, int courage, int honor ) {
        super(studentName, spellPower, transgressionDistance);
        this.chivalry = chivalry;
        this.courage = courage;
        this.honor = honor;
    }
    public String toString(){
        return  "\tБлагородство: " + chivalry + "\n\tХрабрость: " + courage + "\n\tЧесть: " + honor;
    }

    public static void gryffindorComparison( Gryffindor studentOne, Gryffindor studentTwo){
        boolean equalChivalry = studentOne.chivalry == studentTwo.chivalry;
        boolean diffChivalry = studentOne.chivalry > studentTwo.chivalry;
        boolean equalCourage = studentOne.courage == studentTwo.courage;
        boolean diffCourage = studentOne.courage > studentTwo.courage;
        boolean equalHonor = studentOne.honor == studentTwo.honor;
        boolean diffHonor = studentOne.honor > studentTwo.honor;
        if (equalChivalry){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково благородны");
        } else if (diffChivalry){
            System.out.println(studentOne.getStudentName() +" благороднее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" благороднее, чем " + studentOne.getStudentName());
        }
        if (equalCourage){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково храбры");
        } else if (diffCourage){
            System.out.println(studentOne.getStudentName() +" храбрее, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" храбрее, чем " + studentOne.getStudentName());
        }
        if (equalHonor){
            System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " имеют одинаковую честь");
        } else if (diffHonor){
            System.out.println(studentOne.getStudentName() +" имеет больше чести, чем " + studentTwo.getStudentName());
        } else {
            System.out.println(studentTwo.getStudentName() +" имеет больше чести, чем " + studentOne.getStudentName());
        }
    }
}
