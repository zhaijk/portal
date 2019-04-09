package com.sxds.portal;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sxds.portal.model.User;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = MallPortalApplication.class)
public class AppTest {
//    class User implements Serializable{
//    	/**
//		 * 
//		 */
//		private static final long serialVersionUID = 1L;
//		private String name;
//    	public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public int getAge() {
//			return age;
//		}
//		public void setAge(int age) {
//			this.age = age;
//		}
//		public int getSex() {
//			return sex;
//		}
//		public void setSex(int sex) {
//			this.sex = sex;
//		}
//		private int age;
//    	private int sex;
//    	private boolean flag;
//		public boolean isFlag() {
//			return flag;
//		}
//		public void setFlag(boolean flag) {
//			this.flag = flag;
//		}
//		@Override
//		public String toString() {
//			return "User [name=" + name + ", age=" + age + ", sex=" + sex + ", flag=" + flag + "]";
//		}
//		public Map<String ,Object> toHashMap(){
//			Map<String ,Object> obj=new HashMap<String ,Object>();
//			obj.put("name", name);
//			obj.put("age", age);
//			obj.put("sex", sex);
//			obj.put("flag", flag);
//			return obj;
//		}
//    }
	@Autowired
    private RedisTemplate<String,Object> redisTemplate;
	@Autowired
    private StringRedisTemplate strRedisTemplate;
    @Test
    public void op() {
//    	User user=new User();
//    	user.setAge(11);
//    	user.setName("zhaijk");
//    	//System.out.println(user);
//    	for(int i=0;i<10;i++) {
//    		user.setAge(100+i*20);
//    		user.setName("zhaijk"+i*i);
//    		redisTemplate.opsForHash().putAll("zhaijk:"+i, user.toHashMap());
//    	}
//    	for(int i=0;i<10 ;i++) {
//    		Object u=redisTemplate.opsForHash().get("zhaijk:"+i, "name");
//    		System.out.println("user:"+u);
//    	}
//    	redisTemplate.opsForHash().put("zhaijk", "age",11);
//    	int re=(int) redisTemplate.opsForHash().get("zhaijk", "age");
//    	System.out.println(re);
    	//redisTemplate.setHashValueSerializer(hashValueSerializer);
    	User user=new User();
    	user.setPassword("123456");
    	user.setName("zhaijk");
    	for(int i=0;i<10;i++) {
    		user.setAge(100+i);
    		user.setName("zhaijk"+i);
    		redisTemplate.opsForHash().putAll("user:"+i, user.toHashMap());
    	}
//    	BoundHashOperations<String, String, Object> operation=redisTemplate.boundHashOps("zhaijk");
//    	operation.put("password", user.getPassword());
//    	operation.put("name", user.getName());
//    	BoundHashOperations<String, String, Object> operationget=redisTemplate.boundHashOps("zhaijk");
    	//System.out.println(operationget.get("password").toString()+operationget.get("name"));
    	
    }
}
