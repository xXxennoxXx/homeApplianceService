package pl.xxxennoxxx.home.appliance.service.controller;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Response {
    String orderNumber;
    String orderStatus;
}
