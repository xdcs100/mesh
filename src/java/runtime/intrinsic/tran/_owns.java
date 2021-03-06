/**
 * ADOBE SYSTEMS INCORPORATED
 * Copyright 2009-2013 Adobe Systems Incorporated
 * All Rights Reserved.
 *
 * NOTICE: Adobe permits you to use, modify, and distribute
 * this file in accordance with the terms of the MIT license,
 * a copy of which can be found in the LICENSE.txt file or at
 * http://opensource.org/licenses/MIT.
 */
package runtime.intrinsic.tran;

import runtime.intrinsic.IntrinsicLambda;
import runtime.rep.Tuple;
import runtime.tran.TransactionManager;

/**
 * Tuplized version of own()
 *
 * @author Basil Hosmer
 */
public final class _owns extends IntrinsicLambda
{
    public static final _owns INSTANCE = new _owns(); 
    public static final String NAME = "owns";

    public String getName()
    {
        return NAME;
    }

    public Object apply(final Object arg)
    {
        return invoke((Tuple)arg);
    }

    public static Tuple invoke(final Tuple boxes)
    {
        return TransactionManager.owns(boxes);
    }
}
