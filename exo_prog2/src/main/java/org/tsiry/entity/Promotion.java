package org.tsiry.entity;

import lombok.Data;
import lombok.Builder;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
public class Promotion {
    private String name;

    @Builder.Default
    private Set<String> groups = new HashSet<>();

    public void addGroup(String group) {
        groups.add(group);
    }
}
