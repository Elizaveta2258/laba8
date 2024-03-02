class Person{
    String fName;
    String lName;
    String Birthday;
    Person(String fName, String lName, String Birthday){
        this.fName = fName;
        this.lName = lName;
        this.Birthday = Birthday;
    }

    void per(){
        System.out.printf( "%s %s. Год рождения: %s\n", fName, lName, Birthday);
    }
}
class Car{
    String Title;
    int Year;
    double EngSize;

    Car(String Title, int Year, double EngSize){
        this.Title = Title;
        this.Year = Year;
        this.EngSize = EngSize;
    }

    void ca(){
        System.out.printf( "%s. Год выпуска: %s. Объем двигателя: %s\n", Title, Year, EngSize);
    }
}

class Book{
    String Title;
    String Author;
    int Year;

    Book(String Title, String Author, int Year){
        this.Title = Title;
        this.Author = Author;
        this.Year = Year;
    }
    void boo(){
        System.out.printf( "%s Автор: %s. Год выпуска издания: %s\n", Title, Author, Year);
    }
    void ppp(Person person, Car car){
        System.out.println(person.fName + " читает книгу " + Title + " про машину " + car.Title);
    }
}
public class Main {
    public static void main(String[] args){
        Person person = new Person("Петров", "Петр", "31.01.1999");
        Car car = new Car("Audi", 2024, 300.0);
        Book book = new Book(".Audi в наше время.", "Август Хорьх", 2010);

        person.per();
        car.ca();
        book.boo();
        book.ppp(person, car);
    }
}