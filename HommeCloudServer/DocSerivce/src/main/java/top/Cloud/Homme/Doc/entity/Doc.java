package top.Cloud.Homme.Doc.entity;

import lombok.Data;

import java.util.Date;


@Data
public class Doc {
    private Long docId;
    private String UUID;
    private String docName;
    private String docOriName;
    private String docType;
    private double docSize;
    private Date upLoadTime;
    private String docDir;
}
