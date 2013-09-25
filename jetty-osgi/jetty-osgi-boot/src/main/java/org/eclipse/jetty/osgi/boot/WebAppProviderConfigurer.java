//
//  ========================================================================
//  Copyright (c) 1995-2013 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//


package org.eclipse.jetty.osgi.boot;

/**
 * @author Gregory Fouquet
 * 
 */
public class WebAppProviderConfigurer {
	private String[] _configurationClasses;
	private String _defaultsDescriptor;
	private String _tldBundles;
	private Boolean _extractWars;

	/**
	 * 
	 */
	public WebAppProviderConfigurer() {
		super();
	}

	/**
	 * @return the _configurationClasses
	 */
	public String[] getConfigurationClasses() {
		return _configurationClasses;
	}

	/**
	 * @param _configurationClasses
	 *            the _configurationClasses to set
	 */
	public void setConfigurationClasses(String[] configurationClasses) {
		if (configurationClasses != null)
			this._configurationClasses = configurationClasses.clone();
	}

	/**
	 * @return the _defaultsDecriptor
	 */
	public String getDefaultsDescriptor() {
		return _defaultsDescriptor;
	}

	/**
	 * @param _defaultsDescriptor
	 *            the _defaultsDecriptor to set
	 */
	public void setDefaultsDescriptor(String defaultsDescriptor) {
		this._defaultsDescriptor = defaultsDescriptor;
	}

	/**
	 * @return the _tldBundles
	 */
	public String getTldBundles() {
		return _tldBundles;
	}

	/**
	 * @param _tldBundles
	 *            the _tldBundles to set
	 */
	public void setTldBundles(String tldBundles) {
		this._tldBundles = tldBundles;
	}

	/**
	 * @return the _extractWars
	 */
	public Boolean isExtractWars() {
		return _extractWars;
	}

	/**
	 * @param _extractWars
	 *            the _extractWars to set
	 */
	public void setExtractWars(boolean extractWars) {
		this._extractWars = extractWars;
	}

	public void configure(AbstractWebAppProvider provider) {
		if (_configurationClasses != null) {
			provider.setConfigurationClasses(_configurationClasses);
		}
		if (_defaultsDescriptor != null) {
			provider.setDefaultsDescriptor(_defaultsDescriptor);
		}
		if (_tldBundles != null) {
			provider.setTldBundles(_tldBundles);
		}
		if (_extractWars != null) {
			provider.setExtract(_extractWars);
		}
	}
}