package modules.workenvironment;

import java.util.Collections;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Component {
    public String componentname;
    public Icon componenticon = new ImageIcon("путь до стандартной иконки");
    public Component(String name){
        componentname = name;
    }
    public Component(String name, Icon icon){
        componentname = name;
        componenticon = icon;
    }
    public Port[] Ports = {};
    public void setPorts(Port[] ports){
        Ports = ports;
    }
    public int[] ComponentLocation = {0, 0};
    public int[] getComponentLocation(){
        return ComponentLocation;
    }
    public void setComponentLocation(int[] changelocation){
        ComponentLocation[0] = changelocation[0];
        ComponentLocation[1] = changelocation[1];
    }
    public void changeComponentLocation(int[] changelocation){
        ComponentLocation[0] += changelocation[0];
        ComponentLocation[1] += changelocation[1];
    }
    public List<String> DrawOder = Collections.emptyList();
    public List<Object[]> LineData = Collections.emptyList();
    public List<Object[]> RectData = Collections.emptyList();
    public List<Object[]> OvalData = Collections.emptyList();
    public List<Object[]> PolyData = Collections.emptyList();
    public List<Object[]> TextData = Collections.emptyList();
    public void setDrawOrder( List<String> Data){
        DrawOder = Data;
    }
    public void setLineData(List<Object[]> Data){
        LineData = Data;
    }
    public void setRectData(List<Object[]> Data){
        RectData = Data;
    }
    public void setOvalData(List<Object[]> Data){
        OvalData = Data;
    }
    public void setPolyData(List<Object[]> Data){
        PolyData = Data;
    }
    public void setTextData(List<Object[]> Data){
        TextData = Data;
    }
}
