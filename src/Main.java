public class Main {
    public static void main(String[] args) {
        Genre genre = new Genre("Наукова фантастика");
        Duration duration = new Duration(2, 30); // 2 hours 30 minutes
        Price price = new Price(12.99);

        System.out.println("Жанр: " + genre.getName());
        System.out.println("Тривалість: " + duration.getHours() + " годин " + duration.getMinutes() + " хвилин");
        System.out.println("Ціна: $" + price.getAmount());
    }
}