package Z2;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private int englishLevel;
    private double salary;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getExpirienceInYears() {
        return expirienceInYears;
    }

    public int getEnglishLevel() {
        return englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setExpirienceInYears(int expirienceInYears) {
        this.expirienceInYears = expirienceInYears;
    }

    public void setEnglishLevel(int englishLevel) {
        this.englishLevel = englishLevel;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void info(Tester r) {
        System.out.println("Тестер, его зовут: " + r.getName() + ", Его фамилия: " + r.getSurname() + ", его опыт: " + r.getExpirienceInYears() + ", его уровень английского: " + r.getEnglishLevel() + ", его зарплата: " + r.getSalary());
    }

    public static void info(Tester r, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("Тестер, его зовут: " + r.getName() + ", Его фамилия: " + r.getSurname() + ", его опыт: " + r.getExpirienceInYears() + ", его уровень английского: " + r.getEnglishLevel() + ", его зарплата: " + r.getSalary());
        }
    }

    public static void info() {
        System.out.println("Понятно");
    }

    public Tester(String a) {
        name = a;
    }

    public Tester(String a, String b, int c) {
        this(a);
        surname = b;
        expirienceInYears = c;
    }

    public Tester(String a, String b, int c, int d, double e) {
        this(a, b, c);
        englishLevel = d;
        salary = e;
    }
}
