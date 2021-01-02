package com.raghu;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Service;

public class TargetClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL endPoint=new URL("http://localhost:8080/Calculator/services/CalServer");
		Service service=new Service();
		CalServerSoapBindingStub stub=new CalServerSoapBindingStub(endPoint,service);
		System.out.println("add of 10 and 20"+stub.add(10, 20));
		

	}

}
