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

public interface _FileOperations extends _NodeOperations
{
    String[] read(Ice.Current __current);

    void write(String[] text, Ice.Current __current)
        throws GenericError;
}
