package asapD.server.controller.dto.store;

import asapD.server.domain.Store;
import lombok.Builder;
import lombok.Data;


@Data
public class StoreResponseDto {

    private Long storeId;
    private String name;
    private int owner;
    private String address;

    public StoreResponseDto(Store store) {
        storeId = store.getId();
        name = store.getName();
        owner = store.getOwner();
        address = store.getAddress();
    }
}
