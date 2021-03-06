package game.model;

import game.dto.ResourceDto;

import java.io.Serializable;

/**
 * @author alexey.buheria
 */
public class ResourceEntity implements Serializable {
    private Integer id;
    private String name;
    private String description;

    public ResourceEntity(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ResourceEntity (ResourceDto resourceDto) {
        this.id = resourceDto.getId();
        this.name = resourceDto.getName();
        this.description = resourceDto.getDescription();
    }

    public ResourceEntity () {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ResourceEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description +
                '}';
    }
}
