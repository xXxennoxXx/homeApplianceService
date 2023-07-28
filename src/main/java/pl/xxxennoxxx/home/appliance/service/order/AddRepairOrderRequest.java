package pl.xxxennoxxx.home.appliance.service.order;

import lombok.Value;

@Value

public class AddRepairOrderRequest {
    String clientFirstName;
    String clientLastName;
    String clientPhone;
    String clientMail;
    String clientAddress;


}
