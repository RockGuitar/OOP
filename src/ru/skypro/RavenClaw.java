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

    public static void ravenClawComparison ( RavenClaw studentOne, RavenClaw studentTwo ) {
        String[] ravenClawQualities = new String[]{"умн", "мудр", "остроумн", "креативн"};
        int[] studentOneQualities = new int[]{studentOne.intelligence, studentOne.wisdom, studentOne.wit, studentOne.creativity};
        int[] studentTwoQualities = new int[]{studentTwo.intelligence, studentTwo.wisdom, studentTwo.wit, studentTwo.creativity};
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
