package org.itsimulator.germes.app.service.transform.impl;

import java.util.List;

import org.itsimulator.germes.app.infra.util.ReflectionUtil;

/**
 * Base functionality of the field preparation
 * @author Morenets
 *
 */
public class FieldProvider {
	public List<String> getFieldNames(Class<?> source, Class<?> dest) {
		return ReflectionUtil.findSimilarFields(source, dest);
	}
}
