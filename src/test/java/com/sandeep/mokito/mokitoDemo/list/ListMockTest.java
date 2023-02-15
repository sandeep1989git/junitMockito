package com.sandeep.mokito.mokitoDemo.list;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListMockTest {

	@Test
	void test() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(3);
		assertEquals(3, listMock.size());
	}
	
	@Test
	void mutipleReturn() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(3).thenReturn(2);
		//when(listMock.get(0);
		assertEquals(3, listMock.size());
		assertEquals(2, listMock.size());
	}
	
	@Test
	void specificParameter() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("HareKrishna");
		assertEquals("HareKrishna", listMock.get(0));

		assertEquals(null, listMock.get(1));
	}	
	
	@Test
	void generalParameter() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("HareKrishna");
		assertEquals("HareKrishna", listMock.get(0));

		assertEquals("HareKrishna", listMock.get(1));
	}	

}
