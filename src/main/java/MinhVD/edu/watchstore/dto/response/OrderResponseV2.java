package MinhVD.edu.watchstore.dto.response;

import java.util.Date;
import java.util.List;

import MinhVD.edu.watchstore.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponseV2 {
    private String id;

    private List<ProductItemResponse> productItems;

    private String shippingAddress;

    private String paymentMethod;

    private double itemsPrice;

    private double shippingPrice;

    private double totalPrice;

    private UserResp user;

    private boolean isPaid;

    private Date paidAt;

    private boolean isDelivered;

    private Date deliveredAt;

    private Date createdAt;

    private String state;


    public OrderResponseV2(Order order) {
        this.id = order.getId().toHexString();
        this.shippingAddress = order.getShippingAddress();
        this.paymentMethod = order.getPaymentMethod();
        this.itemsPrice = order.getItemsPrice();
        this.shippingPrice = order.getShippingPrice();
        this.totalPrice = order.getTotalPrice();
        this.isPaid = (order.getPaidAt() == null) ? false : true;
        this.paidAt = order.getPaidAt();
        this.isDelivered = (order.getDeliveredAt() == null) ? false : true;
        this.deliveredAt = order.getDeliveredAt();
        this.state = order.getState();
        this.createdAt = order.getCreatedAt();
    }
}
