/*
 * Password Management Servlets (PWM)
 * http://www.pwm-project.org
 *
 * Copyright (c) 2006-2009 Novell, Inc.
 * Copyright (c) 2009-2018 The PWM Project
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package password.pwm.ws.server;

import com.novell.ldapchai.provider.ChaiProvider;
import lombok.Value;
import password.pwm.bean.UserIdentity;
import password.pwm.config.option.WebServiceUsage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Set;

@Value
public class RestAuthentication implements Serializable
{
    private RestAuthenticationType type;
    private String namedSecretName;
    private UserIdentity ldapIdentity;
    private Set<WebServiceUsage> usages;
    private boolean thirdPartyEnabled;
    private transient ChaiProvider chaiProvider;

    public final Object readObject( ) throws IOException, ClassNotFoundException
    {
        throw new IOException( "class can not be de-serialized" );
    }
}
