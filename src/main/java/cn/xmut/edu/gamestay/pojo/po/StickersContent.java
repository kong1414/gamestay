package cn.xmut.edu.gamestay.pojo.po;

import javax.persistence.*;

@Table(name = "stickers_content")
public class StickersContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    private String from;

    private String message;

    @Column(name = "titile_bg")
    private String titileBg;

    private String title;

    private String type;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return from;
    }

    /**
     * @param from
     */
    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * @return titile_bg
     */
    public String getTitileBg() {
        return titileBg;
    }

    /**
     * @param titileBg
     */
    public void setTitileBg(String titileBg) {
        this.titileBg = titileBg == null ? null : titileBg.trim();
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}