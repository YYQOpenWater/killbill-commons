/*
 * Copyright 2014 Groupon, Inc
 *
 * Groupon licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.automaton;

import org.killbill.xmlloader.ValidatingConfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public abstract class StateMachineValidatingConfig<Context> extends ValidatingConfig<Context> {

    protected StateMachineEntry getEntry(final StateMachineEntry [] entries, final String entryName) throws MissingEntryException {
        for (StateMachineEntry cur : entries) {
            if (cur.getName().equals(entryName)) {
                return cur;
            }
        }
        throw new MissingEntryException("Unknown entry " + entryName);
    }

}