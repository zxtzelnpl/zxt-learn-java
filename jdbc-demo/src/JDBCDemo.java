import dao.PersonDao;
import model.Person;

import java.sql.SQLException;

public class JDBCDemo {
    public static void main(String[] args){
        PersonDao personDao = new PersonDao();
        Person p = new Person();
        p.setUserName("ZhaoXueTong");

        try{
            personDao.addPerson(p);
            personDao.addPerson(p);
            personDao.addPerson(p);
            personDao.addPerson(p);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
