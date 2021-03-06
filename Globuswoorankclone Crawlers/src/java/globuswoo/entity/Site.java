package globuswoo.entity;
// Generated May 23, 2013 8:20:10 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Site generated by hbm2java
 */
@Entity
@Table(name="site")
public class Site  implements java.io.Serializable {


     private Long siteId;
     private long resellerId;
     private String ip;
     private String domain;
     private String logo;
     private String css;

    public Site() {
    }

	
    public Site(long resellerId, String ip, String domain) {
        this.resellerId = resellerId;
        this.ip = ip;
        this.domain = domain;
    }
    public Site(long resellerId, String ip, String domain, String logo, String css) {
       this.resellerId = resellerId;
       this.ip = ip;
       this.domain = domain;
       this.logo = logo;
       this.css = css;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="SiteId", unique=true, nullable=false)
    public Long getSiteId() {
        return this.siteId;
    }
    
    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }
    
    @Column(name="ResellerId", nullable=false)
    public long getResellerId() {
        return this.resellerId;
    }
    
    public void setResellerId(long resellerId) {
        this.resellerId = resellerId;
    }
    
    @Column(name="Ip", nullable=false, length=60)
    public String getIp() {
        return this.ip;
    }
    
    public void setIp(String ip) {
        this.ip = ip;
    }
    
    @Column(name="Domain", nullable=false, length=200)
    public String getDomain() {
        return this.domain;
    }
    
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    @Column(name="Logo", length=200)
    public String getLogo() {
        return this.logo;
    }
    
    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    @Column(name="Css", length=200)
    public String getCss() {
        return this.css;
    }
    
    public void setCss(String css) {
        this.css = css;
    }




}


