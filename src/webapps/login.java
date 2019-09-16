package webapps;

import appLayer.Taikhoan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Taikhoan taokhoanmoi = new Taikhoan();
        request.setAttribute("tk", request.getParameter("tk"));
        request.setAttribute("mk", request.getParameter("mk"));

        if (taokhoanmoi.thongtintaikhaondung(request.getParameter("tk"), request.getParameter("mk")))
        {
            request.setAttribute("success", "chúc mừng bạn đăng nhập thành công");
            request.getRequestDispatcher("/Chao mung.jsp").forward(request,response);}
        else
            {
                request.setAttribute("errormessage"," Mật khẩu hoặc Tài khoản không đúng vui long thu lai");
                request.getRequestDispatcher("/login.jsp").forward(request,response);}

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out =response.getWriter();
        out.print("login-name" + request.getParameter("username") + "Password:"+request.getParameter("password"));
    }
}
