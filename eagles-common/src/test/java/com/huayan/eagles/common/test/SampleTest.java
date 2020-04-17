package com.huayan.eagles.common.test;

import com.huayan.eagles.common.entity.User;
import com.huayan.eagles.common.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author caihua
 * @version 1.0
 * @date 2020/4/7
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.huayan.eagles.common.mapper")
public class SampleTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSelect() {
		System.out.println(("----- selectAll method test ------"));
		List<User> userList = userMapper.selectList(null);
		Assert.assertEquals(5, userList.size());
		userList.forEach(System.out::println);
	}

}
