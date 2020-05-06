package mobanfangfamoshi;

public class UserManager extends BaseManager {
	public void execute(String method) {
		if("add".equals(method)) {
			System.out.println("执行了添加操作");
		}else if("del".equals(method)) {
			System.out.println("执行了删除操作"); 
		}
	}
}
