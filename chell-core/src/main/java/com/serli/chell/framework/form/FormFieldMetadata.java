/*
 *  Copyright 2011-2012 SERLI (www.serli.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package com.serli.chell.framework.form;

import com.serli.chell.framework.form.FormFieldConfiguration.NoConfiguration;
import com.serli.chell.framework.form.converter.FieldConverter;
import com.serli.chell.framework.form.converter.IdentityFieldConverter;
import com.serli.chell.framework.validation.Constraint;
import com.serli.chell.framework.validation.NoConstraint;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Vincent Michaud (vincent.michaud@serli.com)
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
@Inherited
public @interface FormFieldMetadata {
    Class<? extends Constraint<?>> constraint() default NoConstraint.class;
    Class<? extends FieldConverter<?, ?>> converter() default IdentityFieldConverter.class;
    Class<? extends FormFieldConfiguration<?>> configuration() default NoConfiguration.class;
}
