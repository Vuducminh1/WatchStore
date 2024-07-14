package MinhVD.edu.watchstore.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryResponse {
    
    private String id;

    private String categoryName;

    private List<ProductResponse> product;
}
