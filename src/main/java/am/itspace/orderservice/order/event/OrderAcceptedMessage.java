package am.itspace.orderservice.order.event;

public record OrderAcceptedMessage(
        Long orderId
) {
}