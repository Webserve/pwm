/*
 * Password Management Servlets (PWM)
 * http://www.pwm-project.org
 *
 * Copyright (c) 2006-2009 Novell, Inc.
 * Copyright (c) 2009-2021 The PWM Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package password.pwm.util.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.Instant;

public class PwmDateFormatTest
{
    @Test
    public void testDateFormat() throws ParseException
    {
        final PwmDateFormat pwmDateFormat = MiscUtil.newPwmDateFormat( "yyyyMMddhhmmss" );
        Assertions.assertEquals( "19700101120000", pwmDateFormat.format( Instant.ofEpochMilli( 0 ) ) );
    }

    @Test
    public void testDateParse() throws ParseException
    {
        final PwmDateFormat pwmDateFormat = MiscUtil.newPwmDateFormat( "yyyyMMddhhmmss" );
        Assertions.assertEquals( Instant.ofEpochMilli( 0 ), pwmDateFormat.parse( "19700101120000" ) );
    }
}
