package org.itstep.prokopchik.logic;

import org.itstep.prokopchik.Admin;
import org.itstep.prokopchik.Client;
import org.itstep.prokopchik.database.dao.admin.DAOAdminImpl;
import org.itstep.prokopchik.database.dao.client.DAOClientImpl;

public class LoginLogic {

    public static boolean checkLogin(String enterLogin, String enterPass, String adminflag) {


        if(adminflag.equals("администратор")){
            Admin admin = new Admin();

            admin = new DAOAdminImpl().getAdmin(enterLogin, enterPass);

            return admin != null &&
                    admin.getPassword().equals(enterPass);
        }

        else{

            Client client = new Client();

            client = new DAOClientImpl().getClient(enterLogin);

            return client != null &&
                    client.getPassword().equals(enterPass);
        }
    }

}
