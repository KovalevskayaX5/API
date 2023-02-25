public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Яна";
        post.surname = "Ковалевская";
        post.patronymic = "Михайловна";
        post.passport = "1956 № 126985";
        post.phone = "+7 956 458 96 63";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 20;
        post.birthday.month = 12;
        post.birthday.year = 1996;
    }
}
