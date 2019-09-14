package sjjg.designmode.interpreter;

import main.designmode.interpreter.Expression;
import main.designmode.interpreter.SymbolExpression;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

	public SubExpression(main.designmode.interpreter.Expression left, Expression right) {
		super(left, right);
	}

	//���left �� right ���ʽ�����Ľ��
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}
