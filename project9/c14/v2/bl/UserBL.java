package c14.v2.bl;

import c14.v2.dao.UserDao;
import c14.v2.exception.FalsePWDException;
import c14.v2.exception.NoUserException;

public class UserBL {
	private String USERNAME = "tom";
	private String PWD = "123";
	{
		UserDao userDao = new UserDao();
		String s = userDao.read();
		String[] userinfo = s.split(":");
		USERNAME = userinfo[0];
		PWD = userinfo[1];
	}
	public int verify(String username,String pwd) {

		if(username.equals(USERNAME) && pwd.equals(PWD)) {
			return 0;
		}else if(!username.equals(USERNAME)) {
			return -1;
		}else if(!pwd.equals(PWD)) {
			return -2;
		}else {
			System.out.println("An unkown error!");
			return -9;
		}
	}
	public void verify2(String username,String pwd) 
			throws NoUserException, FalsePWDException {
		UserDao userDao = new UserDao();
		String s = userDao.read();
		String[] userinfo = s.split(":");
		if(!username.equals(userinfo[0])) {
			throw new NoUserException();
		}else if(!pwd.equals(userinfo[1])) {
			throw new FalsePWDException();
		}
	}
}
