package sample.mybatis;

import static org.junit.Assert.assertTrue;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.OutputCapture;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhili.ApplicationStart;
import com.zhili.police.mapper.CityMapper;
import com.zhili.police.mapper.TsAjaxsqlMapper;
import com.zhili.police.model.TsAjaxsql;

/**
 * @author Eddú Meléndez
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationStart.class)
public class SampleMybatisApplicationTest {
	// @Autowired
	// private DoSomthing doSomthing;

	@ClassRule
	public static OutputCapture out = new OutputCapture();

	// private SqlSession sqlSession;
	@Autowired
	private CityMapper cityMapper;

	@Autowired
	private TsAjaxsqlMapper tsAjaxsqlMapper;

	@Test
	public void test() {
		// City city = new City();
		// city.setCountry("11");
		// city.setName("11");
		// city.setState("11");
		// cityMapper.insert(city);

		// Assert.assertNotNull(doSomthing);
		// System.out.println(sqlSession.getConnection());
		// assertNotNull(sqlSession);

		TsAjaxsql tmp = new TsAjaxsql();
		tmp.setCode("1111");
		tsAjaxsqlMapper.insert(tmp);

		// String output = out.toString();
		//
		// assertTrue("Wrong output: " + output, output.contains("1,San
		// Francisco,CA,US"));
		// assertTrue("Wrong output: " + output, output.contains("1,Conrad
		// Treasury Place,William & George Streets,4001"));
	}

}