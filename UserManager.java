package mobanfangfamoshi;

public class UserManager extends BaseManager {
	public void execute(String method) {
		if("add".equals(method)) {
			System.out.println("ִ������Ӳ���");
		}else if("del".equals(method)) {
			System.out.println("ִ����ɾ������"); 
		}
	}
}
