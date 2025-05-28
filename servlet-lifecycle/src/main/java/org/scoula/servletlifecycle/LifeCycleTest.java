package org.scoula.servletlifecycle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/life-cycle")
public class LifeCycleTest extends HttpServlet {
    private int initCount = 1;
    private int serviceCount = 1;
    private int destroyCount = 1;

    // 서블릿 컨테이너에 의해 호출되며, 최초 요청시에는 init() 다음으로 동작
    // 이후 요청을 받을 때 마다 service() 동작
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service() 메서드 호출" + serviceCount++);
    }

    // 서블릿 컨테이너가 종료될 때 호출되는 메서드
    @Override
    public void destroy() {
        System.out.println("destroy() 메서드 호출" + destroyCount++);
    }

    // 최초 서블릿 요청시 호출되는 메서드
    @Override
    public void init() throws ServletException {
        System.out.println("init() 메서드 호출" + initCount++);
    }
}
