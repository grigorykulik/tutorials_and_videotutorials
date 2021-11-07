package jr.json_example.example2.des_w_annotations;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@JsonAutoDetect
class Cat
{
    public String name = "murka";
    @JsonDeserialize(as = LinkedList.class)
    public List<Cat> cats;
}
