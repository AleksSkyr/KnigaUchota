package Hogwarts;

public class main {
        public static void main(String[] args) {

                Gryffindor potter = new Gryffindor("Гари Поттер", "Грифендор",
                        80, 55, 15, 89, 60);
                Gryffindor grendger = new Gryffindor("Гермиона Грейнджер", "Грифендор",
                        70, 79, 56, 87, 15);
                Gryffindor yizli = new Gryffindor("Рон Уизли", "Грифендор",
                        55, 66, 54, 65, 20);

                Slytherin malfoy = new Slytherin("Драко Малфой", "Слизерин",
                        70, 40, 54, 65, 87, 98, 48);
                Slytherin montegy = new Slytherin("Грэхэм Монтегю", "Слизерине",
                        52, 71, 68, 35, 53, 30, 10);
                Slytherin goil = new Slytherin("Грегори Гойл", "Слизерине",
                        36, 25, 10, 29, 55, 41, 29);


                Ravenclaw smit = new Ravenclaw("Захария Смит", "Пуффендуй",
                        67, 68, 51, 41, 38, 60);
                Ravenclaw diggori = new Ravenclaw("Седрик Диггори", "Пуффендуй",
                        55, 34, 43, 54, 57, 61);
                Ravenclaw finc = new Ravenclaw("Джастин Финч-Флетчли", "Пуффендуй",
                        32, 41, 56, 45, 23, 45);


                Hufflepuff chang = new Hufflepuff("Чжоу Чанг", "Когтевран",
                        5, 6, 12, 25, 56);
                Hufflepuff patil = new Hufflepuff("Падма Патил", "Когтевран",
                        42, 36, 17, 60, 51);
                Hufflepuff belbi = new Hufflepuff("Маркус Белби", "Когтевран",
                        34, 76, 65, 39, 47);

                potter.compareTwoGryffindorStudents(yizli);
                grendger.compareTwoGryffindorStudents(potter);

                System.out.println();

                malfoy.compareTwoSlytherinStudents(montegy);
                montegy.compareTwoSlytherinStudents(goil);

                System.out.println();

                potter.compareTwoHogwartsStudents(malfoy);
                patil.compareTwoHogwartsStudents(goil);
        }
}


