package com.luke.json.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by YANGFENG457 on 2017-04-01.
 */
public class Node {

    private Node prev;

    private List<Node> sub;

    private boolean isEnd;

    private String key;

    private String strValue;

    private Object objValue;

    private NodeType type;

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public List<Node> getSub() {
        return sub;
    }

    public void setSub(List<Node> sub) {
        this.sub = sub;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getStrValue() {
        StringBuilder str = new StringBuilder();

        if(NodeType.ARRAY.equals(this.getType()) || NodeType.OBJECT.equals(this.getType())){
            traverseStr(this, str);
        }else{
            str.append(this.getObjValue());
        }
        String jsonStr = "";
        if(str.lastIndexOf(",") > -1){
            jsonStr = str.deleteCharAt(str.lastIndexOf(",")).toString().replace(",]", "]").replace(",}", "}");
        }else{
            jsonStr = str.toString();
        }
        return strValue = jsonStr;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    public Object getObjValue() {
        return objValue;
    }

    public void setObjValue(Object objValue) {
        this.objValue = objValue;
    }

    public NodeType getType() {
        return type;
    }

    public void setType(NodeType type) {
        this.type = type;
    }

    public void traverseStr(Node node, StringBuilder str){
        if(NodeType.OBJECT.equals(node.getType())){
            str.append("{");
        }else if (NodeType.ARRAY.equals(node.getType())){
            str.append("[");
        }
        for(Node sub : node.getSub()){
            if(NodeType.OBJECT.equals(node.getType())){
                str.append(sub.getKey()).append(":");
                if(sub.getObjValue() != null){
                    str.append(sub.getObjValue()).append(",");
                }
            }else if (NodeType.ARRAY.equals(node.getType())){
                str.append(sub.getObjValue()).append(",");
            }
            traverseStr(sub, str);
        }
        if(NodeType.OBJECT.equals(node.getType())){
            str.append("},");
        }else if (NodeType.ARRAY.equals(node.getType())){
            str.append("],");
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "prev=" + prev +
                ", isEnd=" + isEnd +
                ", key='" + key + '\'' +
                ", objValue='" + objValue + '\'' +
                ", strValue='" + strValue + '\'' +
                ", type=" + type +
                '}';
    }
}
