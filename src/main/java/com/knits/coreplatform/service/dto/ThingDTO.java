package com.knits.coreplatform.service.dto;

import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A DTO for the {@link com.knits.coreplatform.domain.Thing} entity.
 */
@ApiModel(description = "Thing is a representation of place to attach sensorts.\n@author Vassili Moskaljov\n@version 1.1")
public class ThingDTO implements Serializable {

    private Long id;

    private String name;

    private String uUID;

    private LocationDTO location;

    private ThingCategoryDTO thingCategory;

    private ApplicationDTO application;

    private Set<StateDTO> states = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getuUID() {
        return uUID;
    }

    public void setuUID(String uUID) {
        this.uUID = uUID;
    }

    public LocationDTO getLocation() {
        return location;
    }

    public void setLocation(LocationDTO location) {
        this.location = location;
    }

    public ThingCategoryDTO getThingCategory() {
        return thingCategory;
    }

    public void setThingCategory(ThingCategoryDTO thingCategory) {
        this.thingCategory = thingCategory;
    }

    public ApplicationDTO getApplication() {
        return application;
    }

    public void setApplication(ApplicationDTO application) {
        this.application = application;
    }

    public Set<StateDTO> getStates() {
        return states;
    }

    public void setStates(Set<StateDTO> states) {
        this.states = states;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThingDTO)) {
            return false;
        }

        ThingDTO thingDTO = (ThingDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, thingDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ThingDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", uUID='" + getuUID() + "'" +
            ", location=" + getLocation() +
            ", thingCategory=" + getThingCategory() +
            ", application=" + getApplication() +
            ", states=" + getStates() +
            "}";
    }
}
