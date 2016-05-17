/*
 * generated by Xtext
 */
package edu.vanderbilt.isis.chariot;

import org.eclipse.xtext.generator.IGenerator;

import edu.vanderbilt.isis.chariot.generator.DataTypesGenerator;



/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class DatatypesRuntimeModule extends edu.vanderbilt.isis.chariot.AbstractDatatypesRuntimeModule {
	@Override
	public Class<? extends IGenerator> bindIGenerator() {
		return DataTypesGenerator.class;
	}

}