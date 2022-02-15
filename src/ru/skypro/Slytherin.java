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
        return "\tХитрость: " + cunning + "\n\tАмбициозность: " + ambition + "\n\tРешительность: " + determination
                +"\n\tНаходчивость: " + resourcefulness + "\n\tЖажда власти: " + leadership;
    }
    public static void slytherinComparison(Slytherin studentOne, Slytherin studentTwo){
        String[] slytherinQualities = new String[]{"хитр", "амбициозн", "решительн","находчив","властительн"};
        int[] studentOneQualities = new int[]{studentOne.cunning, studentOne.ambition, studentOne.determination, studentOne.resourcefulness, studentOne.leadership};
        int[] studentTwoQualities = new int[]{studentTwo.cunning, studentTwo.ambition, studentTwo.determination, studentTwo.resourcefulness, studentTwo.leadership};
        for (int i = 0; i < slytherinQualities.length; i++) {
            boolean equalQuality = studentOneQualities[i] == studentTwoQualities[i];
            boolean diffQuality = studentOneQualities[i] > studentTwoQualities[i];
            if(equalQuality){
                System.out.println(studentOne.getStudentName() + " и " + studentTwo.getStudentName() + " одинаково "+ slytherinQualities[i]+ "ы");
            }else if(diffQuality){
                System.out.println(studentOne.getStudentName() +" "+slytherinQualities[i]+ "ее, чем " + studentTwo.getStudentName());
            } else{
                System.out.println(studentTwo.getStudentName() +" "+slytherinQualities[i]+ "ее, чем " + studentOne.getStudentName());
            }
        }
        System.out.println();
    }
}
