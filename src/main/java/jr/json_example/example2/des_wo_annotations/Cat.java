package jr.json_example.example2.des_wo_annotations;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect
class Cat
{
    public String name = "murka";
    public List<Cat> cats = new ArrayList<>();
}
