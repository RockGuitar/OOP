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

    public static void gryffindorComparison(Gryffindor studentOne, Gryffindor studentTwo){
        String[] gryffindorQualities = new String[]{"благородн", "храбр", "почётн"};
        int[] studentOneQualities = new int[]{studentOne.chivalry, studentOne.courage, studentOne.honor};
        int[] studentTwoQualities = new int[]{studentTwo.chivalry, studentTwo.courage, studentTwo.honor};
        for (int i = 0; i < gryffindorQualities.length; i++) {
            boolean equalQuality = studentOneQualities[i] == studentTwoQualities[i];
            boolean diffQuality = studentOneQualities[i] > studentTwoQualities[i];
            if(equalQuality){
                System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково "+ gryffindorQualities[i]+ "ы");
            }else if(diffQuality){
                System.out.println(studentOne.getStudentName() +" "+gryffindorQualities[i]+ "ее, чем " + studentTwo.getStudentName());
            } else{
                System.out.println(studentTwo.getStudentName() +" "+gryffindorQualities[i]+ "ее, чем " + studentOne.getStudentName());
            }
        }
        System.out.println();
    }
}
