package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class MyModel extends AbstractModel {
    private List<MyModel> models = new ArrayList<>();
}