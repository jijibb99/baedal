package baedalteamfive.external;

public class Cancellation {

    private Long id;
    private Long menuId;
    private String menuNm;
    private Long lotQty;
    private String status;

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
