package com.arpan.rule.engine;

public interface Rule<T> {

	default boolean skip(T t) {
		return false;
	}
	
	default void execute(T t) throws Exception {
		init(t);
		if(!skip(t)) {
			process(t);
			postProcess(t);
		}
	}
	
	default void init(T t) throws Exception {
	}
	
	void process(T t) throws Exception;
	
	default void postProcess(T t) throws Exception {
	}
}