package lesson.sql.ex1;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lesson?serverTimezone=UTC", "root", "BEtlF0G23780");

        String login = "user2";
        String password = "admin123";
//        Statement stmt = connection.createStatement();
//        int val = stmt.executeUpdate(String.format("INSERT INTO user (login, password) VALUES('%s', '%s')", login, password));
//        System.out.println(val);


//        PreparedStatement stmt = connection.prepareStatement("INSERT INTO user (login, password) VALUES(?, ?)");
//        stmt.setString(1, login);
//        stmt.setString(2, password);
//        int val = stmt.executeUpdate();
//        System.out.println(val);



//        ResultSet rs = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT login, password FROM user");
//        if(rs.relative(2)){
//            System.out.println(rs.getString("login"));
//        }else{
//            System.out.println("error");
//        }

        //Транзакции
        connection.setAutoCommit(false);
        try {
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO user (login, password) VALUES(?, ?)");
            stmt.setString(1, "user3");
            stmt.setString(2, "admin123");
            int val = stmt.executeUpdate();

            stmt = connection.prepareStatement("INSERT INTO user (login, password) VALUES(?, ?)");
            stmt.setString(1, "user4");
            stmt.setString(2, "admin123");
            val = stmt.executeUpdate();

            stmt = connection.prepareStatement("INSERT INTO user (login, password) VALUES(?, ?)");
            stmt.setString(1, "user5");
            stmt.setString(2, "admin123");
            val = stmt.executeUpdate();
            int randValue = (int)(Math.random()*2);
            if(randValue==0) {
                throw new RuntimeException("somthing wrong");
            }

            stmt = connection.prepareStatement("INSERT INTO user (login, password) VALUES(?, ?)");
            stmt.setString(1, "user6");
            stmt.setString(2, "admin123");

            connection.commit();
        }catch(Exception e){
            System.out.println(e.toString());
            connection.rollback();
        }






    }
}
