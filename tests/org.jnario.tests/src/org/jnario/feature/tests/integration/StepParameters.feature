/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration

Feature: Step Parameters
	
	Scenario: Parameters are defined in quotes
		When I have a feature with parameters
			'''
				package bootstrap
				Feature: Test feature
					Scenario: using fields in step definitions
						String x
						Given some values "3", "4"
							x = args.get(0)
						Then it should be possible to get the value
							x => "3"
			'''
			jnarioFile = args.first
		Then it should execute successfully

	Scenario: Access of parameters with first, second, ...
		When I access those parameters
			'''
				package bootstrap
				Feature: Test feature
					Scenario: using fields in step definitions
						String x
						Given some values "3", "4"
							x = args.first
						Then it should be possible to get the value
							x => "3"
			'''
			jnarioFile = args.first
		Then it should execute successfully

	Scenario: Parameter definition in steps and Background
		When I define parameters in a background
			'''
				package bootstrap 
				Feature: Test feature
					Background:
						String x
						Given some values "3", "4"
							x = args.get(1)
					Scenario: using fields in step definitions
						Then those values should be accessible
							x => "4"
							
			'''
			jnarioFile = args.first
		Then it should execute successfully
		
	Scenario: Parameter definition in and steps
		When I define parameters in a an and step
			'''
				Feature: Test feature
				Scenario: "And" args in step definition
					var strings = <String>list()
					Given a string "hello"
						strings += args.first
						And another string "world"
							strings += args.first
					Then the string is
						strings => list("hello", "world")
						
				Scenario: "And" args in step reference
					var strings = <String>list()
					Given a string "hello"
						strings += args.first
						And a string "world"
					Then the string is
						strings => list("hello", "world")
			'''
			jnarioFile = args.first
		Then it should execute successfully
		
	Scenario: Referencing variables that contain a value from args
		When I have a scenario that references a step with arguments
			'''
				package bootstrap 
				Feature: Test feature
					Scenario: using fields in step definitions
						String x
						String y 
						Given the value "hello"
							x = args.first
						When I add " world"
							y = x + args.first
						Then it should be "hello world"
							y should be args.first
							
			'''
			jnarioFile = args.first
		Then it should execute successfully
		
	Scenario: Using multiline Strings
		When I have a scenario with multiline strings
			jnarioFile = "
				package bootstrap 
				Feature: Test feature
					Scenario: using multiline strings in step definitions
						String x
						Given the multine string: 
							'''hello'''
							x = args.first
						Then it should be \"hello\"
							x should be args.first
			"
		Then it should execute successfully
		
