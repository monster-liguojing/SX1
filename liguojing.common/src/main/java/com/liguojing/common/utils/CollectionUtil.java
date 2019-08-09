package com.liguojing.common.utils;

import java.util.List;
import java.util.Map;

public class CollectionUtil {
	public boolean notEmpty(List<String> list) {

		return list.isEmpty();

	}

	public boolean notEmpty(Map<String, String> map) {
		return map.isEmpty();
	}
}
