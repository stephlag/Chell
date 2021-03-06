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

package com.serli.chell.framework.form.annotation;

import com.serli.chell.framework.constant.Constant;
import com.serli.chell.framework.constant.FormType;
import com.serli.chell.framework.reflect.AnnotationMetaData;
import com.serli.chell.framework.reflect.AnnotationMetaData.Type;
import com.serli.chell.framework.form.FormInputMetadata;
import com.serli.chell.framework.resource.Resource;
import com.serli.chell.framework.upload.UploadHandler;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Vincent Michaud (vincent.michaud@serli.com)
 */
@Target(FIELD)
@Retention(RUNTIME)
@Documented
@Inherited
@FormInputMetadata(type = FormType.FILE)
@Resource(path = "/resources/upload/upload.js")
public @interface HtmlInputFile {

    @AnnotationMetaData(Type.MESSAGE_KEY)
    String key() default Constant.EMPTY;

    @AnnotationMetaData(Type.MESSAGE_TEXT)
    String label() default Constant.EMPTY;

    @AnnotationMetaData(Type.MESSAGE_BUNDLE)
    String bundle() default Constant.EMPTY;

    @AnnotationMetaData(Type.PREFERENCE_NAME)
    String prefName() default Constant.EMPTY;

    @AnnotationMetaData(Type.FIELD_ORDER)
    int order() default Constant.DEFAULT_ORDER;

    @AnnotationMetaData(Type.HTML_CSS_CLASS)
    String cssClass() default Constant.EMPTY;

    @AnnotationMetaData(Type.HTML_ID)
    String id() default Constant.EMPTY;

    @AnnotationMetaData(Type.HTML_SIZE)
    int size() default Constant.UNSPECIFIED;

    @AnnotationMetaData(Type.FIELD_FILE_UPLOAD_HANDLER)
    Class<? extends UploadHandler> handler();
}
