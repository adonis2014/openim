// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.1
//
// <auto-generated>
//
// Generated from file `Filesystem2.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Filesystem2;

public final class FileHolder extends Ice.ObjectHolderBase<File>
{
    public
    FileHolder()
    {
    }

    public
    FileHolder(File value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof File)
        {
            value = (File)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _FileDisp.ice_staticId();
    }
}
