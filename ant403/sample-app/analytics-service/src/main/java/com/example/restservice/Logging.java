package com.example.restservice;

public class Logging {

    private String service;
    private String message;

    public Logging(String service, String message) {
        this.service = service;
        this.message = message;
    }

    public String getService() {
        return service;
    }

    public String getMessage() {
        return message;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("service:").append(service);
        sb.append(", message:").append(message);
        sb.append("}");
        return sb.toString();
    }
}