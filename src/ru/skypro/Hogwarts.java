package ru.skypro;

public class Hogwarts {
    private String studentName;
    private int spellPower;
    private int transgressionDistance;
    public Hogwarts ( String studentName, int spellPower, int transgressionDistance ) {
        this.studentName = studentName;
        this.spellPower = spellPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getSpellPower () {
        return spellPower;
    }
    public void setSpellPower ( int spellPower ) {
        this.spellPower = spellPower;
    }

    public int getTransgressionDistance () {
        return transgressionDistance;
    }
    public void setTransgressionDistance ( int transgressionDistance ) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getStudentName () {
        return studentName;
    }

    public String generalQualities(){
        return "Имя: " + studentName +". Мощность заклинаний: " + spellPower+
                ", Дистанция трансгрессии: " + transgressionDistance;
    }
    public static void studentDesc(Hogwarts student){
        System.out.println("Общая характеристика студента:");
        System.out.println(" "+ student.generalQualities());
        System.out.println("Качества, соответствующие факультету: ");
        System.out.println("  "+student.toString());
        System.out.println();
    }
    public static void studentGeneralComparison ( Hogwarts studentOne, Hogwarts studentTwo ) {
        if (studentOne.spellPower > studentTwo.spellPower){
            System.out.println(studentOne.studentName + " сильнее владеет магией, чем " + studentTwo.studentName);
        } else if(studentOne.spellPower == studentTwo.spellPower){
            System.out.println(studentOne.studentName + " и " + studentTwo.studentName + " одинаково сильны в магии");
        } else {
            System.out.println(studentTwo.studentName + " сильнее владеет магией, чем " + studentOne.studentName);}
        if (studentOne.transgressionDistance > studentTwo.transgressionDistance){
            System.out.println(studentOne.studentName + " умеет трансгрессировать дальше, чем " + studentTwo.studentName);
        } else if(studentOne.transgressionDistance == studentTwo.transgressionDistance){
            System.out.println(studentOne.studentName +" и " + studentTwo.studentName + " умеют трансгрессировать на одинаковое расстояние");
        } else {
            System.out.println(studentTwo.studentName + " умеет трансгрессировать дальше, чем " + studentOne.studentName);}
    }
}

