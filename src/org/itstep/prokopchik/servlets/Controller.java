package org.itstep.prokopchik.servlets;

import org.itstep.prokopchik.command.ActionCommand;
import org.itstep.prokopchik.command.factory.ActionFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

    /**
     * Servlet implementation class Controller
     */
    @WebServlet("/controller")
    public class Controller extends HttpServlet {
        private static final long serialVersionUID = 1L;

        /**
         * @see HttpServlet#HttpServlet()
         */
        public Controller() {
            super();
            // TODO Auto-generated constructor stub
        }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub

        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub

            processRequest(request, response);
        }

        private void processRequest(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            String page = null;

            // определение команды, пришедшей из JSP
            ActionFactory client = new ActionFactory();
            ActionCommand command = client.defineCommand(request);

					  /*
					     * вызов реализованного метода execute() и передача параметров
					     * классу-обработчику конкретной команды
					  */
            page = command.execute(request);
            // метод возвращает страницу ответа
            // page = null; // поэксперементировать!

            if (page != null) {
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);

                // вызов страницы ответа на запрос
                dispatcher.forward(request, response);

            } else {
                // установка страницы c cообщением об ошибке

                // page = ConfigurationManager.getProperty("path.page.index");
                page = "/index.jsp";

                //request.getSession().setAttribute("nullPage", MessageManager.getProperty("message.nullpage"));
                request.getSession().setAttribute("nullPage", "Page not found. Business logic error");

                response.sendRedirect(request.getContextPath() + page);
            }

        }
    }
