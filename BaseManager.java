package mobanfangfamoshi;

public abstract class BaseManager {
	public void action(String name,String method) {
		if("admin".equals(name)){
			execute(method);
		}else{
			System.out.println("��û�в���Ȩ��");
		}
	}
	public abstract void execute(String method);
}
