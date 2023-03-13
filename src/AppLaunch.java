public class AppLaunch {
    public static void main(String[] args) {
        task1();
    }

    public static void task1(){
        Author author1 = new Author("Фрэнсис", "Фицджеральд");
        Author author2 = new Author("Артур", "Дойл");
        Author author3 = new Author("Александр", "Дюма");

        Book book1 = new Book("Великий Гетсби", author1, 1925);
        Book book2 = new Book("Приключения Шерлока Холмса", author2, 1892);
        Book book3 = new Book("Граф Монте-Кристо", author3, 1844);

        System.out.println("book2.getYearPublishing() = " + book2.getYearPublishing());
        book2.setYearPublishing(1898);
        System.out.println("book2.getYearPublishing() = " + book2.getYearPublishing());
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    }
}
