package ru.skypro;

public class Main {

    public static void main ( String[] args ) {
        Gryffindor Harry = new Gryffindor("Гарри Поттер", 100, 4, 5, 67, 99);
        Gryffindor Hermione = new Gryffindor("Гермиона Грейнджер", 55, 4, 50, 90, 78);
        Gryffindor Ronald = new Gryffindor("Рон Уизли", 21, 4, 78, 49, 87);

        Slytherin Malfoy = new Slytherin("Драко Малфой", 59, 23, 54, 21, 90, 11, 92);
        Slytherin Monetgru = new Slytherin("Грэхэм Монтегю", 45, 89, 22, 21, 90, 11, 45);
        Slytherin Goyl = new Slytherin("Грегори Гойл", 67, 12, 54, 21, 11, 56, 87);

        Hufflepuff Smith = new Hufflepuff("Захария Смит", 42, 49, 59, 68, 90);
        Hufflepuff Diggory = new Hufflepuff("Седрик Диггори", 12, 87, 98, 25, 78);
        Hufflepuff Finch = new Hufflepuff("Джастин Финч-Флетчли", 56, 77, 43, 67, 89);

        RavenClaw Chang = new RavenClaw("Чжоу Чанг", 78, 98, 25, 87, 56, 43);
        RavenClaw Padma = new RavenClaw("Падма Патил", 78, 98, 54, 74, 87, 34);
        RavenClaw Markus = new RavenClaw("Маркус Белби", 78, 67, 87, 65, 74, 74);

        Hogwarts.studentGeneralComparison(Malfoy, Harry); System.out.println();
        Hogwarts.studentDesc(Chang); System.out.println();
        Hogwarts.studentDesc(Malfoy); System.out.println();
        Hogwarts.studentDesc(Markus); System.out.println();
        Hogwarts.studentGeneralComparison(Padma, Goyl); System.out.println();
        Gryffindor.gryffindorComparison(Ronald, Hermione); System.out.println();
        Slytherin.slytherinComparison(Monetgru, Goyl); System.out.println();
        Hufflepuff.hufflepuffComparison(Smith, Finch); System.out.println();
        Hufflepuff.hufflepuffComparison(Diggory, Smith); System.out.println();
        Hogwarts.studentGeneralComparison(Chang, Markus); System.out.println();

    }
}
