package com.demo.customer;

public record CustomerRequest(
        String firstName,
        String lastName,
        String email
) { }
