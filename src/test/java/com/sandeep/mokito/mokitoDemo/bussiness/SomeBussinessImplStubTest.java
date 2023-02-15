package com.sandeep.mokito.mokitoDemo.bussiness;

import static org.junit.jupiter.api.Assertions.*;

import javax.xml.crypto.Data;

import org.junit.jupiter.api.Test;

class SomeBussinessImplStubTest {
	


	@Test
	void test() {
		SomeBussinessImpl bussiness=new SomeBussinessImpl(new DataServiceStub());
		assertEquals(4, bussiness.getMax());

}
	
class DataServiceStub implements DataService{

	@Override
	public int[] getAllData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4};
	}
	
	}
}
