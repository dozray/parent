package tk.deep;

/**
 * Created by dozray on 2015/6/29.
 */
public class CompDto {
    public CompDto(long id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private long id;
    private String code;
    private String name;

    public String toString(){
        return "Id :"+ this.getId()+"  Code:"+this.getCode()+"  Name:"+ this.getName();
    }
}
