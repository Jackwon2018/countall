package sjjg.designmode.interpreter;

import main.designmode.interpreter.Expression;

import java.util.HashMap;

/**
 * ����������Ž����� ���ÿ��������ţ���ֻ���Լ��������������й�ϵ��
 * ���������������п���Ҳ��һ�������Ľ�������ۺ������ͣ�����Expression���ʵ����
 * 
 * @author Administrator
 *
 */
public class SymbolExpression extends main.designmode.interpreter.Expression {

	protected main.designmode.interpreter.Expression left;
	protected main.designmode.interpreter.Expression right;

	public SymbolExpression(main.designmode.interpreter.Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//��Ϊ SymbolExpression ������������ʵ�֣���� interpreter ��һ��Ĭ��ʵ��
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
}
