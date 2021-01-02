/**
 * CalServerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.raghu;

public interface CalServerService extends javax.xml.rpc.Service {
    public java.lang.String getCalServerAddress();

    public com.raghu.CalServer getCalServer() throws javax.xml.rpc.ServiceException;

    public com.raghu.CalServer getCalServer(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
