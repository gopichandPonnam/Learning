package com.Login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.Pojo.User.UserPojo;
@org.springframework.stereotype.Controller
public class LoginController{
	
	@RequestMapping("/login.htm")
	public ModelAndView Login(HttpServletRequest req, HttpServletResponse res) throws Exception {
		/*DatabaseConnectionDemo dd = DatabaseConnectionDemo.getInstance();
		
		int login = dd.select(req.getParameter("userName"), req.getParameter("password"));*/
		
		Configuration conf = new Configuration();
		conf.configure("Hibernate.cfg.xml");
		SessionFactory fac = conf.buildSessionFactory();
		Session ses = fac.openSession();
		//UserPojo up = new UserPojo();
		Query qr = ses.createQuery("select from UserPojo s where s.name=? s.pass = ?");
		System.out.println("****************************************************");
		qr.setParameter(0,req.getParameter("userName"));
		qr.setParameter(1,req.getParameter("password"));
	
	List l = qr.list();
		if(!l.isEmpty()) {
			ModelAndView mv = new ModelAndView("options");
			return mv;
		}
		
		else {
			ModelAndView mv = new ModelAndView("index");
			return mv;
		}
			
	}

}
