package week4.day2;

class APIClient {
    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }

    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request body: " + requestBody);
        System.out.println("Request status: " + requestStatus);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        APIClient apiClient = new APIClient();

        apiClient.sendRequest("api/endpoint");

        apiClient.sendRequest("api/endpoint", "{'key': 'value'}", true);
    }
}
