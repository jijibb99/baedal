package baedalteamfive;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Inventory_table")
public class Inventory {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long menuId;
    private String menuNm;
    private Long lotQty;
    private String status;

    @PostPersist
    public void onPostPersist(){
        InventoryCreated inventoryCreated = new InventoryCreated();
        BeanUtils.copyProperties(this, inventoryCreated);
        inventoryCreated.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
    public String getMenuNm() {
        return menuNm;
    }

    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm;
    }
    public Long getLotQty() {
        return lotQty;
    }

    public void setLotQty(Long lotQty) {
        this.lotQty = lotQty;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }




}
