package org.itstep.prokopchik.database.dao.admin;

import org.itstep.prokopchik.Admin;

abstract public class DAO {

    abstract public Admin createAdmin(String login, String password);

    abstract public Admin getAdmin(String login, String password);
}
