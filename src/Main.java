//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        University[] universities = new University[3];
        universities[0] = new University();
        universities[0].setName("Гарвард");
        universities[0].setCity("Кэмбридж");
        universities[0].setFoundationYear(1636);

        universities[1] = new University();
        universities[1].setName("М.И.Т");
        universities[1].setCity("Кэмбридж");
        universities[1].setFoundationYear(1861);

        universities[2] = new University();
        universities[2].setName("Стенфорд");
        universities[2].setCity("Город Стэнфорд");
        universities[2].setFoundationYear(1885);


        School[] schools = new School[3];
        schools[0] = new School();
        schools[0].setName("И.Арабаев");
        schools[0].setStudentsCount(500);
        schools[0].setPublic(true);

        schools[1] = new School();
        schools[1].setName("Калыгул Бай Улуу");
        schools[1].setStudentsCount(450);
        schools[1].setPublic(false);

        schools[2] = new School();
        schools[2].setName("Каракоо мектеби");
        schools[2].setStudentsCount(400);
        schools[2].setPublic(true);

        Car[] cars = new Car[3];
        cars[0] = new Car();
        cars[0].setModel("Toyota Camry");
        cars[0].setColor("Black");
        cars[0].setYear(2020);
        cars[1] = new Car();
        cars[1].setModel("Tesla Model 3");
        cars[1].setColor("идфсл");
        cars[1].setYear(2023);

        cars[2] = new Car();
        cars[2].setModel("BMW X5");
        cars[2].setColor("White");
        cars[2].setYear(2018);

        Person[] people = new Person[3];
        people[0] = new Person();
        people[0].setName("Бекааа");
        people[0].setAge(25);
        people[0].setProfession("айтишник");

        people[1] = new Person();
        people[1].setName("Ади");
        people[1].setAge(30);
        people[1].setProfession("Учитель");

        people[2] = new Person();
        people[2].setName("Нурс");
        people[2].setAge(35);
        people[2].setProfession("Доктор");

        System.out.println("Университеты:");
        for (University university : universities) {
            System.out.println(university);
        }
        System.out.println("\nШколы:");
        for (School school : schools) {
            System.out.println(school);
        }
        System.out.println("\nМашины:");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("\nЛюди:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}





