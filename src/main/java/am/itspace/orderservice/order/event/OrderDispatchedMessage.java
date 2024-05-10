package am.itspace.orderservice.order.event;

public record OrderDispatchedMessage(
        Long orderId
) {
}
