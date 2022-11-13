package com.gj.xr.servlet;

import com.gj.xr.Bean.Website;
import com.gj.xr.Dao.WebstieDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/website/*")
public class WebsiteServlet extends BaseServlet {
    private WebstieDao dao = new WebstieDao();

    public void admin(HttpServletRequest request, HttpServletResponse respone) throws Exception {
        List<Website> websites = dao.list();
        Website website = (websites == null) ? null : websites.get(0);
        request.setAttribute("website", website);
        request.getRequestDispatcher("").forward(request, respone);
    }
}
