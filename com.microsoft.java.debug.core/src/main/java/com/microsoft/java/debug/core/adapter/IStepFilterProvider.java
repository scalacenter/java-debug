/*******************************************************************************
 * Copyright (c) 2020 Microsoft Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Microsoft Corporation - initial API and implementation
 *******************************************************************************/

package com.microsoft.java.debug.core.adapter;

import com.microsoft.java.debug.core.protocol.Requests;
import com.sun.jdi.Location;
import com.sun.jdi.Method;

public interface IStepFilterProvider extends IProvider {
    boolean shouldSkipOver(Method method, Requests.StepFilters filters);

    boolean shouldSkipOut(Location upperLocation, Method method);
}
