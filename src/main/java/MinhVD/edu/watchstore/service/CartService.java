package MinhVD.edu.watchstore.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;

import MinhVD.edu.watchstore.dto.response.ProductItemResponse;
import MinhVD.edu.watchstore.entity.Cart;
import MinhVD.edu.watchstore.entity.ProductItem;

public interface CartService {
    ResponseEntity<?> addProductToCart(ProductItem productItem, ObjectId userId);
    ResponseEntity<?> findCartByUser(ObjectId userId);
    ResponseEntity<?> updateCart(List<ProductItemResponse> listResp, ObjectId userId);
    List<ObjectId> deleteCart(ObjectId cartId);
    ObjectId saveCart(Cart cart);
}
