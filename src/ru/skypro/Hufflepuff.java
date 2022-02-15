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

    public static void hufflepuffComparison ( Hufflepuff studentOne, Hufflepuff studentTwo ) {
        String[] ravenClawQualities = new String[]{"старательн", "верн", "честн"};
        int[] studentOneQualities = new int[]{studentOne.diligence, studentOne.loyalty, studentOne.honesty};
        int[] studentTwoQualities = new int[]{studentTwo.diligence, studentTwo.loyalty, studentTwo.honesty};
        for (int i = 0; i < ravenClawQualities.length; i++) {
            boolean equalQuality = studentOneQualities[i] == studentTwoQualities[i];
            boolean diffQuality = studentOneQualities[i] > studentTwoQualities[i];
            if (equalQuality) {
                System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково " + ravenClawQualities[i] + "ы");
            } else if (diffQuality) {
                System.out.println(studentOne.getStudentName() + " " + ravenClawQualities[i] + "ее, чем " + studentTwo.getStudentName());
            } else {
                System.out.println(studentTwo.getStudentName() + " " + ravenClawQualities[i] + "ее, чем " + studentOne.getStudentName());
            }
        }
        System.out.println();
    }
}
