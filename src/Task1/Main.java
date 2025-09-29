package Task1;
import java.util.Comparator;
public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);
    cats.sort(Comparator.comparing(Cat::getBreed));


        cats.sort(
                Comparator.comparing(Cat::getName)
                        .thenComparing(Cat::getAge)
        ) ;

        cats.removeIf( cat -> cat.getColor() == Cat.Color.GINGER );

        cats.removeIf( cat -> cat.getName().length() == 5);

        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        // cats.sort(?);
        // Printer.print(cats);
    }

}
