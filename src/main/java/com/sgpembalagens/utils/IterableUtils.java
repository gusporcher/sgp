package com.sgpembalagens.utils;

import java.util.ArrayList;
import java.util.List;

public class IterableUtils {
	
	public static<T> List<T> toList(Iterable<T> iterable){
		List<T> lista = new ArrayList<>();
		
		iterable.forEach(t -> lista.add(t));
		
		return lista;
	}
}
