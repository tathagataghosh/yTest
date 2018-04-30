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
package com.ytest.conv;

import de.hybris.platform.commercefacades.product.data.ReviewData;
import com.ytest.product.data.ReviewDataList;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;


/**
 * Specific converter for a {@link ReviewDataList} object.
 */
public class ReviewDataListConverter extends AbstractRedirectableConverter
{
	@Override
	public boolean canConvert(final Class type)
	{
		return type == getConvertedClass();
	}

	@Override
	public void marshal(final Object source, final HierarchicalStreamWriter writer, final MarshallingContext context)
	{
		final ReviewDataList reviews = (ReviewDataList) source;

		for (final ReviewData rd : reviews.getReviews())
		{
			writer.startNode("review");
			context.convertAnother(rd);
			writer.endNode();
		}
	}

	@Override
	public Object unmarshal(final HierarchicalStreamReader reader, final UnmarshallingContext context)
	{
		return getTargetConverter().unmarshal(reader, context);
	}

	@Override
	public Class getConvertedClass()
	{
		return ReviewDataList.class;
	}


}
