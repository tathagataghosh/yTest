/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.yTest.yTestcommercewebservices.swagger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;


@Target(value =
{ ElementType.TYPE, ElementType.METHOD })
@Retention(value = RetentionPolicy.RUNTIME)
@ApiImplicitParams(
{ @ApiImplicitParam(name = "baseSiteId", value = "Base site identifier", required = true, dataType = "String", paramType = "path"),
		@ApiImplicitParam(name = "userId", value = "User identifier or one of the literals : 'current' for currently authenticated user, 'anonymous' for anonymous user", required = true, dataType = "String", paramType = "path") })
public @interface ApiBaseSiteIdAndUserIdParam
{
	//empty
}
