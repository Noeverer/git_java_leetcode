import com.kuang.dao.UserDao;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void getUserList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }


    @Test
    public void getUserId(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User userId = userDao.getUserId(1);
        System.out.println(userId.toString());
        sqlSession.close();
    }


    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int userId = userDao.addUser(new User(3,"哈哈哈哈","hahahah"));
        System.out.println(userId);
        //增删改查需要提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int userId = userDao.updateUser(new User(3,"wawawa","wawawa"));
        System.out.println(userId);
        //增删改查需要提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int userId = userDao.updateUser(new User(3,"wawawa","wawawa"));
        System.out.println(userId);
        //增删改查需要提交事务
        sqlSession.commit();
        sqlSession.close();
    }


}
