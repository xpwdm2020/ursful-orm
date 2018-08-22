/*
 * Copyright 2017 @ursful.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ursful.framework.orm.support;
public enum ExpressionType {
    CDT_None, //
    CDT_Equal, //=
    CDT_NotEqual,//<> !=
    CDT_Like,// like %x% 不建议使用
    CDT_StartWith,// x% 建议使用
    CDT_EndWith,// %x  禁止使用 除非特定情况
    CDT_Less,// <
    CDT_More,// >
    CDT_LessEqual,// <=
    CDT_MoreEqual,// >=
    CDT_In, // []/List/Collection/Set
    CDT_NotIn,
    CDT_NotLike,// _a ...
    CDT_IS_NULL,
    CDT_IS_NOT_NULL;

    public static ExpressionType getType(String name){
        if(name != null && !"".equals(name)){
            try {
                return ExpressionType.valueOf(name.trim());
            }catch (Exception e){}
        }
        return CDT_None;
    }
}