package com.example.interactions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testVerifyInteraction() {

        // Step 1: Create Mock Object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Create Service with Mock Object
        MyService service = new MyService(mockApi);

        // Step 3: Call Service Method
        service.fetchData();

        // Step 4: Verify Interaction
        verify(mockApi).getData();

        // Descriptive Output
        System.out.println("========== Mockito Interaction Verification ==========");
        System.out.println("Step 1: Mock object for ExternalApi created successfully.");
        System.out.println("Step 2: Mock object injected into MyService.");
        System.out.println("Step 3: fetchData() method executed.");
        System.out.println("Step 4: Verified that getData() was invoked on the mocked ExternalApi.");
        System.out.println("Result: Interaction verification completed successfully.");
        System.out.println("======================================================");
    }
}