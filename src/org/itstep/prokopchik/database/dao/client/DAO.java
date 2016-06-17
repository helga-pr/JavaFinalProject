package org.itstep.prokopchik.database.dao.client;

import org.itstep.prokopchik.Client;

public abstract class DAO {

    abstract public Client createClient(String login, String password, String name, String middleName, String lastname);

    abstract public Client getClient(String login);
}
