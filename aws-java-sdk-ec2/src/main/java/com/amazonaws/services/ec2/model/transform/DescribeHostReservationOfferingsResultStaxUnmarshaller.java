/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeHostReservationOfferingsResult StAX Unmarshaller
 */
public class DescribeHostReservationOfferingsResultStaxUnmarshaller implements Unmarshaller<DescribeHostReservationOfferingsResult, StaxUnmarshallerContext> {

    public DescribeHostReservationOfferingsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeHostReservationOfferingsResult describeHostReservationOfferingsResult = new DescribeHostReservationOfferingsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeHostReservationOfferingsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("offeringSet", targetDepth)) {
                    describeHostReservationOfferingsResult.withOfferingSet(new ArrayList<HostOffering>());
                    continue;
                }

                if (context.testExpression("offeringSet/member", targetDepth)) {
                    describeHostReservationOfferingsResult.withOfferingSet(HostOfferingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("nextToken", targetDepth)) {
                    describeHostReservationOfferingsResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeHostReservationOfferingsResult;
                }
            }
        }
    }

    private static DescribeHostReservationOfferingsResultStaxUnmarshaller instance;

    public static DescribeHostReservationOfferingsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHostReservationOfferingsResultStaxUnmarshaller();
        return instance;
    }
}
