package com.raghu;

public class CalServerProxy implements com.raghu.CalServer {
  private String _endpoint = null;
  private com.raghu.CalServer calServer = null;
  
  public CalServerProxy() {
    _initCalServerProxy();
  }
  
  public CalServerProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalServerProxy();
  }
  
  private void _initCalServerProxy() {
    try {
      calServer = (new com.raghu.CalServerServiceLocator()).getCalServer();
      if (calServer != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calServer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calServer)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calServer != null)
      ((javax.xml.rpc.Stub)calServer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.raghu.CalServer getCalServer() {
    if (calServer == null)
      _initCalServerProxy();
    return calServer;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (calServer == null)
      _initCalServerProxy();
    return calServer.add(i, j);
  }
  
  public int sub(int i, int j) throws java.rmi.RemoteException{
    if (calServer == null)
      _initCalServerProxy();
    return calServer.sub(i, j);
  }
  
  
}