/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * generated by Xtext
 */
package org.jnario.suite;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.parser.IParser;
import org.jnario.feature.parser.CustomFeatureParser;
import org.jnario.suite.conversion.SuiteValueConverterService;
import org.jnario.suite.parser.CustomSuiteParser;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class SuiteRuntimeModule extends org.jnario.suite.AbstractSuiteRuntimeModule {

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return SuiteValueConverterService.class;
	}
	
	@Override
	public Class<? extends IParser> bindIParser() {
		return CustomSuiteParser.class;
	}
	
	
}
