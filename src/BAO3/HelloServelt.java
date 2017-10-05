package BAO3;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class HelloServelt {
    public static class HelloServlet extends HttpServlet{
        public void service(HttpServletRequest request,
                            HttpServletResponse response)
                throws ServletException,IOException{
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Hello Servlet</h1>");
            out.close();
        }

    }
    public static  void main(String [] args){
        HelloServlet kk = new HelloServlet();

    }
}


