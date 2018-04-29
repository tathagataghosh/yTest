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
package com.yTest.yTestcommercewebservices.queues.util;

import com.yTest.yTestcommercewebservices.queues.data.ProductExpressUpdateElementData;

import javax.annotation.Nullable;

import org.apache.commons.lang.StringUtils;

import com.google.common.base.Predicate;


public class ProductExpressUpdateElementPredicate implements Predicate<ProductExpressUpdateElementData>
{
	private ProductExpressUpdateElementData productExpressUpdateElementData;

	public ProductExpressUpdateElementPredicate()
	{
		super();
	}

	public ProductExpressUpdateElementPredicate(final ProductExpressUpdateElementData productExpressUpdateElementData)
	{
		super();
		this.productExpressUpdateElementData = productExpressUpdateElementData;
	}

	@Override
	public boolean apply(@Nullable final ProductExpressUpdateElementData input)
	{

		return areElementsEqual(productExpressUpdateElementData, input);
	}

	protected boolean areElementsEqual(final ProductExpressUpdateElementData element1,
			final ProductExpressUpdateElementData element2)
	{
		if (element1 == element2) //NOSONAR
		{
			return true;
		}

		if (element1 == null || element2 == null)
		{
			return false;
		}

		if (!StringUtils.equals(element1.getCode(), element2.getCode()))
		{
			return false;
		}

		if (!StringUtils.equals(element1.getCatalogVersion(), element2.getCatalogVersion()))
		{
			return false;
		}

		if (!StringUtils.equals(element1.getCatalogId(), element2.getCatalogId()))
		{
			return false;
		}

		return true;
	}

	public ProductExpressUpdateElementData getProductExpressUpdateElementData()
	{
		return productExpressUpdateElementData;
	}

	public void setProductExpressUpdateElementData(final ProductExpressUpdateElementData productExpressUpdateElementData)
	{
		this.productExpressUpdateElementData = productExpressUpdateElementData;
	}

}
