package homework.sql.join;

public class Main {
    public static void main(String[] args) {
        //JOIN
        /*
        без join:
        -- select u.id, u.login, p.name from lesson.user u , lesson.pet p where p.user_id = u.id and u.id = 1;

        через join:
-- select u.id, u.login, p.name from lesson.user u join lesson.pet p on u.id = p.user_id where u.id = 1;

Left join выведет всех юзеров, даже если у них нет питомцев
-- select u.id, u.login, p.name from lesson.user u left join lesson.pet p on u.id = p.user_id order by u.login
Left right выведет всех питомцев, даже если у них нет владельцев
-- select u.id, u.login, p.name from lesson.user u right join  lesson.pet p on u.id = p.user_id order by u.login
         */
    }
}
