package com.debanuj;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    public void testFetchData() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("Mock Response");

        ApiService service = new ApiService(mockApi);

        String result = service.fetchData();

        assertEquals("Mock Response", result);

        verify(mockApi).getData();
    }
}