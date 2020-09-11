package chapter18_6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

// 現在時刻を表示するサーブレット（開発環境が必要）
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        Date d = new Date();
        PrintWriter w = res.getWtriter();
        res.setContentType("Text/html");
        w.write("<html><body>");
        w.write("Today is " + d.toString());
        w.write("</body></html>");
    }
}
