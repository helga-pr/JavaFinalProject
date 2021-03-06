package org.itstep.prokopchik.command;

import org.itstep.prokopchik.Client;
import org.itstep.prokopchik.database.dao.client.DAOClientImpl;
import org.itstep.prokopchik.logic.LoginLogic;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

public class LoginCommand implements ActionCommand {

    private static final String PARAM_NAME_LOGIN = "login";
    private static final String PARAM_NAME_PASSWORD = "password";
    private static final String PARAM_NAME_ADMINFLAG = "adminflag";

    //@Override
    public String execute(HttpServletRequest request) {
        String page = null;

        // извлечение из запроса логина и пароля
        String login = request.getParameter(PARAM_NAME_LOGIN);
        String pass = request.getParameter(PARAM_NAME_PASSWORD);
        String flag = request.getParameter(PARAM_NAME_ADMINFLAG);

        try {
            flag = new String(flag.getBytes("ISO-8859-1"), "utf-8");//значение параметра внесено на русском языке

        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        // проверка логина и пароля
        if (LoginLogic.checkLogin(login, pass, flag)) {


            // определение пути к main.jsp

            if (flag == "администратор") {

                //страница администратора
                //page = ConfigurationManager.getProperty("path.page.main");
                request.setAttribute("user", login);

                page = "/administration.jsp";
            }

            //страница клиента
            else{
                page = "/main.jsp";
                Client client = new Client();
                client = new DAOClientImpl().getClient(login);

                String fio = client.getLastname() + " " + client.getName() + " " + client.getMiddleName();
                request.setAttribute("fio", fio);

                request.setAttribute("clientname", fio);

                request.setAttribute("login", login);

                request.setAttribute("pass", pass);

            }
        }

        else  {

            request.setAttribute("errorLoginPassMessage","Incorrect login or password.");
            //page = ConfigurationManager.getProperty("path.page.login");
            page = "/login.jsp";
        }
        return page;

    }

}

