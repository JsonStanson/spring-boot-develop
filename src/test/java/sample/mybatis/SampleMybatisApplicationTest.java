package sample.mybatis;

import static org.junit.Assert.*;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.OutputCapture;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhili.police.ApplicationStart;

/**
 * @author Eddú Meléndez
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationStart.class)
public class SampleMybatisApplicationTest {

	@ClassRule
	public static OutputCapture out = new OutputCapture();

	@Test
	public void test() {
		String output = out.toString();
		assertTrue("Wrong output: " + output, output.contains("1,San Francisco,CA,US"));
//		assertTrue("Wrong output: " + output, output.contains("1,Conrad Treasury Place,William & George Streets,4001"));
	}

}