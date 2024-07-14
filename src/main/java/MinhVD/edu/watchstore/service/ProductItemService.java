package MinhVD.edu.watchstore.service;

import java.util.List;

import org.bson.types.ObjectId;

import MinhVD.edu.watchstore.dto.response.ProductItemResponse;
import MinhVD.edu.watchstore.entity.ProductItem;

public interface ProductItemService {
    ObjectId saveOrEditItem(ProductItem productIt);
    boolean updateItem(List<ProductItem> listItem);
    ProductItem findProductItem(ObjectId itemId);
    List<ProductItemResponse> findProductItemResponse(List<ObjectId> itemList);
    boolean deleteItem(ObjectId itemId);
    List<ProductItem> findItemByList(List<ObjectId> itemId);
    boolean deleteItemAdvance(List<ObjectId> listItemId, boolean handleQuantityProduct);
    boolean cancelItem(List<ObjectId> listItem);
}
