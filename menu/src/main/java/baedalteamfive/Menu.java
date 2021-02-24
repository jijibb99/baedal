package baedalteamfive;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Menu_table")
public class Menu {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String menuNm;
    private Long lotQty;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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




}
