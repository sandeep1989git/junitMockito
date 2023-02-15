package com.sandeep.mokito.mokitoDemo.bussiness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class )
class SomeBussinessImplMockTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	private SomeBussinessImpl bussiness;
	
	@Test 
	void findMaxBasic() {
		when(dataServiceMock.getAllData()).thenReturn(new int[] {1,2,3,4});
		assertEquals(4, bussiness.getMax());
	}	
	
	@Test 
	void findMaxWithOneData() {
		when(dataServiceMock.getAllData()).thenReturn(new int[] {1});
		assertEquals(1, bussiness.getMax());
	}	
}
