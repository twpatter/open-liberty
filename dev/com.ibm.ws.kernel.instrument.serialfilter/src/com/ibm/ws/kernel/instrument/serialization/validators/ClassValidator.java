/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.kernel.instrument.serialization.validators;

import com.ibm.ws.kernel.instrument.serialization.util.Functor;

/** Perform a validation step on a retrieved class object. */
abstract class ClassValidator extends Functor<Class<?>,Class<?>> {
}
