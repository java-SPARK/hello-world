package mobanfangfamoshi;

public abstract class BaseManager {
	public void action(String name,String method) {
		if("admin".equals(name)){
			execute(method);
		}else{
			System.out.println("你没有操作权限");
		}
	}
	public abstract void execute(String method);
}
