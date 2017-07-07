package edu.umich.verdict.relation.expr;

import edu.umich.verdict.VerdictContext;
import edu.umich.verdict.exceptions.VerdictException;

public class ConstantExpr extends Expr {
	
	private Object value;

	public ConstantExpr(Object value) {
		this.value = value;
	}
	
	public static ConstantExpr from(Object value) {
		return new ConstantExpr(value);
	}
	
	public static ConstantExpr from(String value) {
		return from((Object) value); 
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public <T> T accept(ExprVisitor<T> v) {
		return v.call(this);
	}

}