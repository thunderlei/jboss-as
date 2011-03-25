/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.as.ee.component;

import org.jboss.as.naming.ManagedReferenceFactory;
import org.jboss.msc.service.ServiceName;
import org.jboss.msc.value.Value;

/**
 * An Injection Point and the {@link org.jboss.as.naming.ManagedReferenceFactory} that creates the injected value.
 *
 * @author Stuart Douglas
 */
class JndiInjectedValue {

    private final InjectionTargetDescription injectionTarget;
    private final Value<ManagedReferenceFactory> referenceFactory;
    private final ServiceName serviceName;

    public JndiInjectedValue(InjectionTargetDescription injectionTarget, Value<ManagedReferenceFactory> referenceFactory, ServiceName serviceName) {
        this.referenceFactory = referenceFactory;
        this.injectionTarget = injectionTarget;
        this.serviceName = serviceName;
    }

    public InjectionTargetDescription getInjectionTarget() {
        return injectionTarget;
    }

    public Value<ManagedReferenceFactory> getReferenceFactory() {
        return referenceFactory;
    }

    public ServiceName getServiceName() {
        return serviceName;
    }
}