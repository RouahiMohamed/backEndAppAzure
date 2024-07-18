package com.example.AzurePfe.models.composant;

import com.example.AzurePfe.models.User;
import com.example.AzurePfe.models.ressources.Region;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "applicationGateway")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationGateway {
    @Id
    private String id;
    private String name;
    @DBRef
    private Region region;
    @DBRef
    private ResourceGroup resourceGroupe;
    @DBRef
    private Subnet subnet;
    @DBRef
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public ResourceGroup getResourceGroupe() {
        return resourceGroupe;
    }

    public void setResourceGroupe(ResourceGroup resourceGroupe) {
        this.resourceGroupe = resourceGroupe;
    }

    public Subnet getSubnet() {
        return subnet;
    }

    public void setSubnet(Subnet subnet) {
        this.subnet = subnet;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
