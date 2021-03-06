/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
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

package org.jboss.as.ejb3;

import org.jboss.as.ejb3.component.messagedriven.MessageDrivenComponentDescription;
import org.jboss.as.ejb3.component.session.SessionBeanComponentDescription;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: jpai
 */
public class EjbJarDescription {

    private List<SessionBeanComponentDescription> sessionBeans = new ArrayList<SessionBeanComponentDescription>();

    private List<MessageDrivenComponentDescription> messageDrivenBeans = new ArrayList<MessageDrivenComponentDescription>();

    /**
     * Returns the {@link SessionBeanComponentDescription session beans} belonging to this {@link EjbJarDescription}.
     * <p/>
     * Returns an empty collection if no session beans exist
     *
     * @return
     */
    public Collection<SessionBeanComponentDescription> getSessionBeans() {
        return this.sessionBeans;
    }

    public void addSessionBean(SessionBeanComponentDescription sessionBean) {
        this.sessionBeans.add(sessionBean);
    }

    /**
     * Adds the passed <code>sessionBeans</code> to this {@link EjbJarDescription}
     *
     * @param sessionBeans
     */
    public void addSessionBeans(Collection<SessionBeanComponentDescription> sessionBeans) {
        this.sessionBeans.addAll(sessionBeans);
    }

    public void addMessageDrivenBean(MessageDrivenComponentDescription mdb) {
        this.messageDrivenBeans.add(mdb);
    }

    public Collection<MessageDrivenComponentDescription> getMessageDrivenBeans() {
        return this.messageDrivenBeans;
    }
}
