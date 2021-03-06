package grapro20.src.main.java.com.njusoft.grapro20.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * View-Object: 视图层，用于展示层，它的作用是把某个指定页面（或组件）的所有数据封装起来
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private List<T> data;

    private T Object;

    public ResultVO(){

    }

    public ResultVO(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

}
