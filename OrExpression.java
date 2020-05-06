package jieshiqimoshi;

public class OrExpression implements Expression {
	private Expression expr1=null;
	private Expression expr2=null;
	public OrExpression(Expression expr1,Expression expr2) {
		this.expr1=expr1;
		this.expr2=expr2;
		// TODO 自动生成的构造函数存根
	}
	@Override
	public boolean interpret(String context) {
		// TODO 自动生成的方法存根
		return expr1.interpret(context)||expr2.interpret(context);
	}
 }
