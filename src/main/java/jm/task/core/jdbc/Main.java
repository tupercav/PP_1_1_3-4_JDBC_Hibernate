package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Alex", "Brodyaga", (byte) 20);
        userDao.saveUser("Zloy", "Antonov", (byte) 25);
        userDao.saveUser("Kocherizhka", "Stalker", (byte) 31);
        userDao.saveUser("Maslina", "Slovlena", (byte) 38);

        for (User arg: userDao.getAllUsers()) {
            System.out.println(arg);
        }

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();





    }
}
