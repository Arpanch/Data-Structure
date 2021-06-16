package com.arpan.rule.engine;

import java.util.LinkedHashSet;
import java.util.Set;


public abstract class AbstractRule<T extends RuleDTO> implements Rule<T> {

	private String ruleName;

	
	private Set<? extends AbstractRule<T>> subRules = new LinkedHashSet<>();
	

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}


	public Set<? extends AbstractRule<T>> getSubRules() {
		return subRules;
	}

	
	public void setSubRules(Set<? extends AbstractRule<T>> subRules) {
		this.subRules = subRules;
	}


	public AbstractRule(String ruleName, Set<? extends AbstractRule<T>> subRules) {
		super();
		this.ruleName = ruleName;
		this.subRules = subRules;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ruleName == null) ? 0 : ruleName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractRule<T> other = (AbstractRule<T>) obj;
		if (ruleName == null) {
			if (other.ruleName != null)
				return false;
		} else if (!ruleName.equals(other.ruleName))
			return false;
		return true;
	}




	@Override
	public void process(T t) throws Exception {
		if (getSubRules().size()>0) {
			for (AbstractRule<T> rule : this.getSubRules()) {
				rule.execute(t);
			}
		}

	}

	@Override
	public String toString() {
		return "AbstractRule [ruleName=" + ruleName + ", subRules=" + subRules + "]";
	}
	
	

}
