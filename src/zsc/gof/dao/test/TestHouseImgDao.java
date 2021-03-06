package zsc.gof.dao.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zsc.gof.dao.HouseImgDao;
import zsc.gof.entity.HouseImg;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/config/application*.xml"})
public class TestHouseImgDao {
	@Autowired HouseImgDao dao;
	
	@Test public void testHouseImg(){
		List<HouseImg> imgs = dao.queryHouseImgByHouseId(222);
		System.out.println(imgs.size());
	}
	@Test public void testinsertHouseImg(){
		HouseImg houseImg = new HouseImg();
		houseImg.setHouseId(174);
		houseImg.setImgUrl("123");
		dao.insertHouseImg(houseImg);
	}
}
