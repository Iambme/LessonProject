package lesson.sql.ex2;

import org.checkerframework.checker.units.qual.C;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Connection connection;
    public static void main(String[] args) throws SQLException {

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lesson?serverTimezone=UTC", "root", "BEtlF0G23780");
        ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM owner");
        List<Owner> owners = new ArrayList<>();
        while(rs.next()){

            owners.add(new Owner(rs.getInt("id"), rs.getString("name"), getCarById(rs.getInt("car_id")), getPassportById(rs.getInt("passport_id"))));
        }
        owners.forEach(System.out::println);

        //запрос: вывести имя человка, его серию и номер паспорта и автомобиль
        Statement stmt = connection.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT o.name, p.serial, p.number, c.model FROM owner o, passport p, car c WHERE o.id = 3 and o.passport_id = p.id and o.car_id = c.id");
        while(resultSet.next()){
            System.out.println(resultSet.getString("name")+" "+resultSet.getInt("serial")+" "+ resultSet.getInt("number")+" "+resultSet.getString("model"));
        }


    }

    public static Passport getPassportById(int id) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM passport WHERE id = ?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        if(resultSet.next()) {
            return new Passport(resultSet.getInt("id"), resultSet.getInt("serial"), resultSet.getInt("number"));
        }
        //throw new RuntimeException("No passport with id "+id);
        return new Passport();
    }


    public static Car getCarById(int id) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM car WHERE id = ?");
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        if(resultSet.next()) {
            return new Car(resultSet.getInt("id"), resultSet.getString("model"));
        }
        //throw new RuntimeException("No car with id "+id);
        return new Car();
    }

}
