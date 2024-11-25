package com.project.api.Model;
import jakarta.persistence.*;
@Entity
@Table(name = "TblProductMedia")
public class ProductMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productMediaId;

    @Column(nullable = false)
    private String urlFile;

    @Column(nullable = false)
    private String mediaType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", nullable = false) // Clave foránea hacia Product
    private Product product;

    public long getProductMediaId() {
        return productMediaId;
    }

    public void setProductMediaId(long productMediaId) {
        this.productMediaId = productMediaId;
    }

    public String getUrlFile() {
        return urlFile;
    }

    public void setUrlFile(String urlFile) {
        this.urlFile = urlFile;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}


