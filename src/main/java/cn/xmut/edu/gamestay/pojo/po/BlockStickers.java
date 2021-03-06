package cn.xmut.edu.gamestay.pojo.po;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "block_stickers")
public class BlockStickers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    private String from;

    private String title;

    private String type;

    private String img1;

    private String img2;

    private String img3;

}