/* Woodstox Lite ("wool") XML processor
 *
 * Copyright (c) 2006- Tatu Saloranta, tatu.saloranta@iki.fi
 *
 * Licensed under the License specified in the file LICENSE which is
 * included with the source code.
 * You may not use this file except in compliance with the License.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fasterxml.aalto.stax;

import javax.xml.namespace.QName;

import org.codehaus.stax2.ri.Stax2EventFactoryImpl;

/**
 * Simple event factory implementation, mostly based on the reference
 * implementation included in Stax2 API jar.
 *
 * @author Tatu Saloranta
 */
public final class EventFactoryImpl
    extends Stax2EventFactoryImpl
{
    /*
    /////////////////////////////////////////////////////
    // Life-cycle:
    /////////////////////////////////////////////////////
     */

    public EventFactoryImpl()
    {
        super();
    }

    /*
    /////////////////////////////////////////////////////////////
    // Internal/helper methods
    /////////////////////////////////////////////////////////////
     */

    protected QName createQName(String nsURI, String localName) {
        return new QName(nsURI, localName);
    }

    protected QName createQName(String nsURI, String localName, String prefix) {
        return new QName(nsURI, localName, prefix);
    }
}
