package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
    
public class TelefonoController implements Controller{
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr,
            HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("telefono");
        String out = "telefono: ";
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            List result = session.createQuery("from Telefono").list();
            mv.addObject("telefono", result);
            session.getTransaction().commit();
        } catch (Exception e) {
             HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().rollback();
            e.printStackTrace();
        }
        mv.addObject("message", out);
        return mv;
    }
    
}
