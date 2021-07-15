package modules.standartcomponent.wires;
import javax.swing.ImageIcon;
import java.awt.BasicStroke;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modules.workenvironment.ColorList;
import modules.workenvironment.Component;
import modules.workenvironment.Port;
public class power extends Component {
    public power(){
        super("power", new ImageIcon("resources/componenticon/wires/power.gif"));
        setPowerData();
    }
    private void setPowerData(){
        setRotationFlag(20, 10);
        addPort(new Port(0 + 20, 0+10, true, false, this));
        addLineData(-20+20, 0+10, -10+20, -10+10, ColorList.GREEN[1], new BasicStroke(3.0F, 1, 1));
        addLineData(-20+20, 0+10, -10+20, 10+10, ColorList.GREEN[1], new BasicStroke(3.0F, 1, 1));
        addLineData(-10+20, -10+10, -10+20, 10+10, ColorList.GREEN[1], new BasicStroke(3.0F, 1, 1));
        addLineData(-10+20, 0+10, 0+20, 0+10, ColorList.GREEN[1], new BasicStroke(3.0F, 1, 1));
        //RectData.add(new Object[] {"", 0, 0, 50, 50, ColorList.BLACK[0], new BasicStroke(1.0F, 1, 1)});
        //addOvalData("", 10, 10, 1, 1, ColorList.BLACK[0], new BasicStroke(1.0F, 1, 1));
        start();
    }
    @Override
    public void startcode(){
        //эту ересь с tmp надо заменить
        List<List<Object>> tmp = new ArrayList<>(Collections.emptyList());
        List<Object> tmp2 = new ArrayList<Object>(Collections.emptyList());
        tmp2.add(1);
        tmp.add(tmp2);
        getPorts().get(0).setdata(tmp);
    }
    @Override
    public void step(){
        //эту ересь с tmp надо заменить
        List<List<Object>> tmp = new ArrayList<>(Collections.emptyList());
        List<Object> tmp2 = new ArrayList<Object>(Collections.emptyList());
        tmp2.add(1);
        tmp.add(tmp2);
        getPorts().get(0).setdata(tmp);
    }
}