package stunning.programmer.hr.servlets;
import stunning.programmer.hr.dl.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class AddDesignation extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)
{
String title = request.getParameter("title");
DesignationDAO designationDAO = new DesignationDAO();
DesignationDTO designationDTO =new DesignationDTO();
designationDTO.setTitle(title);
try
{
PrintWriter pw= null;
try
{
designationDAO.add(designationDTO);
pw= response.getWriter();
response.setContentType("text/plain");
pw.println("Designation added");
}
catch(DAOException daoException)
{
pw = response.getWriter();
response.setContentType("text/plain");
pw.println(daoException.getMessage());
}
}
catch(Exception exception)
{
System.out.println(exception);
}
}
public void doPost(HttpServletRequest request ,HttpServletResponse response)
{
try
{
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
}
catch(Exception exception){}
}

}