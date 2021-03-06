package zsc.gof.dao.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zsc.gof.dao.OrderDao;
import zsc.gof.entity.Orderinfo;
import zsc.gof.entity.Premises;
import zsc.gof.entity.Userinfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/config/application*.xml"})
public class TestOrderDao {
	@Autowired OrderDao dao;
	@Test public void test(){
		Orderinfo orderinfo = new Orderinfo();
		orderinfo.setOrderTime(new Date());
		Premises premises = new Premises();
		premises.setBuildId(220);
		orderinfo.setPremises(premises);
		Userinfo userinfo = new Userinfo();
		userinfo.setUserId(3);
		orderinfo.setUserinfo(userinfo);
		orderinfo.setState(1);
		dao.insertOrder(orderinfo);
	}
	@Test public void test2(){
		List<Orderinfo> list=dao.queryOrderinfoByUserId(3);
		System.out.println(list.size());
	}
	
}
