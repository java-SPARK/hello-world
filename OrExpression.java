package jieshiqimoshi;

public class OrExpression implements Expression {
	private Expression expr1=null;
	private Expression expr2=null;
	public OrExpression(Expression expr1,Expression expr2) {
		this.expr1=expr1;
		this.expr2=expr2;
		// TODO �Զ����ɵĹ��캯�����
	}
	@Override
	public boolean interpret(String context) {
		// TODO �Զ����ɵķ������
		return expr1.interpret(context)||expr2.interpret(context);
	}
 }
