package com.qibill.problem;

// : generics/UseList.java
// {CompileTimeError} (Won't compile)
import java.util.*;

public class UseList<W, T> {
	void f(List<T> v) {
	}

	//由于擦拭 参数 List<T> v 和 List<W> v被认为是相同的参数
/*	void f(List<W> v) {
	}*/
} /// :~
