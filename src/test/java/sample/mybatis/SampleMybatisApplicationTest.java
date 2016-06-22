package sample.mybatis;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.OutputCapture;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhili.ApplicationStart;
import com.zhili.police.mapper.FBjgxxMapper;
import com.zhili.police.model.FBjgxx;

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

	@Autowired
	private FBjgxxMapper fBjgxxMapper;

	// private SqlSession sqlSession;

	@Test
	public void test() {
		FBjgxx tmp = new FBjgxx();
		System.out.println(fBjgxxMapper.selectCount(tmp));
		// City city = new City();
		// city.setCountry("11");
		// city.setName("11");
		// city.setState("11");
		// cityMapper.insert(city);

		// Assert.assertNotNull(doSomthing);
		// System.out.println(sqlSession.getConnection());
		// assertNotNull(sqlSession);

		// TsAjaxsql tmp = new TsAjaxsql();
		// tmp.setCode("1111");

		// String output = out.toString();
		//
		// assertTrue("Wrong output: " + output, output.contains("1,San
		// Francisco,CA,US"));
		// assertTrue("Wrong output: " + output, output.contains("1,Conrad
		// Treasury Place,William & George Streets,4001"));
	}

}